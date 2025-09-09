package com.exe.residentialcomplexmanagement.DTO;

import lombok.Data;

@Data

public class SolicitudDTO {

    private Long id;

    private String tipo;

    private String descripcion;

    private java.time.LocalDate fecha;

    private ApartamentoDTO apartamento;
}
