package Quittance.EmissionQuittance.services.ImpleService;

import Quittance.EmissionQuittance.dto.request.QtcQuittanceDTO;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import Quittance.EmissionQuittance.entities.QtcQuittanceEntity;
import Quittance.EmissionQuittance.mapper.PoliceEntityMapper;
import Quittance.EmissionQuittance.mapper.QuittanceMapper;
import Quittance.EmissionQuittance.repositories.PoliceEntityRepository;
import Quittance.EmissionQuittance.repositories.QtcQuittanceEntityRepository;
import Quittance.EmissionQuittance.services.Iservice.IPoliceService;
import Quittance.EmissionQuittance.services.Iservice.IQuittanceService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuittanceServiceImpl implements IQuittanceService {

    private final QtcQuittanceEntityRepository quittanceRepository;
    private final QuittanceMapper quittanceMapper;



    @Override
    public QtcQuittanceDTO save(QtcQuittanceDTO quittanceDTO) {
        QtcQuittanceEntity quittanceEntity = quittanceMapper.toEntity(quittanceDTO);
        quittanceEntity = quittanceRepository.save(quittanceEntity);
        return quittanceMapper.toDto(quittanceEntity);
    }

    @Override
    public List<QtcQuittanceDTO> getAllQuittance() {
        List<QtcQuittanceEntity> dataList = quittanceRepository.findAll();
        return dataList.stream()
                .map(quittanceMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<QtcQuittanceEntity> getAllQuittance2() {
        System.out.println("getAllQuittance 3");
        return quittanceRepository.findAll();
    }


    @Override
    public QtcQuittanceDTO update(QtcQuittanceDTO quittanceDTO) {
        QtcQuittanceEntity quittanceEntity = quittanceMapper.toEntity(quittanceDTO);
        quittanceEntity = quittanceRepository.save(quittanceEntity);
        return quittanceMapper.toDto(quittanceEntity);
    }

    @Override
    public List<QtcQuittanceDTO> getByRefQuittanceEntity(String refQuittanceEntity) {
        List<QtcQuittanceEntity> quittanceEntities = quittanceRepository.findByRefQuittance(refQuittanceEntity);
        return quittanceMapper.toQuittanceDTOList(quittanceEntities);
    }

    @Override
    public List<QtcQuittanceDTO> searchByDateBetween(Date dateDebut, Date dateFin) {
        List<QtcQuittanceEntity> quittanceEntities = quittanceRepository.findAllByDatefinBetween(dateDebut, dateFin);
        return quittanceMapper.toQuittanceDTOList(quittanceEntities);
    }

    @Override
    public List<QtcQuittanceDTO> searchByCodePolice(String codePolice) {
        List<QtcQuittanceEntity> quittanceEntities = quittanceRepository.findByCodepolice(codePolice);
        return quittanceMapper.toQuittanceDTOList(quittanceEntities);
    }
}
