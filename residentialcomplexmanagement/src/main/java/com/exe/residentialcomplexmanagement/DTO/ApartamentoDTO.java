package com.exe.residentialcomplexmanagement.DTO;

import lombok.Data;

@Data

public class ApartamentoDTO {

    private long id;

    private String numeroApartamento;

    private PropietarioDTO propietario;
}
