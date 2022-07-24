/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fullstack.portfolio.service;

import com.fullstack.portfolio.model.AcercaDe;
import java.util.List;

/**
 *
 * @author luis
 */
public interface IAcercaDeService {
        
    public List<AcercaDe> verAcercaDe();
    public void agregarAcercaDe(AcercaDe data);
    public void borrarAcercaDe(Long id);
    public void editarAcercaDe(AcercaDe data);
}
