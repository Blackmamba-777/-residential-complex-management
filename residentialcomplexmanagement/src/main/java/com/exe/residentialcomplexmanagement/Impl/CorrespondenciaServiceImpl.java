package com.exe.residentialcomplexmanagement.Impl;

import com.exe.residentialcomplexmanagement.Entity.Correspondencia;
import com.exe.residentialcomplexmanagement.Repository.CorrespondenciaRepository;
import com.exe.residentialcomplexmanagement.Service.CorrespondeciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CorrespondenciaServiceImpl implements CorrespondeciaService {

    @Autowired
    private CorrespondenciaRepository correspondenciaRepository;

    /**
     * Guarda una nueva correspondencia o actualiza una existente.
     */
    @Override
    public Correspondencia save(Correspondencia correspondencia) {
        return correspondenciaRepository.save(correspondencia);
    }

    /**
     * Obtiene la lista de todas las correspondencias.
     */
    @Override
    public List<Correspondencia> findAll() {
        return correspondenciaRepository.findAll();
    }

    /**
     * Busca una correspondencia por su ID.
     */
    @Override
    public Optional<Correspondencia> findById(Long id) {
        return correspondenciaRepository.findById(id);
    }

    /**
     * Elimina una correspondencia por su ID.
     */
    @Override
    public void deleteById(Long id) {
        correspondenciaRepository.deleteById(id);
    }

    /**
     * Busca correspondencias por destinatario (búsqueda parcial, sin importar mayúsculas/minúsculas).
     */
    @Override
    public List<Correspondencia> findByDestinatario(String destinatario) {
        return correspondenciaRepository.findByDestinatarioContainingIgnoreCase(destinatario);
    }

    /**
     * Busca correspondencias por estado (por ejemplo: "Entregado", "Pendiente").
     */
    @Override
    public List<Correspondencia> findByEstado(String estado) {
        return correspondenciaRepository.findByEstado(estado);
    }

    /**
     * Busca correspondencias recibidas entre dos fechas.
     */
    @Override
    public List<Correspondencia> findByFechaRecepcionBetween(LocalDate fechaInicio, LocalDate fechaFin) {
        return correspondenciaRepository.findByFechaRecepcionBetween(fechaInicio, fechaFin);
    }
}