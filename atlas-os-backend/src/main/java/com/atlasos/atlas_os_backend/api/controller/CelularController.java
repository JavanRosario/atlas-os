package com.atlasos.atlas_os_backend.api.controller;

import com.atlasos.atlas_os_backend.api.dto.CelularDto;
import com.atlasos.atlas_os_backend.api.dto.CelularFiltro;
import com.atlasos.atlas_os_backend.api.literal.ApiBasePaths;
import com.atlasos.atlas_os_backend.api.mapper.celularMapper.CelularResponseMapper;
import com.atlasos.atlas_os_backend.domain.service.CelularService;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

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
    public List<CelularDto> listar(@RequestParam String fabricante) {
        return celularResponseMapper.dtoList(celularService.buscaPorFabricante(fabricante));
    }

    @GetMapping("/{id}")
    public CelularDto listarId(@PathVariable Long id) {
        return celularResponseMapper.toDto(celularService.buscaOuFalha(id));
    }

    @GetMapping("/fabricante-paginado")
    public Page<CelularDto> buscaPaginada(
            @ParameterObject Pageable pageable, @ParameterObject CelularFiltro celularFiltro) {
        return celularService.buscaPaginada(celularFiltro, pageable);
    }
}
