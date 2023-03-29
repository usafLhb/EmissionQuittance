package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class PrestataireService extends ParametrageBO implements IEntite {
   
	private long id;
	private Integer code;   
	private String nom;
	private String prenom;
	private String raisonSociale;
	private String adresse;
	private String telephone;
	private String email;
	private String numConvention;
	private Calendar dateDebut;
	private Calendar dateFin;
   
	private Specialite refSpecialite;
	private Honoraire refHonoraire;
	private TypeService refTypeService;
	private String numeroCIN ;
	
    public String getNumeroCIN() {
		return numeroCIN;
	}

	public void setNumeroCIN(String numeroCIN) {
		this.numeroCIN = numeroCIN;
	}

	public PrestataireService() {
    
   }
   
   /**
    * Access method for the id property.
    * 
    * @return   the current value of the id property
    */
   public long getId() 
   {
      return id;
   }
   
   /**
    * Sets the value of the id property.
    * 
    * @param aId the new value of the id property
    */
   public void setId(long aId) 
   {
      id = aId;
   }
   
   /**
    * Access method for the code property.
    * 
    * @return   the current value of the code property
    */
   public Integer getCode() 
   {
      return code;
   }
   
   /**
    * Sets the value of the code property.
    * 
    * @param aCode the new value of the code property
    */
   public void setCode(Integer aCode) 
   {
      code = aCode;
   }
   /**
    * Access method for the numConvention property.
    * 
    * @return   the current value of the numConvention property
    */
   public String getNumConvention() 
   {
      return numConvention;
   }
	
   /**
    * Sets the value of the numConvention property.
    * 
    * @param aNumConvention the new value of the numConvention property
    */
   public void setNumConvention (String aNumConvention) 
   {
      numConvention = aNumConvention;
   }
   
   /**
    * Access method for the nom property.
    * 
    * @return   the current value of the nom property
    */
   public String getNom() 
   {
      return nom;
   }
	
   /**
    * Sets the value of the nom property.
    * 
    * @param aNom the new value of the nom property
    */
   public void setNom (String aNom) 
   {
      nom = aNom;
   }
   /**
    * Access method for the prenom property.
    * 
    * @return   the current value of the prenom property
    */
   public String getPrenom() 
   {
      return prenom;
   }
	
   /**
    * Sets the value of the prenom property.
    * 
    * @param aPrenom the new value of the prenom property
    */
   public void setPrenom(String aPrenom) 
   {
      prenom = aPrenom;
   }
   /**
    * Access method for the adresse property.
    * 
    * @return   the current value of the adresse property
    */
   public String getAdresse() 
   {
      return adresse;
   }
	
   /**
    * Sets the value of the adresse property.
    * 
    * @param aAdresse the new value of the adresse property
    */
   public void setAdresse (String aAdresse) 
   {
      adresse = aAdresse;
   }
   /**
    * Access method for the telephone property.
    * 
    * @return   the current value of the telephone property
    */
   public String getTelephone() 
   {
      return telephone;
   }
	
   /**
    * Sets the value of the telephone property.
    * 
    * @param aTelephone the new value of the telephone property
    */
   public void setTelephone (String aTelephone) 
   {
      telephone = aTelephone;
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
   public void setEmail (String aEmail) 
   {
      email = aEmail;
   }
   
   
   
   /**
    * Access method for the dateDebut property.
    * 
    * @return   the current value of the dateDebut property
    */
   public Calendar getDateDebut() 
   {
      return dateDebut;
   }
   
   /**
    * Sets the value of the dateDebut property.
    * 
    * @param aDateDebut the new value of the dateDebut property
    */
   public void setDateDebut (Calendar aDateDebut) 
   {
      dateDebut = aDateDebut;
   }
   /**
    * Access method for the dateFin property.
    * 
    * @return   the current value of the dateFin property
    */
   public Calendar getDateFin() 
   {
      return dateFin;
   }
   
   /**
    * Sets the value of the dateFin property.
    * 
    * @param aDateFin the new value of the dateFin property
    */
   public void setDateFin(Calendar aDateFin) 
   {
      dateFin = aDateFin;
   }
   
   /* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public Specialite getRefSpecialite() {
		return refSpecialite;
	}

	public void setRefSpecialite(Specialite refSpecialite) {
		this.refSpecialite = refSpecialite;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public TypeService getRefTypeService() {
		return refTypeService;
	}

	public void setRefTypeService(TypeService refTypeService) {
		this.refTypeService = refTypeService;
	}

	public Honoraire getRefHonoraire() {
		return refHonoraire;
	}

	public void setRefHonoraire(Honoraire refHonoraire) {
		this.refHonoraire = refHonoraire;
	}

	}