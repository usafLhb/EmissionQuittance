package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.jetbrains.annotations.NotNull;

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
    private  double tauxTaxeEve=0;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "refGarantie")
    private RefGarantieEntity refGarantie;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prdProduit")
    private PrdProduitEntity prdProduit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "police")
    private PoliceEntity police;




}
