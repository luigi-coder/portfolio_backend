/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fullstack.portfolio.service;

import com.fullstack.portfolio.model.Skills;
import java.util.List;

/**
 *
 * @author luis
 */
public interface ISkillsService {
       
    public List<Skills> verSkills();
    public void agregarSkills(Skills data);
    public void borrarSkills(Long id);
    public void editarSkills(Skills data);
}
