package com.exe.residentialcomplexmanagement.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VisitanteDTO {

    private Long id;
    private String nombre;
    private String telefono;
    private ApartamentoDTO apartamento;
}
