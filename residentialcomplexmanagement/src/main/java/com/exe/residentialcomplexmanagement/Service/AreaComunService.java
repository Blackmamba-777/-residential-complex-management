package com.exe.residentialcomplexmanagement.Service;

import java.util.List;
import java.util.Optional;

import com.exe.residentialcomplexmanagement.Entity.AreaComun;

public interface AreaComunService {
    /**
     * Guarda un área común nueva o actualiza una existente.
     * @param areaComun El objeto AreaComun a guardar.
     * @return El área común guardada.
     */
    AreaComun save(AreaComun areaComun);

    /**
     * Obtiene la lista de todas las áreas comunes.
     * @return Lista de áreas comunes.
     */
    List<AreaComun> findAll();

    /**
     * Busca un área común por su ID.
     * @param id El ID del área común.
     * @return Un Optional con el área común encontrada o vacío si no existe.
     */
    Optional<AreaComun> findById(Long id);

    /**
     * Elimina un área común por su ID.
     * @param id El ID del área común a eliminar.
     */
    void deleteById(Long id);

    /**
     * Busca áreas comunes por nombre (búsqueda parcial, sin importar mayúsculas/minúsculas).
     * @param nombre El nombre o parte del nombre a buscar.
     * @return Lista de áreas comunes que coinciden con el nombre.
     */
    List<AreaComun> findByNombre(String nombre);
}
