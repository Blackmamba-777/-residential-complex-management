package com.exe.residentialcomplexmanagement.Service;

import com.exe.residentialcomplexmanagement.DTO.ResidenteDTO;
import org.springframework.stereotype.Service;

@Service
public class ResidenteService {

    //Metodo para obtener residente por id
    ResidenteDTO getApartamentoById(Long id){
        return new ResidenteDTO();
    }

    //Metodo para obtener todos los residentes
    ResidenteDTO getAllResidentes(){
        return new ResidenteDTO();
    }

    //Metodo para crear residente
     ResidenteDTO getResidenteById(Long id){
        return new ResidenteDTO();
     }

    //Metodo para actualizar residente
    ResidenteDTO updateResidente(Long id, ResidenteDTO residenteDTO){
        return new ResidenteDTO();
    }

    //Metodo para eliminar residente
    void deleteResidente(Long id){
    }

    //Metodo para asignar residente a apartamento
    //Metodo para eliminar residente de apartamento
    //Metodo para obtener residentes por apartamento

}
