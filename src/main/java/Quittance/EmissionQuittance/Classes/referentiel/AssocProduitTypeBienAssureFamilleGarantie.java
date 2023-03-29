
package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.Produit;

public class AssocProduitTypeBienAssureFamilleGarantie extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private Produit refProduit;
	private TypeBienAssure refTypeBienAssure;
	private FamilleGarantie refFamilleGarantie;

	private Integer nombreMin; // Si FamilleGarantie obligatoire pour le TypeBienAssure alors nombreMin >= 1
	private Integer nombreMax; // Ind�fini
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

	public boolean equals(Object obj) {
		if(this.getId()==((AssocProduitTypeBienAssureFamilleGarantie)obj).getId()){
			return true;
		}
		return false;
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
		if(refTypeBienAssure!=null){
			s+=" - " + refTypeBienAssure.getDescription();
		}
		if(refFamilleGarantie!=null){
			s+= " - " + refFamilleGarantie.getDescription();
		}
		return  s;
	}

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

	public TypeBienAssure getRefTypeBienAssure() {
		return refTypeBienAssure;
	}

	public void setRefTypeBienAssure(TypeBienAssure refTypeBienAssure) {
		this.refTypeBienAssure = refTypeBienAssure;
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

}
