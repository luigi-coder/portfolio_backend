/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fullstack.portfolio.service;

import com.fullstack.portfolio.model.AcercaDe;
import com.fullstack.portfolio.repository.AcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luis
 */

@Service
public class AcercaDeService implements IAcercaDeService {
    
    // Haciendo una inyecccion de dependencias
    @Autowired 
    public AcercaDeRepository acercaDeRepo;
    
    

    @Override
    public List<AcercaDe> verAcercaDe() {
 
        return acercaDeRepo.findAll();
    }

    @Override
    public void agregarAcercaDe(AcercaDe data) {
        acercaDeRepo.save(data);
    } 

    @Override
    public void borrarAcercaDe(Long id) {
        acercaDeRepo.deleteById(id);
    }

    @Override
    public void editarAcercaDe(AcercaDe data) {
        acercaDeRepo.save(data);
    }  
    
}
