package com.exe.residentialcomplexmanagement.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PropietarioDTO {

    private Long id;
    private String nombre;
    private String telefono;
    private String email;
}
