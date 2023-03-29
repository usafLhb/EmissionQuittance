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
public class AssocProduitTypeBienAssureFamilleGarantieBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		AssocProduitTypeBienAssureFamilleGarantie assocPrdTypBien = (AssocProduitTypeBienAssureFamilleGarantie) bo;
		
		if((assocPrdTypBien.getDateDebut() != null)&& assocPrdTypBien.getDateFin()!=null){
			if(assocPrdTypBien.getDateDebut().after(assocPrdTypBien.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}
				
		
		
}
}
