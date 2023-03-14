package Quittance.EmissionQuittance.services.serviceImplementation;

import Quittance.EmissionQuittance.dto.PoliceDTO;
import Quittance.EmissionQuittance.mapper.PoliceMapper;
import Quittance.EmissionQuittance.models.Police;
import Quittance.EmissionQuittance.repository.PoliceRepository;
import Quittance.EmissionQuittance.services.Iservice.IPolice;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class PoliceImplementation implements IPolice {

    private PoliceMapper policeMapper;
    private PoliceRepository PoliceRepository;



    @Override
    public PoliceDTO save(PoliceDTO policeDTO) {
        Police police = policeMapper.toEntity(policeDTO);
        PoliceRepository.save(police);
        return policeDTO;
    }
    @Override
    public List<PoliceDTO> getAllPolice() {
        List<Police> entities = PoliceRepository.findAll();
        return policeMapper.toDTOList(entities);
    }


}
