package Quittance.EmissionQuittance.mapper.responseMapper;

import Quittance.EmissionQuittance.dto.response.IntermediaireResponse;
import Quittance.EmissionQuittance.dto.response.RefQuittanceResponse;
import Quittance.EmissionQuittance.entities.IntermediaireEntity;
import Quittance.EmissionQuittance.entities.RefQuittanceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RefQtcQuittanceMapperResponse {

    //@Mapping(source = "codePolice", target = "codePolice")
    RefQuittanceEntity toEntity(RefQuittanceResponse refQuittanceResponse);
    //@Mapping(source = "codePolice", target = "codePolice")
    RefQuittanceResponse toDto(RefQuittanceEntity refQuittanceEntity);
}