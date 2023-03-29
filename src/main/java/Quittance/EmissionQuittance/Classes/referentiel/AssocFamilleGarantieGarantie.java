
package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class AssocFamilleGarantieGarantie extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;
	private FamilleGarantie refFamilleGarantie;
	private Garantie refGarantie;
	private Double pourcentage;
	private Calendar dateDebut;
	private Calendar dateFin;

	public boolean equals(Object obj) {
		if(this.getId()==((AssocFamilleGarantieGarantie)obj).getId()){
			return true;
		}
		return false;
	}

	public String getDescription() {
		return  refFamilleGarantie.getLibelle()+ " - " + refGarantie.getLibelle();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public Garantie getRefGarantie() {
		return refGarantie;
	}

	public void setRefGarantie(Garantie refGarantie) {
		this.refGarantie = refGarantie;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}

	public FamilleGarantie getRefFamilleGarantie() {
		return refFamilleGarantie;
	}

	public void setRefFamilleGarantie(FamilleGarantie refFamilleGarantie) {
		this.refFamilleGarantie = refFamilleGarantie;
	}

	public Calendar getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Calendar getDateFin() {
		return dateFin;
	}

	public void setDateFin(Calendar dateFin) {
		this.dateFin = dateFin;
	}
}
