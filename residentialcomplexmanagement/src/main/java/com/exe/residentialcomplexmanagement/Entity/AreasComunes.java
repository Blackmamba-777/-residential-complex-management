package com.exe.residentialcomplexmanagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AreasComunes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long idAreasComunes ;

    @Column(name = "nombre",nullable = false, length = 100)
    private String nombre;

    @Column(name = "capacidad",nullable = false)
    private int capacidad;

    @Column(name = "horario",length = 100)
    private String horario;
}
