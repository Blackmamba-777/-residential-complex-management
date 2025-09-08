package com.exe.residentialcomplexmanagement.DTO;

import lombok.Data;

@Data

public class Residentes {

    private Long id;

    private String nombre;

    private String apellido;

    private String email;

    private Apartamento apartamento;


}
