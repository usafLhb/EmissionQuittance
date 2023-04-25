package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.GarantieProduitDTO;
import Quittance.EmissionQuittance.entities.GarantieProduitEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface GarantieProduitEntityMapper {
    GarantieProduitEntity toEntity(GarantieProduitDTO garantieProduitDTO);


    //@Mapping(target = "tauxTaxeEve", expression = "0")
    GarantieProduitDTO toDto(GarantieProduitEntity garantieProduitEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    GarantieProduitEntity partialUpdate(GarantieProduitDTO garantieProduitDTO, @MappingTarget GarantieProduitEntity garantieProduitEntity);
}