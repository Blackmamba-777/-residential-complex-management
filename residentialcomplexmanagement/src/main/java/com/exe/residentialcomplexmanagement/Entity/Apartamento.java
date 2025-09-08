package com.exe.residentialcomplexmanagement.Entity;

import com.exe.residentialcomplexmanagement.Enum.EstadoApartamento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "apartamentos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apartamento {

    // Identificador único del apartamento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private long idApartamento;

    // Número identificador del apartamento (ej: 101, 202A)
    @Column(name = "Numero_apartamento", nullable = false, unique = true, length = 50)
    private String numeroApartamento;
    
    // Estado actual del apartamento (ej: OCUPADO, DISPONIBLE)
    @Enumerated(EnumType.STRING)
    @Column(name= "Estado_apartanmento", nullable = false)
    private EstadoApartamento estado;

    // Fecha de registro del apartamento en el sistema
    @Column(name = "fecha_registro", nullable = false, updatable = false)
    private LocalDate fechaRegistro;

    // Relación muchos a uno con Propietario (un propietario puede tener varios apartamentos)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "propietario_id")
    private Propietario propietario;

    // Relación uno a muchos con Residente (un apartamento puede tener varios residentes)
    @OneToMany(mappedBy = "apartamento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Residente> residentes;

    // Relación uno a muchos con Visitante (un apartamento puede tener varios visitantes)
    @OneToMany(mappedBy = "apartamento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Visitante> visitantes;

    // Relación uno a muchos con Parqueadero (un apartamento puede tener varios parqueaderos)
    @OneToMany(mappedBy = "apartamento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Parqueadero> parqueaderos;

    // Relación uno a muchos con Correspondencia (un apartamento puede recibir varias correspondencias)
    @OneToMany(mappedBy = "apartamento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Correspondencia> correspondencias;

    // Relación uno a muchos con Solicitud (un apartamento puede tener varias solicitudes)
    @OneToMany(mappedBy = "apartamento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Solicitud> solicitudes;

}
