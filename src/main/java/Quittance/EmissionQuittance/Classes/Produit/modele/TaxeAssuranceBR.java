/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Produit.modele;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

/**
 * @author b.slayki
 * 
 */
public class TaxeAssuranceBR extends BusinessRule {

	private static final long serialVersionUID = 1L;

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		TaxeAssurance ta = (TaxeAssurance) bo;
		if ((ta.getRefParametresEpargne() == null)
				&& (ta.getRefParametresPrevoyance() == null)
				&& (ta.getRefParametresDommages() == null))
			throw new BusinessRuleNotSatisfiedException(
					"Au moins une des garanties active !");
		
		if((ta.getDateDebut() != null)&& ta.getDateFin()!=null){
			if(ta.getDateDebut().after(ta.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}

	}

}
