package com.exe.residentialcomplexmanagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "areascomunes")
@Data
public class AreaComun {
    // Identificador único del área común
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long idAreasComunes ;

    // Nombre del área común (ej: piscina, salón social)
    @Column(name = "nombre",nullable = false, length = 100)
    private String nombre;

    // Capacidad máxima de personas permitidas
    @Column(name = "capacidad",nullable = false)
    private int capacidad;

    // Horario de uso del área común
    @Column(name = "horario",length = 100)
    private String horario;
}
