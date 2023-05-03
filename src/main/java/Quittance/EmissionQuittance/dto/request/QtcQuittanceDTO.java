package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.entities.*;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Calendar;
import java.util.List;


@Data

public class QtcQuittanceDTO {

    @Column(name = "CODESOCIETE", nullable = true)
    private int codesociete;

    @Column(name = "NATUREQUITTANCE", nullable = true)
    private String naturequittance;

    @Column(name = "NUMEROQUITTANCE", nullable = true)
    private String numeroquittance;

    @Column(name = "CODEPOLICE", nullable = true)
    private String codepolice;

    @Column(name = "NUMEROQUITTANCEORIGINE", nullable = true)
    private String numeroquittanceorigine;

    @Column(name = "CODECLIENT", nullable = true)
    private String codeclient;

    @Column(name = "CODEINTERMEDIAIRE", nullable = true)
    private Long codeintermediaire;

    @Column(name = "CODEBRANCHE", nullable = true)
    private Long codebranche;

    @Column(name = "NOMCLIENT", nullable = true)
    private String nomclient;

    @Column(name = "PRENOMCLIENT", nullable = true)
    private String prenomclient;

    @Column(name = "ADRESSECLIENT", nullable = true)
    private String adresseclient;

    @Column(name = "VILLECLIENT", nullable = true)
    private String villeclient;

    @Column(name = "TYPEQUITTANCE", nullable = true)
    private String typequittance;

    @Column(name = "PRIMENETTE", nullable = true)
    private double primenette;

    @Column(name = "TAUXTAXE", nullable = true)
    private double tauxtaxe;

    @Column(name = "MONTANTTAXE", nullable = true)
    private double montanttaxe;

    @Column(name = "MONTANTACCESSOIRE", nullable = true)
    private double montantaccessoire;

    @Column(name = "MONTANTENCAISSE", nullable = true)
    private double montantencaisse;

    @Column(name = "MONTANTCOMMISIONRETENUE", nullable = true)
    private double montantcommisionretenue;

    @Column(name = "MONTANTCOMMISIONRISTOURNE", nullable = true)
    private double montantcommisionristourne;

    private double montontremise;

    private String periodicite;

    private Calendar datedebut;

    private Calendar datefin;

    private Calendar dateemission;

    private String etatquittance;

    private Calendar dateetat;

    private Calendar dateeffet;

    private Long idoperationprelevement;

    private Long idutilisateurristourne;

    private Long idutilisateurvalidateur;

    private Long idproduit;

    private Long idremise;

    private double tauxcommission;

    private double montantcommission;

    @Column(name = "SYNCHRONE", nullable = true)
    private double synchrone;

    @Column(name = "DATESYNCHRONISATION", nullable = true)
    private Calendar datesynchronisation;

    private double montantcommision;
    private Long numeroquittanceOld;

    private Calendar datevalidation;

    private double montanttaxeparafiscale;

    private double tauxcommissioncatnat;

    private Long idquittanceorigine;

    private String typequittanceprevoyance;


    private Long forcee;


    private IntermediaireEntity intermediaire;



    private RefQuittanceEntity refQuittance;





    private List<QtcDetailquittanceEntity> qtcDetailquittance;


    private QtcRemiseEntity qtcRemise;


    private HabUtilisateurEntity habUtilisateur;

    /*Ajouter*/

    @Basic
    @Column(name = "EXERCICE", nullable = true)
    private String exercice;

    @Basic
    @Column(name = "ordre", nullable = true)
    private String ordre;


}
