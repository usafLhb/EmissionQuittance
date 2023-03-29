package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class NouveauSalaireDit implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private int rowNumber;
	private String numeroContratGroupe;
	private String numeroAdhesion;
	private double salaire;
	private double capitalForfaitaire;
	private String nom;
	private String prenom;
	private String categorie;
	private String periode;
	private String typeErreur;
	

	public NouveauSalaireDit(){
		
	}
	
	public NouveauSalaireDit(String numeroAdhesion, String numeroContratGroupe) {
		this.numeroAdhesion=numeroAdhesion;
		this.numeroContratGroupe=numeroContratGroupe;
	}


	public EntiteFactory getFactory() {
		return null;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNumeroContratGroupe() {
		return numeroContratGroupe;
	}


	public void setNumeroContratGroupe(String numeroContratGroupe) {
		this.numeroContratGroupe = numeroContratGroupe;
	}


	public String getNumeroAdhesion() {
		return numeroAdhesion;
	}


	public void setNumeroAdhesion(String numeroAdhesion) {
		this.numeroAdhesion = numeroAdhesion;
	}




	public double getSalaire() {
		return salaire;
	}


	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}


	public double getCapitalForfaitaire() {
		return capitalForfaitaire;
	}


	public void setCapitalForfaitaire(double capitalForfaitaire) {
		this.capitalForfaitaire = capitalForfaitaire;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public String getPeriode() {
		return periode;
	}


	public void setPeriode(String periode) {
		this.periode = periode;
	}
	

	
	public int getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}
	
	

	/**
	 * @return the typeErreur
	 */
	public String getTypeErreur() {
		return typeErreur;
	}

	/**
	 * @param typeErreur the typeErreur to set
	 */
	public void setTypeErreur(String typeErreur) {
		this.typeErreur = typeErreur;
	}

	public boolean equals(Object obj){
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof NouveauSalaireDit)) {
			return false;
		}
		NouveauSalaireDit nvs = (NouveauSalaireDit) obj;
		if(null==this.getNumeroAdhesion() || null==this.getNumeroContratGroupe() ){
			return false;
		}
		if(this.getNumeroAdhesion().equals(nvs.getNumeroAdhesion()) 
				&& this.getNumeroContratGroupe().equals(nvs.getNumeroContratGroupe())
				){
			return true;
		}
		return false;
	}

	public int hashCode() {
		String hc = this.getClass().getName();
		if(null!=this.getNumeroAdhesion() && null!=this.getNumeroContratGroupe()){
			
			 hc += this.getNumeroAdhesion()+this.getNumeroContratGroupe();
		}
		return hc.hashCode();
	}
	

}
