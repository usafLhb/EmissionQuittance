package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PoliceEntityMapper {

    @Mapping(source = "codePolice", target = "codePolice")
    PoliceEntity toEntity(PoliceDTO policeDTO);
    @Mapping(source = "codePolice", target = "codePolice")
    PoliceDTO toDto(PoliceEntity policeEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PoliceEntity partialUpdate(PoliceDTO policeDTO, @MappingTarget PoliceEntity policeEntity);
}