package com.exe.residentialcomplexmanagement.Entity;

import com.exe.residentialcomplexmanagement.Enum.MotivoVisita;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "visitantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitante {

    // Identificador único del visitante
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long idVisitantes;

    // Nombre completo del visitante
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    // Teléfono de contacto del visitante
    @Column(name = "telefono", length = 15)
    private String telefono;

    // Motivo de la visita (ej: familiar, proveedor)
    @Enumerated(EnumType.STRING)
    @Column(name = "motivo_visita", nullable = false, length = 50)
    private MotivoVisita motivoVisita;

    // Relación muchos a uno con Apartamento (a qué apartamento visita)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idApartamento", nullable = false)
    private Apartamento apartamento;

}
