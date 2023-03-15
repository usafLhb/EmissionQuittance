package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.PoliceDTO;
import Quittance.EmissionQuittance.models.Police;
import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@AllArgsConstructor
@Mapper
public class PoliceMapper {
    //PoliceDTO toDto(Police police);
  //  Police toEntity(PoliceDTO dto);
  //  List<PoliceDTO> toDTOList(List<Police> entities);
   // List<Police> toEntityList(List<PoliceDTO> dtos);
  //  void updateEntity(PoliceDTO dto, @MappingTarget Police entity);

    PoliceDTO toDto(Police police) {
        return null;
    }

    List<PoliceDTO> toDtoList(List<Police> police) {
        return null;
    }

    Police toEntity(PoliceDTO policeDTO) {
        return null;
    }

    List<Police> toEntityList(List<PoliceDTO> personDTOs) {
        return null;
    }
}
