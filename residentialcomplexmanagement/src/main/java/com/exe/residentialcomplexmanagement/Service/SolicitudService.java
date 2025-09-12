package com.exe.residentialcomplexmanagement.Service;

import com.exe.residentialcomplexmanagement.DTO.SolicitudDTO;
import com.exe.residentialcomplexmanagement.Enum.PrioridadSolicitud;

import java.time.LocalDate;
import java.util.List;

public interface SolicitudService {

    // ------------------ CRUD BÁSICO ------------------


    /**
     * Crear una nueva solicitud.
     */
    SolicitudDTO crearSolicitud(SolicitudDTO dto);
    // Crea una nueva solicitud en la base de datos y devuelve el DTO de la solicitud creada.


    /**
     * Obtener una solicitud por su ID.
     */
    SolicitudDTO obtenerSolicitudPorId(Long id);
    // Obtiene una solicitud por su ID.


    /**
     * Obtener todas las solicitudes registradas.
     */
    List<SolicitudDTO> obtenerTodasLasSolicitudes();
    // Devuelve una lista de todas las solicitudes en la base de datos.


    /**
     * Actualizar los datos de una solicitud.
     */
    SolicitudDTO actualizarSolicitud(Long id, SolicitudDTO dto);
    // Actualiza una solicitud existente con los datos proporcionados en el DTO y devuelve el DTO actualizado.


    /**
     * Eliminar una solicitud por su ID.
     */
    void eliminarSolicitud(Long id);
    // Elimina una solicitud de la base de datos por su ID.


    // ------------------ CONSULTAS PERSONALIZADAS ------------------


    /**
     * Listar solicitudes por tipo
     */
    List<SolicitudDTO> listarSolicitudesPorTipo(String tipo);
    // Busca todas las solicitudes que coincidan con un tipo específico.


    /**
     * Listar solicitudes por prioridad
     */
    List<SolicitudDTO> listarSolicitudesPorPrioridad(PrioridadSolicitud prioridad);
    // Devuelve todas las solicitudes con prioridad específica.


    /**
     * Listar solicitudes de un apartamento específico.
     */
    List<SolicitudDTO> listarSolicitudesPorApartamento(Long idApartamento);
    // Lista solicitudes pertenecientes a un apartamento en particular.


    /**
     * Listar solicitudes dentro de un rango de fechas.
     */
    List<SolicitudDTO> listarSolicitudesPorRangoDeFechas(LocalDate inicio, LocalDate fin);
    // Devuelve todas las solicitudes creadas dentro de un rango de fechas.


    /**
     * Listar todas las solicitudes ordenadas por fecha descendente.
     */
    List<SolicitudDTO> listarSolicitudesOrdenadasPorFecha();
    // Trae todas las solicitudes, de la más reciente a la más antigua.


    /**
     * Contar cuántas solicitudes existen por prioridad.
     */
    Long contarSolicitudesPorPrioridad(PrioridadSolicitud prioridad);
    // Devuelve un número entero con cuántas solicitudes hay según la prioridad.

}
