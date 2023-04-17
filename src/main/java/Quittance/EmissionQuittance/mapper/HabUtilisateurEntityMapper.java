package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.HabUtilisateurDTO;
import Quittance.EmissionQuittance.models.classes.HabUtilisateurEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface HabUtilisateurEntityMapper {
    HabUtilisateurEntity toEntity(HabUtilisateurDTO habUtilisateurDTO);

    HabUtilisateurDTO toDto(HabUtilisateurEntity habUtilisateurEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    HabUtilisateurEntity partialUpdate(HabUtilisateurDTO habUtilisateurDTO, @MappingTarget HabUtilisateurEntity habUtilisateurEntity);
}