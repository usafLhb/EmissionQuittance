package Quittance.EmissionQuittance.services.ImpleService;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.PoliceSearchCriteriaDTO;
import Quittance.EmissionQuittance.dto.request.PrdProduitDTO;
import Quittance.EmissionQuittance.dto.request.PrdVersioncommercialeDTO;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import Quittance.EmissionQuittance.entities.PrdVersioncommercialeEntity;
import Quittance.EmissionQuittance.mapper.PoliceEntityMapper;
import Quittance.EmissionQuittance.mapper.PrdVersionCommercialeMapper;
import Quittance.EmissionQuittance.repositories.PoliceEntityRepository;
import Quittance.EmissionQuittance.services.Iservice.IPoliceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PoliceServiceImpl implements IPoliceService {
    private PoliceEntityRepository policeRepository;
    private PoliceEntityMapper policeEntityMapper;
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

/*    @Override
    public List<PoliceDTO> getPolicesByNumClient(Long numClient) {
        List<PoliceEntity> polices = policeRepository.findAllByNumClient(numClient);
        return polices.stream()
                .map(policeEntityMapper::toDto)
                .collect(Collectors.toList());
    }
    @Override
    public List<PoliceDTO> getPolicesByCodePolice(String codePolice) {
        List<PoliceEntity> polices = policeRepository.findAllByCodePolice(codePolice);
        return polices.stream()
                .map(policeEntityMapper::toDto)
                .collect(Collectors.toList());
    }
    @Override
    public List<PoliceDTO> getPolicesByVersionCommerciale(PrdVersioncommercialeDTO versionCommerciale) {
        List<PoliceEntity> polices = policeRepository.findAllByPrd_versionCommerciale(versionCommerciale);
        return polices.stream()
                .map(policeEntityMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<PoliceDTO> getPolicesByNumClientAndVersionCommerciale(Long numClient, PrdVersioncommercialeDTO v_comm) {
        List<PoliceEntity> polices = policeRepository.findAllByNumClientAndPrd_versionCommerciale(numClient, v_comm);
        return polices.stream()
                .map(policeEntityMapper::toDto)
                .collect(Collectors.toList());

    }
    @Override
    public List<PoliceDTO> getPolicesByNumClientAndCodePolice(Long numClient, String codePolice) {
        List<PoliceEntity> polices = policeRepository.findAllByNumClientAndCodePolice(numClient, codePolice);
        return polices.stream()
                .map(policeEntityMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<PoliceDTO> getPolicesByNumClientAndVersionCommercialeAndCodePolice(Long numClient, PrdVersioncommercialeDTO versioncommerciale, String codePolice) {
        List<PoliceEntity> polices = policeRepository.findAllByNumClientAndPrd_versionCommercialeAndCodePolice(numClient, versioncommerciale, codePolice);
        return polices.stream()
                .map(policeEntityMapper::toDto)
                .collect(Collectors.toList());

    }
    @Override
    public Set<PoliceEntity> getPolicesByProduitAndCodePolice(String produit, String codePolice) {
        return null;
    }*/

    public List<PoliceDTO> getPoliceByCriteres(PoliceSearchCriteriaDTO policeSearchCriteriaDTO){
        Specification<PoliceEntity> policeSpecification = Specification.where(null);
        if (policeSearchCriteriaDTO.getNumClient() != null) {
            policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("numClient"), policeSearchCriteriaDTO.getNumClient()));
        }
        if (policeSearchCriteriaDTO.getCodePolice() != null) {
            policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("codePolice"), policeSearchCriteriaDTO.getCodePolice()));
        }
        if (policeSearchCriteriaDTO.getVersionCommerciale() != null) {
            policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("versionCommerciale").get("nomCommercial"), policeSearchCriteriaDTO.getVersionCommerciale().getNomcommercial()));
        }
        if(policeSearchCriteriaDTO.getVille() != null){
            policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("ville").get("libelle"), policeSearchCriteriaDTO.getVille().getLibelle()));
        }

        return policeRepository.findAll(policeSpecification).stream()
                .map(policeEntityMapper::toDto)
                .collect(Collectors.toList());
    }


}




