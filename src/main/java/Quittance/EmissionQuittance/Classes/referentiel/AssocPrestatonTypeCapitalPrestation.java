/**
 * 
 */
package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.PrestationFormule;

/**
 * @author Mstafa
 *
 */
public class AssocPrestatonTypeCapitalPrestation  extends ParametrageBO implements IEntite {

	private long id;
	private PrestationFormule refPrestationFormule;
	private TypeCapitalPrestation refTypeCapitalPrestation;
	private Double tauxExpression;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public PrestationFormule getRefPrestationFormule() {
		return refPrestationFormule;
	}

	public void setRefPrestationFormule(PrestationFormule refPrestationFormule) {
		this.refPrestationFormule = refPrestationFormule;
	}

	public TypeCapitalPrestation getRefTypeCapitalPrestation() {
		return refTypeCapitalPrestation;
	}

	public void setRefTypeCapitalPrestation(
			TypeCapitalPrestation refTypeCapitalPrestation) {
		this.refTypeCapitalPrestation = refTypeCapitalPrestation;
	}

	public Double getTauxExpression() {
		return tauxExpression;
	}

	public void setTauxExpression(Double tauxExpression) {
		this.tauxExpression = tauxExpression;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
