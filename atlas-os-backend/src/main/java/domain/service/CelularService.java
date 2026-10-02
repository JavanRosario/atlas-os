package domain.service;

import domain.exception.CelularNaoEncontradoException;
import domain.model.Celular;
import domain.repository.CelularRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CelularService {
    private final CelularRepository celularRepository;

    public CelularService(CelularRepository celularRepository) {
        this.celularRepository = celularRepository;
    }

    public List<Celular> listar() {
        return celularRepository.findAll();
    }

    public Celular buscaOuFalha(Long celularId) {
        return celularRepository.findById(celularId).orElseThrow(() -> new CelularNaoEncontradoException(celularId));
    }


}
