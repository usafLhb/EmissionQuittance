package Quittance.EmissionQuittance.services.ImpleService;

import Quittance.EmissionQuittance.dto.request.PrdVersioncommercialeDTO;
import Quittance.EmissionQuittance.entities.PrdVersioncommercialeEntity;
import Quittance.EmissionQuittance.entities.RefVilleEntity;
import Quittance.EmissionQuittance.mapper.VersionCommMapper;
import Quittance.EmissionQuittance.repositories.PrdVersioncommercialeEntityRepository;
import Quittance.EmissionQuittance.services.Iservice.IVersionCommercialeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class VersionComServiceImpl implements IVersionCommercialeService {
    private final PrdVersioncommercialeEntityRepository prdVersioncommercialeEntityRepository;
    private final VersionCommMapper versionCommMapper;

    @Autowired
    public VersionComServiceImpl(PrdVersioncommercialeEntityRepository prdVersioncommercialeEntityRepository, VersionCommMapper versionCommMapper) {
        this.prdVersioncommercialeEntityRepository = prdVersioncommercialeEntityRepository;
        this.versionCommMapper = versionCommMapper;
    }

    @Override
    public List<PrdVersioncommercialeDTO> getAllVersions() {
        List<PrdVersioncommercialeEntity> versionscommerciales  = prdVersioncommercialeEntityRepository.findAll();
        return versionscommerciales.stream()
                .map(versionCommMapper::toDto)
                .collect(Collectors.toList());
    }
}
