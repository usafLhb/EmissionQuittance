package Quittance.EmissionQuittance.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRD_VERSIONCOMMERCIALE" )
public class PrdVersioncommercialeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotNull
    @Column(name = "NOMCOMMERCIAL")
    private String nomcommercial;

    @Column(name = "DATEEDEBUT", nullable = true)
    private Calendar dateedebut;

    @Column(name = "DATEFIN", nullable = true)
    private Calendar datefin;

    @Column(name = "COMPTEBANCAIREPRESTATION", nullable = true)
    private String comptebancaireprestation;

    @Column(name = "COMPTEBANCAIRESERVICE", nullable = true)
    private String comptebancaireservice;

    @Column(name = "REFHOMOLOGATION", nullable = true)
    private Long refhomologation;

    @Column(name = "CODEINTERMEDIAIRE", nullable = true)
    private int codeintermediaire;

    @Column(name = "IDPRODUIT", nullable = true)
    private int idproduit;

    @Column(name = "IDSOCIETE", nullable = true)
    private int idsociete;

    @Column(name = "DELAIMODIFENINSTANCE", nullable = true)
    private Calendar delaimodifeninstance;

    @Column(name = "NOMBREMAXADHESION", nullable = true)
    private Long nombremaxadhesion;

    @Column(name = "CODE", nullable = true)
    private int code;

    @Column(name = "NOMCOMMERCIAL_AR", nullable = true)
    private String nomcommercialAr;

    @Column(name = "PLAFONDINDEMNITE", nullable = true)
    private String plafondindemnite;

    @Column(name = "DATEMAJPRODUIT", nullable = true)
    private Calendar datemajproduit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "intermediaire", referencedColumnName = "ID")
    private IntermediaireEntity intermediaire;

    @OneToMany(mappedBy = "prdVersioncommerciale", fetch = FetchType.LAZY)
    private List<PoliceEntity> polices;
}