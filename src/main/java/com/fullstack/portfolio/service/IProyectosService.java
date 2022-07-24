/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fullstack.portfolio.service;

import com.fullstack.portfolio.model.Proyectos;
import java.util.List;

/**
 *
 * @author luis
 */
public interface IProyectosService {
    
    public List<Proyectos> verProyectos();
    public void agregarProyectos(Proyectos data);
    public void borrarProyectos(Long id);
    public void editarProyectos(Proyectos data);
}
