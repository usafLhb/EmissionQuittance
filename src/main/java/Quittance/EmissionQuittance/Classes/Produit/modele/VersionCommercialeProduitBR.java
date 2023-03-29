/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

/**
 * @author b.slayki
 * 
 */
public class VersionCommercialeProduitBR extends BusinessRule {

	private static final long serialVersionUID = 1L;

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		VersionCommercialeProduit vp = (VersionCommercialeProduit) bo;
		Calendar dateSysteme= Calendar.getInstance();
		
		if (operation.equalsIgnoreCase(BusinessRule.INSERT_OPERATION)) {
			if((vp.getDateDebut() != null)&& vp.getDateDebut().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date d�but doit �tre sup�rieure � la date syst�me !");
			}
			if((vp.getDateFin() != null)&& vp.getDateFin().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date syst�me !");
			}
		}
		if((vp.getDateDebut() != null)&& vp.getDateFin()!=null){
			if(vp.getDateDebut().after(vp.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}
}
}
