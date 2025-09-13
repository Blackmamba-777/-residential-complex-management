package com.exe.residentialcomplexmanagement.Repository;

import com.exe.residentialcomplexmanagement.Entity.AreaComun;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaComunRepository extends JpaRepository<AreaComun, Long> {
    
    // Buscar áreas comunes por nombre
    List<AreaComun> findByNombreContainingIgnoreCase(String nombre);
}
