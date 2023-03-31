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
public class PeriodiciteDTO {

    private String type_periodicite;


    private List<PoliceEntity> polices;
}
