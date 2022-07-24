/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fullstack.portfolio.repository;

import com.fullstack.portfolio.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author luis
 */
@Repository
public interface ProyectosRepository  extends JpaRepository<Proyectos, Long>{
    
}
