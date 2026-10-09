package com.atlasos.atlas_os_backend.api.controller;

import com.atlasos.atlas_os_backend.api.dto.CelularDto;
import com.atlasos.atlas_os_backend.api.literal.ApiBasePaths;
import com.atlasos.atlas_os_backend.api.mapper.celularMapper.CelularResponseMapper;
import com.atlasos.atlas_os_backend.domain.service.CelularService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(ApiBasePaths.CELULAR_ROOT)
@RestController
public class CelularController {
    private final CelularService celularService;
    private final CelularResponseMapper celularResponseMapper;

    public CelularController(CelularService celularService, CelularResponseMapper celularResponseMapper) {
        this.celularService = celularService;
        this.celularResponseMapper = celularResponseMapper;
    }

    @GetMapping
    public List<CelularDto> listar() {
        return celularResponseMapper.dtoList(celularService.listar());
    }

    @GetMapping("/{id}")
    public CelularDto listarId(@PathVariable Long id) {
        return celularResponseMapper.toDto(celularService.buscaOuFalha(id));
    }

    @GetMapping("/fabricante")
    public Page<CelularDto> buscaPaginada(@PageableDefault(page = 0, size = 10, sort = "cd_celular", direction = Sort.Direction.ASC)
                                          Pageable pageable) {
        return celularResponseMapper.toDtoPageList(celularService.buscaPaginada(pageable));
    }
}
