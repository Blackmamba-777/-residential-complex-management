package com.exe.residentialcomplexmanagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "propietarios")
public class Propietarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private long idPropietario;

    @Column(name = "nombre", nullable = false, unique = false, length = 100)
    private String nombre;

    @Column(name = "telefono", nullable = false, unique = true, updatable = true, length = 15)
    private String telefono;

    @Column(name = "email", nullable = false, unique = true, updatable = true, length = 100)
    private String email;
}
