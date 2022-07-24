/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fullstack.portfolio.luis.jwt.dao;

import com.fullstack.portfolio.luis.jwt.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author luis
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
    public Optional<User> findByUserName(String userName);

    public boolean existsByEmail(String email);

    public boolean existsByUserName(String userName);
}
