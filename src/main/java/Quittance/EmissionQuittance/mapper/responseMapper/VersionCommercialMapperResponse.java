package Quittance.EmissionQuittance.mapper.responseMapper;

import Quittance.EmissionQuittance.dto.response.IntermediaireResponse;
import Quittance.EmissionQuittance.dto.response.PrdVersioncommercialeResponse;
import Quittance.EmissionQuittance.entities.IntermediaireEntity;
import Quittance.EmissionQuittance.entities.PrdVersioncommercialeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface VersionCommercialMapperResponse {

    //@Mapping(source = "codePolice", target = "codePolice")
    PrdVersioncommercialeEntity toEntity(PrdVersioncommercialeResponse prdVersioncommercialeResponse);
    //@Mapping(source = "codePolice", target = "codePolice")
    PrdVersioncommercialeResponse toDto(PrdVersioncommercialeEntity prdVersioncommercialeEntity);
}