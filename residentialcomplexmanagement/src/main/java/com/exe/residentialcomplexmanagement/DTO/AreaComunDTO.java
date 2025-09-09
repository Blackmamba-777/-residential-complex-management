package com.exe.residentialcomplexmanagement.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AreaComunDTO {

    private Long id;
    private String nombre;
    private Integer capacidad;
    private String horario;
}
