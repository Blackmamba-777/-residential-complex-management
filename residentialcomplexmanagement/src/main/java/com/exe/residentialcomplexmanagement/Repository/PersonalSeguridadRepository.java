package com.exe.residentialcomplexmanagement.Repository;

import com.exe.residentialcomplexmanagement.Entity.PersonalSeguridad;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalSeguridadRepository extends JpaRepository<PersonalSeguridad, Long> {

    // Buscar por nombre (parcial, sin importar mayúsculas/minúsculas)
    List<PersonalSeguridad> findByNombreContainingIgnoreCase(String nombre);

    // Buscar por turno (por ejemplo: "Mañana", "Tarde", "Noche")
    List<PersonalSeguridad> findByTurno(String turno);

    // Buscar por estado (por ejemplo: "Activo", "Inactivo")
    List<PersonalSeguridad> findByEstado(String estado);
}