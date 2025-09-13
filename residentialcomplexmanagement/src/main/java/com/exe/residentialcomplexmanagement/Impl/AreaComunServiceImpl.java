package com.exe.residentialcomplexmanagement.Impl;

import com.exe.residentialcomplexmanagement.Entity.AreaComun;
import com.exe.residentialcomplexmanagement.Repository.AreaComunRepository;
import com.exe.residentialcomplexmanagement.Service.AreaComunService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaComunServiceImpl implements AreaComunService {

    @Autowired
    private AreaComunRepository areaComunRepository;

    /**
     * Guarda un área común nueva o actualiza una existente.
     */
    @Override
    public AreaComun save(AreaComun areaComun) {
        return areaComunRepository.save(areaComun);
    }

    /**
     * Obtiene la lista de todas las áreas comunes.
     */
    @Override
    public List<AreaComun> findAll() {
        return areaComunRepository.findAll();
    }

    /**
     * Busca un área común por su ID.
     */
    @Override
    public Optional<AreaComun> findById(Long id) {
        return areaComunRepository.findById(id);
    }

    /**
     * Elimina un área común por su ID.
     */
    @Override
    public void deleteById(Long id) {
        areaComunRepository.deleteById(id);
    }

    /**
     * Busca áreas comunes por nombre (búsqueda parcial, sin importar mayúsculas/minúsculas).
     */
    @Override
    public List<AreaComun> findByNombre(String nombre) {
        return areaComunRepository.findByNombreContainingIgnoreCase(nombre);
    }
}