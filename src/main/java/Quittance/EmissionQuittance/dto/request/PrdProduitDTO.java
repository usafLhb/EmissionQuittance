package Quittance.EmissionQuittance.dto.request;

import jakarta.persistence.*;
import lombok.Data;


@Data
public class PrdProduitDTO {

    @Basic
    private Object agemaxadherent;
    @Basic
    private Object agemaxconjoint;
    @Basic
    private Object agemaxenfant;
    @Basic
    private Object ageminadherent;
    @Basic
    private Object ageminconjoint;
    @Basic
    private Object ageminenfant;
    @Basic
    private Object agelimiteadherent;
    @Basic
    private Object agelimiteconjoint;
    @Basic
    private Object agelimiteenfant;
    @Basic
    private Object avecbeneficiaires;
    @Basic
    private Object aveccoassurance;
    @Basic
    private Object avecdommages;
    @Basic
    private Object avecepargne;
    @Basic
    private Object avecpoidstaille;
    @Basic
    private Object avecprevoyance;
    @Basic
    private Object avecprimeperiodique;
    @Basic
    private Object avecprimesseparees;
    @Basic
    private Object avecquestiondeclaration;
    @Basic
    private Object code;
    @Basic
    private Object codeabrege;
    @Basic
    private Object codepolice;
    @Basic
    private Object codeservice;
    @Basic
    private Object datelancement;
    @Basic
    private Object datefin;
    @Basic
    private Object effetmodification;
    @Basic
    private Object libelleproduit;
    @Basic
    private Object nombremaxenfantsassures;
    @Basic
    private Object nombremingaranties;
    @Basic
    private Object roleconjoint;
    @Basic
    private Object roleenfants;
    @Basic
    private Object typeadherent;
    @Basic
    private Object roleadherent;
    @Basic
    private Object typecontrat;
    @Basic
    private Object typesouscripteur;
    @Basic
    private Object avecreferenceexterne;
    @Basic
    private Object categorie;
    @Basic
    private Object comptecomptable;
    @Basic
    private Object compteavance;
    @Basic
    private Object compteprestation;
    @Basic
    private Object comptecontrepartie;
    @Basic
    private Object codecomptable;
    @Basic
    private Object avecbienassure;
    @Basic
    private Object avecpersonneassure;
    @Basic
    private Object idproduitremplacant;
    @Basic
    private Object idparametresepargne;
    @Basic
    private Object idparametresprevoyance;
    @Basic
    private Object idparametresdommages;
    @Basic
    private Object libelle;
    @Basic
    private Object comptebancaireservice;
    @Basic
    private Object idtyperenouvellement;
    @Basic
    private Object comptebancaireprestation;
    @Basic
    private Object compteservice;
    @Basic
    private Object refhomologation;
    @Basic
    private Object modulable;
    @Basic
    private Object delaipreavis;


}
