/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fullstack.portfolio.service;

import com.fullstack.portfolio.model.Educacion;
import java.util.List;

/**
 *
 * @author luis
 */
public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    public void agregarEducacion(Educacion data);
    public void borrarEducacion(Long id);
    public void editarEducacion(Educacion data);
    
}
