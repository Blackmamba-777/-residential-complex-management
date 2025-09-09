package com.exe.residentialcomplexmanagement.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ParqueaderoDTO {

    private Long id;
    private String numero;
    private String tipo;
    private ApartamentoDTO apartamento;
}
