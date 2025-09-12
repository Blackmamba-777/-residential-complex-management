package com.exe.residentialcomplexmanagement.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class VisitanteDTO {

    private Long id; // ID del visitante
    private String nombre; // Nombre del visitante
    private String telefono; // Teléfono del visitante
    private String motivoVisita; // Motivo de la visita
    private ApartamentoDTO apartamento; // Apartamento asociado al visitante
}
