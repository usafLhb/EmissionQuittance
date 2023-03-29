package Quittance.EmissionQuittance.Classes.Prestation.modele;



public class BeanSinistre {

	private String id;		
	private String gestionnaire;
	private String numeroContrat;
	private String numSinistre;
	private String exercice;
	private String entiteCommerciale;
	private String ordre;
	private String telGestionnaire;
	private String faxGestionnaire;
	private String departement;
	private String responsableDepartement;
	private String numAdhesion;
	private String dateAdhesion;
	private String etatContrat;
	
	//Assure
	private String nomPrenomAssure;
	private String ageAssure;
	private String professionAssure;
	private String situationFamilialeAssure;
	
	//Sinistre
	private String typeSinistre;
	private String dateSurvenance;
	private String lieuSurvenance;
	private String montantEvaluation;
    private String InfosComplementaire;
	private String lieuEtDateEdition;
	private String dateEdition;
	private String entiteGestion;
	private String telEntiteGestion;
	private String faxEntiteGestion;
	private String gestionnaireAbrg;
	private String dateDeclaration;
	private String causes;
	private String capitalAssure;
	private String capitalRestantDu;
	private String dateOrdonnacement;
	private String dateFinGestion;
	
	//lettre rejet
	private String police;
	private String natureProduit;
	private String motifRejet;
	
	
	//Recours
	private String montantRecours;
	private String nomPrenomTiersResponsable;
	private String adresseTiersResponsable;
	private String nomPrestataire;
	private String honorairePrestataire;
	private String typeBien;
	
	//reglement
	private String beneficiaire;
	private String modeReglement;
	private String texteObservation;
	
	//liste des ordonnanceurs (max 4)
	private String reglementOrdonnance1;
	private String reglementOrdonnance2;
	private String reglementOrdonnance3;
	private String reglementOrdonnance4;
	
	private String ordonnanceur1;
	private String ordonnanceur2;
	private String ordonnanceur3;
	private String ordonnanceur4;
	
	private String dateOrdonnancement1;
	private String dateOrdonnancement2;
	private String dateOrdonnancement3;
	private String dateOrdonnancement4;
	
	private String decisionOrdonnancement;
	private String dateReceptionExpertise;
	
	private String dateDernierePieceJustificative;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(String gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public String getNumeroContrat() {
		return numeroContrat;
	}

	public void setNumeroContrat(String numeroContrat) {
		this.numeroContrat = numeroContrat;
	}

	public String getNumSinistre() {
		return numSinistre;
	}

	public void setNumSinistre(String numSinistre) {
		this.numSinistre = numSinistre;
	}

	public String getTypeSinistre() {
		return typeSinistre;
	}

	public void setTypeSinistre(String typeSinistre) {
		this.typeSinistre = typeSinistre;
	}

	public String getDateSurvenance() {
		return dateSurvenance;
	}

	public void setDateSurvenance(String dateSurvenance) {
		this.dateSurvenance = dateSurvenance;
	}

	public String getLieuSurvenance() {
		return lieuSurvenance;
	}

	public void setLieuSurvenance(String lieuSurvenance) {
		this.lieuSurvenance = lieuSurvenance;
	}

	public String getMontantEvaluation() {
		return montantEvaluation;
	}

	public void setMontantEvaluation(String montantEvaluation) {
		this.montantEvaluation = montantEvaluation;
	}

	public String getLieuEtDateEdition() {
		return lieuEtDateEdition;
	}

	public void setLieuEtDateEdition(String lieuEtDateEdition) {
		this.lieuEtDateEdition = lieuEtDateEdition;
	}

	public String getNomPrenomAssure() {
		return nomPrenomAssure;
	}

	public void setNomPrenomAssure(String nomPrenomAssure) {
		this.nomPrenomAssure = nomPrenomAssure;
	}

	public String getExercice() {
		return exercice;
	}

	public void setExercice(String exercice) {
		this.exercice = exercice;
	}

	public String getInfosComplementaire() {
		return InfosComplementaire;
	}

	public void setInfosComplementaire(String infosComplementaire) {
		InfosComplementaire = infosComplementaire;
	}

	public String getDateEdition() {
		return dateEdition;
	}

	public void setDateEdition(String dateEdition) {
		this.dateEdition = dateEdition;
	}

	public String getEntiteCommerciale() {
		return entiteCommerciale;
	}

	public void setEntiteCommerciale(String entiteCommerciale) {
		this.entiteCommerciale = entiteCommerciale;
	}

	public String getOrdre() {
		return ordre;
	}

	public void setOrdre(String ordre) {
		this.ordre = ordre;
	}

	public String getEntiteGestion() {
		return entiteGestion;
	}

	public void setEntiteGestion(String entiteGestion) {
		this.entiteGestion = entiteGestion;
	}

	public String getTelEntiteGestion() {
		return telEntiteGestion;
	}

	public void setTelEntiteGestion(String telEntiteGestion) {
		this.telEntiteGestion = telEntiteGestion;
	}

	public String getFaxEntiteGestion() {
		return faxEntiteGestion;
	}

	public void setFaxEntiteGestion(String faxEntiteGestion) {
		this.faxEntiteGestion = faxEntiteGestion;
	}

	public String getGestionnaireAbrg() {
		return gestionnaireAbrg;
	}

	public void setGestionnaireAbrg(String gestionnaireAbrg) {
		this.gestionnaireAbrg = gestionnaireAbrg;
	}

	public String getPolice() {
		return police;
	}

	public void setPolice(String police) {
		this.police = police;
	}

	public String getNatureProduit() {
		return natureProduit;
	}

	public void setNatureProduit(String natureProduit) {
		this.natureProduit = natureProduit;
	}

	public String getMotifRejet() {
		return motifRejet;
	}

	public void setMotifRejet(String motifRejet) {
		this.motifRejet = motifRejet;
	}

	public String getTelGestionnaire() {
		return telGestionnaire;
	}

	public void setTelGestionnaire(String telGestionnaire) {
		this.telGestionnaire = telGestionnaire;
	}

	public String getFaxGestionnaire() {
		return faxGestionnaire;
	}

	public void setFaxGestionnaire(String faxGestionnaire) {
		this.faxGestionnaire = faxGestionnaire;
	}

	public String getMontantRecours() {
		return montantRecours;
	}

	public void setMontantRecours(String montantRecours) {
		this.montantRecours = montantRecours;
	}

	public String getNomPrenomTiersResponsable() {
		return nomPrenomTiersResponsable;
	}

	public void setNomPrenomTiersResponsable(String nomPrenomTiersResponsable) {
		this.nomPrenomTiersResponsable = nomPrenomTiersResponsable;
	}

	public String getAdresseTiersResponsable() {
		return adresseTiersResponsable;
	}

	public void setAdresseTiersResponsable(String adresseTiersResponsable) {
		this.adresseTiersResponsable = adresseTiersResponsable;
	}

	public String getNomPrestataire() {
		return nomPrestataire;
	}

	public void setNomPrestataire(String nomPrestataire) {
		this.nomPrestataire = nomPrestataire;
	}

	public String getHonorairePrestataire() {
		return honorairePrestataire;
	}

	public void setHonorairePrestataire(String honorairePrestataire) {
		this.honorairePrestataire = honorairePrestataire;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getTypeBien() {
		return typeBien;
	}

	public void setTypeBien(String typeBien) {
		this.typeBien = typeBien;
	}

	public String getResponsableDepartement() {
		return responsableDepartement;
	}

	public void setResponsableDepartement(String responsableDepartement) {
		this.responsableDepartement = responsableDepartement;
	}

	public String getAgeAssure() {
		return ageAssure;
	}

	public void setAgeAssure(String ageAssure) {
		this.ageAssure = ageAssure;
	}

	public String getProfessionAssure() {
		return professionAssure;
	}

	public void setProfessionAssure(String professionAssure) {
		this.professionAssure = professionAssure;
	}

	public String getSituationFamilialeAssure() {
		return situationFamilialeAssure;
	}

	public void setSituationFamilialeAssure(String situationFamilialeAssure) {
		this.situationFamilialeAssure = situationFamilialeAssure;
	}

	public String getNumAdhesion() {
		return numAdhesion;
	}

	public void setNumAdhesion(String numAdhesion) {
		this.numAdhesion = numAdhesion;
	}

	public String getDateAdhesion() {
		return dateAdhesion;
	}
	public void setDateAdhesion(String dateAdhesion) {
		this.dateAdhesion = dateAdhesion;
	}

	public String getEtatContrat() {
		return etatContrat;
	}

	public void setEtatContrat(String etatContrat) {
		this.etatContrat = etatContrat;
	}

	public String getDateDeclaration() {
		return dateDeclaration;
	}

	public void setDateDeclaration(String dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}

	public String getCauses() {
		return causes;
	}

	public void setCauses(String causes) {
		this.causes = causes;
	}

	public String getCapitalAssure() {
		return capitalAssure;
	}

	public void setCapitalAssure(String capitalAssure) {
		this.capitalAssure = capitalAssure;
	}

	public String getCapitalRestantDu() {
		return capitalRestantDu;
	}

	public void setCapitalRestantDu(String capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}

	public String getDateOrdonnacement() {
		return dateOrdonnacement;
	}

	public void setDateOrdonnacement(String dateOrdonnacement) {
		this.dateOrdonnacement = dateOrdonnacement;
	}

	public String getDateFinGestion() {
		return dateFinGestion;
	}

	public void setDateFinGestion(String dateFinGestion) {
		this.dateFinGestion = dateFinGestion;
	}

	public String getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	public String getModeReglement() {
		return modeReglement;
	}

	public void setModeReglement(String modeReglement) {
		this.modeReglement = modeReglement;
	}

	public String getTexteObservation() {
		return texteObservation;
	}

	public void setTexteObservation(String texteObservation) {
		this.texteObservation = texteObservation;
	}

	public String getDecisionOrdonnancement() {
		return decisionOrdonnancement;
	}

	public void setDecisionOrdonnancement(String decisionOrdonnancement) {
		this.decisionOrdonnancement = decisionOrdonnancement;
	}

	public String getReglementOrdonnance1() {
		return reglementOrdonnance1;
	}

	public void setReglementOrdonnance1(String reglementOrdonnance1) {
		this.reglementOrdonnance1 = reglementOrdonnance1;
	}

	public String getReglementOrdonnance2() {
		return reglementOrdonnance2;
	}

	public void setReglementOrdonnance2(String reglementOrdonnance2) {
		this.reglementOrdonnance2 = reglementOrdonnance2;
	}

	public String getReglementOrdonnance3() {
		return reglementOrdonnance3;
	}

	public void setReglementOrdonnance3(String reglementOrdonnance3) {
		this.reglementOrdonnance3 = reglementOrdonnance3;
	}

	public String getReglementOrdonnance4() {
		return reglementOrdonnance4;
	}

	public void setReglementOrdonnance4(String reglementOrdonnance4) {
		this.reglementOrdonnance4 = reglementOrdonnance4;
	}

	public String getOrdonnanceur1() {
		return ordonnanceur1;
	}

	public void setOrdonnanceur1(String ordonnanceur1) {
		this.ordonnanceur1 = ordonnanceur1;
	}

	public String getOrdonnanceur2() {
		return ordonnanceur2;
	}

	public void setOrdonnanceur2(String ordonnanceur2) {
		this.ordonnanceur2 = ordonnanceur2;
	}

	public String getOrdonnanceur3() {
		return ordonnanceur3;
	}

	public void setOrdonnanceur3(String ordonnanceur3) {
		this.ordonnanceur3 = ordonnanceur3;
	}

	public String getOrdonnanceur4() {
		return ordonnanceur4;
	}

	public void setOrdonnanceur4(String ordonnanceur4) {
		this.ordonnanceur4 = ordonnanceur4;
	}

	public String getDateOrdonnancement1() {
		return dateOrdonnancement1;
	}

	public void setDateOrdonnancement1(String dateOrdonnancement1) {
		this.dateOrdonnancement1 = dateOrdonnancement1;
	}

	public String getDateOrdonnancement2() {
		return dateOrdonnancement2;
	}

	public void setDateOrdonnancement2(String dateOrdonnancement2) {
		this.dateOrdonnancement2 = dateOrdonnancement2;
	}

	public String getDateOrdonnancement3() {
		return dateOrdonnancement3;
	}

	public void setDateOrdonnancement3(String dateOrdonnancement3) {
		this.dateOrdonnancement3 = dateOrdonnancement3;
	}

	public String getDateOrdonnancement4() {
		return dateOrdonnancement4;
	}

	public void setDateOrdonnancement4(String dateOrdonnancement4) {
		this.dateOrdonnancement4 = dateOrdonnancement4;
	}

	public String getDateReceptionExpertise() {
		return dateReceptionExpertise;
	}

	public void setDateReceptionExpertise(String dateReceptionExpertise) {
		this.dateReceptionExpertise = dateReceptionExpertise;
	}

	public String getDateDernierePieceJustificative() {
		return dateDernierePieceJustificative;
	}

	public void setDateDernierePieceJustificative(
			String dateDernierePieceJustificative) {
		this.dateDernierePieceJustificative = dateDernierePieceJustificative;
	}

	
}
