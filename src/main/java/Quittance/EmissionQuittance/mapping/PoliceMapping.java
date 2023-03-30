package Quittance.EmissionQuittance.mapping;

import Quittance.EmissionQuittance.dto.PoliceDTO;
import Quittance.EmissionQuittance.models.classes.PoliceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;


@Mapper
public interface PoliceMapping {

    PoliceDTO toDto(PoliceEntity policeEntity);
     PoliceEntity toEntity(PoliceDTO dto);
      List<PoliceDTO> toDTOList(List<PoliceEntity> entities);
     List<PoliceEntity> toEntityList(List<PoliceDTO> dtos);
      void updateEntity(PoliceDTO dto, @MappingTarget PoliceEntity entity);
}
