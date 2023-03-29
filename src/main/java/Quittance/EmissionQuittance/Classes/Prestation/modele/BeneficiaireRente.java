package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class BeneficiaireRente implements IEntite {
	private static final long serialVersionUID = -8080663189013987444L;
	private long id;
	private String nom;
	private String prenom;
	private String numeroPieceIdentite;
	private Calendar dateNaissance;
	private String numeroCompteBancaire;
	private String sexe;
	private String adresse;
	private Integer modeReglement;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getNumeroPieceIdentite() {
		return numeroPieceIdentite;
	}
	public void setNumeroPieceIdentite(String numeroPieceIdentite) {
		this.numeroPieceIdentite = numeroPieceIdentite;
	}
	public Calendar getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Calendar dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getNumeroCompteBancaire() {
		return numeroCompteBancaire;
	}
	public void setNumeroCompteBancaire(String numeroCompteBancaire) {
		this.numeroCompteBancaire = numeroCompteBancaire;
	}
	public EntiteFactory getFactory() {
		return null;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Integer getModeReglement() {
		return modeReglement;
	}
	public void setModeReglement(Integer modeReglement) {
		this.modeReglement = modeReglement;
	}
	
}
