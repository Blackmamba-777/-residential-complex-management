package com.exe.residentialcomplexmanagement.Repository;

import com.exe.residentialcomplexmanagement.Entity.Apartamento;
import com.exe.residentialcomplexmanagement.Entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApartamentoRepository extends JpaRepository<Apartamento, Long> {

    //Lista de apartamentos por numero
    List<Apartamento> findBynumeroApartamento(String numeroApartamento);

    //Apartamento por estado
    List<Apartamento> findByestado_apartamento(String estado_apartamento);

    //Apartamento por fecha de registro
    List<Apartamento> findByfecha_registro(String fecha_registro);

    //Apartamento por propietario
    List<Apartamento> findByidPropietario(Propietario propietario);

    //Apartamento por residente
    List<Apartamento> findByidResidente(Long idResidente);

    //Apartamento por parqueadero
    List<Apartamento> findByidParqueadero(Long idParqueadero);

    //Apartamento por correspondencia
    List<Apartamento> findByidCorrespondencia(Long idCorrespondencia);

    //Apartamento por solicitud
    List<Apartamento> findByidSolicitud(Long idSolicitud);
}
