/**
 * 
 */
package Quittance.EmissionQuittance.Classes.organisation;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

/**
 * @author b.slayki
 * 
 */
public class EntiteBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {
		try {
			if (operation.equalsIgnoreCase(BusinessRule.INSERT_OPERATION) 
					|| operation.equalsIgnoreCase(BusinessRule.UPDATE_OPERATION) 
					|| operation.equalsIgnoreCase(BusinessRule.MERGE_OPERATION)) {
				Entite e = (Entite) bo;
				Calendar c = new GregorianCalendar();
				c.setTime(new Date());
				e.setDateCreation(c);
				
				if(e.getDateDebut()== null && e.getDateFin() != null){
					throw new BusinessRuleNotSatisfiedException("Date D�but doit etre renseign�e et inf�rieur� � Date Fin");
				}
				if(e.getDateDebut()!= null && e.getDateFin() != null && e.getDateDebut().after(e.getDateFin())){
					throw new BusinessRuleNotSatisfiedException("Date Fin doit etre sup�rieur � Date D�but");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessRuleNotSatisfiedException(e.getMessage(), e);
		}
	}
}
