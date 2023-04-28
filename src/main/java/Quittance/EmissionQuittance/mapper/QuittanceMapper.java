package Quittance.EmissionQuittance.mapper;


import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.QtcQuittanceDTO;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import Quittance.EmissionQuittance.entities.QtcQuittanceEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuittanceMapper {

}
