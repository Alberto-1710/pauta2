package com.example.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Equipos;
import com.example.demo.entities.Posiciones;
import com.example.demo.repositories.EquipoRepository;
import com.example.demo.repositories.PosicionesRepository;
import com.example.demo.services.EquipoService;

@Service
public class EquipoServiceImpl implements EquipoService{

    @Autowired
    public EquipoRepository equipoRepository;

    @Autowired
    public PosicionesRepository posicionesRepository;


    @Override
    public Equipos crearEquipos(Equipos equipos) {
        Equipos equipos2 = this.equipoRepository.save(equipos);
        Posiciones posiciones = new Posiciones();
        posiciones.setEquipos(equipos2);
        posicionesRepository.save(posiciones);
        return this.equipoRepository.save(equipos2);
    }
    
}
