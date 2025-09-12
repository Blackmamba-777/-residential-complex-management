package com.exe.residentialcomplexmanagement.Repository;

import com.exe.residentialcomplexmanagement.Entity.Solicitud;
import com.exe.residentialcomplexmanagement.Enum.PrioridadSolicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SolicitudRepos extends JpaRepository<Solicitud, Long> {

    /**
     * Buscar solicitudes por tipo
     */
    List<Solicitud> findByTipo(String tipo);
    // Devuelve todas las solicitudes filtradas por su tipo
    

    /**
     * Buscar solicitudes por prioridad
     */
    List<Solicitud> findByPrioridad(PrioridadSolicitud prioridad);
    // Devuelve todas las solicitudes filtradas por su prioridad


    /**
     * Buscar solicitudes de un apartamento específico.
     */
    List<Solicitud> findByApartamentoIdApartamento(Long idApartamento);
    // Obtiene todas las solicitudes relacionadas con un apartamento específico


    /**
     * Buscar solicitudes entre dos fechas.
     */
    List<Solicitud> findByFechaBetween(LocalDate fechaInicio, LocalDate fechaFin);
    // Devuelve solicitudes creadas dentro de un rango de fechas


    /**
     * Obtener todas las solicitudes ordenadas por fecha descendente.
     */
    @Query("SELECT s FROM Solicitud s ORDER BY s.fecha DESC")
    List<Solicitud> findAllOrderByFechaDesc();
    // Lista todas las solicitudes ordenadas de más reciente a más antigua


    /**
     * Contar cuántas solicitudes existen por prioridad.
     */
    @Query("SELECT COUNT(s) FROM Solicitud s WHERE s.prioridad = :prioridad")
    Long countByPrioridad(PrioridadSolicitud prioridad);
    // Devuelve el número total de solicitudes con una prioridad específica
}
