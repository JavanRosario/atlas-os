package api.mapper.celularMapper;

import api.dto.CelularDto;
import domain.model.Celular;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CelularResponseMapper {


    List<CelularDto> dtoList(List<Celular> celulares);

    CelularDto toDto(Celular celular);
}
