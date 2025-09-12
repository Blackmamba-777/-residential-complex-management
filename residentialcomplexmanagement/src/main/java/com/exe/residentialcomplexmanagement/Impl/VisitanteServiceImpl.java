package com.exe.residentialcomplexmanagement.Impl;

import com.exe.residentialcomplexmanagement.DTO.VisitanteDTO;
import com.exe.residentialcomplexmanagement.Entity.Visitante;
import com.exe.residentialcomplexmanagement.Entity.Apartamento;
import com.exe.residentialcomplexmanagement.Repository.VisitanteRepository;
import com.exe.residentialcomplexmanagement.Repository.ApartamentoRepository;
import com.exe.residentialcomplexmanagement.Service.VisitanteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VisitanteServiceImpl implements VisitanteService {

    @Autowired
    private VisitanteRepository visitanteRepository;

    @Autowired
    private ApartamentoRepository apartamentoRepository;

    // ------------------ MÉTODOS CRUD ------------------

    /**
     * Crear un nuevo visitante.
     * Convierte el DTO en entidad, lo guarda en la BD y devuelve el DTO creado.
     */
    @Override
    public VisitanteDTO crearVisitante(VisitanteDTO visitanteDTO) { // Crea un nuevo visitante en la base de datos y devuelve el DTO del visitante creado.
        Visitante visitante = mapToEntity(visitanteDTO); // Convertir DTO a entidad Visitante
        Visitante guardado = visitanteRepository.save(visitante); // Guardar en la base de datos
        return mapToDTO(guardado); // Convertir entidad guardada a DTO y devolver
    }

    /**
     * Obtener un visitante por su ID.
     * Lanza excepción si no existe.
     */
    @Override
    public VisitanteDTO obtenerVisitantePorId(Long id) { // Obtiene un visitante por su ID. 
        Visitante visitante = visitanteRepository.findById(id) // Busca el visitante en la base de datos por su ID
                .orElseThrow(() -> new RuntimeException("Visitante no encontrado con id: " + id)); // Lanza excepción si no se encuentra
        return mapToDTO(visitante); // Convierte la entidad a DTO y devuelve
    }

    /**
     * Listar todos los visitantes.
     */
    @Override
    public List<VisitanteDTO> obtenerTodosLosVisitantes() { // Devuelve una lista de todos los visitantes en la base de datos.
        return visitanteRepository.findAll() // Obtiene todos los visitantes de la base de datos
                .stream() // Convierte la lista a un stream
                .map(this::mapToDTO) // Mapea cada entidad Visitante a VisitanteDTO
                .collect(Collectors.toList()); // Recoge los resultados en una lista y devuelve
    }

    /**
     * Actualizar un visitante existente.
     */
    @Override
    public VisitanteDTO actualizarVisitante(Long id, VisitanteDTO visitanteDTO) { // Actualiza un visitante existente con los datos proporcionados en el DTO y devuelve el DTO actualizado.
        Visitante visitante = visitanteRepository.findById(id) // Busca el visitante en la base de datos por su ID
                .orElseThrow(() -> new RuntimeException("Visitante no encontrado con id: " + id)); // Lanza excepción si no se encuentra

        // Actualizamos los campos
        visitante.setNombre(visitanteDTO.getNombre()); // Actualiza el nombre del visitante
        visitante.setTelefono(visitanteDTO.getTelefono()); // Actualiza el teléfono del visitante
        visitante.setMotivoVisita(visitanteDTO.getMotivoVisita()); // Actualiza el motivo de la visita

        // Si el visitante tiene un apartamento asociado, lo actualizamos
        if (visitanteDTO.getApartamento() != null) { // Si el DTO tiene un apartamento asociado
            Long numeroApartamentoLong = Long.valueOf(visitanteDTO.getApartamento().getNumeroApartamento()); // Convertimos el número de apartamento a Long
            Apartamento apartamento = apartamentoRepository.findById(numeroApartamentoLong) // Buscamos el apartamento en la base de datos
                    .orElseThrow(() -> new RuntimeException("Apartamento no encontrado con id: " + 
                            visitanteDTO.getApartamento().getNumeroApartamento())); // Lanza excepción si no se encuentra
            visitante.setApartamento(apartamento); // Asociamos el apartamento al visitante
        }

        Visitante actualizado = visitanteRepository.save(visitante); // Guardamos los cambios en la base de datos
        return mapToDTO(actualizado); // Convertimos la entidad actualizada a DTO y devolvemos
    } 

    /**
     * Eliminar un visitante por ID.
     */
    @Override
    public void eliminarVisitante(Long id) { // Elimina un visitante de la base de datos por su ID.
        Visitante visitante = visitanteRepository.findById(id) // Busca el visitante en la base de datos por su ID
                .orElseThrow(() -> new RuntimeException("Visitante no encontrado con id: " + id)); // Lanza excepción si no se encuentra
        visitanteRepository.delete(visitante); // Elimina el visitante de la base de datos
    }

    // ------------------ MÉTODOS DE MAPEO ------------------

    /**
     * Convierte una entidad Visitante a DTO VisitanteDTO.
     */
    private VisitanteDTO mapToDTO(Visitante v) {
        return new VisitanteDTO(
        );
    }

    /**
     * Convierte un DTO VisitanteDTO a entidad Visitante.
     */
    private Visitante mapToEntity(VisitanteDTO dto) {
        Visitante visitante = new Visitante();
        visitante.setId(dto.getId());
        visitante.setNombre(dto.getNombre());
        visitante.setTelefono(dto.getTelefono());
        visitante.setMotivoVisita(dto.getMotivoVisita());

        // Si tiene apartamento, lo asociamos desde BD
        if (dto.getApartamento() != null && dto.getApartamento().getNumeroApartamento() != null) {
            Long numeroApartamentoLong = Long.valueOf(dto.getApartamento().getNumeroApartamento());
            Apartamento apartamento = apartamentoRepository.findById(numeroApartamentoLong)
                    .orElseThrow(() -> new RuntimeException("Apartamento no encontrado con id: " +
                            dto.getApartamento().getNumeroApartamento()));
            visitante.setApartamento(apartamento);
        }

        return visitante;
    }

    @Override
    public List<VisitanteDTO> listarVisitantesPorApartamento(Long idApartamento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarVisitantesPorApartamento'");
    }

    @Override
    public List<VisitanteDTO> listarVisitantesPorNombre(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarVisitantesPorNombre'");
    }

    @Override
    public List<VisitanteDTO> listarVisitantesPorMotivoVisita(String motivoVisita) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarVisitantesPorMotivoVisita'");
    }

    @Override
    public List<VisitanteDTO> listarVisitantesPorTelefono(String telefono) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarVisitantesPorTelefono'");
    }

    @Override
    public List<VisitanteDTO> listarVisitantesOrdenadosPorNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarVisitantesOrdenadosPorNombre'");
    }

    @Override
    public Long contarVisitantesPorApartamento(Long idApartamento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contarVisitantesPorApartamento'");
    }
}
