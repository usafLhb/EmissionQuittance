package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

public class OctFluxContratItem {

	private long id;
	private long idFlux;
	private String reference;
	private Calendar dateFlux;
	private String typeAssurance;
	private String numeroContrat;
	private String numeroContratPrevoyance;
	private String numeroDossier;
	private String nom;
	private String prenom;
	private Calendar dateNaissance;
	private String cin;
	private String situationFamiliale;
	private Integer nbrEnfants;
	private String residence;
	private String adresse;
	private String ville;
	private String codePostale;
	private String telephone;
	private String profession;
	private String numeroCompte;
	private Double capitalDegressif;
	private Integer duree; 
	private Integer differe; 
	private Calendar dateDebloquage;
	private Calendar datePremiereEcheance; 
	private Calendar dateDerniereEcheance;
	private Integer periode;
	private Double tauxPrime;
	private Double primeTotale;
	private String financementParClient;
	private Integer nouvelleDuree; 
	private Double NouveauMontant; 
	private Double complementPrime;
	private String TypePrime;
	private Calendar dateModification;
	
	private String motifRejet;
	
	/**
	 * 
	 * Constructeur
	 */
	public OctFluxContratItem() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Calendar getDateFlux() {
		return dateFlux;
	}

	public void setDateFlux(Calendar dateFlux) {
		this.dateFlux = dateFlux;
	}

	public String getTypeAssurance() {
		return typeAssurance;
	}

	public void setTypeAssurance(String typeAssurance) {
		this.typeAssurance = typeAssurance;
	}

	public String getNumeroContrat() {
		return numeroContrat;
	}

	public void setNumeroContrat(String numeroContrat) {
		this.numeroContrat = numeroContrat;
	}

	public String getNumeroContratPrevoyance() {
		return numeroContratPrevoyance;
	}

	public void setNumeroContratPrevoyance(String numeroContratPrevoyance) {
		this.numeroContratPrevoyance = numeroContratPrevoyance;
	}

	public String getNumeroDossier() {
		return numeroDossier;
	}

	public void setNumeroDossier(String numeroDossier) {
		this.numeroDossier = numeroDossier;
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

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getSituationFamiliale() {
		return situationFamiliale;
	}

	public void setSituationFamiliale(String situationFamiliale) {
		this.situationFamiliale = situationFamiliale;
	}

	public Integer getNbrEnfants() {
		return nbrEnfants;
	}

	public void setNbrEnfants(Integer nbrEnfants) {
		this.nbrEnfants = nbrEnfants;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public Double getCapitalDegressif() {
		return capitalDegressif;
	}

	public void setCapitalDegressif(Double capitalDegressif) {
		this.capitalDegressif = capitalDegressif;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public Integer getDiffere() {
		return differe;
	}

	public void setDiffere(Integer differe) {
		this.differe = differe;
	}

	public Calendar getDateDebloquage() {
		return dateDebloquage;
	}

	public void setDateDebloquage(Calendar dateDebloquage) {
		this.dateDebloquage = dateDebloquage;
	}

	public Calendar getDatePremiereEcheance() {
		return datePremiereEcheance;
	}

	public void setDatePremiereEcheance(Calendar datePremiereEcheance) {
		this.datePremiereEcheance = datePremiereEcheance;
	}

	public Calendar getDateDerniereEcheance() {
		return dateDerniereEcheance;
	}

	public void setDateDerniereEcheance(Calendar dateDerniereEcheance) {
		this.dateDerniereEcheance = dateDerniereEcheance;
	}

	public Integer getPeriode() {
		return periode;
	}

	public void setPeriode(Integer periode) {
		this.periode = periode;
	}

	public Double getTauxPrime() {
		return tauxPrime;
	}

	public void setTauxPrime(Double tauxPrime) {
		this.tauxPrime = tauxPrime;
	}

	public Double getPrimeTotale() {
		return primeTotale;
	}

	public void setPrimeTotale(Double primeTotale) {
		this.primeTotale = primeTotale;
	}

	public String getFinancementParClient() {
		return financementParClient;
	}

	public void setFinancementParClient(String financementParClient) {
		this.financementParClient = financementParClient;
	}

	public Integer getNouvelleDuree() {
		return nouvelleDuree;
	}

	public void setNouvelleDuree(Integer nouvelleDuree) {
		this.nouvelleDuree = nouvelleDuree;
	}

	public Double getNouveauMontant() {
		return NouveauMontant;
	}

	public void setNouveauMontant(Double nouveauMontant) {
		NouveauMontant = nouveauMontant;
	}

	public Double getComplementPrime() {
		return complementPrime;
	}

	public void setComplementPrime(Double complementPrime) {
		this.complementPrime = complementPrime;
	}

	public String getTypePrime() {
		return TypePrime;
	}

	public void setTypePrime(String typePrime) {
		TypePrime = typePrime;
	}

	public Calendar getDateModification() {
		return dateModification;
	}

	public void setDateModification(Calendar dateModification) {
		this.dateModification = dateModification;
	}

	public String getMotifRejet() {
		return motifRejet;
	}

	public void setMotifRejet(String motifRejet) {
		this.motifRejet = motifRejet;
	}

	public long getIdFlux() {
		return idFlux;
	}

	public void setIdFlux(long idFlux) {
		this.idFlux = idFlux;
	}


	
}
