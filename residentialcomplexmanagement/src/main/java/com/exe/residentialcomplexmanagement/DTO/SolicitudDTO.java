package com.exe.residentialcomplexmanagement.DTO;

import java.time.LocalDate;

import com.exe.residentialcomplexmanagement.Enum.PrioridadSolicitud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolicitudDTO { // DTO para transferir datos de Solicitud
    private Long id; // ID de la solicitud
    private String tipo; // Tipo de la solicitud
    private String descripcion; // Descripción de la solicitud
    private LocalDate fecha; // Fecha de la solicitud
    private PrioridadSolicitud prioridad; // Prioridad de la solicitud
    private ApartamentoDTO apartamento; // Apartamento asociado a la solicitud
}
