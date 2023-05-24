package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.RefVilleDTO;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import Quittance.EmissionQuittance.entities.RefVilleEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface VilleMapper {
        RefVilleEntity toEntity(RefVilleDTO refVilleDTO);
        RefVilleDTO toDto(RefVilleEntity refVilleEntity);
        @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
        RefVilleEntity partialUpdate(RefVilleDTO refVilleDTO, @MappingTarget RefVilleEntity refVilleEntity);
}
