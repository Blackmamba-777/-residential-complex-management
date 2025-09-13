package com.exe.residentialcomplexmanagement.Impl;

import com.exe.residentialcomplexmanagement.Entity.PersonalSeguridad;
import com.exe.residentialcomplexmanagement.Repository.PersonalSeguridadRepository;
import com.exe.residentialcomplexmanagement.Service.PersonalSeguridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalSeguridadServiceImpl implements PersonalSeguridadService {

    @Autowired
    private PersonalSeguridadRepository personalSeguridadRepository;

    /**
     * Guarda un nuevo personal de seguridad o actualiza uno existente.
     */
    @Override
    public PersonalSeguridad save(PersonalSeguridad personal) {
        return personalSeguridadRepository.save(personal);
    }

    /**
     * Obtiene la lista de todo el personal de seguridad.
     */
    @Override
    public List<PersonalSeguridad> findAll() {
        return personalSeguridadRepository.findAll();
    }

    /**
     * Busca un personal de seguridad por su ID.
     */
    @Override
    public Optional<PersonalSeguridad> findById(Long id) {
        return personalSeguridadRepository.findById(id);
    }

    /**
     * Elimina un personal de seguridad por su ID.
     */
    @Override
    public void deleteById(Long id) {
        personalSeguridadRepository.deleteById(id);
    }

    /**
     * Busca personal de seguridad por nombre (búsqueda parcial, sin importar mayúsculas/minúsculas).
     */
    @Override
    public List<PersonalSeguridad> findByNombre(String nombre) {
        return personalSeguridadRepository.findByNombreContainingIgnoreCase(nombre);
    }

    /**
     * Busca personal de seguridad por turno (por ejemplo: "Mañana", "Tarde", "Noche").
     */
    @Override
    public List<PersonalSeguridad> findByTurno(String turno) {
        return personalSeguridadRepository.findByTurno(turno);
    }

    /**
     * Busca personal de seguridad por estado (por ejemplo: "Activo", "Inactivo").
     */
    @Override
    public List<PersonalSeguridad> findByEstado(String estado) {
        return personalSeguridadRepository.findByEstado(estado);
    }
}