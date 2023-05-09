package Quittance.EmissionQuittance.services.Iservice;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.QtcQuittanceDTO;
import org.springframework.data.domain.Page;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public interface IQuittanceService {

    QtcQuittanceDTO save(QtcQuittanceDTO quittanceDTO);
    Page<QtcQuittanceDTO> getAllQuittance(int pageNumber, int pageSize);
    boolean getQuittanceById(Long id);
    QtcQuittanceDTO update(QtcQuittanceDTO quittanceDTO);
    public List<QtcQuittanceDTO> getByRefQuittanceEntity(Long refQuittanceid);
    List<QtcQuittanceDTO> searchByDateBetween(Calendar dateDebut, Calendar dateFin);
    public List<QtcQuittanceDTO> searchByCodePolice(Long codePolice);
    public Page<QtcQuittanceDTO> searchQuittances(Long refQuittanceid, Calendar dateDebut, Calendar dateFin, Long codePolice, int pageNumber, int pageSize);

    }
