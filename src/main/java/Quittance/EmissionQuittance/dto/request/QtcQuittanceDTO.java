package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "QTC_QUITTANCE", schema = "CONVERGPARAM", catalog = "")
public class QtcQuittanceDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Basic
    @Column(name = "CODESOCIETE", nullable = true)
    private Object codesociete;
    @Basic
    @Column(name = "NATUREQUITTANCE", nullable = true)
    private Object naturequittance;
    @Basic
    @Column(name = "NUMEROQUITTANCE", nullable = true)
    private Object numeroquittance;
    @Basic
    @Column(name = "CODEPOLICE", nullable = true)
    private Object codepolice;
    @Basic
    @Column(name = "NUMEROQUITTANCEORIGINE", nullable = true)
    private Object numeroquittanceorigine;
    @Basic
    @Column(name = "CODECLIENT", nullable = true)
    private Object codeclient;
    @Basic
    @Column(name = "CODEINTERMEDIAIRE", nullable = true)
    private Object codeintermediaire;
    @Basic
    @Column(name = "CODEBRANCHE", nullable = true)
    private Object codebranche;
    @Basic
    @Column(name = "NOMCLIENT", nullable = true)
    private Object nomclient;
    @Basic
    @Column(name = "PRENOMCLIENT", nullable = true)
    private Object prenomclient;
    @Basic
    @Column(name = "ADRESSECLIENT", nullable = true)
    private Object adresseclient;
    @Basic
    @Column(name = "VILLECLIENT", nullable = true)
    private Object villeclient;
    @Basic
    @Column(name = "TYPEQUITTANCE", nullable = true)
    private Object typequittance;
    @Basic
    @Column(name = "PRIMENETTE", nullable = true)
    private Object primenette;
    @Basic
    @Column(name = "TAUXTAXE", nullable = true)
    private Object tauxtaxe;
    @Basic
    @Column(name = "MONTANTTAXE", nullable = true)
    private Object montanttaxe;
    @Basic
    @Column(name = "MONTANTACCESSOIRE", nullable = true)
    private Object montantaccessoire;
    @Basic
    @Column(name = "MONTANTENCAISSE", nullable = true)
    private Object montantencaisse;
    @Basic
    @Column(name = "MONTANTCOMMISIONRETENUE", nullable = true)
    private Object montantcommisionretenue;
    @Basic
    @Column(name = "MONTANTCOMMISIONRISTOURNE", nullable = true)
    private Object montantcommisionristourne;
    @Basic
    @Column(name = "MONTONTREMISE", nullable = true)
    private Object montontremise;
    @Basic
    @Column(name = "PERIODICITE", nullable = true)
    private Object periodicite;
    @Basic
    @Column(name = "DATEDEBUT", nullable = true)
    private Object datedebut;
    @Basic
    @Column(name = "DATEFIN", nullable = true)
    private Object datefin;
    @Basic
    @Column(name = "DATEEMISSION", nullable = true)
    private Object dateemission;
    @Basic
    @Column(name = "ETATQUITTANCE", nullable = true)
    private Object etatquittance;
    @Basic
    @Column(name = "DATEETAT", nullable = true)
    private Object dateetat;
    @Basic
    @Column(name = "DATEEFFET", nullable = true)
    private Object dateeffet;
    @Basic
    @Column(name = "IDOPERATIONPRELEVEMENT", nullable = true)
    private Object idoperationprelevement;
    @Basic
    @Column(name = "IDUTILISATEURRISTOURNE", nullable = true)
    private Object idutilisateurristourne;
    @Basic
    @Column(name = "IDUTILISATEURVALIDATEUR", nullable = true)
    private Object idutilisateurvalidateur;
    @Basic
    @Column(name = "IDPRODUIT", nullable = true)
    private Object idproduit;
    @Basic
    @Column(name = "IDREMISE", nullable = true)
    private Object idremise;
    @Basic
    @Column(name = "TAUXCOMMISSION", nullable = true)
    private Object tauxcommission;
    @Basic
    @Column(name = "MONTANTCOMMISSION", nullable = true)
    private Object montantcommission;
    @Basic
    @Column(name = "SYNCHRONE", nullable = true)
    private Object synchrone;
    @Basic
    @Column(name = "DATESYNCHRONISATION", nullable = true)
    private Object datesynchronisation;
    @Basic
    @Column(name = "MONTANTCOMMISION", nullable = true)
    private Object montantcommision;
    @Basic
    @Column(name = "NUMEROQUITTANCE_OLD", nullable = true)
    private Object numeroquittanceOld;
    @Basic
    @Column(name = "DATEVALIDATION", nullable = true)
    private Object datevalidation;
    @Basic
    @Column(name = "MONTANTTAXEPARAFISCALE", nullable = true)
    private Object montanttaxeparafiscale;
    @Basic
    @Column(name = "TAUXCOMMISSIONCATNAT", nullable = true)
    private Object tauxcommissioncatnat;
    @Basic
    @Column(name = "IDQUITTANCEORIGINE", nullable = true)
    private Object idquittanceorigine;
    @Basic
    @Column(name = "TYPEQUITTANCEPREVOYANCE", nullable = true)
    private Object typequittanceprevoyance;
    @Basic
    @Column(name = "FORCEE", nullable = true)
    private Object forcee;


}
