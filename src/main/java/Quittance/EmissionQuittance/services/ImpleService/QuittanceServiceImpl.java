package Quittance.EmissionQuittance.services.ImpleService;

import Quittance.EmissionQuittance.dto.request.QtcQuittanceDTO;
import Quittance.EmissionQuittance.dto.response.QuittanceResponse;
import Quittance.EmissionQuittance.entities.*;
import Quittance.EmissionQuittance.mapper.QuittanceMapper;
import Quittance.EmissionQuittance.mapper.responseMapper.QuittanceMapperResponse;
import Quittance.EmissionQuittance.repositories.*;
import Quittance.EmissionQuittance.services.Iservice.IQuittanceService;
import Quittance.EmissionQuittance.utils.DateUtils;
import Quittance.EmissionQuittance.utils.SearchUtils;
import Quittance.EmissionQuittance.utils.ValidationUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuittanceServiceImpl implements IQuittanceService {

    private final QtcQuittanceEntityRepository quittanceRepository;
    private final QuittanceMapper quittanceMapper;
    private final QuittanceMapperResponse quittanceMapperResponse;
    private final IntermediaireEntityRepository intermediaireEntityRepository;
    private final RefQuittanceRepository refQuittanceRepository;
    private final HabUtilisateurEntityRepository habUtilisateurRepository;
    private final QtcRemiseEntityRepository qtcRemiseEntityRepository;
    private final PoliceEntityRepository policeEntityRepository;
    private final DateUtils dateUtils;
    private final ValidationUtils validationUtils;
    private final QtcQuittanceEntityRepository qtcQuittanceRepository;
    private final RefVilleEntityRepository refVilleRepository;

    private final SearchUtils searchUtils;


    @Override
    public QtcQuittanceDTO save(QtcQuittanceDTO quittanceDTO) {

      /*   if(quittanceDTO.getTauxcommission()>25  ){
             throw new IllegalArgumentException("Le taux de commission ne peut pas dépasser 25%");
         }
        if(quittanceDTO.getMontantaccessoire() != 0 && quittanceDTO.getMontantaccessoire() != 10 && quittanceDTO.getMontantaccessoire() != 15 && quittanceDTO.getMontantaccessoire() != 20 && quittanceDTO.getMontantaccessoire() != 30){
            throw new IllegalArgumentException("Le montant des ACC doit etre 0 or 10 or 15 or 20 or 30");
        }
         if(getQuittanceByPoliceId(quittanceDTO.getPoliceid())){
             throw new IllegalArgumentException("Police  deja  existante");
         }
        if(!dateUtils.isStartDateAfterEndDate( quittanceDTO.getDatefin().getTime(),quittanceDTO.getDatedebut().getTime())){
            throw new IllegalArgumentException("Date debut est supp de date Fin \n");
        }
        if(!dateUtils.isStartDateAfterEndDate( quittanceDTO.getDateEcheance().getTime() ,quittanceDTO.getDateeffet().getTime())){
            throw new IllegalArgumentException("Date debut est supp de date Fin \n");
        }
        if(!dateUtils.isStartDateAfterEndDate( quittanceDTO.getDateEcheance().getTime() ,quittanceDTO.getDateTerme().getTime())){
            throw new IllegalArgumentException("Date debut est supp de date Fin \n");
        }
        if(! validationUtils.isTaxAmountValid(quittanceDTO.getPrimenette() , quittanceDTO.getMontanttaxe())){
            throw new IllegalArgumentException("Le montant de la taxe ne doit pas etre  supperieur a 15% de la prime \n");
        }*/


       /* if (quittanceDTO.getQtcRemiseid() != null){
            throw new IllegalArgumentException("Remise  doit  etre inserer \n");
        }*/



        QtcQuittanceEntity quittanceEntity = quittanceMapper.toEntity(quittanceDTO);


       quittanceEntity.setOrdre(String.valueOf(dateUtils.getCurrentYear()));
       quittanceEntity.setRefQuittance( searchUtils.getRefQuittanceEntityById(quittanceDTO.getRefQuittanceid()));
       quittanceEntity.setIntermediaire(searchUtils.getIntermediaireEntityById(quittanceDTO.getIntermediaireid()));
       quittanceEntity.setHabUtilisateur(searchUtils.getHabUtilisateurEntityById(quittanceDTO.getHabUtilisateurid()));
       quittanceEntity.setQtcRemise(searchUtils.getQtcRemiseEntityById(quittanceDTO.getQtcRemiseid()));
       quittanceEntity.setPolice(searchUtils.getPoliceEntityById(quittanceDTO.getPoliceid()));
    //   quittanceEntity.setVille(searchUtils.getRefVilleEntityById(quittanceDTO.getVilleclient()));
       quittanceEntity.setPrdVersioncommerciale(searchUtils.getversioncommercialeById(quittanceDTO.getVersioncommerciale()));


        quittanceEntity = quittanceRepository.save(quittanceEntity);
        return    quittanceMapper.toDto(quittanceEntity);
    }

    @Override
    public boolean getQuittanceById(Long id) {
        PoliceEntity police= policeEntityRepository.findById(id).orElseThrow();
        System.out.println("policepolice "+police.toString());
        QtcQuittanceEntity qtcQuittanceEntity =  quittanceRepository.findByPolice(police);
        System.out.println("qtcQuittanceEntityqtcQuittanceEntity "+qtcQuittanceEntity.toString());
        System.out.println((qtcQuittanceEntity != null) ? true : false);
        return (qtcQuittanceEntity != null) ? true : false;
    }
    public boolean getQuittanceByPoliceId(Long id) {
        PoliceEntity police= policeEntityRepository.findById(id).orElseThrow();
        QtcQuittanceEntity qtcQuittanceEntity =  quittanceRepository.findByPolice(police);
        return (qtcQuittanceEntity != null) ? true : false;
    }

   /* @Override
    public List<QtcQuittanceDTO> getAllQuittance() {
        List<QtcQuittanceEntity> dataList = quittanceRepository.findAll();
        return dataList.stream()
                .map(quittanceMapper::toDto)
                .collect(Collectors.toList());
    }*/

    @Override
    public Page<QtcQuittanceDTO> getAllQuittance(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<QtcQuittanceEntity> quittancePage = quittanceRepository.findAll(pageable);
        List<QtcQuittanceDTO> quittanceDTOList = quittancePage.getContent()
                .stream()
                .map(quittanceMapper::toDto)
                .collect(Collectors.toList());
        return new PageImpl<>(quittanceDTOList, pageable, quittancePage.getTotalElements());
    }


    @Override
    public QtcQuittanceDTO update(QtcQuittanceDTO quittanceDTO) {
        QtcQuittanceEntity quittanceEntity = qtcQuittanceRepository.findById(quittanceDTO.getId())
                .orElseThrow(() -> new IllegalArgumentException("Quittance not found"));

        quittanceMapper.partialUpdate(quittanceDTO, quittanceEntity);

        quittanceEntity.setRefQuittance( searchUtils.getRefQuittanceEntityById(quittanceDTO.getRefQuittanceid()));
        quittanceEntity.setIntermediaire(searchUtils.getIntermediaireEntityById(quittanceDTO.getIntermediaireid()));
        quittanceEntity.setHabUtilisateur(searchUtils.getHabUtilisateurEntityById(quittanceDTO.getHabUtilisateurid()));
        quittanceEntity.setQtcRemise(searchUtils.getQtcRemiseEntityById(quittanceDTO.getQtcRemiseid()));
        //quittanceEntity.setPolice(searchUtils.getPoliceEntityById(quittanceDTO.getPoliceid()));
       // quittanceEntity.setVille(searchUtils.getRefVilleEntityById(quittanceDTO.getVilleclient()));
        quittanceEntity.setPrdVersioncommerciale(searchUtils.getversioncommercialeById(quittanceDTO.getVersioncommerciale()));



        quittanceEntity = qtcQuittanceRepository.save(quittanceEntity);
        return quittanceMapper.toDto(quittanceEntity);
    }
    @Override
    public List<QtcQuittanceDTO> getByRefQuittanceEntity(Long refQuittanceid) {
        RefQuittanceEntity refQuittance = refQuittanceRepository.findById(refQuittanceid).orElseThrow();//1L
        List<QtcQuittanceEntity> quittanceEntities = quittanceRepository.findByRefQuittance(refQuittance);
        return quittanceMapper.toQuittanceDTOList(quittanceEntities);
    }

    @Override
    public List<QtcQuittanceDTO> searchByDateBetween(Calendar dateDebut, Calendar dateFin) {
        List<QtcQuittanceEntity> quittanceEntities = quittanceRepository.findAllByDatefinBetween(dateDebut, dateFin);
        return quittanceMapper.toQuittanceDTOList(quittanceEntities);
    }

    @Override
    public List<QtcQuittanceDTO> searchByCodePolice(Long codePolice) {
        PoliceEntity police=policeEntityRepository.findById(codePolice).orElseThrow();//1L || 3

        List<QtcQuittanceEntity> quittanceEntities = quittanceRepository.findAllByPolice(police);
        return quittanceMapper.toQuittanceDTOList(quittanceEntities);
    }
    @Override
    public Page<QuittanceResponse> searchQuittances(Long refQuittanceid, Calendar dateDebut, Calendar dateFin, Long codePolice, int pageNumber, int pageSize) {
        RefQuittanceEntity refQuittance = null;
        PoliceEntity police = null;
        List<QtcQuittanceEntity> quittanceEntities = null;

        if (refQuittanceid != null) {
            refQuittance = refQuittanceRepository.findById(refQuittanceid).orElseThrow();
            quittanceEntities = quittanceRepository.findByRefQuittance(refQuittance);
        } else if (dateDebut != null && dateFin != null) {
            quittanceEntities = quittanceRepository.findAllByDatefinBetween(dateDebut, dateFin);
        } else if (codePolice != null) {
            police = policeEntityRepository.findById(codePolice).orElseThrow();
            quittanceEntities = quittanceRepository.findAllByPolice(police);
        } else {
            quittanceEntities = quittanceRepository.findAll();
            // throw new IllegalArgumentException("At least one parameter must be non-null.");
        }
       /* Pageable paging = PageRequest.of(pageNumber, pageSize);
        Page<QtcQuittanceEntity> pagedResult = new PageImpl<>(quittanceEntities, paging, quittanceEntities.size());
        return pagedResult.map(quittanceMapper::toDto);*/

        Pageable paging = PageRequest.of(pageNumber, pageSize);
        int startIndex = paging.getPageNumber() * paging.getPageSize();
        int endIndex = Math.min(startIndex + paging.getPageSize(), quittanceEntities.size());
        List<QtcQuittanceEntity> pageContent = quittanceEntities.subList(startIndex, endIndex);
        Page<QtcQuittanceEntity> pagedResult = new PageImpl<>(pageContent, paging, quittanceEntities.size());
        return pagedResult.map(quittanceMapperResponse::toDto);
    }
    public List<QuittanceResponse> getAllQuittances() {
        return quittanceRepository.findAll()
                .stream()
                .map(quittanceMapperResponse::toDto)
                .collect(Collectors.toList());
    }



}
