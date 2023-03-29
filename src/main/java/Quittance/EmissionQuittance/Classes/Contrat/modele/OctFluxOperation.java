package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

public class OctFluxOperation {

	private long id;
	private String nomFichier;
	private Calendar dateDebut;
	private Calendar dateFin;
	private String numeroRemise;
	private Double montantRemise;
	private Calendar dateTraitement;
	private String motifRejet;
	private String etat;
	private Integer nombreDossierTraites;
	private Integer nombreDossierAcceptes;
	private Integer nombreDossierRejetes;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomFichier() {
		return nomFichier;
	}
	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
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
	public String getNumeroRemise() {
		return numeroRemise;
	}
	public void setNumeroRemise(String numeroRemise) {
		this.numeroRemise = numeroRemise;
	}
	public Double getMontantRemise() {
		return montantRemise;
	}
	public void setMontantRemise(Double montantRemise) {
		this.montantRemise = montantRemise;
	}
	public Calendar getDateTraitement() {
		return dateTraitement;
	}
	public void setDateTraitement(Calendar dateTraitement) {
		this.dateTraitement = dateTraitement;
	}
	public String getMotifRejet() {
		return motifRejet;
	}
	public void setMotifRejet(String motifRejet) {
		this.motifRejet = motifRejet;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Integer getNombreDossierTraites() {
		return nombreDossierTraites;
	}
	public void setNombreDossierTraites(Integer nombreDossierTraites) {
		this.nombreDossierTraites = nombreDossierTraites;
	}
	public Integer getNombreDossierAcceptes() {
		return nombreDossierAcceptes;
	}
	public void setNombreDossierAcceptes(Integer nombreDossierAcceptes) {
		this.nombreDossierAcceptes = nombreDossierAcceptes;
	}
	public Integer getNombreDossierRejetes() {
		return nombreDossierRejetes;
	}
	public void setNombreDossierRejetes(Integer nombreDossierRejetes) {
		this.nombreDossierRejetes = nombreDossierRejetes;
	}



}
