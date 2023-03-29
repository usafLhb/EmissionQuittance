
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

/**
 * @author M.ayouch
 * 
 */
public class PeriodePromo extends ParametrageBO implements IEntite {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	private Calendar dateDebutPromo;

	private Calendar dateFinPromo;

	
	

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Calendar getDateDebutPromo() {
		return dateDebutPromo;
	}

	public void setDateDebutPromo(Calendar dateDebutPromo) {
		this.dateDebutPromo = dateDebutPromo;
	}

	public Calendar getDateFinPromo() {
		return dateFinPromo;
	}

	public void setDateFinPromo(Calendar dateFinPromo) {
		this.dateFinPromo = dateFinPromo;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
