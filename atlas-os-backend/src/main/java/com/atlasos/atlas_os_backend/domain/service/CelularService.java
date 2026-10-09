package com.atlasos.atlas_os_backend.domain.service;

import com.atlasos.atlas_os_backend.api.mapper.celularMapper.CelularResponseMapper;
import com.atlasos.atlas_os_backend.domain.exception.CelularNaoEncontradoException;
import com.atlasos.atlas_os_backend.domain.model.Celular;
import com.atlasos.atlas_os_backend.domain.repository.CelularRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CelularService {
    private final CelularRepository celularRepository;

    public Celular buscaOuFalha(Long id) {
        return celularRepository.findById(id).orElseThrow(() -> new CelularNaoEncontradoException(id));
    }

    public CelularService(CelularRepository celularRepository) {
        this.celularRepository = celularRepository;
    }

    @Transactional(readOnly = true)
    public List<Celular> listar() {
        return celularRepository.findAll();
    }

    public Page<Celular> buscaPaginada(Pageable pageable){
        Page<Celular> celularEntity = celularRepository.findAll(pageable);

        return celularEntity.map(CelularResponseMapper::toDto);
    }
}
