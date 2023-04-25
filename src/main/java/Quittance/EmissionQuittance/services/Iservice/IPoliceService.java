package Quittance.EmissionQuittance.services.Iservice;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
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
 /*    List<PoliceDTO> getPolicesByNumClient(Long numClient);
     List<PoliceDTO> getPolicesByCodePolice(String codePolice);
    List <PoliceDTO> getPolicesByVersionCommerciale(PrdVersioncommercialeDTO versionCommerciale);
    List <PoliceDTO> getPolicesByNumClientAndVersionCommerciale(Long numClient, PrdVersioncommercialeDTO versionCommerciale);
    List <PoliceDTO> getPolicesByNumClientAndCodePolice(Long numClient, String codePolice);
    List <PoliceDTO> getPolicesByNumClientAndVersionCommercialeAndCodePolice(Long numClient, PrdVersioncommercialeDTO versionCommerciale, String codePolice);
    Set <PoliceEntity> getPolicesByProduitAndCodePolice(String produit, String codePolice);*/

}
