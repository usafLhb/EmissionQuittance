package Quittance.EmissionQuittance.critaria.mapper;

import Quittance.EmissionQuittance.critaria.entity.PersonSearchCriteria;
import Quittance.EmissionQuittance.critaria.dto.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PersonMapper {



   /* @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")*/
    PersonDTO toDto(PersonSearchCriteria person);

//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "firstName", target = "firstName")
//    @Mapping(source = "lastName", target = "lastName")
//    @Mapping(source = "email", target = "email")
    PersonSearchCriteria toEntity(PersonDTO personDTO);
}
