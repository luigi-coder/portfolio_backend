/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fullstack.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author luis
 */
@Setter @Getter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String url;
    private String img;
    
    public Proyectos(){}
    
    public Proyectos(Long id, String nombre, String url, String img){
        
        this.id = id;
        this.nombre = nombre;
        this.url = url;
        this.img = img;
    }
    
}
