/**
 * 
 */
package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

/**
 * @author b.slayki
 * 
 */
public class TauxIGRBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		TauxIGR taux = (TauxIGR) bo;
		
		if((taux.getDateDebut() != null)&& taux.getDateFin()!=null){
			if(taux.getDateDebut().after(taux.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}
				
		
		
}
}
