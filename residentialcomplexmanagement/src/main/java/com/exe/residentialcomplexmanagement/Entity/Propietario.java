package com.exe.residentialcomplexmanagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "propietarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Propietario {

    // Identificador único del propietario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private long idPropietario;

    // Nombre completo del propietario
    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    // Teléfono de contacto del propietario
    @Column(name = "Telefono", nullable = false,  updatable = true, length = 15)
    private String telefono;

    // Correo electrónico del propietario
    @Column(name = "Email", nullable = false, unique = true, updatable = true, length = 255)
    private String email;

    // Relación uno a muchos con Apartamento (un propietario puede tener varios apartamentos)
    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Apartamento> apartamentos;

}
