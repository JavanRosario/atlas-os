package api.mapper;

import api.dto.CelularDto;
import domain.model.Celular;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CelularReponseMapper {

    CelularDto toDto(Celular celular);

    List<CelularDto> toDtoList(List<Celular> celulars);
}
