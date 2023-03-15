package Quittance.EmissionQuittance.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Details_Quittance implements Serializable {

    @EmbeddedId
    private DetailQuittanceId id;

    @ManyToOne
    @MapsId("quittance_id")
    private Produit quittance;

    @ManyToOne
    @MapsId("garantie_id")
    private Garantie garantie;
    private Double primeNette;
    private Double montantTaxe;
    private Double tauxCommission;
    private Double montantCommission;




}
