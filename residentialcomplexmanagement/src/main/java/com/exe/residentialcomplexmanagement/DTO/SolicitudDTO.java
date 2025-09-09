package com.exe.residentialcomplexmanagement.DTO;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SolicitudDTO {

    private Long id;
    private String tipo;
    private String descripcion;
    private LocalDate fecha;
    private ApartamentoDTO apartamento;
}
