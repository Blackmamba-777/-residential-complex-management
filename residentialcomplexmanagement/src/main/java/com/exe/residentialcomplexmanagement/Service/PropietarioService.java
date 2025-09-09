package com.exe.residentialcomplexmanagement.Service;

import com.exe.residentialcomplexmanagement.DTO.ApartamentoDTO;
import com.exe.residentialcomplexmanagement.DTO.PropietarioDTO;
import com.exe.residentialcomplexmanagement.Repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;

    //Metodo para mostrar un propietario por su id
    PropietarioDTO getPropietarioByid(Long id){
        return new PropietarioDTO();
    }

    //Metodo para mostrar todos los propietarios
    List<PropietarioDTO> getAllPropietarios(){
        return new ArrayList<>();
    }

    //Metodo para crear un nuevo propietario
    PropietarioDTO createPropietario(PropietarioDTO propietarioDTO){
        return new PropietarioDTO();
    }

    // Metodo para actualizar un propietario existente
    PropietarioDTO updatePropietario(Long id, PropietarioDTO propietarioDTO){
        return new PropietarioDTO();
    }

    //Metodo para eliminar un propietario por su id
    void deletePropietario(Long id){
    }

    //Metodo para actualizar el telefono de un propietario
    PropietarioDTO getPopietarioByTelefono(String telefono){
        return  new PropietarioDTO();
    }

    //Metododo para actualizar el email de un propietario
    PropietarioDTO getPropietarioByEmail(String emaiol){
        return new PropietarioDTO();
    }

    //Metodo para obtener propietarios por apartamentos
    List<ApartamentoDTO> getAllApartamentoByPropietarioId(Long PropietarioId){
        return new ArrayList<>();
    }

}
