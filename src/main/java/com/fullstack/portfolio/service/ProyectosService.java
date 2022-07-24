/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fullstack.portfolio.service;

import com.fullstack.portfolio.model.Proyectos;
import com.fullstack.portfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luis
 */

@Service
public class ProyectosService implements IProyectosService{
    
    @Autowired ProyectosRepository proRep;

    @Override
    public List<Proyectos> verProyectos() {
        return proRep.findAll();
    }

    @Override
    public void agregarProyectos(Proyectos data) {
       proRep.save(data);
    }

    @Override
    public void borrarProyectos(Long id) {
        proRep.deleteById(id);
    }

    @Override
    public void editarProyectos(Proyectos data) {
       proRep.save(data);
    }
    
}
