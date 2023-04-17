package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.IntermediaireDTO;
import Quittance.EmissionQuittance.models.classes.IntermediaireEntity;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IntermediaireEntityMapper {
    IntermediaireEntity toEntity(IntermediaireDTO intermediaireDTO);

    IntermediaireDTO toDto(IntermediaireEntity intermediaireEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    IntermediaireEntity partialUpdate(IntermediaireDTO intermediaireDTO, @MappingTarget IntermediaireEntity intermediaireEntity);
}