package Quittance.EmissionQuittance.services.ImpleService;

import Quittance.EmissionQuittance.dto.request.QtcQuittanceDTO;
import Quittance.EmissionQuittance.entities.*;
import Quittance.EmissionQuittance.exception.PoliceNotFoundException;
import Quittance.EmissionQuittance.mapper.PoliceEntityMapper;
import Quittance.EmissionQuittance.mapper.QuittanceMapper;
import Quittance.EmissionQuittance.repositories.*;
import Quittance.EmissionQuittance.services.Iservice.IPoliceService;
import Quittance.EmissionQuittance.services.Iservice.IQuittanceService;
import Quittance.EmissionQuittance.utils.DateUtils;
import Quittance.EmissionQuittance.utils.ValidationUtils;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuittanceServiceImpl implements IQuittanceService {

    private final QtcQuittanceEntityRepository quittanceRepository;
    private final QuittanceMapper quittanceMapper;
    private final IntermediaireEntityRepository intermediaireEntityRepository;
    private final RefQuittanceRepository refQuittanceRepository;
    private final HabUtilisateurEntityRepository habUtilisateurRepository;
    private final QtcRemiseEntityRepository qtcRemiseEntityRepository;
    private final PoliceEntityRepository policeEntityRepository;
    private final DateUtils dateUtils;
    private final ValidationUtils validationUtils;
    private final QtcQuittanceEntityRepository qtcQuittanceRepository;





    @Override
    public QtcQuittanceDTO save(QtcQuittanceDTO quittanceDTO) {

         if(quittanceDTO.getTauxcommission()>25  ){
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
        }
       /* if (quittanceDTO.getQtcRemiseid() != null){
            throw new IllegalArgumentException("Remise  doit  etre inserer \n");
        }*/


        IntermediaireEntity inter=intermediaireEntityRepository.findById(quittanceDTO.getIntermediaireid()).orElseThrow();//7L
        RefQuittanceEntity refQuittance = refQuittanceRepository.findById(quittanceDTO.getRefQuittanceid()).orElseThrow();//1L
        HabUtilisateurEntity habUtilisateurEntity=habUtilisateurRepository.findById(quittanceDTO.getHabUtilisateurid()).orElseThrow();//1L
        QtcRemiseEntity qtcRemiseEntity=qtcRemiseEntityRepository.findById(quittanceDTO.getQtcRemiseid()).orElseThrow();//1L
        PoliceEntity police=policeEntityRepository.findById(quittanceDTO.getPoliceid()).orElseThrow();//1L || 3

         QtcQuittanceEntity quittanceEntity = quittanceMapper.toEntity(quittanceDTO);

         quittanceEntity.setIntermediaire(inter);
         quittanceEntity.setRefQuittance(refQuittance);
         quittanceEntity.setHabUtilisateur(habUtilisateurEntity);
         quittanceEntity.setQtcRemise(qtcRemiseEntity);
         quittanceEntity.setPolice(police);
         quittanceEntity.setOrdre(String.valueOf(dateUtils.getCurrentYear()));


        quittanceEntity = quittanceRepository.save(quittanceEntity);
        return    quittanceMapper.toDto(quittanceEntity);
    }

    @Override
    public boolean getQuittanceById(Long id) {
        System.out.println("idid "+id);
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

    @Override
    public List<QtcQuittanceDTO> getAllQuittance() {
        List<QtcQuittanceEntity> dataList = quittanceRepository.findAll();
        return dataList.stream()
                .map(quittanceMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public QtcQuittanceDTO update(QtcQuittanceDTO quittanceDTO) {

        QtcQuittanceEntity quittanceEntity = quittanceMapper.toEntity(quittanceDTO);
      //  QtcQuittanceEntity quittance=qtcQuittanceRepository.findById(quittanceEntity.getQuittanceid()).orElseThrow();
        quittanceEntity = quittanceRepository.save(quittanceEntity);
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
    public List<QtcQuittanceDTO> searchQuittances(Long refQuittanceid, Calendar dateDebut, Calendar dateFin, Long codePolice) {
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
            throw new IllegalArgumentException("At least one parameter must be non-null.");
        }

        return quittanceMapper.toQuittanceDTOList(quittanceEntities);
    }

}
