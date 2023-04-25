package Quittance.EmissionQuittance.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Calendar;
import java.util.Collection;

@Entity
@Data
//@Table(name = "PRD_PRODUIT" )
public class PrdProduitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
   @Basic
    @Column(name = "AGEMAXADHERENT", nullable = true)
    private int agemaxadherent;
    @Basic
    @Column(name = "AGEMAXCONJOINT", nullable = true)
    private int agemaxconjoint;
    @Basic
    @Column(name = "AGEMAXENFANT", nullable = true)
    private int agemaxenfant;
    @Basic
    @Column(name = "AGEMINADHERENT", nullable = true)
    private int ageminadherent;
    @Basic
    @Column(name = "AGEMINCONJOINT", nullable = true)
    private int ageminconjoint;
    @Basic
    @Column(name = "AGEMINENFANT", nullable = true)
    private int ageminenfant;
    @Basic
    @Column(name = "AGELIMITEADHERENT", nullable = true)
    private int agelimiteadherent;
    @Basic
    @Column(name = "AGELIMITECONJOINT", nullable = true)
    private int agelimiteconjoint;
    @Basic
    @Column(name = "AGELIMITEENFANT", nullable = true)
    private int agelimiteenfant;
    @Basic
    @Column(name = "AVECBENEFICIAIRES", nullable = true)
    private boolean avecbeneficiaires;
    @Basic
    @Column(name = "AVECCOASSURANCE", nullable = true)
    private int aveccoassurance;
    @Basic
    @Column(name = "AVECDOMMAGES", nullable = true)
    private boolean avecdommages;
    @Basic
    @Column(name = "AVECEPARGNE", nullable = true)
    private boolean avecepargne;
    @Basic
    @Column(name = "AVECPOIDSTAILLE", nullable = true)
    private boolean avecpoidstaille;
    @Basic
    @Column(name = "AVECPREVOYANCE", nullable = true)
    private boolean avecprevoyance;
    @Basic
    @Column(name = "AVECPRIMEPERIODIQUE", nullable = true)
    private boolean avecprimeperiodique;
    @Basic
    @Column(name = "AVECPRIMESSEPAREES", nullable = true)
    private boolean avecprimesseparees;
    @Basic
    @Column(name = "AVECQUESTIONDECLARATION", nullable = true)
    private boolean avecquestiondeclaration;
    @Basic
    @Column(name = "CODE", nullable = true)
    private String code;
    @Basic
    @Column(name = "CODEABREGE", nullable = true)
    private String codeabrege;
    @Basic
    @Column(name = "CODEPOLICE", nullable = true)
    private String codepolice;
    @Basic
    @Column(name = "CODESERVICE", nullable = true)
    private String codeservice;
    @Basic
    @Column(name = "DATELANCEMENT", nullable = true)
    private Calendar datelancement;
    @Basic
    @Column(name = "DATEFIN", nullable = true)
    private Calendar datefin;
    @Basic
    @Column(name = "EFFETMODIFICATION", nullable = true)
    private Calendar effetmodification;
    @Basic
    @Column(name = "LIBELLEPRODUIT", nullable = true)
    private String libelleproduit;
    @Basic
    @Column(name = "NOMBREMAXENFANTSASSURES", nullable = true)
    private int nombremaxenfantsassures;
    @Basic
    @Column(name = "NOMBREMINGARANTIES", nullable = true)
    private int nombremingaranties;
    @Basic
    @Column(name = "ROLECONJOINT", nullable = true)
    private String roleconjoint;
    @Basic
    @Column(name = "ROLEENFANTS", nullable = true)
    private String roleenfants;
    @Basic
    @Column(name = "TYPEADHERENT", nullable = true)
    private String typeadherent;
    @Basic
    @Column(name = "ROLEADHERENT", nullable = true)
    private String roleadherent;
    @Basic
    @Column(name = "TYPECONTRAT", nullable = true)
    private String typecontrat;
    @Basic
    @Column(name = "TYPESOUSCRIPTEUR", nullable = true)
    private String typesouscripteur;
    @Basic
    @Column(name = "AVECREFERENCEEXTERNE", nullable = true)
    private boolean avecreferenceexterne;
    @Basic
    @Column(name = "CATEGORIE", nullable = true)
    private String categorie;
    @Basic
    @Column(name = "COMPTECOMPTABLE", nullable = true)
    private String comptecomptable;
    @Basic
    @Column(name = "COMPTEAVANCE", nullable = true)
    private String compteavance;
    @Basic
    @Column(name = "COMPTEPRESTATION", nullable = true)
    private String compteprestation;
    @Basic
    @Column(name = "COMPTECONTREPARTIE", nullable = true)
    private String comptecontrepartie;
    @Basic
    @Column(name = "CODECOMPTABLE", nullable = true)
    private String codecomptable;
    @Basic
    @Column(name = "AVECBIENASSURE", nullable = true)
    private boolean avecbienassure;
    @Basic
    @Column(name = "AVECPERSONNEASSURE", nullable = true)
    private boolean avecpersonneassure;
    @Basic
    @Column(name = "IDPRODUITREMPLACANT", nullable = true)
    private Long idproduitremplacant;
    @Basic
    @Column(name = "IDPARAMETRESEPARGNE", nullable = true)
    private Long idparametresepargne;
    @Basic
    @Column(name = "IDPARAMETRESPREVOYANCE", nullable = true)
    private Long idparametresprevoyance;
    @Basic
    @Column(name = "IDPARAMETRESDOMMAGES", nullable = true)
    private Long idparametresdommages;
    @Basic
    @Column(name = "LIBELLE", nullable = true)
    private String libelle;
    @Basic
    @Column(name = "COMPTEBANCAIRESERVICE", nullable = true)
    private String comptebancaireservice;
    @Basic
    @Column(name = "IDTYPERENOUVELLEMENT", nullable = true)
    private Long idtyperenouvellement;
    @Basic
    @Column(name = "COMPTEBANCAIREPRESTATION", nullable = true)
    private String  comptebancaireprestation;
    @Basic
    @Column(name = "COMPTESERVICE", nullable = true)
    private String compteservice;
    @Basic
    @Column(name = "REFHOMOLOGATION", nullable = true)
    private Long refhomologation;
    @Basic
    @Column(name = "MODULABLE", nullable = true)
    private boolean modulable;
    @Basic
    @Column(name = "DELAIPREAVIS", nullable = true)
    private Calendar delaipreavis;

    @OneToMany(mappedBy = "produitID")
      private Collection<GarantieProduitEntity> garanties;
}
