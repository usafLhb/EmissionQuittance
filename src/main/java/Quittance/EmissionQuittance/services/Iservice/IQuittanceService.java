package Quittance.EmissionQuittance.services.Iservice;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.QtcQuittanceDTO;

import java.util.Date;
import java.util.List;

public interface IQuittanceService {

    QtcQuittanceDTO save(QtcQuittanceDTO quittanceDTO);
    List<QtcQuittanceDTO> getAllQuittance();
    QtcQuittanceDTO update(QtcQuittanceDTO quittanceDTO);
    List<QtcQuittanceDTO> getByRefQuittanceEntity(String refQuittanceEntity);
    List<QtcQuittanceDTO> searchByDateBetween(Date dateDebut, Date dateFin);
    List<QtcQuittanceDTO> searchByCodePolice(String codePolice);
}
