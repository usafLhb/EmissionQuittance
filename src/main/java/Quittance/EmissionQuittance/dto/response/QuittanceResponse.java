package Quittance.EmissionQuittance.dto.response;

import Quittance.EmissionQuittance.entities.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuittanceResponse {




    private PoliceEntity police;
    private int codesociete;
    private String naturequittance;
    private String numeroquittanceorigine;
    private String nomclient;
    private String prenomclient;
    private String adresseclient;
    private double montontremise;
    private String periodicite;
    private Calendar datedebut;
    private Calendar datefin;
    private Calendar dateemission;
    private Calendar dateeffet;
    private Long idoperationprelevement;
    private Long forcee;
    private IntermediaireEntity intermediaire;
    private RefQuittanceEntity refQuittance;
    private QtcRemiseEntity qtcRemise;

    /*Ajouter*/


  //  private RefVilleEntity ville;

    private String exercice;
    private String ordre;
    private Calendar dateEcheance;
    private Calendar dateTerme;




    private Calendar dateEmission;

    private Calendar dateetat;

    private String numeroquittance;



    private Double tauxPrimeNette;

    private Double primeGareEve ;


    private Double tauxTaxeParafiscale;


    private PrdVersioncommercialeEntity prdVersioncommerciale;

    private double primenette;
    private double tauxtaxe;
    private double montanttaxe;

    private double montantaccessoire;

    private double montantencaisse;
    private double montantcommisionretenue;
    private double montantcommisionristourne;
    private double tauxcommission;
    private double montantcommission;
    private double synchrone;
    private Calendar datesynchronisation;
    private double montantcommision;
    private Long numeroquittanceOld;
    private Calendar datevalidation;
    private double montanttaxeparafiscale;
    private double tauxcommissioncatnat;

}
