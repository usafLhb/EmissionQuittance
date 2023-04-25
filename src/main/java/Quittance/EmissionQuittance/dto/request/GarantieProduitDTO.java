package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.entities.PoliceEntity;
import Quittance.EmissionQuittance.entities.PrdProduitEntity;
import Quittance.EmissionQuittance.entities.RefGarantieEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.jetbrains.annotations.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GarantieProduitDTO {

    private  String libelle;

    private  double tauxTaxeEve;

    private RefGarantieEntity refGarantie;

    private PrdProduitEntity prdProduit;


    private PoliceEntity police;
}
