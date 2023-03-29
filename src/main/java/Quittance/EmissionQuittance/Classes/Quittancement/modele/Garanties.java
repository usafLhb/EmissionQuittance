package Quittance.EmissionQuittance.Classes.Quittancement.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.prd.metier.modele.ParametresDommages;
import com.rmawatanya.convergence.application.prd.metier.modele.ParametresEpargne;
import com.rmawatanya.convergence.application.prd.metier.modele.ParametresPrevoyance;
import com.rmawatanya.convergence.application.prd.metier.modele.Produit;
import com.rmawatanya.convergence.utile.referentiel.Garantie;

public class Garanties implements IEntite
{
	private long id;      
	private String code;  
	private String libelle;
	private Double taux;
	private Double tauxVentilation;
	private Calendar dateDebut;
	private Calendar dateFin;
	private Produit refProduit;
	private ParametresEpargne refParametresEpargne;
	private ParametresPrevoyance refParametresPrevoyance;
	private ParametresDommages refParametresDommages;
	private Garantie refGarantie;
	private Boolean usecatnat;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Double getTaux() {
		return taux;
	}
	public void setTaux(Double taux) {
		this.taux = taux;
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
	public Produit getRefProduit() {
		return refProduit;
	}
	public void setRefProduit(Produit refProduit) {
		this.refProduit = refProduit;
	}  

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	public ParametresDommages getRefParametresDommages() {
		return refParametresDommages;
	}
	public void setRefParametresDommages(ParametresDommages refParametresDommages) {
		this.refParametresDommages = refParametresDommages;
	}
	public ParametresEpargne getRefParametresEpargne() {
		return refParametresEpargne;
	}
	public void setRefParametresEpargne(ParametresEpargne refParametresEpargne) {
		this.refParametresEpargne = refParametresEpargne;
	}
	public ParametresPrevoyance getRefParametresPrevoyance() {
		return refParametresPrevoyance;
	}
	public void setRefParametresPrevoyance(
			ParametresPrevoyance refParametresPrevoyance) {
		this.refParametresPrevoyance = refParametresPrevoyance;
	}
	public Garantie getRefGarantie() {
		return refGarantie;
	}
	public void setRefGarantie(Garantie refGarantie) {
		this.refGarantie = refGarantie;
	}
	public Boolean getUsecatnat() {
		return usecatnat;
	}
	public void setUsecatnat(Boolean usecatnat) {
		this.usecatnat = usecatnat;
	}
	public Double getTauxVentilation() {
		return tauxVentilation;
	}
	public void setTauxVentilation(Double tauxVentilation) {
		this.tauxVentilation = tauxVentilation;
	}	

}