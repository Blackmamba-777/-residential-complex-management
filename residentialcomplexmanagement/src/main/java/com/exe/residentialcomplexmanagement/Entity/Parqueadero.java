package com.exe.residentialcomplexmanagement.Entity;

import com.exe.residentialcomplexmanagement.Enum.EstadoParqueadero;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "parqueaderos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parqueadero {

    // Identificador único del parqueadero
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long idParqueadero;

    // Número del parqueadero (ej: P1, P2)
    @Column(name = "numero", nullable = false, length = 10)
    private String numero;

    // Tipo de parqueadero (ej: carro, moto)
    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    // Estado del parqueadero (ej: OCUPADO, LIBRE)
    @Enumerated(EnumType.STRING)
    private EstadoParqueadero estado;

    // Relación muchos a uno con Apartamento (a qué apartamento pertenece)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idApartamento", nullable = false)
    private Apartamento apartamento;
}
