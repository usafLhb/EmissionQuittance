package Quittance.EmissionQuittance.models.classes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PRD_PRODUIT", schema = "CONVERGPARAM", catalog = "")
public class PrdProduitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Basic
    @Column(name = "AGEMAXADHERENT", nullable = true)
    private Object agemaxadherent;
    @Basic
    @Column(name = "AGEMAXCONJOINT", nullable = true)
    private Object agemaxconjoint;
    @Basic
    @Column(name = "AGEMAXENFANT", nullable = true)
    private Object agemaxenfant;
    @Basic
    @Column(name = "AGEMINADHERENT", nullable = true)
    private Object ageminadherent;
    @Basic
    @Column(name = "AGEMINCONJOINT", nullable = true)
    private Object ageminconjoint;
    @Basic
    @Column(name = "AGEMINENFANT", nullable = true)
    private Object ageminenfant;
    @Basic
    @Column(name = "AGELIMITEADHERENT", nullable = true)
    private Object agelimiteadherent;
    @Basic
    @Column(name = "AGELIMITECONJOINT", nullable = true)
    private Object agelimiteconjoint;
    @Basic
    @Column(name = "AGELIMITEENFANT", nullable = true)
    private Object agelimiteenfant;
    @Basic
    @Column(name = "AVECBENEFICIAIRES", nullable = true)
    private Object avecbeneficiaires;
    @Basic
    @Column(name = "AVECCOASSURANCE", nullable = true)
    private Object aveccoassurance;
    @Basic
    @Column(name = "AVECDOMMAGES", nullable = true)
    private Object avecdommages;
    @Basic
    @Column(name = "AVECEPARGNE", nullable = true)
    private Object avecepargne;
    @Basic
    @Column(name = "AVECPOIDSTAILLE", nullable = true)
    private Object avecpoidstaille;
    @Basic
    @Column(name = "AVECPREVOYANCE", nullable = true)
    private Object avecprevoyance;
    @Basic
    @Column(name = "AVECPRIMEPERIODIQUE", nullable = true)
    private Object avecprimeperiodique;
    @Basic
    @Column(name = "AVECPRIMESSEPAREES", nullable = true)
    private Object avecprimesseparees;
    @Basic
    @Column(name = "AVECQUESTIONDECLARATION", nullable = true)
    private Object avecquestiondeclaration;
    @Basic
    @Column(name = "CODE", nullable = true)
    private Object code;
    @Basic
    @Column(name = "CODEABREGE", nullable = true)
    private Object codeabrege;
    @Basic
    @Column(name = "CODEPOLICE", nullable = true)
    private Object codepolice;
    @Basic
    @Column(name = "CODESERVICE", nullable = true)
    private Object codeservice;
    @Basic
    @Column(name = "DATELANCEMENT", nullable = true)
    private Object datelancement;
    @Basic
    @Column(name = "DATEFIN", nullable = true)
    private Object datefin;
    @Basic
    @Column(name = "EFFETMODIFICATION", nullable = true)
    private Object effetmodification;
    @Basic
    @Column(name = "LIBELLEPRODUIT", nullable = true)
    private Object libelleproduit;
    @Basic
    @Column(name = "NOMBREMAXENFANTSASSURES", nullable = true)
    private Object nombremaxenfantsassures;
    @Basic
    @Column(name = "NOMBREMINGARANTIES", nullable = true)
    private Object nombremingaranties;
    @Basic
    @Column(name = "ROLECONJOINT", nullable = true)
    private Object roleconjoint;
    @Basic
    @Column(name = "ROLEENFANTS", nullable = true)
    private Object roleenfants;
    @Basic
    @Column(name = "TYPEADHERENT", nullable = true)
    private Object typeadherent;
    @Basic
    @Column(name = "ROLEADHERENT", nullable = true)
    private Object roleadherent;
    @Basic
    @Column(name = "TYPECONTRAT", nullable = true)
    private Object typecontrat;
    @Basic
    @Column(name = "TYPESOUSCRIPTEUR", nullable = true)
    private Object typesouscripteur;
    @Basic
    @Column(name = "AVECREFERENCEEXTERNE", nullable = true)
    private Object avecreferenceexterne;
    @Basic
    @Column(name = "CATEGORIE", nullable = true)
    private Object categorie;
    @Basic
    @Column(name = "COMPTECOMPTABLE", nullable = true)
    private Object comptecomptable;
    @Basic
    @Column(name = "COMPTEAVANCE", nullable = true)
    private Object compteavance;
    @Basic
    @Column(name = "COMPTEPRESTATION", nullable = true)
    private Object compteprestation;
    @Basic
    @Column(name = "COMPTECONTREPARTIE", nullable = true)
    private Object comptecontrepartie;
    @Basic
    @Column(name = "CODECOMPTABLE", nullable = true)
    private Object codecomptable;
    @Basic
    @Column(name = "AVECBIENASSURE", nullable = true)
    private Object avecbienassure;
    @Basic
    @Column(name = "AVECPERSONNEASSURE", nullable = true)
    private Object avecpersonneassure;
    @Basic
    @Column(name = "IDPRODUITREMPLACANT", nullable = true)
    private Object idproduitremplacant;
    @Basic
    @Column(name = "IDPARAMETRESEPARGNE", nullable = true)
    private Object idparametresepargne;
    @Basic
    @Column(name = "IDPARAMETRESPREVOYANCE", nullable = true)
    private Object idparametresprevoyance;
    @Basic
    @Column(name = "IDPARAMETRESDOMMAGES", nullable = true)
    private Object idparametresdommages;
    @Basic
    @Column(name = "LIBELLE", nullable = true)
    private Object libelle;
    @Basic
    @Column(name = "COMPTEBANCAIRESERVICE", nullable = true)
    private Object comptebancaireservice;
    @Basic
    @Column(name = "IDTYPERENOUVELLEMENT", nullable = true)
    private Object idtyperenouvellement;
    @Basic
    @Column(name = "COMPTEBANCAIREPRESTATION", nullable = true)
    private Object comptebancaireprestation;
    @Basic
    @Column(name = "COMPTESERVICE", nullable = true)
    private Object compteservice;
    @Basic
    @Column(name = "REFHOMOLOGATION", nullable = true)
    private Object refhomologation;
    @Basic
    @Column(name = "MODULABLE", nullable = true)
    private Object modulable;
    @Basic
    @Column(name = "DELAIPREAVIS", nullable = true)
    private Object delaipreavis;


}
