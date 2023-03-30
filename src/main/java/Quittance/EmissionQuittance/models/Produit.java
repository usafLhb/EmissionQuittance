package Quittance.EmissionQuittance.models;

import Quittance.EmissionQuittance.models.classes.PoliceEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produit_seq")

    private Long id;
    private String libelle;
    private Double tauxTaxe;
    private Double tauxEve;
    @ManyToMany(mappedBy = "produits")
    private List<Garantie> garanties;

    @OneToMany(mappedBy = "produit")
    private List<PoliceEntity> policeEntities;

}
