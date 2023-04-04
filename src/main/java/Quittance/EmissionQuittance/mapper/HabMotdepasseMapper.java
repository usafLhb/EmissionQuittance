package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.HabMotdepasseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.function.Function;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public class HabMotdepasseMapper
     //   implements Function<HabMotdepasseEntity, HabMotdepasseDTO>
{


 /*   @Override
    public HabMotdepasseDTO apply(HabMotdepasseEntity habMotdepasseEntity) {
        return null;
    }
    HabMotdepasseEntity toEntity(HabMotdepasseDTO habMotdepasseDTO) {
        return null;
    }
    HabMotdepasseDTO toDto(HabMotdepasseEntity habMotdepasseEntity) {
        return null;
    }*/
}
