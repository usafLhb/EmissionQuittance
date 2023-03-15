package Quittance.EmissionQuittance.mapping;

import Quittance.EmissionQuittance.dto.PoliceDTO;
import Quittance.EmissionQuittance.models.Police;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.context.annotation.Bean;

import java.util.List;


@Mapper
public interface PoliceMapping {

    PoliceDTO toDto(Police police);
     Police toEntity(PoliceDTO dto);
      List<PoliceDTO> toDTOList(List<Police> entities);
     List<Police> toEntityList(List<PoliceDTO> dtos);
      void updateEntity(PoliceDTO dto, @MappingTarget Police entity);
}
