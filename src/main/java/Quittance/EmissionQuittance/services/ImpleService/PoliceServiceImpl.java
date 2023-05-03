package Quittance.EmissionQuittance.services.ImpleService;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.PoliceSearchCriteriaDTO;
import Quittance.EmissionQuittance.dto.request.PrdVersioncommercialeDTO;
import Quittance.EmissionQuittance.dto.request.RefVilleDTO;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import Quittance.EmissionQuittance.mapper.PoliceEntityMapper;
import Quittance.EmissionQuittance.repositories.PoliceEntityRepository;
import Quittance.EmissionQuittance.services.Iservice.IPoliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PoliceServiceImpl implements IPoliceService {

    private final PoliceEntityRepository policeRepository;
    private final PoliceEntityMapper policeEntityMapper;

    @Autowired
    public PoliceServiceImpl(PoliceEntityRepository policeRepository, PoliceEntityMapper policeEntityMapper) {
        this.policeRepository = policeRepository;
        this.policeEntityMapper = policeEntityMapper;
    }

    @Override
    public PoliceDTO addPolice(PoliceDTO policeDTO) {
       PoliceEntity police = policeEntityMapper.toEntity(policeDTO);
       PoliceEntity savedPolice = policeRepository.save(police);
       return policeEntityMapper.toDto(savedPolice);
    }

    @Override
    public PoliceDTO updatePolice(Long policeId,PoliceDTO policeDTO) {
        PoliceEntity police = policeRepository.findById(policeId).orElseThrow(() -> new RuntimeException("Police not found"));
        policeEntityMapper.partialUpdate(policeDTO, police);
        PoliceEntity updatedPolice = policeRepository.save(police);
        return policeEntityMapper.toDto(updatedPolice);
    }

    @Override
    public List<PoliceDTO> getAllPolices() {
        List<PoliceEntity> polices = policeRepository.findAll();
        return polices.stream()
                .map(policeEntityMapper::toDto)
                .collect(Collectors.toList());
    }
    /*@Override
    public List<PoliceDTO> getPoliceByCriteres(PoliceSearchCriteriaDTO policeSearchCriteriaDTO){
        Specification<PoliceEntity> policeSpecification = Specification.where(null);
        if (policeSearchCriteriaDTO.getNumClient() != null) {
            policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("numClient"), policeSearchCriteriaDTO.getNumClient()));
        }
        if (policeSearchCriteriaDTO.getCodePolice() != null) {
            policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("codePolice"), policeSearchCriteriaDTO.getCodePolice()));
        }
        if (policeSearchCriteriaDTO.getPrdVersioncommerciale() != null) {
            policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.join("prdVersioncommerciale").get("nomcommercial"), policeSearchCriteriaDTO.getPrdVersioncommerciale().getNomcommercial()));
        }
        if(policeSearchCriteriaDTO.getRefVille() != null){
            policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.join("refVille").get("libelle"), policeSearchCriteriaDTO.getRefVille().getLibelle()));
        }

        return policeRepository.findAll(policeSpecification).stream()
                .map(policeEntityMapper::toDto)
                .collect(Collectors.toList());
    }*/
    @Override
    public List<PoliceDTO> getPoliceByCriteres(PoliceSearchCriteriaDTO policeSearchCriteriaDTO) {
        Specification<PoliceEntity> policeSpecification = Specification.where(null);
        if (policeSearchCriteriaDTO.getNumClient() != null) {
            policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("numClient"), policeSearchCriteriaDTO.getNumClient()));
        }
        if (policeSearchCriteriaDTO.getCodePolice() != null) {
            policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("codePolice"), policeSearchCriteriaDTO.getCodePolice()));
        }
        if (policeSearchCriteriaDTO.getPrdVersioncommerciale() != null) {
            PrdVersioncommercialeDTO prdVersionCommercialeDTO = policeSearchCriteriaDTO.getPrdVersioncommerciale();
            if (prdVersionCommercialeDTO.getNomcommercial() != null) {
                policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.join("prdVersioncommerciale").get("nomcommercial"), prdVersionCommercialeDTO.getNomcommercial()));
            }
        }
        if (policeSearchCriteriaDTO.getRefVille() != null) {
            RefVilleDTO refVilleDTO = policeSearchCriteriaDTO.getRefVille();
            if (refVilleDTO.getLibelle() != null) {
                policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.join("refVille").get("libelle"), policeSearchCriteriaDTO.getRefVille().getLibelle()));
            }
            }

        return policeRepository.findAll(policeSpecification).stream()
                .map(policeEntityMapper::toDto)
                .collect(Collectors.toList());
    }



}




