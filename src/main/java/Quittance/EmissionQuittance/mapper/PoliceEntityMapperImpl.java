/*
package Quittance.EmissionQuittance.mapper;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Component
public class PoliceEntityMapperImpl implements PoliceEntityMapper {

    @Override
    public PoliceEntity toEntity(PoliceDTO policeDTO) {
        if (policeDTO == null) {
            return null;
        }
        PoliceEntity policeEntity = new PoliceEntity();
        policeEntity.setCodePolice(policeDTO.getCodePolice());
        policeEntity.setNumClient(policeDTO.getNumClient());
        policeEntity.setRaisonSociale(policeDTO.getRaisonSociale());
        policeEntity.setAdresse(policeDTO.getAdresse());
        policeEntity.setDateEffet(policeDTO.getDateEffet());
        policeEntity.setPrimeNette(policeDTO.getPrimeNette());
        policeEntity.setTaxe(policeEntity.getTaxe());
        policeEntity.setAcce(policeDTO.getAcce());
        policeEntity.setTauxComm(policeDTO.getTauxComm());
        policeEntity.setDateTerme(policeDTO.getDateTerme());
        policeEntity.setDateEtat(policeDTO.getDateEtat());
        policeEntity.setFf(policeDTO.getFf());
        policeEntity.setMnt_taxe_eve(policeDTO.getMnt_taxe_eve());
        policeEntity.setMnt_taxe_parafiscale(policeDTO.getMnt_taxe_parafiscale());
        policeEntity.setMnt_taxe_eve(policeDTO.getMnt_taxe_eve());
        policeEntity.setPrd_versionCommerciale(policeDTO.getVersioncommerciale());


        return policeEntity;
    }

    @Override
    public PoliceDTO toDto(PoliceEntity policeEntity) {
        if (policeEntity == null) {
            return null;
        }
        PoliceDTO policeDTO = new PoliceDTO();
        policeDTO.setId(policeEntity.getId());
        policeDTO.setName(policeEntity.getName());
        policeDTO.setAddress(policeEntity.getAddress());
        return policeDTO;
    }

    @Override
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    public PoliceEntity partialUpdate(PoliceDTO policeDTO, @MappingTarget PoliceEntity policeEntity) {
        if (policeDTO == null) {
            return policeEntity;
        }
        if (policeDTO.getName() != null) {
            policeEntity.setName(policeDTO.getName());
        }
        if (policeDTO.getAddress() != null) {
            policeEntity.setAddress(policeDTO.getAddress());
        }
        return policeEntity;
    }
}
*/
