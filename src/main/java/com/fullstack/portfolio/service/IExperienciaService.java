/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fullstack.portfolio.service;

import com.fullstack.portfolio.model.Experiencia;
import java.util.List;

/**
 *
 * @author luis
 */
public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    public void agregarExperiencia(Experiencia data);
    public void borrarExperiencia(Long id);
    public void editarExperiencia(Experiencia data);
    
}
