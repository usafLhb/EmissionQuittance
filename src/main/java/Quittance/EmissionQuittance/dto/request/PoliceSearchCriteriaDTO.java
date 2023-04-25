package Quittance.EmissionQuittance.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PoliceSearchCriteriaDTO {
    public Long NumClient;
    public String CodePolice;
    public PrdVersioncommercialeDTO VersionCommerciale;
    public RefVilleDTO Ville;
}
