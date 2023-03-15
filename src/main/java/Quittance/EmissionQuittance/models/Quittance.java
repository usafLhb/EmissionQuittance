package Quittance.EmissionQuittance.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Quittance {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quittance_seq")
    private Long id;
    private Long numeroQuittance;
    private String codePolice;
    private Long ordre;
    private Long exercice;
    private Date dateEmission;
    private Calendar dateDebut;
    private Calendar dateFin;
    private Double primeNette;
    private Double montantTaxe;
    private Double montantAccessoire;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ref_quittance_id")
    private RefQuittance refQuittance;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Qtc_Remise_id")
    private Qtc_Remise remise;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Police_id")
    private Police police;

    @OneToMany(mappedBy = "quittance")
    private List<Prd_VersionCommerciale> versionCommerciale;

    @ManyToMany
    @JoinTable(
            name = "Details_Quittance",
            joinColumns = @JoinColumn(name = "quittance_id"),
            inverseJoinColumns = @JoinColumn(name = "garantie_id"))
    private Set<Garantie> garanties= new HashSet<>();
    private Double montantEve;
    private Double montantTotal;
}
