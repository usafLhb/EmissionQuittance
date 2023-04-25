package Quittance.EmissionQuittance.services.ImpleService;

import Quittance.EmissionQuittance.dto.request.GarantieProduitDTO;
import Quittance.EmissionQuittance.entities.GarantieProduitEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface  ExampleMapper {
    ExampleMapper INSTANCE = Mappers.getMapper( ExampleMapper.class );

    //@Mapping(target = "id", source = "entity.id")
    GarantieProduitDTO toDTO(GarantieProduitEntity entity);

  //  @Mapping(target = "id", ignore = true)
    GarantieProduitEntity toEntity(GarantieProduitDTO dto);
}
