package com.exe.residentialcomplexmanagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "residentes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Residente {

    // Identificador único del residente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long idResidente;

    // Nombre completo del residente
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    // Teléfono de contacto del residente
    @Column(name = "telefono", nullable = false, updatable = true, length = 15)
    private String telefono;

    // Correo electrónico del residente
    @Column(name = "email", nullable = false, unique = true, updatable = true, length = 255)
    private String email;

    // Relación muchos a uno con Apartamento (a qué apartamento pertenece el residente)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartamento_id")
    private Apartamento apartamento;


}
