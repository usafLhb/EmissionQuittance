package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.models.classes.PoliceEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefPoliceDTO {



    private String libelle;


    private List<PoliceEntity> polices;
}
