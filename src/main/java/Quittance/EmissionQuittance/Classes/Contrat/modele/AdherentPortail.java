package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import com.rmawatanya.convergence.utile.referentiel.Pays;
import com.rmawatanya.convergence.utile.referentiel.TitreCivilite;
import com.rmawatanya.convergence.utile.referentiel.Ville;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class AdherentPortail implements IEntite {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;	   
	private FichierAdhesionPortail refFichierPortail;
	private String numeroCompteBancaire;
	private Calendar dateEntreeEntreprise;
    private String matricule;
	private String nom;
	private String prenom;
	private Calendar dateNaissance;
	private String situationFamiliale;
	private String typePieceIdentite;
	private String numeroPieceIdentite;
	private Double poids;
	private Double taille;
	private String adresse;
	private Pays refPays;
	private Ville refVille;
	private Integer codePostal;
	private TitreCivilite refTitreCivilite;
	private Double cotisationPartPatronale;
	private Double cotisationPartSalariale;
	private Double tauxPartPatronale;
	private Double tauxPartSalariale;
	private Double salaire;
	private String statusAdhesion;
	private String motifRejet;
	private String typeSalarie ;
	private String numeroAdhesion;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public FichierAdhesionPortail getRefFichierPortail() {
		return refFichierPortail;
	}
	public void setRefFichierPortail(FichierAdhesionPortail refFichierPortail) {
		this.refFichierPortail = refFichierPortail;
	}
	public String getNumeroCompteBancaire() {
		return numeroCompteBancaire;
	}
	public void setNumeroCompteBancaire(String numeroCompteBancaire) {
		this.numeroCompteBancaire = numeroCompteBancaire;
	}
	public Calendar getDateEntreeEntreprise() {
		return dateEntreeEntreprise;
	}
	public void setDateEntreeEntreprise(Calendar dateEntreeEntreprise) {
		this.dateEntreeEntreprise = dateEntreeEntreprise;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
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
	public Calendar getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Calendar dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getSituationFamiliale() {
		return situationFamiliale;
	}
	public void setSituationFamiliale(String situationFamiliale) {
		this.situationFamiliale = situationFamiliale;
	}
	public String getTypePieceIdentite() {
		return typePieceIdentite;
	}
	public void setTypePieceIdentite(String typePieceIdentite) {
		this.typePieceIdentite = typePieceIdentite;
	}
	public String getNumeroPieceIdentite() {
		return numeroPieceIdentite;
	}
	public void setNumeroPieceIdentite(String numeroPieceIdentite) {
		this.numeroPieceIdentite = numeroPieceIdentite;
	}
	public Double getPoids() {
		return poids;
	}
	public void setPoids(Double poids) {
		this.poids = poids;
	}
	public Double getTaille() {
		return taille;
	}
	public void setTaille(Double taille) {
		this.taille = taille;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Pays getRefPays() {
		return refPays;
	}
	public void setRefPays(Pays refPays) {
		this.refPays = refPays;
	}
	
	public Ville getRefVille() {
		return refVille;
	}
	public void setRefVille(Ville refVille) {
		this.refVille = refVille;
	}
	public Integer getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}
	public TitreCivilite getRefTitreCivilite() {
		return refTitreCivilite;
	}
	public void setRefTitreCivilite(TitreCivilite refTitreCivilite) {
		this.refTitreCivilite = refTitreCivilite;
	}
	public Double getCotisationPartPatronale() {
		return cotisationPartPatronale;
	}
	public void setCotisationPartPatronale(Double cotisationPartPatronale) {
		this.cotisationPartPatronale = cotisationPartPatronale;
	}
	public Double getCotisationPartSalariale() {
		return cotisationPartSalariale;
	}
	public void setCotisationPartSalariale(Double cotisationPartSalariale) {
		this.cotisationPartSalariale = cotisationPartSalariale;
	}
	public Double getTauxPartPatronale() {
		return tauxPartPatronale;
	}
	public void setTauxPartPatronale(Double tauxPartPatronale) {
		this.tauxPartPatronale = tauxPartPatronale;
	}
	public Double getTauxPartSalariale() {
		return tauxPartSalariale;
	}
	public void setTauxPartSalariale(Double tauxPartSalariale) {
		this.tauxPartSalariale = tauxPartSalariale;
	}
	@Override
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	public String getStatusAdhesion() {
		return statusAdhesion;
	}
	public void setStatusAdhesion(String statusAdhesion) {
		this.statusAdhesion = statusAdhesion;
	}
	public String getMotifRejet() {
		return motifRejet;
	}
	public void setMotifRejet(String motifRejet) {
		this.motifRejet = motifRejet;
	}
	public String getNumeroAdhesion() {
		return numeroAdhesion;
	}
	public void setNumeroAdhesion(String numeroAdhesion) {
		this.numeroAdhesion = numeroAdhesion;
	}
	public AdherentPortail(String matricule, String nom, String prenom, String numeroAdhesion) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.numeroAdhesion = numeroAdhesion;
	}
	public AdherentPortail() {
		super();
	}
	public String getTypeSalarie() {
		return typeSalarie;
	}
	public void setTypeSalarie(String typeSalarie) {
		this.typeSalarie = typeSalarie;
	}
	
}
