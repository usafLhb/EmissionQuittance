package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Calendar;
import java.util.List;

@Entity
@Data
//@Table(name = "PRD_VERSIONCOMMERCIALE" )
public class PrdVersioncommercialeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID" )
    private Long id;
    @Basic
    @Column(name = "NOMCOMMERCIAL", nullable = true)
    private String nomcommercial;
    @Basic
    @Column(name = "DATEEDEBUT", nullable = true)
    private Calendar dateedebut;
    @Basic
    @Column(name = "DATEFIN", nullable = true)
    private Calendar datefin;
    @Basic
    @Column(name = "COMPTEBANCAIREPRESTATION", nullable = true)
    private String comptebancaireprestation;
    @Basic
    @Column(name = "COMPTEBANCAIRESERVICE", nullable = true)
    private String comptebancaireservice;
    @Basic
    @Column(name = "REFHOMOLOGATION", nullable = true)
    private Long refhomologation;
    @Basic
    @Column(name = "CODEINTERMEDIAIRE", nullable = true)
    private int codeintermediaire;
    @Basic
    @Column(name = "IDPRODUIT", nullable = true)
    private int idproduit;
    @Basic
    @Column(name = "IDSOCIETE", nullable = true)
    private int idsociete;
    @Basic
    @Column(name = "DELAIMODIFENINSTANCE", nullable = true)
    private Calendar delaimodifeninstance;
    @Basic
    @Column(name = "NOMBREMAXADHESION", nullable = true)
    private Long nombremaxadhesion;
    @Basic
    @Column(name = "CODE", nullable = true)
    private int code;
    @Basic
    @Column(name = "NOMCOMMERCIAL_AR", nullable = true)
    private String nomcommercialAr;
    @Basic
    @Column(name = "PLAFONDINDEMNITE", nullable = true)
    private String plafondindemnite;
    @Basic
    @Column(name = "DATEMAJPRODUIT", nullable = true)
    private Calendar datemajproduit;



}
