package com.exe.residentialcomplexmanagement.Service;

import com.exe.residentialcomplexmanagement.DTO.VisitanteDTO;

public interface VisitanteService {

    // ------------------ CRUD BÁSICO ------------------


    /**
     * Crear un nuevo visitante.
     */

        VisitanteDTO crearVisitante(VisitanteDTO visitanteDTO);
    // Crea un nuevo visitante en la base de datos y devuelve el DTO del visitante creado.


    /**
     * Obtener un visitante por su ID.
     */
        VisitanteDTO obtenerVisitantePorId(Long id);
    // Obtiene un visitante por su ID.


    /**
     * Obtener todos los visitantes registrados.
     */
        java.util.List<VisitanteDTO> obtenerTodosLosVisitantes();
    // Devuelve una lista de todos los visitantes en la base de datos.


    /**
     * Actualizar los datos de un visitante.
     */
        VisitanteDTO actualizarVisitante(Long id, VisitanteDTO visitanteDTO);
    // Actualiza un visitante existente con los datos proporcionados en el DTO y devuelve el DTO actualizado.


    /**
     * Eliminar un visitante por su ID.
     */
        void eliminarVisitante(Long id);
    // Elimina un visitante de la base de datos por su ID.


    // ------------------ CONSULTAS PERSONALIZADAS ------------------

    /**
     * Listar visitantes por apartamento
     */
        java.util.List<VisitanteDTO> listarVisitantesPorApartamento(Long idApartamento);
    // Busca todas los visitantes que coincidan con un apartamento específico.
    

    /**
     * Listar visitantes por nombre
     */
        java.util.List<VisitanteDTO> listarVisitantesPorNombre(String nombre);
    // Busca todas los visitantes que coincidan con un nombre específico.


    /**
     * Listar visitantes por motivo de visita
     */
        java.util.List<VisitanteDTO> listarVisitantesPorMotivoVisita(String motivoVisita);
    // Devuelve todas los visitantes que coincidan con un motivo de visita específico.


    /**
     * Listar visitantes por teléfono
     */
        java.util.List<VisitanteDTO> listarVisitantesPorTelefono(String telefono);
    // Busca todas los visitantes que coincidan con un teléfono específico.


    /**
     * Listar visitantes ordenados por nombre
     */
        java.util.List<VisitanteDTO> listarVisitantesOrdenadosPorNombre();
    // Lista todos los visitantes ordenados alfabéticamente por nombre

    
    /**
     * Contar visitantes por apartamento
     */
        Long contarVisitantesPorApartamento(Long idApartamento);
    // Devuelve el número total de visitantes asociados a un apartamento específico

    
    }

