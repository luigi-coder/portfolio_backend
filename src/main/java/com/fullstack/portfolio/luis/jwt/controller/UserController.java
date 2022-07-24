/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fullstack.portfolio.luis.jwt.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author luis
 */
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/user")

public class UserController {
    
    @GetMapping("/allusers")
    public String displayUsers() {
        return "Display All Users";
    }

    @GetMapping("/displayuser")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public String displayToUser() {
        return "Display to both user and admin";
    }

    @GetMapping("/displayadmin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String displayToAdmin() {
        return "Display only to admin";
    }
}
