package com.exe.residentialcomplexmanagement.Impl;

import com.exe.residentialcomplexmanagement.DTO.ResidenteDTO;
import com.exe.residentialcomplexmanagement.Service.ResidenteService;
import org.springframework.stereotype.Service;

@Service
public class ResidenteServiceImpl implements ResidenteService {
    @Override
    public ResidenteDTO getResidenteById(Long id) {
        return null;
    }

    @Override
    public ResidenteDTO getAllResidentes() {
        return null;
    }

    @Override
    public ResidenteDTO createResidente(ResidenteDTO residenteDTO) {
        return null;
    }

    @Override
    public ResidenteDTO updateResidente(ResidenteDTO residenteDTO) {
        return null;
    }

    @Override
    public void deleteResidente(Long id) {

    }

    @Override
    public ResidenteDTO updateTelefonoResidente(Long id, String telefono) {
        return null;
    }

    @Override
    public ResidenteDTO updateEmailResidente(Long id, String email) {
        return null;
    }

    @Override
    public ResidenteDTO getAllResidentesByApartamentoId(Long id) {
        return null;
    }
}
