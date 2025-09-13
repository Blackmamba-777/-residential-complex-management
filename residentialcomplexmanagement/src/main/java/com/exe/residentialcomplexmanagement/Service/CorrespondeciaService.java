package com.exe.residentialcomplexmanagement.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.exe.residentialcomplexmanagement.Entity.Correspondencia;

public interface CorrespondeciaService {
    /**
     * Guarda una nueva correspondencia o actualiza una existente.
     * @param correspondencia El objeto Correspondencia a guardar.
     * @return La correspondencia guardada.
     */
    Correspondencia save(Correspondencia correspondencia);

    /**
     * Obtiene la lista de todas las correspondencias.
     * @return Lista de correspondencias.
     */
    List<Correspondencia> findAll();

    /**
     * Busca una correspondencia por su ID.
     * @param id El ID de la correspondencia.
     * @return Un Optional con la correspondencia encontrada o vacío si no existe.
     */
    Optional<Correspondencia> findById(Long id);

    /**
     * Elimina una correspondencia por su ID.
     * @param id El ID de la correspondencia a eliminar.
     */
    void deleteById(Long id);

    /**
     * Busca correspondencias por destinatario (búsqueda parcial, sin importar mayúsculas/minúsculas).
     * @param destinatario El nombre o parte del nombre del destinatario.
     * @return Lista de correspondencias que coinciden con el destinatario.
     */
    List<Correspondencia> findByDestinatario(String destinatario);

    /**
     * Busca correspondencias por estado (por ejemplo: "Entregado", "Pendiente").
     * @param estado El estado de la correspondencia.
     * @return Lista de correspondencias con el estado indicado.
     */
    List<Correspondencia> findByEstado(String estado);

    /**
     * Busca correspondencias recibidas entre dos fechas.
     * @param fechaInicio Fecha de inicio del rango.
     * @param fechaFin Fecha de fin del rango.
     * @return Lista de correspondencias recibidas en el rango de fechas.
     */
    List<Correspondencia> findByFechaRecepcionBetween(LocalDate fechaInicio, LocalDate fechaFin);
}
