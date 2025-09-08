package com.exe.residentialcomplexmanagement.DTO;

import lombok.Data;


@Data

public class Correspondencia {

    private Long id;

    private String tipo;

    private java.time.LocalDate fechaRecepcion;

    private Apartamento apartamento;
}
