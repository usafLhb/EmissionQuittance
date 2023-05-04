package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.entities.*;
import jakarta.persistence.*;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.List;


@Data

public class QtcQuittanceDTO {

    private int codesociete;

    private String naturequittance;

    private String numeroquittance;

    private String codepolice;

    private String numeroquittanceorigine;

    private String codeclient;
    private Long codeintermediaire;

    private Long codebranche;

    private String nomclient;

    private String prenomclient;

    private String adresseclient;

    private String villeclient;

    private String typequittance;


    private double primenette;

    private double tauxtaxe;


    private double montanttaxe;


    private double montantaccessoire;


    private double montantencaisse;

    private double montantcommisionretenue;

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

    private double synchrone;

    private Calendar datesynchronisation;

    private double montantcommision;
    private Long numeroquittanceOld;

    private Calendar datevalidation;

    private double montanttaxeparafiscale;

    private double tauxcommissioncatnat;

    private Long idquittanceorigine;

    private String typequittanceprevoyance;
    private Long forcee;
    private String exercice;
    private String ordre;
    private Long codeIntermediaire;

    private Long intermediaireid;
    private Long refQuittanceid;
    // private RefQuittanceEntity refQuittance;
    private Long qtcRemiseid;
    //private QtcRemiseEntity qtcRemise;
    private Long habUtilisateurid;
    //private HabUtilisateurEntity habUtilisateur;

    //private List<QtcDetailquittanceEntity> qtcDetailquittance;


    private Long  policeid;
    private Calendar dateEcheance;
    private Calendar dateTerme;



}
