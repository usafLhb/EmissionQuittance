package Quittance.EmissionQuittance.services.Iservice;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.RefVilleDTO;

import java.util.List;

public interface IVilleService {
    List<RefVilleDTO> getAllVilles();
}
