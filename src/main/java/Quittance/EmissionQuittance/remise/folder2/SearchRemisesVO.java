package Quittance.EmissionQuittance.remise.folder2;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SearchRemisesVO {
    protected String agenceVersement;
    protected String banqueVersement;
    protected String codeDirection;
    protected String codeService;
    protected String compteVersement;
    protected String dateEncaissement;
    protected String dateEtat;
    protected String etat;
    protected String etatSoldeRemise;
    protected String exercice;
    /*@XmlElement(nillable = true)
    protected List<IntermediaireVO> listIntermediaire;*/
    protected String motif;
    protected String natureEncaissement;
    protected String numCheque;
    protected String referenceBordreauxVersement;
    protected String remiseBancaire;
    protected String sort;
    protected String statutAffectation;
}
