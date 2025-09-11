package com.exe.residentialcomplexmanagement.Service;

import com.exe.residentialcomplexmanagement.DTO.ParqueaderoConApartamentoDTO;
import java.util.List;

public interface ParqueaderoService {

    // ---------------- CRUD ----------------
    ParqueaderoConApartamentoDTO crearParqueadero(ParqueaderoConApartamentoDTO dto);

    ParqueaderoConApartamentoDTO obtenerParqueaderoPorId(Long id);

    List<ParqueaderoConApartamentoDTO> obtenerTodosLosParqueaderos();

    ParqueaderoConApartamentoDTO actualizarParqueadero(Long id, ParqueaderoConApartamentoDTO dto);

    void eliminarParqueadero(Long id);

    // ------------- Consultas personalizadas -------------

    List<String> listarNumerosParqueaderosLibres();

    List<String> listarNumerosParqueaderosOcupados();

    List<ParqueaderoConApartamentoDTO> buscarParqueaderosPorTipoYEstado(String tipo, String estado);

    Long contarParqueaderosPorApartamento(Long idApartamento);

    List<ParqueaderoConApartamentoDTO> traerParqueaderosConApartamento();

    List<ParqueaderoConApartamentoDTO> traerParqueaderosLibresSQL();

    List<String> obtenerNumerosParqueaderosMotosLibresSQL();
}
