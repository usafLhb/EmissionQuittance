package Quittance.EmissionQuittance.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Garantie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "garantie_seq")
    private Long id;
    private String libelle;
    private String code;
    @ManyToMany
    @JoinTable(
            name = "QTC_GARANTIE",
            joinColumns = @JoinColumn(name = "garantie_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id"))
    private Set<Produit> produits = new HashSet<>();

    @ManyToMany(mappedBy = "garanties")
    private List<Quittance> quittances;


}
