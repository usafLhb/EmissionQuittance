package Quittance.EmissionQuittance.services.Iservice;


import Quittance.EmissionQuittance.dto.PoliceDTO;

import java.util.List;


public interface IPolice {
     public PoliceDTO save(PoliceDTO policeDTO);
     public List<PoliceDTO> getAllPolice();
}
