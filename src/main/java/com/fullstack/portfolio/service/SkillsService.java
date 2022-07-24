/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fullstack.portfolio.service;

import com.fullstack.portfolio.model.Skills;
import com.fullstack.portfolio.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luis
 */
@Service
public class SkillsService implements ISkillsService{
    
    @Autowired
    public SkillsRepository skillRepo;
    

    @Override
    public List<Skills> verSkills() {
        
        return skillRepo.findAll();
    }

    @Override
    public void agregarSkills(Skills data) {
        
        skillRepo.save(data);
    }

    @Override
    public void borrarSkills(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public void editarSkills(Skills data) {
        skillRepo.save(data);
    }
    
}
