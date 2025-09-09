package com.exe.residentialcomplexmanagement.DTO;

import lombok.Data;

@Data

public class ParqueaderoDTO {

    private Long id;

    private String numero;

    private String tipo;

    private ApartamentoDTO apartamento;
}
