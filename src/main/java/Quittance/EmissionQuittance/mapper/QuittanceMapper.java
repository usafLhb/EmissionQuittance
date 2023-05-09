package Quittance.EmissionQuittance.mapper;


import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.QtcQuittanceDTO;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import Quittance.EmissionQuittance.entities.QtcQuittanceEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuittanceMapper {

    QtcQuittanceDTO toDto(QtcQuittanceEntity entity);

    QtcQuittanceEntity toEntity(QtcQuittanceDTO qtcQuittanceDTO);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    QtcQuittanceEntity partialUpdate(QtcQuittanceDTO qtcQuittanceDTO, @MappingTarget QtcQuittanceEntity entity);

    List<QtcQuittanceDTO> toQuittanceDTOList(List<QtcQuittanceEntity> quittanceEntityList);


}
