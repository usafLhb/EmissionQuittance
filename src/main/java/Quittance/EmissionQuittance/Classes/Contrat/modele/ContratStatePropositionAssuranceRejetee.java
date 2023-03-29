package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.businessInterface.ValidationException;

import com.rmawatanya.convergence.utile.common.Constantes;

/**
 * @author MOUHANE
 *  
 */
public class ContratStatePropositionAssuranceRejetee extends ContratState {
	
	public void annuler(Contrat contrat) throws ValidationException {
		contrat.setEtat(Constantes.ETAT_CONTRAT_PROPOSITION_ASSURANCE_ANNULEE);
		contrat.setEnInstance(false);
	}
}