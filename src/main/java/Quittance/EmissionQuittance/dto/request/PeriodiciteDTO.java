package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.entities.PoliceEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeriodiciteDTO {

    private String type_periodicite;
    private List<PoliceDTO> polices;
}
