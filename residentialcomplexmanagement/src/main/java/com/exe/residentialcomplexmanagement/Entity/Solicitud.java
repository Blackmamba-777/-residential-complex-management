package com.exe.residentialcomplexmanagement.Entity;

import com.exe.residentialcomplexmanagement.Enum.PrioridadSolicitud;
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

@Data
@Entity
@Table(name = "solicitudes")
public class Solicitud {
    // Identificador único de la solicitud
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long idSolicitudes;

    // Tipo de solicitud (ej: mantenimiento, queja)
    @Column(name = "tipo", nullable = false, length = 100)
    private String tipo;

    // Descripción de la solicitud
    @Column(name = "descripcion", length = 250)
    private String descripcion;

    // Fecha en la que se realiza la solicitud
    @Column(name = "fecha", nullable = false)
    private java.time.LocalDate fecha;

    // Prioridad de la solicitud (ej: ALTA, MEDIA, BAJA)
    @Enumerated(EnumType.STRING)
    private PrioridadSolicitud prioridad;

    // Relación muchos a uno con Apartamento (a qué apartamento pertenece la solicitud)
    @ManyToOne
    @JoinColumn(name = "idApartamento", nullable = false)
    private Apartamento apartamento;
}
