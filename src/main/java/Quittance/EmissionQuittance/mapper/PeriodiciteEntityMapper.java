package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.PeriodiciteDTO;
import Quittance.EmissionQuittance.models.classes.PeriodiciteEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PeriodiciteEntityMapper {
    PeriodiciteEntity toEntity(PeriodiciteDTO periodiciteDTO);

    PeriodiciteDTO toDto(PeriodiciteEntity periodiciteEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PeriodiciteEntity partialUpdate(PeriodiciteDTO periodiciteDTO, @MappingTarget PeriodiciteEntity periodiciteEntity);
}