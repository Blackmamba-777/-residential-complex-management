package com.exe.residentialcomplexmanagement.Repository;

import com.exe.residentialcomplexmanagement.Entity.Parqueadero;
import com.exe.residentialcomplexmanagement.Enum.EstadoParqueadero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParqueaderoRepository extends JpaRepository<Parqueadero, Long> {

    // Listar solo los números de parqueaderos LIBRES
    @Query("SELECT p.numero FROM Parqueadero p WHERE p.estado = 'LIBRE'")
    List<String> findNumerosParqueaderosLibres();

    // Listar solo los números de parqueaderos OCUPADOS
    @Query("SELECT p.numero FROM Parqueadero p WHERE p.estado = 'OCUPADO'")
    List<String> findNumerosParqueaderosOcupados();

    // Buscar parqueaderos por tipo y estado
    List<Parqueadero> findByTipoAndEstado(String tipo, EstadoParqueadero estado);

    // Contar parqueaderos por idApartamento
    @Query("SELECT COUNT(p) FROM Parqueadero p WHERE p.apartamento.idApartamento = :idApartamento")
    Long countByApartamento(Long idApartamento);

    // Traer parqueaderos con detalles del apartamento asociado
    @Query("SELECT p.idParqueadero, p.numero, p.tipo, p.estado, a.idApartamento " +
           "FROM Parqueadero p JOIN p.apartamento a")
    List<Object[]> findParqueaderosConApartamento();

    // traer parqueaderos libres 
    @Query("SELECT p FROM Parqueadero p WHERE p.estado = 'LIBRE'")
    List<Parqueadero> findParqueaderosLibresSQL();

    // Traer solo los números de motos libres
    @Query("SELECT p.numero FROM Parqueadero p WHERE p.tipo = 'MOTO' AND p.estado = 'LIBRE'")
    List<String> findNumerosParqueaderosMotosLibresSQL();
}
