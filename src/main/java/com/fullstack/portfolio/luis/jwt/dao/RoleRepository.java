/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fullstack.portfolio.luis.jwt.dao;

import com.fullstack.portfolio.luis.jwt.model.Role;
import com.fullstack.portfolio.luis.jwt.model.Roles;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author luis
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    
    Optional<Role> findByRoleName(Roles role);
}
