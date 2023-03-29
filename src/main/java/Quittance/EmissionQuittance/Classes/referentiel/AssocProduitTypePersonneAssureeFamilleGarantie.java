
package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.Produit;

public class AssocProduitTypePersonneAssureeFamilleGarantie extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;
	private Produit refProduit;
	private TypePersonneAssuree refTypePersonneAssuree;
	private FamilleGarantie refFamilleGarantie;

	private Integer nombreMin; // si FamilleGarantie obligatoire pour le TypePersonneAssure alors nombreMin >= 1
	private Integer nombreMax; // ind�fini
	private Calendar dateDebut;
	private Calendar dateFin;

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		String s="";
		if(refProduit!=null){
			s+=refProduit.getDescription();
		}
		if(refTypePersonneAssuree!=null){
			s+=" - " + refTypePersonneAssuree.getDescription();
		}
		if(refFamilleGarantie!=null){
			s+= " - " + refFamilleGarantie.getDescription();
		}
		return  s;
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

	public FamilleGarantie getRefFamilleGarantie() {
		return refFamilleGarantie;
	}

	public void setRefFamilleGarantie(FamilleGarantie refFamilleGarantie) {
		this.refFamilleGarantie = refFamilleGarantie;
	}

	public Produit getRefProduit() {
		return refProduit;
	}

	public void setRefProduit(Produit refProduit) {
		this.refProduit = refProduit;
	}

	public Integer getNombreMin() {
		return nombreMin;
	}

	public void setNombreMin(Integer nombreMin) {
		this.nombreMin = nombreMin;
	}

	public Integer getNombreMax() {
		return nombreMax;
	}

	public void setNombreMax(Integer nombreMax) {
		this.nombreMax = nombreMax;
	}

	public TypePersonneAssuree getRefTypePersonneAssuree() {
		return refTypePersonneAssuree;
	}

	public void setRefTypePersonneAssuree(TypePersonneAssuree refTypePersonneAssuree) {
		this.refTypePersonneAssuree = refTypePersonneAssuree;
	}

}
