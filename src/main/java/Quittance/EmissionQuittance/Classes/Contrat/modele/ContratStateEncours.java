package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.businessInterface.ValidationException;
import ma.co.omnidata.framework.services.core.ServicesFactory;

import com.rmawatanya.convergence.application.oct.metier.manager.ContratManager;
import com.rmawatanya.convergence.utile.common.Constantes;

/**
 * @author MOUHANE
 *  
 */
public class ContratStateEncours extends ContratState {

	public void enregistrerResiliation(Contrat contrat) throws Exception {
		ContratManager contratManager = (ContratManager) ServicesFactory.getService(ContratManager.class);
		Contrat modifEnInstance = new Contrat();
		modifEnInstance.setNumero(contrat.getNumero());
		modifEnInstance = (Contrat) contratManager
				.getContratEnInstanceParNumero(modifEnInstance);
		if (modifEnInstance != null) {
			// supprimer s'il y a une modif en instance
			contratManager.deleteEntite(modifEnInstance);
		}
		
		contrat.setEtat(Constantes.ETAT_CONTRAT_RESILIATION_ENREGISTREE);
	}
	
	public void annuler(Contrat contrat) throws ValidationException {
		contrat.setEtat(Constantes.ETAT_CONTRAT_ANNULE);
	}
	
}