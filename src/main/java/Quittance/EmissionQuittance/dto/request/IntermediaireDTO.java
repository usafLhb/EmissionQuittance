package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.entities.RefIntermediaireEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class IntermediaireDTO {




    private String nomCommercial ;


    private QtcQuittanceDTO quittance;

    private List<PoliceDTO> polices;


    private RefIntermediaireEntity refIntermediaireEntity;
}
