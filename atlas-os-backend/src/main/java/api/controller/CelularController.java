package api.controller;

import api.dto.CelularDto;
import api.literal.ApiBasePaths;
import api.mapper.celularMapper.CelularResponseMapper;
import domain.service.CelularService;
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

    @GetMapping("{id}")
    public CelularDto listarId(@PathVariable Long id) {
        return celularResponseMapper.toDto(celularService.buscaOuFalha(id));
    }
}
