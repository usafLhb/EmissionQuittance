package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.Data;


@Data

public class QtcQuittanceDTO {

    @Basic
    private Object codesociete;
    @Basic
    private Object naturequittance;
    @Basic
    private Object numeroquittance;
    @Basic
    private Object codepolice;
    @Basic
    private Object numeroquittanceorigine;
    @Basic
    private Object codeclient;
    @Basic
    private Object codeintermediaire;
    @Basic
    private Object codebranche;
    @Basic
    private Object nomclient;
    @Basic
    private Object prenomclient;
    @Basic
    private Object adresseclient;
    @Basic
    private Object villeclient;
    @Basic
    private Object typequittance;
    @Basic
    private Object primenette;
    @Basic
    private Object tauxtaxe;
    @Basic
    private Object montanttaxe;
    @Basic
    private Object montantaccessoire;
    @Basic
    private Object montantencaisse;
    @Basic
    private Object montantcommisionretenue;
    @Basic
    private Object montantcommisionristourne;
    @Basic
    private Object montontremise;
    @Basic
    private Object periodicite;
    @Basic
    private Object datedebut;
    @Basic
    private Object datefin;
    @Basic
    private Object dateemission;
    @Basic
    private Object etatquittance;
    @Basic
    private Object dateetat;
    @Basic
    private Object dateeffet;
    @Basic
    private Object idoperationprelevement;
    @Basic
    private Object idutilisateurristourne;
    @Basic
    private Object idutilisateurvalidateur;
    @Basic
    private Object idproduit;
    @Basic
    private Object idremise;
    @Basic
    private Object tauxcommission;
    @Basic
    private Object montantcommission;
    @Basic
    private Object synchrone;
    @Basic
    private Object datesynchronisation;
    @Basic
    private Object montantcommision;
    @Basic
    private Object numeroquittanceOld;
    @Basic
    private Object datevalidation;
    @Basic
    private Object montanttaxeparafiscale;
    @Basic
    private Object tauxcommissioncatnat;
    @Basic
    private Object idquittanceorigine;
    @Basic
    private Object typequittanceprevoyance;
    @Basic
    private Object forcee;


}
