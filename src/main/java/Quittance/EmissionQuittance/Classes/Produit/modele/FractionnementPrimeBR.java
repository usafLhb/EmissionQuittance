/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Produit.modele;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

public class FractionnementPrimeBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		FractionnementPrime fp = (FractionnementPrime) bo;
		/*
		if ((fp.getRefParametresPrevoyance() == null)
				&& (fp.getRefParametresDommages() == null)
				&& (fp.getRefProduit() == null))
			throw new BusinessRuleNotSatisfiedException(
					"Au moins une des garanties active !");
		*/
		if((fp.getDateDebut() != null)&& fp.getDateFin()!=null){
			if(fp.getDateDebut().after(fp.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}
	}

}
