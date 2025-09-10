package com.exe.residentialcomplexmanagement.Service;

import com.exe.residentialcomplexmanagement.DTO.ApartamentoDTO;
import com.exe.residentialcomplexmanagement.DTO.PropietarioDTO;

import java.util.List;

public interface PropietarioService {

    //Metodo para mostrar un propietario por su id
    PropietarioDTO getPropietarioById(Long id);

    //Metodo para mostrar todos los propietarios
    PropietarioDTO getAllPropietarios();

    //Metodo para crear un nuevo propietario
    PropietarioDTO createPropietario(PropietarioDTO propietarioDTO);

    //Metodo para actualizar un propietario existente
    PropietarioDTO updatePropietario(Long id, PropietarioDTO propietarioDTO);

    //Metodo para eliminar un propietario por su id
    void deletePropietarioById(Long id);

    //Metodo para actualizar el telefono de un propietarioq
    PropietarioDTO updateTelefonoPropietario(Long id, String telefono);

    //Metodo para actualizar el email de un propietario
    PropietarioDTO updateEmailPropietario(Long id, String email);

    //Metodo para obtener propietarios por apartemento
    List<ApartamentoDTO> getAllApartamentosByPropietarioId(Long id);
}
