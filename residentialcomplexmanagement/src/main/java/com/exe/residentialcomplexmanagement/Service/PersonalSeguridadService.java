package com.exe.residentialcomplexmanagement.Service;

import java.util.List;
import java.util.Optional;

import com.exe.residentialcomplexmanagement.Entity.PersonalSeguridad;

public interface PersonalSeguridadService {
    /**
     * Guarda un nuevo personal de seguridad o actualiza uno existente.
     * @param personal El objeto PersonalSeguridad a guardar.
     * @return El personal de seguridad guardado.
     */
    PersonalSeguridad save(PersonalSeguridad personal);

    /**
     * Obtiene la lista de todo el personal de seguridad.
     * @return Lista de personal de seguridad.
     */
    List<PersonalSeguridad> findAll();

    /**
     * Busca un personal de seguridad por su ID.
     * @param id El ID del personal de seguridad.
     * @return Un Optional con el personal encontrado o vacío si no existe.
     */
    Optional<PersonalSeguridad> findById(Long id);

    /**
     * Elimina un personal de seguridad por su ID.
     * @param id El ID del personal a eliminar.
     */
    void deleteById(Long id);

    /**
     * Busca personal de seguridad por nombre (búsqueda parcial, sin importar mayúsculas/minúsculas).
     * @param nombre El nombre o parte del nombre a buscar.
     * @return Lista de personal que coinciden con el nombre.
     */
    List<PersonalSeguridad> findByNombre(String nombre);

    /**
     * Busca personal de seguridad por turno (por ejemplo: "Mañana", "Tarde", "Noche").
     * @param turno El turno a buscar.
     * @return Lista de personal que trabajan en ese turno.
     */
    List<PersonalSeguridad> findByTurno(String turno);

    /**
     * Busca personal de seguridad por estado (por ejemplo: "Activo", "Inactivo").
     * @param estado El estado a buscar.
     * @return Lista de personal con el estado indicado.
     */
    List<PersonalSeguridad> findByEstado(String estado);
}
