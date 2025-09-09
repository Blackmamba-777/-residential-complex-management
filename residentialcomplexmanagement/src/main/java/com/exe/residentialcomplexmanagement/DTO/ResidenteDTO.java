package com.exe.residentialcomplexmanagement.DTO;

import lombok.Data;

@Data

public class ResidenteDTO {

    private Long id;

    private String nombre;

    private String apellido;

    private String email;

    private ApartamentoDTO apartamento;


}
