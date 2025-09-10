package com.exe.residentialcomplexmanagement.Service;

import com.exe.residentialcomplexmanagement.DTO.ApartamentoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ApartamentoService {

    //Metodo para mostrar un apartamento por su id
    ApartamentoDTO getApartamentoById(Long id);

    //Metodo para mostrar todos los apartamentos
    List<ApartamentoDTO> getAllApartamentos();

    //Metodo para crear un nuevo apartamento
    ApartamentoDTO createApartamento(ApartamentoDTO apartamentoDTO);

    //Metodo para actualizar un apartamento existente
    ApartamentoDTO updateApartamento(Long id, ApartamentoDTO apartamentoDTO);

    //Metodo para eliminar un apartamento por su id
    void deleteApartamentoById(Long id);

    //Metodo para obtener el estado actual de un apartamento
    String getEstadoApartamento(Long id);

    //Metodo para obtener el propietario de un apartamento
    String getPropietarioApartamento(Long id);

    //Metodo para obtener los residentes de un apartamento
    List<String> getResidentesApartamento(Long id);

    //Metodo para obtener el parqueadero asignado a un apartamento
    String getParqueaderoApartamento(Long id);

    //Metodo para obtner la correspondecia asignada a un apartamento
    String getCorrespondenciaApartamento(Long id);

    //Metodo para obtener las solicitudes de un apartamento
    List<String> getSolicitudesApartamento(Long id);

}
