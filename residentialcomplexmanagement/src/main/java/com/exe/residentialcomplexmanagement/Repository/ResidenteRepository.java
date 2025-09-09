package com.exe.residentialcomplexmanagement.Repository;

import com.exe.residentialcomplexmanagement.Entity.Residente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidenteRepository extends JpaRepository<Residente, Long> {
}
