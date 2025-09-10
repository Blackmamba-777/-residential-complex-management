package com.exe.residentialcomplexmanagement.Impl;


import com.exe.residentialcomplexmanagement.DTO.ApartamentoDTO;
import com.exe.residentialcomplexmanagement.DTO.PropietarioDTO;
import com.exe.residentialcomplexmanagement.Service.PropietarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioServiceImpl implements PropietarioService {
    @Override
    public PropietarioDTO getPropietarioById(Long id) {
        return null;
    }

    @Override
    public PropietarioDTO getAllPropietarios() {
        return null;
    }

    @Override
    public PropietarioDTO createPropietario(PropietarioDTO propietarioDTO) {
        return null;
    }

    @Override
    public PropietarioDTO updatePropietario(Long id, PropietarioDTO propietarioDTO) {
        return null;
    }

    @Override
    public void deletePropietarioById(Long id) {

    }

    @Override
    public PropietarioDTO updateTelefonoPropietario(Long id, String telefono) {
        return null;
    }

    @Override
    public PropietarioDTO updateEmailPropietario(Long id, String email) {
        return null;
    }

    @Override
    public List<ApartamentoDTO> getAllApartamentosByPropietarioId(Long id) {
        return List.of();
    }
}
