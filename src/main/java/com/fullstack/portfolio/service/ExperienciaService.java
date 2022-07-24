/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fullstack.portfolio.service;

import com.fullstack.portfolio.model.Experiencia;
import com.fullstack.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luis
 */
@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository expRepo;

    @Override
    public List<Experiencia> verExperiencia() {
       return expRepo.findAll();
    }

    @Override
    public void agregarExperiencia(Experiencia data) {
        expRepo.save(data);
    }

    @Override
    public void borrarExperiencia(Long id) {
       expRepo.deleteById(id);
    }

    @Override
    public void editarExperiencia(Experiencia data) {
        expRepo.save(data);
    }
    
}
