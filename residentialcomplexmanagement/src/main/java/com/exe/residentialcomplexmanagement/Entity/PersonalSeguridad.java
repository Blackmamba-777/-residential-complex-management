package com.exe.residentialcomplexmanagement.Entity;

import com.exe.residentialcomplexmanagement.Enum.TurnoSeguridad;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "personalseguridad")
@Data
public class PersonalSeguridad {

    // Identificador único del personal de seguridad
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long idPersonalSeguridad;

    // Nombre del personal de seguridad
    @Column(name = "nombre",nullable = false, length = 100)
    private String nombre;

    // Teléfono de contacto
    @Column(name = "telefono",length = 15)
    private String telefono;

    // Turno asignado (ej: DIA, NOCHE)
    @Enumerated(EnumType.STRING)
    private TurnoSeguridad turno;
}
