package com.exe.residentialcomplexmanagement.Repository;

import com.exe.residentialcomplexmanagement.Entity.Parqueadero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParqueaderoRepository extends JpaRepository<Parqueadero, Long> {
}
