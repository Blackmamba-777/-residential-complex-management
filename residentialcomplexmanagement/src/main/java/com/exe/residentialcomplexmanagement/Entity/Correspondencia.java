package com.exe.residentialcomplexmanagement.Entity;

import com.exe.residentialcomplexmanagement.Enum.EstadoCorrespondencia;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "correspondencias")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Correspondencia {

    // Identificador único de la correspondencia
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long idCorrespondencia;

    // Tipo de correspondencia (ej: carta, paquete)
    @Column(name = "tipo",nullable = false, length = 100)
    private String tipo;

    // Fecha en la que se recibió la correspondencia
    @Column(name = "fecha_recepcion", nullable = false)
    private LocalDate fechaRecepcion;

    // Estado de la correspondencia (ej: ENTREGADO, PENDIENTE)
    @Enumerated(EnumType.STRING)
    @Column (name = "estado", nullable = false, length = 50)
    private EstadoCorrespondencia estado;

    // Relación muchos a uno con Apartamento (a qué apartamento va dirigida)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idApartamento", nullable = false)
    private Apartamento apartamento;

}
