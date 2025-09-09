package com.exe.residentialcomplexmanagement.Service;

import com.exe.residentialcomplexmanagement.DTO.*;


import com.exe.residentialcomplexmanagement.Enum.EstadoApartamento;
import com.exe.residentialcomplexmanagement.Repository.ApartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApartamentoService {

    @Autowired
    private ApartamentoRepository apartamentoRepository;

    //Metodo para mostrar un apartamento por su id
    ApartamentoDTO getApartamentoById(Long id) {
        return new ApartamentoDTO();
    }

    //Metodo para mostrar todos los apartamentos
    List<ApartamentoDTO> getAllApartamentos() {
        return null;
    }

    //Metodo para crear un nuevo apartamento
    ApartamentoDTO createApartamento(ApartamentoDTO apartamentoDTO) {
        return new ApartamentoDTO();
    }

    // Método para actualizar un apartamento existente
    ApartamentoDTO updateApartamento(ApartamentoDTO apartamentoDTO) {
        return new ApartamentoDTO();
    }

    // Método para obtener el estado actual
    EstadoApartamento getestadoApartamento(Long id) {
        return EstadoApartamento.DISPONIBLE;
    }

    //Metodo para actualizar un apartamento existente
    ApartamentoDTO updateApartamento(Long id, ApartamentoDTO apartamentoDTO) {
        return new ApartamentoDTO();
    }

    //Metodo para eliminar un apartamento por su id
    void deleteApartamento(Long id) {
    }

    //Metodo para obtener apartamentos por propietarios
    List<ApartamentoDTO> getApartamentosByPropietarioId(Long propietarioId) {
        return  new ArrayList<>();
    }

    //Metodo para obtener apartamentos por residentes
    List<ResidenteDTO> getResidentesByApartamento(String numeroApartamento) {
        return new ArrayList<>();
    }

    //Obtener visitantes por apartamento
    List<VisitanteDTO> getVisitantesByApartamento(String numeroApartamento) {
        return new ArrayList<>();
    }

    //Obtener parqueaderos por apartamento
    List<ParqueaderoDTO> getParqueaderosByApartamento(String numeroApartamento) {
        return new ArrayList<>();
    }

    //Obtener correspondencias por apartamento
    List<CorrespondenciaDTO> getCorrespondenciasByApartamento(String numeroApartamento) {
        return new ArrayList<>();
    }

    //Obtener solicitudes por apartamento
    List<SolicitudDTO> getSolicitudesByApartamento(String numeroApartamento) {
        return new ArrayList<>();
    }

}
