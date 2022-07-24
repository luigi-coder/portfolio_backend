/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fullstack.portfolio.luis.jwt.controller;

import com.fullstack.portfolio.luis.jwt.dao.RoleRepository;
import com.fullstack.portfolio.luis.jwt.dao.UserRepository;
import com.fullstack.portfolio.luis.jwt.model.AuthResponse;
import com.fullstack.portfolio.luis.jwt.model.CustomUserBean;
import com.fullstack.portfolio.luis.jwt.model.Role;
import com.fullstack.portfolio.luis.jwt.model.Roles;
import com.fullstack.portfolio.luis.jwt.model.SignupRequest;
import com.fullstack.portfolio.luis.jwt.model.User;
import com.fullstack.portfolio.luis.jwt.security.JwtTokenUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author luis
 */
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/auth")
public class AuthController {
    @Autowired
  UserRepository userRepository;
  @Autowired
  RoleRepository roleRepository;
  @Autowired
  PasswordEncoder encoder;
  @Autowired
  AuthenticationManager authenticationManager;
  @Autowired
  JwtTokenUtil jwtTokenUtil;
  
  @PostMapping("/login")
  public ResponseEntity<?> userLogin(@RequestBody User user) {
    System.out.println("AuthController -- userLogin");
    System.out.println("Ingresando al portfolio de luis salinas");
    Authentication authentication = authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword()));
    
    SecurityContextHolder.getContext().setAuthentication(authentication);
    String token = jwtTokenUtil.generateJwtToken(authentication);
    CustomUserBean userBean = (CustomUserBean) authentication.getPrincipal();    
    List<String> roles = userBean.getAuthorities().stream()
                   .map(auth -> auth.getAuthority())
                   .collect(Collectors.toList());
    AuthResponse authResponse = new AuthResponse();
    authResponse.setToken(token);
    authResponse.setRoles(roles);
    return ResponseEntity.ok(authResponse);
  }
  
  @PostMapping("/signup")
  public ResponseEntity<?> userSignup(@RequestBody SignupRequest signupRequest) {
    if(userRepository.existsByUserName(signupRequest.getUserName())){
      return ResponseEntity.badRequest().body("Username is already taken");
    }
    if(userRepository.existsByEmail(signupRequest.getEmail())){
      return ResponseEntity.badRequest().body("Email is already taken");
    }
    User user = new User();
    Set<Role> roles = new HashSet<>();
    user.setUserName(signupRequest.getUserName());
    user.setEmail(signupRequest.getEmail());
    user.setPassword(encoder.encode(signupRequest.getPassword()));
    //System.out.println("Encoded password--- " + user.getPassword());
    String[] roleArr = signupRequest.getRoles();
    
    if(roleArr == null) {
      roles.add(roleRepository.findByRoleName(Roles.ROLE_USER).get());
    }
    for(String role: roleArr) {
      switch(role) {
        case "admin":
          roles.add(roleRepository.findByRoleName(Roles.ROLE_ADMIN).get());
          break;
        case "user":
          roles.add(roleRepository.findByRoleName(Roles.ROLE_USER).get());
          break;  
        default:
          return ResponseEntity.badRequest().body("Specified role not found");
      }
    }
    user.setRoles(roles);
    userRepository.save(user);
    return ResponseEntity.ok("User signed up successfully");
  }
}
