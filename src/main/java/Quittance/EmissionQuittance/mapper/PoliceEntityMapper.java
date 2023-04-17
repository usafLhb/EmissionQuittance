package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.models.classes.PoliceEntity;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PoliceEntityMapper {
    PoliceEntity toEntity(PoliceDTO policeDTO);

    PoliceDTO toDto(PoliceEntity policeEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PoliceEntity partialUpdate(PoliceDTO policeDTO, @MappingTarget PoliceEntity policeEntity);
}