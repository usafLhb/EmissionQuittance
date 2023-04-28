package Quittance.EmissionQuittance.services.Iservice;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.QtcQuittanceDTO;

import java.util.List;

public interface IQuittanceService {
    QtcQuittanceDTO addQuittance(QtcQuittanceDTO qtcQuittanceDTO);
    QtcQuittanceDTO updateQuittance(QtcQuittanceDTO qtcQuittanceDTO);
    List<QtcQuittanceDTO> getAllQuittance();
}
