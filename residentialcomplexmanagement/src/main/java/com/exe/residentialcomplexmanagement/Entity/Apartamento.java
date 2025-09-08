package com.exe.residentialcomplexmanagement.Entity;

import com.exe.residentialcomplexmanagement.Enum.EstadoApartamento;

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
@Table(name = "apartamento")

public class Apartamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private long idApartamento;


    @Column(name = "numero_apartamento", nullable = false, unique = true, length = 50)
    private String numeroApartamento;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoApartamento estado;


    @ManyToOne
    @JoinColumn(name = "idPropietario", nullable = false)
    private Propietarios propietario;

}
