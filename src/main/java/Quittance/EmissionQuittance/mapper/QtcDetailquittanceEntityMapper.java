package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.QtcDetailquittanceDTO;
import Quittance.EmissionQuittance.models.classes.QtcDetailquittanceEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface QtcDetailquittanceEntityMapper {
    QtcDetailquittanceEntity toEntity(QtcDetailquittanceDTO qtcDetailquittanceDTO);

    QtcDetailquittanceDTO toDto(QtcDetailquittanceEntity qtcDetailquittanceEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    QtcDetailquittanceEntity partialUpdate(QtcDetailquittanceDTO qtcDetailquittanceDTO, @MappingTarget QtcDetailquittanceEntity qtcDetailquittanceEntity);
}