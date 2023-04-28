package Quittance.EmissionQuittance.dto.request;


import Quittance.EmissionQuittance.entities.IntermediaireEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;




public class RefIntermediaireDTO  {
    String libelle;List<IntermediaireEntity> intermediair;
 
}
