package com.exe.residentialcomplexmanagement.Impl;

import com.exe.residentialcomplexmanagement.DTO.ApartamentoDTO;
import com.exe.residentialcomplexmanagement.Entity.Apartamento;
import com.exe.residentialcomplexmanagement.Entity.Correspondencia;
import com.exe.residentialcomplexmanagement.Enum.EstadoApartamento;
import com.exe.residentialcomplexmanagement.Repository.ApartamentoRepository;
import com.exe.residentialcomplexmanagement.Service.ApartamentoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// Implementación del servicio de Apartamento
@Service
public class ApartamentoServiceImpl implements ApartamentoService {

    // Inyección del repositorio de Apartamento para acceso a datos
    @Autowired
    private ApartamentoRepository apartamentoRepository;

    // Inyección de ModelMapper para convertir entre entidades y DTOs
    @Autowired
    private ModelMapper modelMapper;

    // Obtiene un apartamento por su ID y lo convierte a DTO
    @Override
    public ApartamentoDTO getApartamentoById(Long id) {
        Apartamento apartamento = apartamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Apartamento no encontrado"));
        return modelMapper.map(apartamento, ApartamentoDTO.class);
    }

    // Obtiene todos los apartamentos y los convierte a DTOs
    @Override
    public List<ApartamentoDTO> getAllApartamentos() {
        List<Apartamento> apartamentos = apartamentoRepository.findAll();
        return apartamentos.stream()
                .map(apartamento -> modelMapper.map(apartamento, ApartamentoDTO.class))
                .collect(Collectors.toList());
    }

    // Crea un nuevo apartamento a partir de un DTO
    @Override
    public ApartamentoDTO createApartamento(ApartamentoDTO apartamentoDTO) {
        Apartamento apartamento = modelMapper.map(apartamentoDTO, Apartamento.class);
        Apartamento savedApartamento = apartamentoRepository.save(apartamento);
        return modelMapper.map(savedApartamento, ApartamentoDTO.class);
    }

    // Actualiza un apartamento existente por ID usando los datos del DTO
    @Override
    public ApartamentoDTO updateApartamento(Long id, ApartamentoDTO apartamentoDTO) {
        Apartamento existente = apartamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Apartamento no encontrado"));
        // Actualiza los campos del apartamento existente con los del DTO
        modelMapper.map(apartamentoDTO, existente);
        Apartamento actualizado = apartamentoRepository.save(existente);
        return modelMapper.map(actualizado, ApartamentoDTO.class);
    }

    // Elimina un apartamento por su ID
    @Override
    public void deleteApartamentoById(Long id) {
        if (!apartamentoRepository.existsById(id)) {
            throw new RuntimeException("Apartamento no encontrado");
        }
        apartamentoRepository.deleteById(id);
    }

    // Obtiene el estado del apartamento por su ID
    @Override
    public String getEstadoApartamento(Long id) {
        Apartamento apartamento = apartamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Apartamento no encontrado"));
        return apartamento.getEstado().toString();
    }

    // Obtiene el nombre completo del propietario del apartamento
    @Override
    public String getPropietarioApartamento(Long id) {
        Apartamento apartamento = apartamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Apartamento no encontrado"));
        // Corregido: ahora retorna nombre y apellido correctamente
        if (apartamento.getPropietario() != null) {
            return apartamento.getPropietario().getNombre() + " " + apartamento.getPropietario();
        } else {
            return "No tiene propietario asignado";
        }
    }

    // Obtiene la lista de nombres completos de los residentes del apartamento
    @Override
    public List<String> getResidentesApartamento(Long id) {
        Apartamento apartamento = apartamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Apartamento no encontrado"));
        if (apartamento.getResidentes() == null) {
            return List.of();
        }
        return apartamento.getResidentes().stream()
                .map(residente -> residente.getNombre() + " " + residente)
                .collect(Collectors.toList());
    }

    // Obtiene el número de parqueadero asignado al apartamento
    @Override
    public String getParqueaderoApartamento(Long id) {
        Apartamento apartamento = apartamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Apartamento no encontrado"));
        if (apartamento.getParqueaderos() != null) {
            return apartamento.getParqueaderos().getFirst().getNumero();
        } else {
            return "No tiene parqueadero asignado";
        }
    }

    // Obtiene la descripción de la última correspondencia recibida en el apartamento
    @Override
    public String getCorrespondenciaApartamento(Long id) {
        Apartamento apartamento = apartamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Apartamento no encontrado"));
        if (apartamento.getCorrespondencias() == null || apartamento.getCorrespondencias().isEmpty()) {
            return "No hay correspondencia";
        }
        // Retorna la última correspondencia recibida
        Correspondencia ultima = apartamento.getCorrespondencias()
                .get(apartamento.getCorrespondencias().size() - 1);
        return ultima.getTipo();
    }

    // Obtiene la lista de descripciones de solicitudes asociadas al apartamento
    @Override
    public List<String> getSolicitudesApartamento(Long id) {
        Apartamento apartamento = apartamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Apartamento no encontrado"));
        if (apartamento.getSolicitudes() == null || apartamento.getSolicitudes().isEmpty()) {
            return List.of();
        }
        return apartamento.getSolicitudes().stream()
                .map(solicitud -> solicitud.getDescripcion())
                .collect(Collectors.toList());
    }
}
