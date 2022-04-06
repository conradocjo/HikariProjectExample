package br.com.conexao.service;

import br.com.conexao.model.Estado;
import br.com.conexao.repository.EstadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    private EstadoRepository estadoRepository;

    EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    public List<Estado> getEstados() {
        return estadoRepository.getEstado();
    }
}
