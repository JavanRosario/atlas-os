package domain.service;

import domain.exception.CelularNaoEncontradoException;
import domain.model.Celular;
import domain.repository.CelularRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CelularService {
    private final CelularRepository celularRepository;

    public Celular buscaOuFalha(Long id){
        return celularRepository.findById(id).orElseThrow(() -> new CelularNaoEncontradoException(id));
    }

    public CelularService(CelularRepository celularRepository) {
        this.celularRepository = celularRepository;
    }

    @Transactional(readOnly = true)
    public List<Celular> listar() {
        return celularRepository.findAll();
    }

}
