package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Garantie_Produit")

public class GarantieProduitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = true)
    private Long id;


    @NotNull
    private  String libelle;
    @NotNull
    private  double taux_taxe_eve;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "refGarantie")
    private RefGarantieEntity refGarantie;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prdProduit")
    private PrdProduitEntity prdProduit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "police")
    private PoliceEntity police;



    private double tauxTaxeEve=0  ;
}
