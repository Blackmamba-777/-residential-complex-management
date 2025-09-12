package com.exe.residentialcomplexmanagement.Impl;

import com.exe.residentialcomplexmanagement.DTO.SolicitudDTO;
import com.exe.residentialcomplexmanagement.DTO.ApartamentoDTO;
import com.exe.residentialcomplexmanagement.Entity.Solicitud;
import com.exe.residentialcomplexmanagement.Entity.Apartamento;
import com.exe.residentialcomplexmanagement.Enum.PrioridadSolicitud;
import com.exe.residentialcomplexmanagement.Repository.SolicitudRepos;
import com.exe.residentialcomplexmanagement.Service.SolicitudService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudServiceImpl implements SolicitudService {

    private final SolicitudRepos repository;

    public SolicitudServiceImpl(SolicitudRepos repository) {
        this.repository = repository;
    }

    // ------------------ CRUD BÁSICO ------------------

    @Override
    public SolicitudDTO crearSolicitud(SolicitudDTO dto) { // Crear una nueva solicitud 
        Solicitud s = new Solicitud(); // Instanciamos la entidad Solicitud 
        s.setTipo(dto.getTipo()); // Asignamos los valores del DTO a la entidad 
        s.setDescripcion(dto.getDescripcion()); // Asignamos la descripción 
        s.setFecha(dto.getFecha()); // Asignamos la fecha
        s.setPrioridad(dto.getPrioridad()); // Asignamos la prioridad

        // Relación con apartamento
        Apartamento apartamento = new Apartamento(); // Creamos una instancia de Apartamento 
        apartamento.setIdApartamento(dto.getApartamento().getId()); // Asignamos el ID del apartamento desde el DTO
        s.setApartamento(apartamento); // Establecemos la relación

        Solicitud guardada = repository.save(s); // Guardamos la entidad en la base de datos

        return mapToDTO(guardada); // Convertimos la entidad guardada a DTO y la devolvemos
    }

    @Override
    public SolicitudDTO obtenerSolicitudPorId(Long id) { // Obtener una solicitud por su ID 
        Solicitud s = repository.findById(id) // Buscamos la solicitud en el repositorio
                .orElseThrow(() -> new RuntimeException("Solicitud no encontrada con ID: " + id)); // Si no se encuentra, lanzamos una excepción
        return mapToDTO(s); // Convertimos la entidad a DTO y la devolvemos
    }

    @Override
    public List<SolicitudDTO> obtenerTodasLasSolicitudes() { // Obtener todas las solicitudes
        return repository.findAll() // Buscamos todas las solicitudes en el repositorio
                .stream() // Convertimos la lista a un stream
                .map(this::mapToDTO) // Convertimos cada entidad a DTO
                .toList(); // Devolvemos la lista de DTOs
    }

    @Override
    public SolicitudDTO actualizarSolicitud(Long id, SolicitudDTO dto) { // Actualizar una solicitud existente
        Solicitud s = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Solicitud no encontrada con ID: " + id)); // Buscamos la solicitud por ID o lanzamos una excepción si no se encuentra

        // Actualizamos los datos
        s.setTipo(dto.getTipo()); // Actualizamos el tipo 
        s.setDescripcion(dto.getDescripcion()); // Actualizamos la descripción
        s.setFecha(dto.getFecha()); // Actualizamos la fecha
        s.setPrioridad(dto.getPrioridad()); // Actualizamos la prioridad

        Solicitud actualizada = repository.save(s); // Guardamos los cambios en la base de datos

        return mapToDTO(actualizada); // Convertimos la entidad actualizada a DTO y la devolvemos
    }

    @Override
    public void eliminarSolicitud(Long id) { // Eliminar una solicitud por su ID
        if (!repository.existsById(id)) { // Verificamos si la solicitud existe
            throw new RuntimeException("Solicitud no encontrada con ID: " + id); // Si no existe, lanzamos una excepción
        }
        repository.deleteById(id); // Si existe, la eliminamos
    }


    // ------------------ CONSULTAS PERSONALIZADAS ------------------

    @Override
    public List<SolicitudDTO> listarSolicitudesPorTipo(String tipo) {
        return repository.findByTipo(tipo)
                .stream()
                .map(this::mapToDTO)
                .toList();
    }

    @Override
    public List<SolicitudDTO> listarSolicitudesPorPrioridad(PrioridadSolicitud prioridad) {
        return repository.findByPrioridad(prioridad)
                .stream()
                .map(this::mapToDTO)
                .toList();
    }

    @Override
    public List<SolicitudDTO> listarSolicitudesPorApartamento(Long idApartamento) {
        return repository.findByApartamentoIdApartamento(idApartamento)
                .stream()
                .map(this::mapToDTO)
                .toList();
    }

    @Override
    public List<SolicitudDTO> listarSolicitudesPorRangoDeFechas(java.time.LocalDate inicio, java.time.LocalDate fin) {
        return repository.findByFechaBetween(inicio, fin)
                .stream()
                .map(this::mapToDTO)
                .toList();
    }

    @Override
    public List<SolicitudDTO> listarSolicitudesOrdenadasPorFecha() {
        return repository.findAllOrderByFechaDesc()
                .stream()
                .map(this::mapToDTO)
                .toList();
    }

    @Override
    public Long contarSolicitudesPorPrioridad(PrioridadSolicitud prioridad) {
        return repository.countByPrioridad(prioridad);
    }

    // ------------------ MÉTODO AUXILIAR ------------------

    /**
     * Convierte una entidad Solicitud en un DTO.
     */
    private SolicitudDTO mapToDTO(Solicitud s) {
    return new SolicitudDTO(
            s.getIdSolicitud(),
            s.getTipo(),
            s.getDescripcion(),
            s.getFecha(),
            s.getPrioridad(), 
            new ApartamentoDTO(
                s.getApartamento().getIdApartamento(), null, null, null, null
            )
    );
}

}
