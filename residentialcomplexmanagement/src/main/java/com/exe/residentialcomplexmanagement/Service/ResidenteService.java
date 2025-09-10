package com.exe.residentialcomplexmanagement.Service;

import com.exe.residentialcomplexmanagement.DTO.ResidenteDTO;

public interface ResidenteService {

    //Metodo para obtener un residente por su ID
    ResidenteDTO getResidenteById(Long id);

    //Metodo para obtener todos los residentes
    ResidenteDTO getAllResidentes();

    //Metodo para crear un nuevo residente
    ResidenteDTO createResidente(ResidenteDTO residenteDTO);

    //Metodo para actualizar un residente existente
    ResidenteDTO updateResidente(ResidenteDTO residenteDTO);

    //Metodo para eliminar un residente por su ID
    void deleteResidente(Long id);

    //Metodo para actualizar el telefono de un residente
    ResidenteDTO updateTelefonoResidente(Long id, String telefono);

    //Metodo para actualizar el email de un residente
    ResidenteDTO updateEmailResidente(Long id, String email);

    //Metodo para obtener residentes por apartamento
    ResidenteDTO getAllResidentesByApartamentoId(Long id);
    
    //Metodo para asignar un residente a un apartamento
    //Metodo para eliminar un residente de un apartamento
}
