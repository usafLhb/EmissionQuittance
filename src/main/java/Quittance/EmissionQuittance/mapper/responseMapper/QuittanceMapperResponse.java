package Quittance.EmissionQuittance.mapper.responseMapper;

import Quittance.EmissionQuittance.dto.response.IntermediaireResponse;
import Quittance.EmissionQuittance.dto.response.QuittanceResponse;
import Quittance.EmissionQuittance.entities.IntermediaireEntity;
import Quittance.EmissionQuittance.entities.QtcQuittanceEntity;
import Quittance.EmissionQuittance.repositories.QtcQuittanceEntityRepository;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuittanceMapperResponse {
    QtcQuittanceEntity toEntity(QuittanceResponse quittanceResponse);
    QuittanceResponse toDto(QtcQuittanceEntity qtcQuittanceEntity);
}