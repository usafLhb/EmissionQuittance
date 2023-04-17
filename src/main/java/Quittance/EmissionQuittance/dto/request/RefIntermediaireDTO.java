package Quittance.EmissionQuittance.dto.request;


import Quittance.EmissionQuittance.models.classes.IntermediaireEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;




public record RefIntermediaireDTO ( String libelle,List<IntermediaireEntity> intermediair) {

 
}
