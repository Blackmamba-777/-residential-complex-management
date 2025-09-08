package com.exe.residentialcomplexmanagement.Entity;

import com.exe.residentialcomplexmanagement.Enum.EstadoCorrespondencia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "correspondencia")

public class Correspondencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long idCorrespondencia;

    @Column(name = "tipo",nullable = false, length = 100)
    private String tipo;

    @Column(name = "fecha_recepcion",nullable = false)
    private java.time.LocalDate fechaRecepcion;

    @Enumerated(EnumType.STRING)
    private EstadoCorrespondencia estado;

    @ManyToOne
    @JoinColumn(name = "idApartamento", nullable = false)
    private Apartamento apartamento;


}
