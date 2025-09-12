package com.exe.residentialcomplexmanagement.Repository;

import com.exe.residentialcomplexmanagement.Entity.Visitante;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Long> {

    List<Visitante> findByApartamentoIdApartamento(Long idApartamento);
    // Obtiene todos los visitantes relacionados con un apartamento específico

    List<Visitante> findByNombreContainingIgnoreCase(String nombre);
    // Busca visitantes cuyo nombre contenga una cadena específica.

    List<Visitante> findByMotivoVisita(String motivoVisita);
    // Devuelve todos los visitantes filtrados por su motivo de visita

    List<Visitante> findByTelefono(String telefono);
    // Busca visitantes por su número de teléfono

    List<Visitante> findByTelefonoContainingIgnoreCase(String telefono);
    // Busca visitantes cuyo teléfono contenga una cadena específica.

    @Query("SELECT v FROM Visitante v ORDER BY v.nombre ASC")
    List<Visitante> findAllOrderByNombreAsc();
    // Lista todos los visitantes ordenados alfabéticamente por nombre

    
    @Query("SELECT COUNT(v) FROM Visitante v WHERE v.apartamento.idApartamento = :idApartamento")
    Long countByApartamentoIdApartamento(Long idApartamento);
    // Devuelve el número total de visitantes asociados a un apartamento específico
}
