package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PRD_VERSIONCOMMERCIALE", schema = "CONVERGPARAM", catalog = "")
public class PrdVersioncommercialeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID" )
    private Long id;
    @Basic
    @Column(name = "NOMCOMMERCIAL", nullable = true)
    private Object nomcommercial;
    @Basic
    @Column(name = "DATEEDEBUT", nullable = true)
    private Object dateedebut;
    @Basic
    @Column(name = "DATEFIN", nullable = true)
    private Object datefin;
    @Basic
    @Column(name = "COMPTEBANCAIREPRESTATION", nullable = true)
    private Object comptebancaireprestation;
    @Basic
    @Column(name = "COMPTEBANCAIRESERVICE", nullable = true)
    private Object comptebancaireservice;
    @Basic
    @Column(name = "REFHOMOLOGATION", nullable = true)
    private Object refhomologation;
    @Basic
    @Column(name = "CODEINTERMEDIAIRE", nullable = true)
    private Object codeintermediaire;
    @Basic
    @Column(name = "IDPRODUIT", nullable = true)
    private Object idproduit;
    @Basic
    @Column(name = "IDSOCIETE", nullable = true)
    private Object idsociete;
    @Basic
    @Column(name = "DELAIMODIFENINSTANCE", nullable = true)
    private Object delaimodifeninstance;
    @Basic
    @Column(name = "NOMBREMAXADHESION", nullable = true)
    private Object nombremaxadhesion;
    @Basic
    @Column(name = "CODE", nullable = true)
    private Object code;
    @Basic
    @Column(name = "NOMCOMMERCIAL_AR", nullable = true)
    private Object nomcommercialAr;
    @Basic
    @Column(name = "PLAFONDINDEMNITE", nullable = true)
    private Object plafondindemnite;
    @Basic
    @Column(name = "DATEMAJPRODUIT", nullable = true)
    private Object datemajproduit;


}
