package Quittance.EmissionQuittance.services.ImpleService;

import Quittance.EmissionQuittance.dto.request.GarantieProduitDTO;
import Quittance.EmissionQuittance.entities.GarantieProduitEntity;
import Quittance.EmissionQuittance.repositories.GarantieProduitEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    @Autowired
    private GarantieProduitEntityRepository exampleRepository;

    public GarantieProduitDTO getExampleById(Long id) {
        GarantieProduitEntity entity = exampleRepository.findById(id).orElse(null);
        return ExampleMapper.INSTANCE.toDTO(entity);
    }

    public GarantieProduitDTO createExample(GarantieProduitDTO dto) {
        GarantieProduitEntity entity = ExampleMapper.INSTANCE.toEntity(dto);
        exampleRepository.save(entity);
        return ExampleMapper.INSTANCE.toDTO(entity);
    }

    public GarantieProduitDTO updateExample(Long id, GarantieProduitDTO dto) {
        GarantieProduitEntity entity = exampleRepository.findById(id).orElse(null);
        if (entity != null) {
            entity.setLibelle(dto.getLibelle());
            exampleRepository.save(entity);
        }
        return ExampleMapper.INSTANCE.toDTO(entity);
    }

    public void deleteExample(Long id) {
        exampleRepository.deleteById(id);
    }
}
