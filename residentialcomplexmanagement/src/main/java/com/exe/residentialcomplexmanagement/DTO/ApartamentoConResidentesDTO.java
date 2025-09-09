package com.exe.residentialcomplexmanagement.DTO;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ApartamentoConResidentesDTO {

    private long id;
    private String numeroApartamento;
    private String  estado;
    private PropietarioDTO propietario;
    private List<ResidenteDTO> residentes;

}
