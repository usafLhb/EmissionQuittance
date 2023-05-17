package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.PrdVersioncommercialeDTO;
import Quittance.EmissionQuittance.dto.request.RefVilleDTO;
import Quittance.EmissionQuittance.entities.PrdVersioncommercialeEntity;
import Quittance.EmissionQuittance.entities.RefVilleEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface VersionCommMapper {
    PrdVersioncommercialeEntity toEntity(PrdVersioncommercialeDTO prdVersioncommercialeDTO);
    PrdVersioncommercialeDTO toDto(PrdVersioncommercialeEntity prdVersioncommercialeEntity);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PrdVersioncommercialeEntity partialUpdate(PrdVersioncommercialeDTO prdVersioncommercialeDTO, @MappingTarget PrdVersioncommercialeEntity prdVersioncommercialeEntity);
}