package com.exe.residentialcomplexmanagement.DTO;

import lombok.Data;

@Data

public class Parqueaderos {

    private Long id;

    private String numero;

    private String tipo;

    private Apartamento apartamento;
}
