package com.exe.residentialcomplexmanagement.Impl;

import com.exe.residentialcomplexmanagement.DTO.ParqueaderoConApartamentoDTO;
import com.exe.residentialcomplexmanagement.Entity.Apartamento;
import com.exe.residentialcomplexmanagement.Entity.Parqueadero;
import com.exe.residentialcomplexmanagement.Enum.EstadoParqueadero;
import com.exe.residentialcomplexmanagement.Repository.ParqueaderoRepository;
import com.exe.residentialcomplexmanagement.Service.ParqueaderoService;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ParqueaderoServiceImpl implements ParqueaderoService {

    private final ParqueaderoRepository repository;

    public ParqueaderoServiceImpl(ParqueaderoRepository repository) {
        this.repository = repository;
    }

    // ---------------------- CRUD ----------------------

    @Override
    public ParqueaderoConApartamentoDTO crearParqueadero(ParqueaderoConApartamentoDTO dto) {
        Parqueadero parqueadero = new Parqueadero();
        parqueadero.setNumero(dto.getNumero());
        parqueadero.setTipo(dto.getTipo());
        parqueadero.setEstado(EstadoParqueadero.valueOf(dto.getEstado()));

        Apartamento apartamento = new Apartamento();
        apartamento.setIdApartamento(dto.getIdApartamento());
        parqueadero.setApartamento(apartamento);

        Parqueadero guardado = repository.save(parqueadero);

        return new ParqueaderoConApartamentoDTO(
                guardado.getIdParqueadero(),
                guardado.getNumero(),
                guardado.getTipo(),
                guardado.getEstado().name(),
                guardado.getApartamento().getIdApartamento()
        );
    }

    @Override
    public ParqueaderoConApartamentoDTO obtenerParqueaderoPorId(Long id) {
        Parqueadero p = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Parqueadero no encontrado"));

        return new ParqueaderoConApartamentoDTO(
                p.getIdParqueadero(),
                p.getNumero(),
                p.getTipo(),
                p.getEstado().name(),
                p.getApartamento().getIdApartamento()
        );
    }

    @Override
    public List<ParqueaderoConApartamentoDTO> obtenerTodosLosParqueaderos() {
        return repository.findAll()
                .stream()
                .map(p -> new ParqueaderoConApartamentoDTO(
                        p.getIdParqueadero(),
                        p.getNumero(),
                        p.getTipo(),
                        p.getEstado().name(),
                        p.getApartamento().getIdApartamento()
                ))
                .toList();
    }

    @Override
    public ParqueaderoConApartamentoDTO actualizarParqueadero(Long id, ParqueaderoConApartamentoDTO dto) {
        Parqueadero p = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Parqueadero no encontrado"));

        p.setNumero(dto.getNumero());
        p.setTipo(dto.getTipo());
        p.setEstado(EstadoParqueadero.valueOf(dto.getEstado()));

        // Relación con apartamento (si se envía)
        if (dto.getIdApartamento() != null) {
            Apartamento apto = new Apartamento();
            apto.setIdApartamento(dto.getIdApartamento());
            p.setApartamento(apto);
        }

        Parqueadero actualizado = repository.save(p);

        return new ParqueaderoConApartamentoDTO(
                actualizado.getIdParqueadero(),
                actualizado.getNumero(),
                actualizado.getTipo(),
                actualizado.getEstado().name(),
                actualizado.getApartamento().getIdApartamento()
        );
    }

    @Override
    public void eliminarParqueadero(Long id) {
        repository.deleteById(id);
    }

    // ---------------------- CONSULTAS PERSONALIZADAS ----------------------

    @Override
    public List<String> listarNumerosParqueaderosLibres() {
        return repository.findNumerosParqueaderosLibres();
    }

    @Override
    public List<String> listarNumerosParqueaderosOcupados() {
        return repository.findNumerosParqueaderosOcupados();
    }

    @Override
    public List<ParqueaderoConApartamentoDTO> buscarParqueaderosPorTipoYEstado(String tipo, String estado) {
        return repository.findByTipoAndEstado(tipo, EstadoParqueadero.valueOf(estado))
                .stream()
                .map(p -> new ParqueaderoConApartamentoDTO(
                        p.getIdParqueadero(),
                        p.getNumero(),
                        p.getTipo(),
                        p.getEstado().name(),
                        p.getApartamento().getIdApartamento()
                ))
                .toList();
    }

    @Override
    public Long contarParqueaderosPorApartamento(Long idApartamento) {
        return repository.countByApartamento(idApartamento);
    }

    @Override
    public List<ParqueaderoConApartamentoDTO> traerParqueaderosConApartamento() {
        return repository.findParqueaderosConApartamento()
                .stream()
                .map(obj -> new ParqueaderoConApartamentoDTO(
                        (Long) obj[0],   // idParqueadero
                        (String) obj[1], // numero
                        (String) obj[2], // tipo
                        (String) obj[3], // estado
                        (Long) obj[4]    // idApartamento
                ))
                .toList();
    }

    @Override
    public List<ParqueaderoConApartamentoDTO> traerParqueaderosLibresSQL() {
        return repository.findParqueaderosLibresSQL()
                .stream()
                .map(p -> new ParqueaderoConApartamentoDTO(
                        p.getIdParqueadero(),
                        p.getNumero(),
                        p.getTipo(),
                        p.getEstado().name(),
                        p.getApartamento().getIdApartamento()
                ))
                .toList();
    }

    @Override
    public List<String> obtenerNumerosParqueaderosMotosLibresSQL() {
        return repository.findNumerosParqueaderosMotosLibresSQL();
    }
}
