package Quittance.EmissionQuittance.services.ImpleService;


import Quittance.EmissionQuittance.entities.QtcQuittanceEntity;
import Quittance.EmissionQuittance.mapper.QuittanceMapper;
import Quittance.EmissionQuittance.repositories.QtcQuittanceEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testSer {
    @Autowired
    private   QtcQuittanceEntityRepository quittanceRepository;
    @Autowired
    private   QuittanceMapper quittanceMapper;





    public String getAllQuittance22() {
        System.out.println("getAllQuittance 3");
        return "quittanceRepository.findAll()";
    }

    public List<QtcQuittanceEntity> getAllQuittance2() {
        System.out.println("getAllQuittance 3");
        return quittanceRepository.findAll();
    }

}
