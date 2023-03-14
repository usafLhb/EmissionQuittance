package Quittance.EmissionQuittance.services.Iservice;


import Quittance.EmissionQuittance.dto.PoliceDTO;
import Quittance.EmissionQuittance.repository.PoliceInterface;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public interface IPolice {
     public PoliceDTO save(PoliceDTO policeDTO);
}
