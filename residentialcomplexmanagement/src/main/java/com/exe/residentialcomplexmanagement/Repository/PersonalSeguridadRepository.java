package com.exe.residentialcomplexmanagement.Repository;

import com.exe.residentialcomplexmanagement.Entity.PersonalSeguridad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalSeguridadRepository extends JpaRepository<PersonalSeguridad, Long> {
}
