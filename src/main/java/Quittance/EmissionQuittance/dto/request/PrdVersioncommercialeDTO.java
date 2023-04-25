package Quittance.EmissionQuittance.dto.request;

import Quittance.EmissionQuittance.entities.PrdVersioncommercialeEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
public class PrdVersioncommercialeDTO {


    @Basic
    private String nomcommercial;
    @Basic
    private Object dateedebut;
    @Basic
    private Object datefin;
    @Basic
    private Object comptebancaireprestation;
    @Basic
    private Object comptebancaireservice;
    @Basic
    private Object refhomologation;
    @Basic
    private Object codeintermediaire;
    @Basic
    private Object idproduit;
    @Basic
    private Object idsociete;
    @Basic
    private Object delaimodifeninstance;
    @Basic
    private Object nombremaxadhesion;
    @Basic
    private Object code;
    @Basic
    private Object nomcommercialAr;
    @Basic
    private Object plafondindemnite;
    @Basic
    private Object datemajproduit;

    private List<PrdVersioncommercialeEntity> prdVersioncommercialeEntities;


}
