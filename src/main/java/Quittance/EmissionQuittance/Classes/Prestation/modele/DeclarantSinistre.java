package Quittance.EmissionQuittance.Classes.Prestation.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.Ville;

public class DeclarantSinistre implements IEntite {

	private static final long serialVersionUID = -8338261747092802848L;
	
	private long id;
	private String typeDeclarant;
	private String nomPrenom;
	private String numeroPieceIdentite;
	private String adresse;
	private Ville refVille;
	private String codePostal;
	private String telDomicile;
	private String telBureau;
	private String gsm;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomPrenom() {
		return nomPrenom;
	}
	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}
	public String getNumeroPieceIdentite() {
		return numeroPieceIdentite;
	}
	public void setNumeroPieceIdentite(String numeroPieceIdentite) {
		this.numeroPieceIdentite = numeroPieceIdentite;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Ville getRefVille() {
		return refVille;
	}
	public void setRefVille(Ville refVille) {
		this.refVille = refVille;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getTelDomicile() {
		return telDomicile;
	}
	public void setTelDomicile(String telDomicile) {
		this.telDomicile = telDomicile;
	}
	public String getTelBureau() {
		return telBureau;
	}
	public void setTelBureau(String telBureau) {
		this.telBureau = telBureau;
	}
	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		this.gsm = gsm;
	}
	public String getTypeDeclarant() {
		return typeDeclarant;
	}
	public void setTypeDeclarant(String typeDeclarant) {
		this.typeDeclarant = typeDeclarant;
	}
	public EntiteFactory getFactory() {
		return null;
	}

}
