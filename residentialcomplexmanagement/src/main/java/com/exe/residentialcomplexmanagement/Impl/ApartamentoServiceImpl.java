package com.exe.residentialcomplexmanagement.Impl;

import com.exe.residentialcomplexmanagement.DTO.ApartamentoDTO;
import com.exe.residentialcomplexmanagement.Entity.Apartamento;
import com.exe.residentialcomplexmanagement.Repository.ApartamentoRepository;
import com.exe.residentialcomplexmanagement.Service.ApartamentoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// Implementación de la interfaz ApartamentoService
@Service
public class ApartamentoServiceImpl implements ApartamentoService {

    @Autowired
    private ApartamentoRepository apartamentoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ApartamentoDTO getApartamentoById(Long id) {
        return null;
    }

    @Override
    public List<ApartamentoDTO> getAllApartamentos() {
        List<Apartamento> apartamentos = apartamentoRepository.findAll();
        return apartamentos.stream()
                .map(apartamento -> modelMapper.map(apartamento, ApartamentoDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ApartamentoDTO createApartamento(ApartamentoDTO apartamentoDTO) {
        return null;
    }

    @Override
    public ApartamentoDTO updateApartamento(Long id, ApartamentoDTO apartamentoDTO) {
        return null;
    }

    @Override
    public void deleteApartamentoById(Long id) {

    }

    @Override
    public String getEstadoApartamento(Long id) {
        return "";
    }

    @Override
    public String getPropietarioApartamento(Long id) {
        return "";
    }

    @Override
    public List<String> getResidentesApartamento(Long id) {
        return List.of();
    }

    @Override
    public String getParqueaderoApartamento(Long id) {
        return "";
    }

    @Override
    public String getCorrespondenciaApartamento(Long id) {
        return "";
    }

    @Override
    public List<String> getSolicitudesApartamento(Long id) {
        return List.of();
    }
}
