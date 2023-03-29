


package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.services.historique.HistoryItem;
import ma.co.omnidata.framework.services.historique.IHistorisable;

import com.rmawatanya.convergence.utile.common.Constantes;
import com.rmawatanya.convergence.utile.organisation.Entite;
import com.rmawatanya.convergence.utile.referentiel.ActiviteBmce;
import com.rmawatanya.convergence.utile.referentiel.FormeJuridique;
import com.rmawatanya.convergence.utile.referentiel.GammeClient;
import com.rmawatanya.convergence.utile.referentiel.Pays;
import com.rmawatanya.convergence.utile.referentiel.SegmentClientele;
import com.rmawatanya.convergence.utile.referentiel.SousMarche;
import com.rmawatanya.convergence.utile.referentiel.TitreCivilite;
import com.rmawatanya.convergence.utile.referentiel.TypeClient;
import com.rmawatanya.convergence.utile.referentiel.Ville;

public class Client implements IHistorisable ,IEntite
{
	
	
	
	


	 
	//private String dateTermeAssure;
	//private String dateEffetAssure;
   private long id;	
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
//   private Collection refContrats = new ArrayList();
   
	//ConventionPrevoyance
	private String codeConvention;
	private String libelleConvention;
   
   
   /***  lien du client avec PartiePrevoyances*/
//   private Collection<PartiePrevoyanceClient> listPartiesPrevoyanceClient = new ArrayList<PartiePrevoyanceClient>();
   
  

private String residence;
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
   private Integer ordreEnfants;
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
   
   private int lastNumVersion; // pour besoin d'historisation 
   
   private Boolean enInstance;
   private Boolean rappatrie; 
   private String referenceExterne;
   private String referenceExterneAMC;
   private String numeroICE;
   
   //PROTECTION FAMILLE
	private String preferenceManuelle;

 //FATCA
   private ClientInfosComplementaires refInfosComplementaires;
   private Collection refActionnaires;
   
	public Client() 
   {
    
   }

   public Client(String nom, String prenom) {
	this.nom=nom;
	this.prenom=prenom;
}

public boolean equals(Object o) {
	   if(o == null) {
		   return false;
	   }

	   Client c = (Client) o;
	   if(c.getId() != this.id) {
		   return false;
	   }

	   return true;
   }

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
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
	
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
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

	public int getLastNumVersion() {
		return lastNumVersion;
	}

	public void setLastNumVersion(int lastNumVersion) {
		this.lastNumVersion = lastNumVersion;
	}

	public void historiser() {		
	}

	public List getHistory() {
		return null;
	}

	public HistoryItem getLastHistoryItem() {
		return null;
	}

	public List getParents() {
		return null;
	}

	public Boolean getEnInstance() {
		return enInstance;
	}

	public void setEnInstance(Boolean enInstance) {
		this.enInstance = enInstance;
	}

	public Boolean getRappatrie() {
		return rappatrie;
	}

	public void setRappatrie(Boolean rappatrie) {
		this.rappatrie = rappatrie;
	}

//	public Collection getRefContrats() {
//		return refContrats;
//	}
//
//	public void setRefContrats(Collection refContrats) {
//		this.refContrats = refContrats;
//	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
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

	public Integer getOrdreEnfants() {
		return ordreEnfants;
	}

	public void setOrdreEnfants(Integer ordreEnfants) {
		this.ordreEnfants = ordreEnfants;
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

	public ActiviteBmce getRefActivite() {
		return refActivite;
	}

	public void setRefActivite(ActiviteBmce refActivite) {
		this.refActivite = refActivite;
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

        public ClientInfosComplementaires getRefInfosComplementaires() {
		return refInfosComplementaires;
	}

	public void setRefInfosComplementaires(ClientInfosComplementaires infosComplementaires) {
		this.refInfosComplementaires = infosComplementaires;
	}

	public Collection getRefActionnaires() {
		return refActionnaires;
	}

	public void setRefActionnaires(Collection actionnaires) {
		this.refActionnaires = actionnaires;
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
