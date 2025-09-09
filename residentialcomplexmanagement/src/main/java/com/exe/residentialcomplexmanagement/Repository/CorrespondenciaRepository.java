package com.exe.residentialcomplexmanagement.Repository;

import com.exe.residentialcomplexmanagement.Entity.Correspondencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CorrespondenciaRepository extends JpaRepository<Correspondencia, Long> {
}
