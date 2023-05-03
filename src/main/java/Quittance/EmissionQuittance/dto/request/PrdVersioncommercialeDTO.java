package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.entities.IntermediaireEntity;
import Quittance.EmissionQuittance.entities.PrdVersioncommercialeEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Calendar;
import java.util.List;


@Data
public class PrdVersioncommercialeDTO {
    private Long id;
    private String nomcommercial;


 /*   private Calendar dateedebut;
    private Calendar datefin;
    private String comptebancaireprestation;
    private String comptebancaireservice;
    private Long refhomologation;
    private int codeintermediaire;
    private int idproduit;
    private int idsociete;
    private Calendar delaimodifeninstance;
    private Long nombremaxadhesion;
    private int code;
    private String nomcommercialAr;
    private String plafondindemnite;
    private Calendar datemajproduit;
    private IntermediaireDTO intermediaire;*/

}
