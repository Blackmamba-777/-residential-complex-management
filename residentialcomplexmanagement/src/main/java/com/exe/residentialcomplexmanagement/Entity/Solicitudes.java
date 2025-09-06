package com.exe.residentialcomplexmanagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "solicitudes")

public class Solicitudes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long idSolicitudes;

    @Column(name = "tipo", nullable = false, length = 100)
    private String tipo;

    @Column(name = "descripcion", length = 250)
    private String descripcion;

    @Column(name = "fecha", nullable = false)
    private java.time.LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "idApartamento", nullable = false)
    private Apartamento apartamento;
}
