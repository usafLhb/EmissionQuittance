package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.models.Ref_Commerciale;
import Quittance.EmissionQuittance.models.classes.RefIntermediaireEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class IntermediaireDTO {


    private Ref_Commerciale ref_Commerciale;

    private String nomCommercial ;


    private QtcQuittanceDTO quittance;


    private List<PoliceDTO> polices;


    private RefIntermediaireEntity refIntermediaireEntity;
}
