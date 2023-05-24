package Quittance.EmissionQuittance.services.ImpleService;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.RefVilleDTO;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import Quittance.EmissionQuittance.entities.RefVilleEntity;
import Quittance.EmissionQuittance.mapper.PoliceEntityMapper;
import Quittance.EmissionQuittance.mapper.VilleMapper;
import Quittance.EmissionQuittance.repositories.PoliceEntityRepository;
import Quittance.EmissionQuittance.repositories.RefVilleEntityRepository;
import Quittance.EmissionQuittance.services.Iservice.IVilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VilleServiceImpl implements IVilleService {

    private final RefVilleEntityRepository refVilleEntityRepository;
    private final VilleMapper villeMapper;

    @Autowired
    public VilleServiceImpl(RefVilleEntityRepository refVilleEntityRepository, VilleMapper villeMapper) {
        this.refVilleEntityRepository = refVilleEntityRepository;
        this.villeMapper = villeMapper;
    }
    @Override
    public List<RefVilleDTO> getAllVilles() {
        List<RefVilleEntity> villes  = refVilleEntityRepository.findAll();
        return villes.stream()
                .map(villeMapper::toDto)
                .collect(Collectors.toList());
    }
}
