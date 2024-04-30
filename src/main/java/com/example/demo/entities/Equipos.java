package com.example.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "equipos")
@Data
public class Equipos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoequipo")
    private long codigoEquipo;

    private String nombre;

    private double ataque;

    private double defensa;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "equipos")
    private Posiciones posiciones;

    
}
