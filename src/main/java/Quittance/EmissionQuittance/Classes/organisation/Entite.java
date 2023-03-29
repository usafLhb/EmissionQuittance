package Quittance.EmissionQuittance.Classes.organisation;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.services.organisation.OrganisationFactory;

import com.rmawatanya.convergence.utile.referentiel.Ville;

public class Entite extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;
	private Integer code;
	private String codeExterne;
	private Integer migre;
	private String  libelle;
	private Societe refSociete;
	private Ville  refVille;
	private Entite refEntiteSuperieur;
	private TypeEntite refTypeEntite;
	
	private Calendar dateCreation;
	private Calendar dateDebut;
	private Calendar dateFin;
	private String codeCompose;
	private String codeAgence;
	
	public boolean equals(Object obj) {
		if(this.getId()==((Entite)obj).getId()){
			return true;
		}
		return false;
	}

	public Entite() {

	}

	public long getId() {
		return id;
	}

	public void setId(long aId) {
		id = aId;
	}

	public String getDescription() {
		return code + " - " + libelle;
	}

	public String getCodeAgence() {
		return codeAgence;
	}

	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Societe getRefSociete() {
		return refSociete;
	}

	public void setRefSociete(Societe refSociete) {
		this.refSociete = refSociete;
	}

	public Ville getRefVille() {
		return refVille;
	}

	public void setRefVille(Ville refVille) {
		this.refVille = refVille;
	}

	public Entite getRefEntiteSuperieur() {
		return refEntiteSuperieur;
	}

	public void setRefEntiteSuperieur(Entite refEntiteSuperieur) {
		this.refEntiteSuperieur = refEntiteSuperieur;
	}

	public TypeEntite getRefTypeEntite() {
		return refTypeEntite;
	}

	public void setRefTypeEntite(TypeEntite refTypeEntite) {
		this.refTypeEntite = refTypeEntite;
	}

	public EntiteFactory getFactory() {
		return new OrganisationFactory();
	}

	public Calendar getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
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

	public String getCodeCompose() {
		return codeCompose;
	}

	public void setCodeCompose(String codeCompose) {
		this.codeCompose = codeCompose;
	}

	public Integer getMigre() {
		return migre;
	}

	public void setMigre(Integer migre) {
		this.migre = migre;
	}

	public String getCodeExterne() {
		return codeExterne;
	}

	public void setCodeExterne(String codeExterne) {
		this.codeExterne = codeExterne;
	}
	
}
