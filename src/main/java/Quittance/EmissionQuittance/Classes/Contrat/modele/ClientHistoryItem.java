package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.historique.HistoryItem;

import com.rmawatanya.convergence.utile.common.Constantes;
import com.rmawatanya.convergence.utile.organisation.Entite;
import com.rmawatanya.convergence.utile.referentiel.ActiviteBmce;
import com.rmawatanya.convergence.utile.referentiel.FormeJuridique;
import com.rmawatanya.convergence.utile.referentiel.GammeClient;
import com.rmawatanya.convergence.utile.referentiel.Indicatif;
import com.rmawatanya.convergence.utile.referentiel.Pays;
import com.rmawatanya.convergence.utile.referentiel.Profession;
import com.rmawatanya.convergence.utile.referentiel.SecteurActivite;
import com.rmawatanya.convergence.utile.referentiel.SegmentClientele;
import com.rmawatanya.convergence.utile.referentiel.SousMarche;
import com.rmawatanya.convergence.utile.referentiel.StatutClient;
import com.rmawatanya.convergence.utile.referentiel.TitreCivilite;
import com.rmawatanya.convergence.utile.referentiel.TypeClient;
import com.rmawatanya.convergence.utile.referentiel.TypePM;
import com.rmawatanya.convergence.utile.referentiel.Ville;

import ma.co.omnidata.framework.services.historique.HistoryItem;

// Juste pour les enfants
public class ClientHistoryItem extends HistoryItem
{
   private String numero;
   private String categorieClient;
   private String typePieceIdentite;
   private String numeroPieceIdentite;
   private String adresse1;
   private String adresse2;
   private String adresse3;   
   private String numeroTiers;
   private String codeTribunal;
   private Integer codePostal;
   private String telephoneBureau;
   private String fax;
   private String email;
   private String adresseErronee;
   private String courrierGarde;
   private Calendar dateCreation;
   private Calendar dateDerniereMaj;
   private String stratification;
   private SousMarche refSousMarche;
   /**
    * C'est la date d'effet du premier contrat du client (le plus ancien).
    */
   private Calendar anciennete;
   private Entite refAgence;
   private Ville refVilleAdresse;
   private Pays refPaysAdresse;
   private Pays refNationalite;
   private TypeClient refTypeClient;
   private GammeClient refGammeClient;
   private SegmentClientele refSegmentClientele;
   
   
   private String nom;
   private String prenom;
   private String sexe;
   private String situationFamiliale;
   private Calendar dateNaissance;
   private Integer nombreEnfants;
   private String profession;
   private String employeur;
   private String gsm;
   private String telephoneDomicile;
   private Double revenuAnnuel;
   private Double poids;
   private Double taille;
   private TitreCivilite refTitreCivilite;
   
   private String raisonSociale;
   private String activite;
   private ActiviteBmce refActivite;
   private FormeJuridique refFormeJuridique;
   
   // Etat : En instance :0, En cours : 1
   private String etat;
   
   private String numeroLien;
   private String typeLien;
   
   private Boolean rappatrie; 
   private String referenceExterne;
   private String referenceExterneAMC;
   private String numeroICE;
   
 //PROTECTION FAMILLE
 	private String preferenceManuelle;

//ConventionPrevoyance
 	private String codeConvention;
 	private String libelleConvention;

// donnees FATCA
   private String enseigneCommerciale;
   private Pays refPaysNaissance;
   private Pays refPaysDeuxiemeNationalite;
   private StatutClient refStatut;
   private Pays refPaysDelivrancePieceIdentite;
   private Calendar dateDebutValiditePieceIdentite;
   private Calendar dateFinValiditePieceIdentite;
   private String numeroRC;
   private String tribunalImmatriculation;
   private String numeroTaxeProfessionnelle;
   private String numeroRegistreNationalEntrepreneur;
   private String adresse1Adr2;
   private String adresse2Adr2;
   private String adresse3Adr2;
   private Ville refVilleAdr2;
   private Pays refPaysAdr2;
   private Integer codePostalAdr2;
   private String adresse1Adr3;
   private String adresse2Adr3;
   private String adresse3Adr3;
   private Ville refVilleAdr3;
   private Pays refPaysAdr3;
   private Integer codePostalAdr3;
   private Pays refPaysResidence;
   private Pays refPaysResidenceFiscale;
   private Indicatif refIndicatifDomicile;
   private Indicatif refIndicatifGsm;
   private Indicatif refIndicatifBureau;
   private String  origineFonds;
   private Profession refProfession;
   private SecteurActivite refSecteurActivite;
   private Boolean Ppe;
   private Boolean personUS;
   private Calendar dateCreationLegale;
   private String objetRelationAffaire;
   private Pays refPaysImmatriculationFiscale;
   private TypePM refTypePM;
   private Boolean entite50RevenuPassive;
   private Boolean entiteUS;
   private String entrepreneurIndividuel;
   
 	
   public ClientHistoryItem() 
   {
    
   }

   /**
    * Access method for the numero property.
    * 
    * @return   the current value of the numero property
    */
   public String getNumero() 
   {
      return numero;
   }
   
   /**
    * Sets the value of the numero property.
    * 
    * @param aNumero the new value of the numero property
    */
   public void setNumero(String aNumero) 
   {
      numero = aNumero;
   }
   
   /**
    * Access method for the categorieClient property.
    * 
    * @return   the current value of the categorieClient property
    */
   public String getCategorieClient() 
   {
      return categorieClient;
   }
   
   /**
    * Sets the value of the categorieClient property.
    * 
    * @param aCategorieClient the new value of the categorieClient property
    */
   public void setCategorieClient(String aCategorieClient) 
   {
      categorieClient = aCategorieClient;
   }
   
   /**
    * Access method for the typePieceIdentite property.
    * 
    * @return   the current value of the typePieceIdentite property
    */
   public String getTypePieceIdentite() 
   {
      return typePieceIdentite;
   }
   
   /**
    * Sets the value of the typePieceIdentite property.
    * 
    * @param aTypePieceIdentite the new value of the typePieceIdentite property
    */
   public void setTypePieceIdentite(String aTypePieceIdentite) 
   {
      typePieceIdentite = aTypePieceIdentite;
   }
   
   /**
    * Access method for the numeroPieceIdentite property.
    * 
    * @return   the current value of the numeroPieceIdentite property
    */
   public String getNumeroPieceIdentite() 
   {
      return numeroPieceIdentite;
   }
   
   /**
    * Sets the value of the numeroPieceIdentite property.
    * 
    * @param aNumeroPieceIdentite the new value of the numeroPieceIdentite property
    */
   public void setNumeroPieceIdentite(String aNumeroPieceIdentite) 
   {
      numeroPieceIdentite = aNumeroPieceIdentite;
   }  
 
   /**
    * Access method for the codePostal property.
    * 
    * @return   the current value of the codePostal property
    */
   public Integer getCodePostal() 
   {
      return codePostal;
   }
   
   /**
    * Sets the value of the codePostal property.
    * 
    * @param aCodePostal the new value of the codePostal property
    */
   public void setCodePostal(Integer aCodePostal) 
   {
      codePostal = aCodePostal;
   }
   
   /**
    * Access method for the telephoneBureau property.
    * 
    * @return   the current value of the telephoneBureau property
    */
   public String getTelephoneBureau() 
   {
      return telephoneBureau;
   }
   
   /**
    * Sets the value of the telephoneBureau property.
    * 
    * @param aTelephoneBureau the new value of the telephoneBureau property
    */
   public void setTelephoneBureau(String aTelephoneBureau) 
   {
      telephoneBureau = aTelephoneBureau;
   }
   
   /**
    * Access method for the fax property.
    * 
    * @return   the current value of the fax property
    */
   public String getFax() 
   {
      return fax;
   }
   
   /**
    * Sets the value of the fax property.
    * 
    * @param aFax the new value of the fax property
    */
   public void setFax(String aFax) 
   {
      fax = aFax;
   }
   
   /**
    * Access method for the email property.
    * 
    * @return   the current value of the email property
    */
   public String getEmail() 
   {
      return email;
   }
   
   /**
    * Sets the value of the email property.
    * 
    * @param aEmail the new value of the email property
    */
   public void setEmail(String aEmail) 
   {
      email = aEmail;
   }
   
   /**
    * Access method for the adresseErronee property.
    * 
    * @return   the current value of the adresseErronee property
    */
   public String getAdresseErronee() 
   {
      return adresseErronee;
   }
   
   /**
    * Sets the value of the adresseErronee property.
    * 
    * @param aAdresseErronee the new value of the adresseErronee property
    */
   public void setAdresseErronee(String aAdresseErronee) 
   {
      adresseErronee = aAdresseErronee;
   }
   
   /**
    * Access method for the courrierGarde property.
    * 
    * @return   the current value of the courrierGarde property
    */
   public String getCourrierGarde() 
   {
      return courrierGarde;
   }
   
   /**
    * Sets the value of the courrierGarde property.
    * 
    * @param aCourrierGarde the new value of the courrierGarde property
    */
   public void setCourrierGarde(String aCourrierGarde) 
   {
      courrierGarde = aCourrierGarde;
   }
   
   /**
    * Access method for the dateCreation property.
    * 
    * @return   the current value of the dateCreation property
    */
   public Calendar getDateCreation() 
   {
      return dateCreation;
   }
   
   /**
    * Sets the value of the dateCreation property.
    * 
    * @param aDateCreation the new value of the dateCreation property
    */
   public void setDateCreation(Calendar aDateCreation) 
   {
      dateCreation = aDateCreation;
   }
   
   /**
    * Access method for the dateDerniereMaj property.
    * 
    * @return   the current value of the dateDerniereMaj property
    */
   public Calendar getDateDerniereMaj() 
   {
      return dateDerniereMaj;
   }
   
   /**
    * Sets the value of the dateDerniereMaj property.
    * 
    * @param aDateDerniereMaj the new value of the dateDerniereMaj property
    */
   public void setDateDerniereMaj(Calendar aDateDerniereMaj) 
   {
      dateDerniereMaj = aDateDerniereMaj;
   }
   
   /**
    * Access method for the anciennete property.
    * 
    * @return   the current value of the anciennete property
    */
   public Calendar getAnciennete() 
   {
      return anciennete;
   }
   
   /**
    * Sets the value of the anciennete property.
    * 
    * @param aAnciennete the new value of the anciennete property
    */
   public void setAnciennete(Calendar aAnciennete) 
   {
      anciennete = aAnciennete;
   }
   
   /**
    * Access method for the refAgence property.
    * 
    * @return   the current value of the refAgence property
    */
   public Entite getRefAgence() 
   {
      return refAgence;
   }
   
   /**
    * Sets the value of the refAgence property.
    * 
    * @param aRefAgence the new value of the refAgence property
    */
   public void setRefAgence(Entite aRefAgence) 
   {
      refAgence = aRefAgence;
   }
   
   /**
    * Access method for the refVilleAdresse property.
    * 
    * @return   the current value of the refVilleAdresse property
    */
   public Ville getRefVilleAdresse() 
   {
      return refVilleAdresse;
   }
   
   /**
    * Sets the value of the refVilleAdresse property.
    * 
    * @param aRefVilleAdresse the new value of the refVilleAdresse property
    */
   public void setRefVilleAdresse(Ville aRefVilleAdresse) 
   {
      refVilleAdresse = aRefVilleAdresse;
   }
   
   /**
    * Access method for the refTypeClient property.
    * 
    * @return   the current value of the refTypeClient property
    */
   public TypeClient getRefTypeClient() 
   {
      return refTypeClient;
   }
   
   /**
    * Sets the value of the refTypeClient property.
    * 
    * @param aRefTypeClient the new value of the refTypeClient property
    */
   public void setRefTypeClient(TypeClient aRefTypeClient) 
   {
      refTypeClient = aRefTypeClient;
   }
   
   /**
    * Access method for the refGammeClient property.
    * 
    * @return   the current value of the refGammeClient property
    */
   public GammeClient getRefGammeClient() 
   {
      return refGammeClient;
   }
   
   /**
    * Sets the value of the refGammeClient property.
    * 
    * @param aRefGammeClient the new value of the refGammeClient property
    */
   public void setRefGammeClient(GammeClient aRefGammeClient) 
   {
      refGammeClient = aRefGammeClient;
   }
   
	/**
	 * @return Returns the refSegmentClientele.
	 */
	public SegmentClientele getRefSegmentClientele() {
		return refSegmentClientele;
	}
	
	/**
	 * @param refSegmentClientele The refSegmentClientele to set.
	 */
	public void setRefSegmentClientele(SegmentClientele refSegmentClientele) {
		this.refSegmentClientele = refSegmentClientele;
	}

	public String getAdresse1() {
		return adresse1;
	}
	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}
	public String getAdresse2() {
		return adresse2;
	}
	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}
	public String getAdresse3() {
		return adresse3;
	}
	public void setAdresse3(String adresse3) {
		this.adresse3 = adresse3;
	}

	public Pays getRefPaysAdresse() {
		return refPaysAdresse;
	}
	public void setRefPaysAdresse(Pays refPaysAdresse) {
		this.refPaysAdresse = refPaysAdresse;
	}	
		
	public String getLibelleTypePieceIdentite() {
		if(this.typePieceIdentite == null || this.typePieceIdentite.trim().equals("")) { 
			return null;
		}
		if(Constantes.TYPE_PIECE_IDENTITE_CIN.equals(this.typePieceIdentite)) { 
		 return	Constantes.LIBELLE_PIECE_IDENTITE_CIN;
		}
		if(Constantes.TYPE_PIECE_IDENTITE_CS.equals(this.typePieceIdentite)) { 
			 return	Constantes.LIBELLE_PIECE_IDENTITE_CIN;
		}
		if(Constantes.TYPE_PIECE_IDENTITE_PASSEPORT.equals(this.typePieceIdentite)) { 
			 return	Constantes.LIBELLE_PIECE_IDENTITE_PASSEPORT;
		}
		if(Constantes.TYPE_PIECE_IDENTITE_RC.equals(this.typePieceIdentite)) { 
			 return	Constantes.LIBELLE_PIECE_IDENTITE_RC;
		}
		if(Constantes.TYPE_PIECE_IDENTITE_PATENTE.equals(this.typePieceIdentite)) { 
			 return	Constantes.LIBELLE_PIECE_IDENTITE_PATENTE;
		}
		return null;
	}

	public String getActivite() {
		return activite;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public FormeJuridique getRefFormeJuridique() {
		return refFormeJuridique;
	}
	public void setRefFormeJuridique(FormeJuridique refFormeJuridique) {
		this.refFormeJuridique = refFormeJuridique;
	}
	public Calendar getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Calendar dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmployeur() {
		return employeur;
	}
	public void setEmployeur(String employeur) {
		this.employeur = employeur;
	}
	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		this.gsm = gsm;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getNombreEnfants() {
		return nombreEnfants;
	}
	public void setNombreEnfants(Integer nombreEnfants) {
		this.nombreEnfants = nombreEnfants;
	}
	public Double getPoids() {
		return poids;
	}
	public void setPoids(Double poids) {
		this.poids = poids;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public TitreCivilite getRefTitreCivilite() {
		return refTitreCivilite;
	}
	public void setRefTitreCivilite(TitreCivilite refTitreCivilite) {
		this.refTitreCivilite = refTitreCivilite;
	}
	public Double getRevenuAnnuel() {
		return revenuAnnuel;
	}
	public void setRevenuAnnuel(Double revenuAnnuel) {
		this.revenuAnnuel = revenuAnnuel;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getSituationFamiliale() {
		return situationFamiliale;
	}
	public void setSituationFamiliale(String situationFamiliale) {
		this.situationFamiliale = situationFamiliale;
	}
	public Double getTaille() {
		return taille;
	}
	public void setTaille(Double taille) {
		this.taille = taille;
	}
	public String getTelephoneDomicile() {
		return telephoneDomicile;
	}
	public void setTelephoneDomicile(String telephoneDomicile) {
		this.telephoneDomicile = telephoneDomicile;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getNumeroLien() {
		return numeroLien;
	}
	public void setNumeroLien(String numeroLien) {
		this.numeroLien = numeroLien;
	}
	public String getTypeLien() {
		return typeLien;
	}
	public void setTypeLien(String typeLien) {
		this.typeLien = typeLien;
	}

	public Boolean getRappatrie() {
		return rappatrie;
	}

	public void setRappatrie(Boolean rappatrie) {
		this.rappatrie = rappatrie;
	}

	public String getStratification() {
		return stratification;
	}

	public void setStratification(String stratification) {
		this.stratification = stratification;
	}

	public SousMarche getRefSousMarche() {
		return refSousMarche;
	}

	public void setRefSousMarche(SousMarche refSousMarche) {
		this.refSousMarche = refSousMarche;
	}

	public ActiviteBmce getRefActivite() {
		return refActivite;
	}

	public void setRefActivite(ActiviteBmce refActivite) {
		this.refActivite = refActivite;
	}

	public String getReferenceExterne() {
		return referenceExterne;
	}

	public void setReferenceExterne(String referenceExterne) {
		this.referenceExterne = referenceExterne;
	}

	public Pays getRefNationalite() {
		return refNationalite;
	}

	public void setRefNationalite(Pays refNationalite) {
		this.refNationalite = refNationalite;
	}

	public String getNumeroTiers() {
		return numeroTiers;
	}

	public void setNumeroTiers(String numeroTiers) {
		this.numeroTiers = numeroTiers;
	}

	public String getCodeTribunal() {
		return codeTribunal;
	}

	public void setCodeTribunal(String codeTribunal) {
		this.codeTribunal = codeTribunal;
	}

	public String getNumeroICE() {
		return numeroICE;
	}

	public void setNumeroICE(String numeroICE) {
		this.numeroICE = numeroICE;
	}
	

	public String getReferenceExterneAMC() {
		return referenceExterneAMC;
	}

	public void setReferenceExterneAMC(String referenceExterneAMC) {
		this.referenceExterneAMC = referenceExterneAMC;
	}
	
	public String getPreferenceManuelle() {
		return preferenceManuelle;
	}

	public void setPreferenceManuelle(String preferenceManuelle) {
		this.preferenceManuelle = preferenceManuelle;
	}
public Pays getRefPaysNaissance() {
		return refPaysNaissance;
	}

	public void setRefPaysNaissance(Pays refPaysNaissance) {
		this.refPaysNaissance = refPaysNaissance;
	}

	public Pays getRefPaysDeuxiemeNationalite() {
		return refPaysDeuxiemeNationalite;
	}

	public void setRefPaysDeuxiemeNationalite(Pays refPaysDeuxiemeNationalite) {
		this.refPaysDeuxiemeNationalite = refPaysDeuxiemeNationalite;
	}

	public StatutClient getRefStatut() {
		return refStatut;
	}

	public void setRefStatut(StatutClient refStatut) {
		this.refStatut = refStatut;
	}

	public Pays getRefPaysDelivrancePieceIdentite() {
		return refPaysDelivrancePieceIdentite;
	}

	public void setRefPaysDelivrancePieceIdentite(Pays refPaysDelivrancePieceIdentite) {
		this.refPaysDelivrancePieceIdentite = refPaysDelivrancePieceIdentite;
	}

	public Calendar getDateDebutValiditePieceIdentite() {
		return dateDebutValiditePieceIdentite;
	}

	public void setDateDebutValiditePieceIdentite(Calendar dateDebutValiditePieceIdentite) {
		this.dateDebutValiditePieceIdentite = dateDebutValiditePieceIdentite;
	}

	public Calendar getDateFinValiditePieceIdentite() {
		return dateFinValiditePieceIdentite;
	}

	public void setDateFinValiditePieceIdentite(Calendar dateFinValiditePieceIdentite) {
		this.dateFinValiditePieceIdentite = dateFinValiditePieceIdentite;
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

	public String getNumeroRegistreNationalEntrepreneur() {
		return numeroRegistreNationalEntrepreneur;
	}

	public void setNumeroRegistreNationalEntrepreneur(String numeroRegistreNationalEntrepreneur) {
		this.numeroRegistreNationalEntrepreneur = numeroRegistreNationalEntrepreneur;
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

	public Integer getCodePostalAdr2() {
		return codePostalAdr2;
	}

	public void setCodePostalAdr2(Integer codePostalAdr2) {
		this.codePostalAdr2 = codePostalAdr2;
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

	public Integer getCodePostalAdr3() {
		return codePostalAdr3;
	}

	public void setCodePostalAdr3(Integer codePostalAdr3) {
		this.codePostalAdr3 = codePostalAdr3;
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

	public Indicatif getRefIndicatifBureau() {
		return refIndicatifBureau;
	}

	public void setRefIndicatifBureau(Indicatif refIndicatifBureau) {
		this.refIndicatifBureau = refIndicatifBureau;
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

	public Boolean getPpe() {
		return Ppe;
	}

	public void setPpe(Boolean ppe) {
		Ppe = ppe;
	}

	public Boolean getPersonUS() {
		return personUS;
	}

	public void setPersonUS(Boolean personUS) {
		this.personUS = personUS;
	}

	public SecteurActivite getRefSecteurActivite() {
		return refSecteurActivite;
	}

	public void setRefSecteurActivite(SecteurActivite refSecteurActivite) {
		this.refSecteurActivite = refSecteurActivite;
	}

	public Calendar getDateCreationLegale() {
		return dateCreationLegale;
	}

	public void setDateCreationLegale(Calendar dateCreationLegale) {
		this.dateCreationLegale = dateCreationLegale;
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

	public Boolean getEntite50RevenuPassive() {
		return entite50RevenuPassive;
	}

	public void setEntite50RevenuPassive(Boolean entite50RevenuPassive) {
		this.entite50RevenuPassive = entite50RevenuPassive;
	}

	public Boolean getEntiteUS() {
		return entiteUS;
	}

	public void setEntiteUS(Boolean entiteUS) {
		this.entiteUS = entiteUS;
	}

	public String getEnseigneCommerciale() {
		return enseigneCommerciale;
	}

	public void setEnseigneCommerciale(String enseigneCommerciale) {
		this.enseigneCommerciale = enseigneCommerciale;
	}

	public String getEntrepreneurIndividuel() {
		return entrepreneurIndividuel;
	}

	public void setEntrepreneurIndividuel(String entrepreneurIndividuel) {
		this.entrepreneurIndividuel = entrepreneurIndividuel;
	}

public String getCodeConvention() {
		return codeConvention;
	}

	public void setCodeConvention(String codeConvention) {
		this.codeConvention = codeConvention;
	}

	public String getLibelleConvention() {
		return libelleConvention;
	}

	public void setLibelleConvention(String libelleConvention) {
		this.libelleConvention = libelleConvention;
	}
	
}
