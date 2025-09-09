package com.exe.residentialcomplexmanagement.DTO;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApartamentoDTO {

    private long id;
    private String numeroApartamento;
    private String  estado;
    private PropietarioDTO propietario;
    private List<ResidenteDTO> residentes;

}
