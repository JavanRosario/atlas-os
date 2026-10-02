package api.controller;

import api.dto.CelularDto;
import api.literal.ApiBasePaths;
import api.mapper.CelularReponseMapper;
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
    private final CelularReponseMapper celularReponseMapper;

    public CelularController(CelularService celularService, CelularReponseMapper celularReponseMapper) {
        this.celularService = celularService;
        this.celularReponseMapper = celularReponseMapper;
    }

    @GetMapping
    public List<CelularDto> listar() {
        return celularReponseMapper.toDtoList(celularService.listar());
    }

    @GetMapping("{celularId}")
    public CelularDto listarPorId(@PathVariable Long celularId){
        return celularReponseMapper.toDto(celularService.buscaOuFalha(celularId));
    }

}
