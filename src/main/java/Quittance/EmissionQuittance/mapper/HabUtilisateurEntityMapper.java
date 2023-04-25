package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.HabUtilisateurDTO;
import Quittance.EmissionQuittance.entities.HabUtilisateurEntity;
import Quittance.EmissionQuittance.entities.HabUtilisateurEntity;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface HabUtilisateurEntityMapper {
    HabUtilisateurEntity toEntity(HabUtilisateurDTO habUtilisateurDTO);

    HabUtilisateurDTO toDto(HabUtilisateurEntity habUtilisateurEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    HabUtilisateurEntity partialUpdate(HabUtilisateurDTO habUtilisateurDTO, @MappingTarget HabUtilisateurEntity habUtilisateurEntity);
}