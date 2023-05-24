package Quittance.EmissionQuittance.mapper.responseMapper;

import Quittance.EmissionQuittance.dto.response.IntermediaireResponse;
import Quittance.EmissionQuittance.dto.response.PoliceResponse;
import Quittance.EmissionQuittance.entities.IntermediaireEntity;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PoliceMapperResponse {

    PoliceEntity toEntity(PoliceResponse policeResponse);
    PoliceResponse toDto(PoliceEntity policeEntity);
}