/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fullstack.portfolio.Controller;

import com.fullstack.portfolio.model.AcercaDe;
import com.fullstack.portfolio.model.Educacion;
import com.fullstack.portfolio.model.Experiencia;
import com.fullstack.portfolio.model.Proyectos;
import com.fullstack.portfolio.model.Skills;

import com.fullstack.portfolio.service.IAcercaDeService;
import com.fullstack.portfolio.service.IEducacionService;
import com.fullstack.portfolio.service.IExperienciaService;
import com.fullstack.portfolio.service.IProyectosService;
import com.fullstack.portfolio.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author luis
 */


// CREACION DE NUESTRA PRIMERA CAPA
// Esta clase es la encargada de recibir todas las peticiones que realice un cliente o una aplicacion
// que nos este consumiendo.


// Clase Controladora.
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/auth")
public class Controller {
        
        // INYECCION DE DEPENDECIAS
        
        
    
    
        // METODOS DE LA SECCION ACERCA DE
        @Autowired
        private IAcercaDeService acercaDeServ;
        
         
        @PostMapping("/acercade/new")
        public void agregarAcercaDe (@RequestBody AcercaDe data){
            
            acercaDeServ.agregarAcercaDe(data);
            
        }
        
        @GetMapping("/acercade/get")
        @ResponseBody
        public List<AcercaDe> verAcercaDe (){
            
            return acercaDeServ.verAcercaDe();
            
        }
        
        @DeleteMapping ("/acercade/delete/{id}")
        public void borrarPersona (@PathVariable Long id){
            
            acercaDeServ.borrarAcercaDe(id);
        }
        
        @PutMapping("/acercade/update/{id}")
        public void editarAcercaDe (@RequestBody AcercaDe data){
            
            acercaDeServ.editarAcercaDe(data);
            
        }
        
        // METODOS DE LA SECCION EXPERIENCIA
        
        @Autowired
        private IExperienciaService expRepo;
        
        @PostMapping("/experiencia/new")
        public void agregarExperiencia(@RequestBody Experiencia  data){
            
            expRepo.agregarExperiencia(data);
        }
        
        @GetMapping("/experiencia/get")
        @ResponseBody
        public List<Experiencia> verExperiencia (){
            
            return expRepo.verExperiencia();
            
        }
        
        @DeleteMapping ("/experiencia/delete/{id}")
        public void borrarExperiencia (@PathVariable Long id){
            
            expRepo.borrarExperiencia(id);
        }
        @PutMapping("/experiencia/update/{id}")
        public void editarExperiencia (@RequestBody Experiencia data){
            
            expRepo.editarExperiencia(data);
            
        }
        
        // METODOS DE LA SECCION EDUCACION
        
        @Autowired
        private IEducacionService eduRepo;
        
        @PostMapping("/educacion/new")
        public void agregarEducacion(@RequestBody Educacion  data){
            
            eduRepo.agregarEducacion(data);
        }
        
        @GetMapping("/educacion/get")
        @ResponseBody
        public List<Educacion> verEducacion (){
            
            return eduRepo.verEducacion();
            
        }
        
        @DeleteMapping ("/educacion/delete/{id}")
        public void borrarEducacion (@PathVariable Long id){
            
            eduRepo.borrarEducacion(id);
        }
        @PutMapping("/educacion/update/{id}")
        public void editarEducacion (@RequestBody Educacion data){
            
            eduRepo.editarEducacion(data);
            
        }
        
        // METODOS DE LA SECCION SKILLS
        
        @Autowired
        private ISkillsService skillRepo;
        
        @PostMapping("/skill/new")
        public void agregarSkills(@RequestBody Skills  data){
            
            skillRepo.agregarSkills(data);
        }
        
        @GetMapping("/skill/get")
        @ResponseBody
        public List<Skills> verSkills (){
            
            return skillRepo.verSkills();
            
        }
        
        @DeleteMapping ("/skill/delete/{id}")
        public void borrarSkills (@PathVariable Long id){
            
            skillRepo.borrarSkills(id);
        }
        @PutMapping("/skill/update/{id}")
        public void editarSkills (@RequestBody Skills data){
            
            skillRepo.editarSkills(data);
            
        }
        
        // METODOS DE LA SECCION PROYECTOS
        
        @Autowired
        private IProyectosService proRepo;
        
        @PostMapping("/proyecto/new")
        public void agregarSkills(@RequestBody Proyectos  data){
            
            proRepo.agregarProyectos(data);
        }
        
        @GetMapping("/proyectos/get")
        @ResponseBody
        public List<Proyectos> verProyectos (){
            
            return proRepo.verProyectos();
            
        }
        
        @DeleteMapping ("/proyecto/delete/{id}")
        public void borrarProyectos (@PathVariable Long id){
            
            proRepo.borrarProyectos(id);
        }
        @PutMapping("/proyectos/update/{id}")
        public void editarProyectos (@RequestBody Proyectos data){
            
            proRepo.editarProyectos(data);
            
        }
}
