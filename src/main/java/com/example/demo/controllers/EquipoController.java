package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Equipos;
import com.example.demo.services.impl.EquipoServiceImpl;

@RestController
@RequestMapping("/prueba")
public class EquipoController {
    
    @Autowired
    public EquipoServiceImpl equipoServiceImpl;

    @PostMapping("/equipo/crear")
    public Equipos crearEquipos(@RequestBody Equipos equipos) {      
        return this.equipoServiceImpl.crearEquipos(equipos);
    }
    
    
}
