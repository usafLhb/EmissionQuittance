package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.businessInterface.ValidationException;

import com.rmawatanya.convergence.utile.common.Constantes;

/**
 * @author MOUHANE
 *  
 */
public class ContratStatePropositionAssuranceAjournee extends ContratState {
	
	public void accepter(Contrat contrat) throws Exception {		
		if (contrat.getRefVersionCommercialeProduit().getRefProduit() != null && contrat.getRefVersionCommercialeProduit().getRefProduit().getAvecPrimesSeparees() != null && contrat.getRefVersionCommercialeProduit().getRefProduit().getAvecPrimesSeparees().booleanValue()) {
			if(contrat.getRefPartiePrevoyance()!=null){
					PartiePrevoyance partiePrevoyance= contrat.getRefPartiePrevoyance();
					if (partiePrevoyance != null && partiePrevoyance.getPrimeTotale() == null) {
						throw new Exception("OCT.CONTRAT.TRAITPROPOSITION.PREVOYANCE.PRIMETOTALE.REQUIRED");
					}
			}
			
			if (contrat.getRefPartieDommages() != null && contrat.getRefPartieDommages().getPrimeTotale() == null) {
				throw new Exception("OCT.CONTRAT.TRAITPROPOSITION.DOMMAGES.PRIMETOTALE.REQUIRED");
			}
		} else if (contrat.getPrimeTotale() == null) {
			throw new Exception("OCT.CONTRAT.TRAITPROPOSITION.PRIMETOTALE.REQUIRED");
		}
		contrat.setEtat(Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_ACCEPTEE);
	}
	
	public void ajourner(Contrat contrat) throws ValidationException {
		contrat.setEtat(Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_AJOURNEE);
	}
	
	public void rejeter(Contrat contrat) throws ValidationException {
		contrat.setEtat(Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_REJETEE);
	}
	
	public void annuler(Contrat contrat) throws ValidationException {
		contrat.setEtat(Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_ANNULEE);
		contrat.setEnInstance(false);
	}
	
}