package Quittance.EmissionQuittance.services.Iservice;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.QtcQuittanceDTO;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public interface IQuittanceService {

    QtcQuittanceDTO save(QtcQuittanceDTO quittanceDTO);
    List<QtcQuittanceDTO> getAllQuittance();
    boolean getQuittanceById(Long id);
    QtcQuittanceDTO update(QtcQuittanceDTO quittanceDTO);
    public List<QtcQuittanceDTO> getByRefQuittanceEntity(Long refQuittanceid);
    List<QtcQuittanceDTO> searchByDateBetween(Calendar dateDebut, Calendar dateFin);
    public List<QtcQuittanceDTO> searchByCodePolice(Long codePolice);
}
