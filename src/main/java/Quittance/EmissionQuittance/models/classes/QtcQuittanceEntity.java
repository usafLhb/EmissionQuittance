package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Calendar;
import java.util.List;

@Entity
@Data
@Table(name = "QTC_QUITTANCE" )
public class QtcQuittanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Basic
    @Column(name = "CODESOCIETE", nullable = true)
    private int codesociete;
    @Basic
    @Column(name = "NATUREQUITTANCE", nullable = true)
    private String naturequittance;
    @Basic
    @Column(name = "NUMEROQUITTANCE", nullable = true)
    private String numeroquittance;
    @Basic
    @Column(name = "CODEPOLICE", nullable = true)
    private String codepolice;
    @Basic
    @Column(name = "NUMEROQUITTANCEORIGINE", nullable = true)
    private String numeroquittanceorigine;
    @Basic
    @Column(name = "CODECLIENT", nullable = true)
    private String codeclient;
    @Basic
    @Column(name = "CODEINTERMEDIAIRE", nullable = true)
    private Long codeintermediaire;
    @Basic
    @Column(name = "CODEBRANCHE", nullable = true)
    private Long codebranche;
    @Basic
    @Column(name = "NOMCLIENT", nullable = true)
    private String nomclient;
    @Basic
    @Column(name = "PRENOMCLIENT", nullable = true)
    private String prenomclient;
    @Basic
    @Column(name = "ADRESSECLIENT", nullable = true)
    private String adresseclient;
    @Basic
    @Column(name = "VILLECLIENT", nullable = true)
    private String villeclient;
    @Basic
    @Column(name = "TYPEQUITTANCE", nullable = true)
    private String typequittance;
    @Basic
    @Column(name = "PRIMENETTE", nullable = true)
    private double primenette;
    @Basic
    @Column(name = "TAUXTAXE", nullable = true)
    private double tauxtaxe;
    @Basic
    @Column(name = "MONTANTTAXE", nullable = true)
    private double montanttaxe;
    @Basic
    @Column(name = "MONTANTACCESSOIRE", nullable = true)
    private double montantaccessoire;
    @Basic
    @Column(name = "MONTANTENCAISSE", nullable = true)
    private double montantencaisse;
    @Basic
    @Column(name = "MONTANTCOMMISIONRETENUE", nullable = true)
    private double montantcommisionretenue;
    @Basic
    @Column(name = "MONTANTCOMMISIONRISTOURNE", nullable = true)
    private double montantcommisionristourne;
    @Basic
    @Column(name = "MONTONTREMISE", nullable = true)
    private double montontremise;
    @Basic
    @Column(name = "PERIODICITE", nullable = true)
    private String periodicite;
    @Basic
    @Column(name = "DATEDEBUT", nullable = true)
    private Calendar datedebut;
    @Basic
    @Column(name = "DATEFIN", nullable = true)
    private Calendar datefin;
    @Basic
    @Column(name = "DATEEMISSION", nullable = true)
    private Calendar dateemission;
    @Basic
    @Column(name = "ETATQUITTANCE", nullable = true)
    private String etatquittance;
    @Basic
    @Column(name = "DATEETAT", nullable = true)
    private Calendar dateetat;
    @Basic
    @Column(name = "DATEEFFET", nullable = true)
    private Calendar dateeffet;
    @Basic
    @Column(name = "IDOPERATIONPRELEVEMENT", nullable = true)
    private Long idoperationprelevement;
    @Basic
    @Column(name = "IDUTILISATEURRISTOURNE", nullable = true)
    private Long idutilisateurristourne;
    @Basic
    @Column(name = "IDUTILISATEURVALIDATEUR", nullable = true)
    private Long idutilisateurvalidateur;
    @Basic
    @Column(name = "IDPRODUIT", nullable = true)
    private Long idproduit;
    @Basic
    @Column(name = "IDREMISE", nullable = true)
    private Long idremise;
    @Basic
    @Column(name = "TAUXCOMMISSION", nullable = true)
    private double tauxcommission;
    @Basic
    @Column(name = "MONTANTCOMMISSION", nullable = true)
    private double montantcommission;
    @Basic
    @Column(name = "SYNCHRONE", nullable = true)
    private double synchrone;
    @Basic
    @Column(name = "DATESYNCHRONISATION", nullable = true)
    private Calendar datesynchronisation;
    @Basic
    @Column(name = "MONTANTCOMMISION", nullable = true)
    private double montantcommision;
    @Basic
    @Column(name = "NUMEROQUITTANCE_OLD", nullable = true)
    private Long numeroquittanceOld;
    @Basic
    @Column(name = "DATEVALIDATION", nullable = true)
    private Calendar datevalidation;
    @Basic
    @Column(name = "MONTANTTAXEPARAFISCALE", nullable = true)
    private double montanttaxeparafiscale;
    @Basic
    @Column(name = "TAUXCOMMISSIONCATNAT", nullable = true)
    private double tauxcommissioncatnat;
    @Basic
    @Column(name = "IDQUITTANCEORIGINE", nullable = true)
    private Long idquittanceorigine;
    @Basic
    @Column(name = "TYPEQUITTANCEPREVOYANCE", nullable = true)
    private String typequittanceprevoyance;
    @Basic
    @Column(name = "FORCEE", nullable = true)
    private Long forcee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Intermediaire_ID")
    private IntermediaireEntity intermediaire;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "refQuittance")
    private RefQuittanceEntity refQuittance;




    @OneToMany(mappedBy = "qtcQuittance")
    private List<QtcDetailquittanceEntity> qtcDetailquittance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "qtcRemise")
    private QtcRemiseEntity qtcRemise;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "habUtilisateur")
    private HabUtilisateurEntity habUtilisateur;

    /*Ajouter*/

    @Basic
    @Column(name = "EXERCICE", nullable = true)
    private String exercice;

    @Basic
    @Column(name = "ordre", nullable = true)
    private String ordre;

}
