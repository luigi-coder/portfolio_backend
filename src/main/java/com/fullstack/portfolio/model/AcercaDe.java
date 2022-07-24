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

@Getter @Setter
@Entity
public class AcercaDe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String tituloPrincipal;
    private String fotoPerfil;
    private String nombre;
    private String titulo;
    private String parrafo;
    
    public AcercaDe() {}
    
    public AcercaDe(Long id, String tituloPrincipal, String fotoPerfil, String nombre, String titulo, String parrafo ){
        
        this.id = id;
        this.tituloPrincipal = tituloPrincipal;
        this.fotoPerfil = fotoPerfil;
        this.nombre = nombre;
        this.titulo = titulo;
        this.parrafo = parrafo;
    }
    
}
