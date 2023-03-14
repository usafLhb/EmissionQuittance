package Quittance.EmissionQuittance.models;

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
    @ManyToMany(mappedBy = "courses")
    private List<Garantie> garanties;
}
