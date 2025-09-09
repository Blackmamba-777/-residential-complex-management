package com.exe.residentialcomplexmanagement.Repository;

import com.exe.residentialcomplexmanagement.Entity.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Long> {
}
