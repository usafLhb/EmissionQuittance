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

    @Column(name = "DATEEDEBUT")
    private Calendar dateedebut;

    @Column(name = "DATEFIN")
    private Calendar datefin;

    @Column(name = "COMPTEBANCAIREPRESTATION")
    private String comptebancaireprestation;

    @Column(name = "COMPTEBANCAIRESERVICE")
    private String comptebancaireservice;

    @Column(name = "REFHOMOLOGATION")
    private Long refhomologation;

    @Column(name = "CODEINTERMEDIAIRE")
    private int codeintermediaire;

    @Column(name = "IDPRODUIT")
    private int idproduit;

    @Column(name = "IDSOCIETE")
    private int idsociete;

    @Column(name = "DELAIMODIFENINSTANCE")
    private Calendar delaimodifeninstance;

    @Column(name = "NOMBREMAXADHESION")
    private Long nombremaxadhesion;

   /* @Column(name = "CODE")
    private int code;*/

    @Column(name = "NOMCOMMERCIAL_AR")
    private String nomcommercialAr;

    @Column(name = "PLAFONDINDEMNITE")
    private String plafondindemnite;

    @Column(name = "DATEMAJPRODUIT")
    private Calendar datemajproduit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "intermediaire", referencedColumnName = "ID")
    private IntermediaireEntity intermediaire;

    @OneToMany(mappedBy = "prdVersioncommerciale", fetch = FetchType.LAZY)
    private List<PoliceEntity> polices;
}