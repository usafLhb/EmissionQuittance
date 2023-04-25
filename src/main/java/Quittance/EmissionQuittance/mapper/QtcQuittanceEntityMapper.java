package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.QtcQuittanceDTO;
import Quittance.EmissionQuittance.entities.QtcQuittanceEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface QtcQuittanceEntityMapper {
    QtcQuittanceEntity toEntity(QtcQuittanceDTO qtcQuittanceDTO);
    QtcQuittanceDTO toDto(QtcQuittanceEntity qtcQuittanceEntity);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    QtcQuittanceEntity partialUpdate(QtcQuittanceDTO qtcQuittanceDTO, @MappingTarget QtcQuittanceEntity qtcQuittanceEntity);
}