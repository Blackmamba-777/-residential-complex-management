package com.exe.residentialcomplexmanagement.Repository;

import com.exe.residentialcomplexmanagement.Entity.Correspondencia;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorrespondenciaRepository extends JpaRepository<Correspondencia, Long> {

    // Buscar por destinatario
    List<Correspondencia> findByDestinatarioContainingIgnoreCase(String destinatario);

    // Buscar por estado (por ejemplo: "Entregado", "Pendiente")
    List<Correspondencia> findByEstado(String estado);

    // Buscar correspondencia recibida entre dos fechas
    List<Correspondencia> findByFechaRecepcionBetween(LocalDate fechaInicio, LocalDate fechaFin);
}
