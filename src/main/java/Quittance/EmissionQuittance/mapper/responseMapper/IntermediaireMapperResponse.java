package Quittance.EmissionQuittance.mapper.responseMapper;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.response.IntermediaireResponse;
import Quittance.EmissionQuittance.entities.IntermediaireEntity;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IntermediaireMapperResponse {

    //@Mapping(source = "codePolice", target = "codePolice")
    IntermediaireEntity toEntity(IntermediaireResponse intermediaireResponse);
    //@Mapping(source = "codePolice", target = "codePolice")
    IntermediaireResponse toDto(IntermediaireEntity intermediaireEntity);
}