package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.entities.IntermediaireEntity;
import Quittance.EmissionQuittance.entities.PrdVersioncommercialeEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class PrdVersioncommercialeDTO {

    private Long id;
    @NotNull
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
