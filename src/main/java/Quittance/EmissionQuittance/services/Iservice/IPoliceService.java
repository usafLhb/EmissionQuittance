package Quittance.EmissionQuittance.services.Iservice;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.PoliceSearchCriteriaDTO;
import Quittance.EmissionQuittance.dto.request.PrdVersioncommercialeDTO;
import Quittance.EmissionQuittance.entities.PoliceEntity;
import Quittance.EmissionQuittance.entities.PrdVersioncommercialeEntity;
import org.apache.coyote.Response;

import java.util.List;
import java.util.Set;


public interface IPoliceService {
    PoliceDTO addPolice(PoliceDTO policeDTO);
    PoliceDTO updatePolice(Long policeId, PoliceDTO policeDTO);
    List<PoliceDTO> getAllPolices();
    List<PoliceDTO> getPoliceByCriteres(PoliceSearchCriteriaDTO policeSearchCriteriaDTO);

}
