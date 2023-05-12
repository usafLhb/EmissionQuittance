package Quittance.EmissionQuittance.remise.remiseClasse.remiseClasse;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RemisesBancairesVO {
    protected String agence;
    protected String agenceVersement;
    protected String avecValidation;
    protected String banqueCheque;
    protected String banqueVersement;
    protected String client;
    protected String codeDirection;
    protected String codeIntermediaire;
    protected String codeMonnaie;
    protected String codePayeur;
    protected String codeService;
    protected String compteCheque;
    protected String compteVersement;
    protected String dateAffectation;
    protected String dateComptable;
    protected String dateEncaissement;
    protected String dateEtat;
    protected String dateValeur;
    protected String dateVersement;
    protected String emplacement;
    protected String etat;
    protected String exercice;
    protected String importPPR;
    protected String libelleRemise;
    protected String lieu;
    protected String montantRemise;
    protected String motif;
    protected String natureEncaissement;
    protected String nomPayeur;
    protected String numeroCheque;
    protected String numeroRemise;
    protected String observation;
    protected String ordre;
    protected String profilUtilisateur;
    protected String refBordereaux;
    protected String refBordereauxVersement;
    protected String referenceEffet;
    protected String remiseBancaire;
    protected String remiseInitiale;
    @XmlElement(name = "SOP")
    protected String sop;
    protected String soldeRemise;
    protected String sort;
    protected String statutAffectations;
    protected String typeEncaissement;
    protected String utilisateur;
    protected String villeCheque;

}
