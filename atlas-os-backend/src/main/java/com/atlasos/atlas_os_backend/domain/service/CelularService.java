package com.atlasos.atlas_os_backend.domain.service;

import com.atlasos.atlas_os_backend.api.dto.CelularDto;
import com.atlasos.atlas_os_backend.api.dto.CelularFiltro;
import com.atlasos.atlas_os_backend.api.especification.CelularSpecification;
import com.atlasos.atlas_os_backend.api.mapper.celularMapper.CelularResponseMapper;
import com.atlasos.atlas_os_backend.domain.exception.CelularNaoEncontradoException;
import com.atlasos.atlas_os_backend.domain.model.Celular;
import com.atlasos.atlas_os_backend.domain.repository.CelularRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CelularService {
    private final CelularRepository celularRepository;
    private final CelularResponseMapper celularResponseMapper;


    public CelularService(CelularRepository celularRepository, CelularResponseMapper celularResponseMapper) {
        this.celularRepository = celularRepository;
        this.celularResponseMapper = celularResponseMapper;
    }

    public Celular buscaOuFalha(Long id) {
        return celularRepository.findById(id).orElseThrow(() -> new CelularNaoEncontradoException(id));
    }

    public List<Celular> buscaPorFabricante(String fabricante) {
        return celularRepository.findByFabricanteOrderByDataLancamentoAsc(fabricante);
    }


    @Transactional(readOnly = true)
    public List<Celular> listar() {
        return celularRepository.findAll();
    }

    public Page<CelularDto> buscaPaginada(CelularFiltro celularFiltro, Pageable pageable) {
        Specification<Celular> specification = CelularSpecification.specification(celularFiltro);
        Page<Celular> paginas = celularRepository.findAll(specification, pageable);
        return paginas.map(celularResponseMapper::toDto);
    }
}
