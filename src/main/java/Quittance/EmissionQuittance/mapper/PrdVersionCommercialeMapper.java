package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.PrdVersioncommercialeDTO;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import Quittance.EmissionQuittance.entities.PrdVersioncommercialeEntity;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PrdVersionCommercialeMapper {
    PrdVersioncommercialeEntity toEntity(PrdVersioncommercialeDTO prdVersioncommercialeDTO);

    PrdVersioncommercialeDTO toDto(PrdVersioncommercialeEntity prdVersioncommercialeEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PrdVersioncommercialeEntity partialUpdate(PrdVersioncommercialeDTO prdVersioncommercialeDTO, @MappingTarget PrdVersioncommercialeEntity prdVersioncommercialeEntity);

}
