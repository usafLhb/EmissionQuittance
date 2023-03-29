package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;
import java.util.List;

import com.rmawatanya.convergence.utile.referentiel.Indicatif;
import com.rmawatanya.convergence.utile.referentiel.Pays;
import com.rmawatanya.convergence.utile.referentiel.Profession;
import com.rmawatanya.convergence.utile.referentiel.SecteurActivite;
import com.rmawatanya.convergence.utile.referentiel.StatutClient;
import com.rmawatanya.convergence.utile.referentiel.TypePM;
import com.rmawatanya.convergence.utile.referentiel.Ville;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.services.historique.HistoryItem;
import ma.co.omnidata.framework.services.historique.IHistorisable;

public class ClientInfosComplementaires implements IHistorisable, IEntite {

	private long id;
	private Client refClient;
	// FATCA
	private String enseigneCommerciale;
	private Calendar dateCreationLegale;
	private String objetRelationAffaire;
	private Pays refPaysImmatriculationFiscale;
	private TypePM refTypePM;
	private Indicatif refIndicatifBureau;
	private Indicatif refIndicatifDomicile;
	private Indicatif refIndicatifGsm;
	private Boolean entite50RevenuPassive;
	private String adresse1Adr2;
	private String adresse2Adr2;
	private String adresse3Adr2;
	private Integer codePostalAdr2;
	private Ville refVilleAdr2;
	private Pays refPaysAdr2;
	private String adresse1Adr3;
	private String adresse2Adr3;
	private String adresse3Adr3;
	private Integer codePostalAdr3;
	private Ville refVilleAdr3;
	private Pays refPaysAdr3;
	private Boolean entiteUS;
	// ce param�tre est calcul� au moement de la sauvegarde de l'entit� et n'est pas
	// g�r� par le formulaire
	private Boolean signeUS;

	// FATCA personnes physiques
	private Pays refPaysNaissance;
	private Pays refPaysDeuxiemeNationlite;
	private StatutClient refStatut;
	private Pays refPaysDelivrancePiece;
	private Calendar dateDebutValiditePiece;
	private Calendar dateFinValiditePiece;
	private Pays refPaysResidence;
	private Pays refPaysResidenceFiscale;
	private SecteurActivite refSecteurActivite;
	private Boolean personUS;
	private Boolean ppe;
	private String fonctionPpe;
	private Pays refPaysPpe;
	private String origineFonds;
	private Profession refProfession;
	private Integer lien;
	//Entrepreneur Individuel
	private String entrepreneurIndividuel;
	private String numeroRegistreNationalEntrepreneur;
	private String numeroRC;
	private String tribunalImmatriculation;
	private String numeroTaxeProfessionnelle;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEnseigneCommerciale() {
		return enseigneCommerciale;
	}

	public void setEnseigneCommerciale(String enseigneCommerciale) {
		this.enseigneCommerciale = enseigneCommerciale;
	}

	public String getObjetRelationAffaire() {
		return objetRelationAffaire;
	}

	public void setObjetRelationAffaire(String objetRelationAffaire) {
		this.objetRelationAffaire = objetRelationAffaire;
	}

	public Pays getRefPaysImmatriculationFiscale() {
		return refPaysImmatriculationFiscale;
	}

	public void setRefPaysImmatriculationFiscale(Pays refPaysImmatriculationFiscale) {
		this.refPaysImmatriculationFiscale = refPaysImmatriculationFiscale;
	}

	public TypePM getRefTypePM() {
		return refTypePM;
	}

	public void setRefTypePM(TypePM refTypePM) {
		this.refTypePM = refTypePM;
	}

	public Indicatif getRefIndicatifBureau() {
		return refIndicatifBureau;
	}

	public void setRefIndicatifBureau(Indicatif refIndicatifBureau) {
		this.refIndicatifBureau = refIndicatifBureau;
	}

	public Indicatif getRefIndicatifDomicile() {
		return refIndicatifDomicile;
	}

	public void setRefIndicatifDomicile(Indicatif refIndicatifDomicile) {
		this.refIndicatifDomicile = refIndicatifDomicile;
	}

	public Indicatif getRefIndicatifGsm() {
		return refIndicatifGsm;
	}

	public void setRefIndicatifGsm(Indicatif refIndicatifGsm) {
		this.refIndicatifGsm = refIndicatifGsm;
	}

	public Boolean getEntite50RevenuPassive() {
		return entite50RevenuPassive;
	}

	public void setEntite50RevenuPassive(Boolean entite50RevenuPassive) {
		this.entite50RevenuPassive = entite50RevenuPassive;
	}

	public String getAdresse1Adr2() {
		return adresse1Adr2;
	}

	public void setAdresse1Adr2(String adresse1Adr2) {
		this.adresse1Adr2 = adresse1Adr2;
	}

	public String getAdresse2Adr2() {
		return adresse2Adr2;
	}

	public void setAdresse2Adr2(String adresse2Adr2) {
		this.adresse2Adr2 = adresse2Adr2;
	}

	public String getAdresse3Adr2() {
		return adresse3Adr2;
	}

	public void setAdresse3Adr2(String adresse3Adr2) {
		this.adresse3Adr2 = adresse3Adr2;
	}

	public Integer getCodePostalAdr2() {
		return codePostalAdr2;
	}

	public void setCodePostalAdr2(Integer codePostalAdr2) {
		this.codePostalAdr2 = codePostalAdr2;
	}

	public Ville getRefVilleAdr2() {
		return refVilleAdr2;
	}

	public void setRefVilleAdr2(Ville refVilleAdr2) {
		this.refVilleAdr2 = refVilleAdr2;
	}

	public Pays getRefPaysAdr2() {
		return refPaysAdr2;
	}

	public void setRefPaysAdr2(Pays refPaysAdr2) {
		this.refPaysAdr2 = refPaysAdr2;
	}

	public String getAdresse1Adr3() {
		return adresse1Adr3;
	}

	public void setAdresse1Adr3(String adresse1Adr3) {
		this.adresse1Adr3 = adresse1Adr3;
	}

	public String getAdresse2Adr3() {
		return adresse2Adr3;
	}

	public void setAdresse2Adr3(String adresse2Adr3) {
		this.adresse2Adr3 = adresse2Adr3;
	}

	public String getAdresse3Adr3() {
		return adresse3Adr3;
	}

	public void setAdresse3Adr3(String adresse3Adr3) {
		this.adresse3Adr3 = adresse3Adr3;
	}

	public Integer getCodePostalAdr3() {
		return codePostalAdr3;
	}

	public void setCodePostalAdr3(Integer codePostalAdr3) {
		this.codePostalAdr3 = codePostalAdr3;
	}

	public Ville getRefVilleAdr3() {
		return refVilleAdr3;
	}

	public void setRefVilleAdr3(Ville refVilleAdr3) {
		this.refVilleAdr3 = refVilleAdr3;
	}

	public Pays getRefPaysAdr3() {
		return refPaysAdr3;
	}

	public void setRefPaysAdr3(Pays refPaysAdr3) {
		this.refPaysAdr3 = refPaysAdr3;
	}

	public Boolean getEntiteUS() {
		return entiteUS;
	}

	public void setEntiteUS(Boolean entiteUS) {
		this.entiteUS = entiteUS;
	}

	public Boolean getSigneUS() {
		return signeUS;
	}

	public void setSigneUS(Boolean signeUS) {
		this.signeUS = signeUS;
	}

	public Pays getRefPaysNaissance() {
		return refPaysNaissance;
	}

	public void setRefPaysNaissance(Pays refPaysNaissance) {
		this.refPaysNaissance = refPaysNaissance;
	}

	public Pays getRefPaysDeuxiemeNationlite() {
		return refPaysDeuxiemeNationlite;
	}

	public void setRefPaysDeuxiemeNationlite(Pays refPaysDeuxiemeNationlite) {
		this.refPaysDeuxiemeNationlite = refPaysDeuxiemeNationlite;
	}

	public StatutClient getRefStatut() {
		return refStatut;
	}

	public void setRefStatut(StatutClient refStatut) {
		this.refStatut = refStatut;
	}

	public Pays getRefPaysDelivrancePiece() {
		return refPaysDelivrancePiece;
	}

	public void setRefPaysDelivrancePiece(Pays refPaysDelivrancePiece) {
		this.refPaysDelivrancePiece = refPaysDelivrancePiece;
	}

	public Calendar getDateDebutValiditePiece() {
		return dateDebutValiditePiece;
	}

	public void setDateDebutValiditePiece(Calendar dateDebutValiditePiece) {
		this.dateDebutValiditePiece = dateDebutValiditePiece;
	}

	public Calendar getDateFinValiditePiece() {
		return dateFinValiditePiece;
	}

	public void setDateFinValiditePiece(Calendar dateFinValiditePiece) {
		this.dateFinValiditePiece = dateFinValiditePiece;
	}

	public Pays getRefPaysResidence() {
		return refPaysResidence;
	}

	public void setRefPaysResidence(Pays refPaysResidence) {
		this.refPaysResidence = refPaysResidence;
	}

	public Pays getRefPaysResidenceFiscale() {
		return refPaysResidenceFiscale;
	}

	public void setRefPaysResidenceFiscale(Pays refPaysResidenceFiscale) {
		this.refPaysResidenceFiscale = refPaysResidenceFiscale;
	}

	public SecteurActivite getRefSecteurActivite() {
		return refSecteurActivite;
	}

	public void setRefSecteurActivite(SecteurActivite refSecteurActivite) {
		this.refSecteurActivite = refSecteurActivite;
	}

	public String getNumeroRegistreNationalEntrepreneur() {
		return numeroRegistreNationalEntrepreneur;
	}

	public void setNumeroRegistreNationalEntrepreneur(String numeroRegistreNationalEntrepreneur) {
		this.numeroRegistreNationalEntrepreneur = numeroRegistreNationalEntrepreneur;
	}

	public String getNumeroRC() {
		return numeroRC;
	}

	public void setNumeroRC(String numeroRC) {
		this.numeroRC = numeroRC;
	}

	public String getTribunalImmatriculation() {
		return tribunalImmatriculation;
	}

	public void setTribunalImmatriculation(String tribunalImmatriculation) {
		this.tribunalImmatriculation = tribunalImmatriculation;
	}

	public String getNumeroTaxeProfessionnelle() {
		return numeroTaxeProfessionnelle;
	}

	public void setNumeroTaxeProfessionnelle(String numeroTaxeProfessionnelle) {
		this.numeroTaxeProfessionnelle = numeroTaxeProfessionnelle;
	}

	public Boolean getPersonUS() {
		return personUS;
	}

	public void setPersonUS(Boolean personUS) {
		this.personUS = personUS;
	}

	public Boolean getPpe() {
		return ppe;
	}

	public void setPpe(Boolean ppe) {
		this.ppe = ppe;
	}

	public String getOrigineFonds() {
		return origineFonds;
	}

	public void setOrigineFonds(String origineFonds) {
		this.origineFonds = origineFonds;
	}

	public Profession getRefProfession() {
		return refProfession;
	}

	public void setRefProfession(Profession refProfession) {
		this.refProfession = refProfession;
	}
	
	public Calendar getDateCreationLegale() {
		return dateCreationLegale;
	}

	public void setDateCreationLegale(Calendar dateCreationLegale) {
		this.dateCreationLegale = dateCreationLegale;
	}
	

	public Integer getLien() {
		return lien;
	}

	public void setLien(Integer lien) {
		this.lien = lien;
	}

	public Client getRefClient() {
		return refClient;
	}

	public void setRefClient(Client refClient) {
		this.refClient = refClient;
	}
	
	public String getEntrepreneurIndividuel() {
		return entrepreneurIndividuel;
	}

	public void setEntrepreneurIndividuel(String entrepreneurIndividuel) {
		this.entrepreneurIndividuel = entrepreneurIndividuel;
	}

	public String getFonctionPpe() {
		return fonctionPpe;
	}

	public void setFonctionPpe(String fonctionPpe) {
		this.fonctionPpe = fonctionPpe;
	}

	public Pays getRefPaysPpe() {
		return refPaysPpe;
	}

	public void setRefPaysPpe(Pays refPaysPpe) {
		this.refPaysPpe = refPaysPpe;
	}

	public ClientInfosComplementaires() {

	}
	

	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}

		ClientInfosComplementaires c = (ClientInfosComplementaires) o;
		if (c.getId() != this.id) {
			return false;
		}

		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List getParents() {
		return null;
	}
	
	public List getHistory() {
		return null;
	}
	
	public void historiser() {		
	}
	
	public HistoryItem getLastHistoryItem() {
		return null;
	}

}
