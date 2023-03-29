
package Quittance.EmissionQuittance.Classes.Produit.modele;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

public class RevalorisationDistBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		RevalorisationDist revalorisation = (RevalorisationDist) bo;
		
		if((revalorisation.getDateDebut() != null)&& revalorisation.getDateFin()!=null){
			if(revalorisation.getDateDebut().after(revalorisation.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}
		
	}

}
