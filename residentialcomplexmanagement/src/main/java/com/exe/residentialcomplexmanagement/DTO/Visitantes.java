package com.exe.residentialcomplexmanagement.DTO;

import lombok.Data;

@Data

public class Visitantes {

    private Long id;

    private String nombre;

    private String telefono;

    private Apartamento apartamento;
}
