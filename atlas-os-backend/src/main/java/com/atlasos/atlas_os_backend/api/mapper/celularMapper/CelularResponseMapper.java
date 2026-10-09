package com.atlasos.atlas_os_backend.api.mapper.celularMapper;

import com.atlasos.atlas_os_backend.api.dto.CelularDto;
import com.atlasos.atlas_os_backend.domain.model.Celular;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CelularResponseMapper {

    String ID_ENTITY = "tb.dados_celular.cd_celular";

    @Mapping(target = ID_ENTITY, ignore = true)
    List<CelularDto> dtoList(List<Celular> celulares);

    @Mapping(target = ID_ENTITY, ignore = true)
    CelularDto toDto(Celular celular);

    @Mapping(target = ID_ENTITY, ignore = true)
    Page<CelularDto> toDtoPageList (Pageable Pageable);
}
