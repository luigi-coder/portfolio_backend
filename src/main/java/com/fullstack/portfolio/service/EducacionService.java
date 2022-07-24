/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fullstack.portfolio.service;

import com.fullstack.portfolio.model.Educacion;
import com.fullstack.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luis
 */
@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository eduRepo;


    @Override
    public List<Educacion> verEducacion() {
        
        return eduRepo.findAll();
    }

    @Override
    public void agregarEducacion(Educacion data) {
        
        eduRepo.save(data);
    }

    @Override
    public void borrarEducacion(Long id) {
        
        eduRepo.deleteById(id);
    }

    @Override
    public void editarEducacion(Educacion data) {
        
        eduRepo.save(data);
    }
        
    
}
