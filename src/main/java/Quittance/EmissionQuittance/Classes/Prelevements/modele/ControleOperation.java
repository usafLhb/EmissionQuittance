package Quittance.EmissionQuittance.Classes.Prelevements.modele;


public class ControleOperation
{
	
   private Long id;
	 
   private String nomPrenomAdherent;
   private String numeroAdhesion;
   private String numeroCIN;
   private String matricule;
   private String dateCreation;
   private String typePrelevement;
   private Double mntCotisation;
   private String numeroCompteBancaire;
   private String etat;
   
   
	public String getNomPrenomAdherent() {
		return nomPrenomAdherent;
	}
	public void setNomPrenomAdherent(String nomPrenomAdherent) {
		this.nomPrenomAdherent = nomPrenomAdherent;
	}
	public String getNumeroAdhesion() {
		return numeroAdhesion;
	}
	public void setNumeroAdhesion(String numeroAdhesion) {
		this.numeroAdhesion = numeroAdhesion;
	}
	public String getNumeroCIN() {
		return numeroCIN;
	}
	public void setNumeroCIN(String numeroCIN) {
		this.numeroCIN = numeroCIN;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getTypePrelevement() {
		return typePrelevement;
	}
	public void setTypePrelevement(String typePrelevement) {
		this.typePrelevement = typePrelevement;
	}
	public Double getMntCotisation() {
		return mntCotisation;
	}
	public void setMntCotisation(Double mntCotisation) {
		this.mntCotisation = mntCotisation;
	}
	public String getNumeroCompteBancaire() {
		return numeroCompteBancaire;
	}
	public void setNumeroCompteBancaire(String numeroCompteBancaire) {
		this.numeroCompteBancaire = numeroCompteBancaire;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	}
