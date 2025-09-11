package com.exe.residentialcomplexmanagement.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParqueaderoConApartamentoDTO {

    private Long idParqueadero;
    private String numero;
    private String tipo;
    private String estado;      
    private Long idApartamento; 
}
