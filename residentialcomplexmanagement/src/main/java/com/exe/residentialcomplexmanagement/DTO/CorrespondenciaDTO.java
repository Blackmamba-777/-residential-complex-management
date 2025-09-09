package com.exe.residentialcomplexmanagement.DTO;

import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CorrespondenciaDTO {

    private Long id;
    private String tipo;
    private LocalDate fechaRecepcion;
    private ApartamentoDTO apartamento;
}
