package com.exe.residentialcomplexmanagement.DTO;

import lombok.Data;

@Data

public class Apartamento {

    private long id;

    private String numeroApartamento;

    private Propietarios propietario;
}
