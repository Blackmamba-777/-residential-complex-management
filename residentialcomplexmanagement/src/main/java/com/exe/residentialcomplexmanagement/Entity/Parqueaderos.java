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

@Entity
@Data
@Table(name = "parqueaderos")

public class Parqueaderos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long idParqueaderos;

    @Column(name = "numero", nullable = false, length = 10)
    private String numero;

    @Column(name = "tipo", length = 50)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "idApartamento", nullable = false)
    private Apartamento apartamento;
}
