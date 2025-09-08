package com.exe.residentialcomplexmanagement.DTO;

import lombok.Data;

@Data

public class Solicitudes {

    private Long id;

    private String tipo;

    private String descripcion;

    private java.time.LocalDate fecha;

    private Apartamento apartamento;
}
