package Quittance.EmissionQuittance.services.Iservice;

import Quittance.EmissionQuittance.dto.request.PrdVersioncommercialeDTO;
import Quittance.EmissionQuittance.dto.request.RefVilleDTO;

import java.util.List;

public interface IVersionCommercialeService {
    List<PrdVersioncommercialeDTO> getAllVersions();
}
