/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.summerframework.bll.BusinessRule;
import ma.co.deltasoft.summerframework.bll.exception.BusinessRuleNotSatisfiedException;
import ma.co.deltasoft.summerframework.dal.IBusinessObjectManager;
import ma.co.deltasoft.summerframework.dal.dao.BusinessObject;

import com.rmawatanya.convergence.utile.common.Constantes;

/**
 * @author b.slayki
 * 
 */
public class ProduitBR extends BusinessRule {

	public void validate(BusinessObject bo, IBusinessObjectManager bom,
			String operation, Object request) throws BusinessRuleNotSatisfiedException {

		Produit prd = (Produit) bo;
		Calendar dateSysteme= Calendar.getInstance();
		
		if (operation.equalsIgnoreCase(BusinessRule.INSERT_OPERATION)) {
			if((prd.getDateLancement() != null)&& prd.getDateLancement().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date d�but doit �tre sup�rieure � la date syst�me !");
			}
			if((prd.getDateFin() != null)&& prd.getDateFin().before(dateSysteme)){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date syst�me !");
			}
		}
		if((prd.getDateLancement() != null)&& prd.getDateFin()!=null){
			if(prd.getDateLancement().after(prd.getDateFin())){
				throw new BusinessRuleNotSatisfiedException("La date fin doit �tre sup�rieure � la date d�but !");
			}
		}
				
		if(((prd.getAvecEpargne() == null)||(prd.getAvecEpargne().equalsIgnoreCase("0")))
				&& ((prd.getAvecPrevoyance() == null)||(prd.getAvecPrevoyance().equalsIgnoreCase("0")))
				&& ((prd.getAvecDommages() == null)||(prd.getAvecDommages().equalsIgnoreCase("0")))
				&& ((prd.getAvecBienAssure() == null)||(prd.getAvecBienAssure().booleanValue() == false))
				&& ((prd.getAvecPersonneAssure() == null)||(prd.getAvecPersonneAssure().booleanValue() == false)))
			throw new BusinessRuleNotSatisfiedException("Ce produit doit avoir au moins une des garanties active !");
		
		if((prd.getAvecEpargne() != null)&&(!prd.getAvecEpargne().equalsIgnoreCase("0"))){
			if(prd.getRefParametresEpargne() == null)
				throw new BusinessRuleNotSatisfiedException("La garantie �pagne est active, vous devez lui associer un objet ParametresEpargne !");
		}
		
		if((prd.getAvecPrevoyance() != null)&&(!prd.getAvecPrevoyance().equalsIgnoreCase("0"))){
			if(prd.getRefParametresPrevoyance() == null)
				throw new BusinessRuleNotSatisfiedException("La garantie pr�voyance est active, vous devez lui associer un objet ParametresPrevoyance !");
		}
		
		if((prd.getAvecDommages() != null)&&(!prd.getAvecDommages().equalsIgnoreCase("0"))){
			if(prd.getRefParametresDommages() == null)
				throw new BusinessRuleNotSatisfiedException("La garantie dommage est active, vous devez lui associer un objet ParametresDommage !");
		}
		
		if((prd.getRoleConjoint() != null)&&(!prd.getRoleConjoint().equalsIgnoreCase("0"))){
			if((prd.getAgeMinConjoint() == null)
					||(prd.getAgeMaxConjoint() == null)
					|| (prd.getAgeLimiteConjoint() == null))
				throw new BusinessRuleNotSatisfiedException("Les �ges 'Min, Max et Limite' du conjoint doivent �tre sp�cifi�s !");
		}
		
		if((prd.getRoleEnfants() != null)&&(!prd.getRoleEnfants().equalsIgnoreCase("0"))){
			if((prd.getAgeMinEnfant() == null)
					||(prd.getAgeMaxEnfant() == null)
					|| (prd.getAgeLimiteEnfant() == null))
				throw new BusinessRuleNotSatisfiedException("Les �ges 'Min, Max et Limite' de l'enfant doivent �tre sp�cifi�s !");
		}
		
		if((prd.getAvecPrevoyance() != null)&&(prd.getAvecPersonneAssure()!=null)){
			if((prd.getAvecPrevoyance() !=Constantes.PRD_GARANTIE_ABSENTE)&&(prd.getAvecPersonneAssure().booleanValue())){
				throw new BusinessRuleNotSatisfiedException("Les deux flags {AvecPrevoyance & AvecPresonneAssur�} ne doivent pas �tre activ� � la fois !");				
			}
		}
		
		if((prd.getAvecDommages() != null)&&(prd.getAvecBienAssure()!=null)){
			if((!prd.getAvecDommages().equals( Constantes.PRD_GARANTIE_ABSENTE))&&(prd.getAvecBienAssure().booleanValue())){
				throw new BusinessRuleNotSatisfiedException("Les deux flags {AvecDommages & AvecBienAssur�} ne doivent pas �tre activ� � la fois !");				
			}
		}
}
}
