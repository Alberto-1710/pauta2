package com.example.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "posiciones")
@Data
public class Posiciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idposiciones")
    private long idPosiciones;

    private long empates;

    private long ganados;

    private long perdidos;

    private long golesf;

    private long golesc;

    private long puntos;

    @OneToOne
    @JoinColumn(name = "codigoequipo", referencedColumnName = "codigoequipo")
    private Equipos equipos;

}
