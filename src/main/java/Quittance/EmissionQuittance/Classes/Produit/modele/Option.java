
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class Option extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;
   private String code;
   private String libelle;
   private String libelleAr;
   private Double valeurSortie;
   private String valeurEntreeMin1;
   private String valeurEntreeMax1;
   private String valeurEntreeMin2;
   private String valeurEntreeMax2;
   private String valeurEntreeMin3;
   private String valeurEntreeMax3;
   private String valeurEntreeMin4;
   private String valeurEntreeMax4;
   private String valeurEntreeMin5;
   private String valeurEntreeMax5;
   private String valeurEntreeMin6;
   private String valeurEntreeMax6;
   private String valeurEntreeMin7;
   private String valeurEntreeMax7;
   private Calendar dateDebut;
   private Calendar dateFin;
   private Bareme refBareme;   
   
   
   public Option() 
   {
    
   }
   
	public long getId() {
		return id;
	}

	public void setId(long aId) {
		id = aId;
	}

	public String getDescription() {
		return code + " - " + libelle;
	}
   
   /**
    * Access method for the code property.
    * 
    * @return   the current value of the code property
    */
   public String getCode() 
   {
      return code;
   }
   
   /**
    * Sets the value of the code property.
    * 
    * @param aCode the new value of the code property
    */
   public void setCode(String aCode) 
   {
      code = aCode;
   }
   
   /**
    * Access method for the valeurSortie property.
    * 
    * @return   the current value of the valeurSortie property
    */
   public Double getValeurSortie() 
   {
      return valeurSortie;
   }
   
   /**
    * Sets the value of the valeurSortie property.
    * 
    * @param aValeurSortie the new value of the valeurSortie property
    */
   public void setValeurSortie(Double aValeurSortie) 
   {
      valeurSortie = aValeurSortie;
   }
   
   /**
    * Access method for the valeurEntreeMin1 property.
    * 
    * @return   the current value of the valeurEntreeMin1 property
    */
   public String getValeurEntreeMin1() 
   {
      return valeurEntreeMin1;
   }
   
   /**
    * Sets the value of the valeurEntreeMin1 property.
    * 
    * @param aValeurEntreeMin1 the new value of the valeurEntreeMin1 property
    */
   public void setValeurEntreeMin1(String aValeurEntreeMin1) 
   {
      valeurEntreeMin1 = aValeurEntreeMin1;
   }
   
   /**
    * Access method for the valeurEntreeMax1 property.
    * 
    * @return   the current value of the valeurEntreeMax1 property
    */
   public String getValeurEntreeMax1() 
   {
      return valeurEntreeMax1;
   }
   
   /**
    * Sets the value of the valeurEntreeMax1 property.
    * 
    * @param aValeurEntreeMax1 the new value of the valeurEntreeMax1 property
    */
   public void setValeurEntreeMax1(String aValeurEntreeMax1) 
   {
      valeurEntreeMax1 = aValeurEntreeMax1;
   }
   
   /**
    * Access method for the valeurEntreeMin2 property.
    * 
    * @return   the current value of the valeurEntreeMin2 property
    */
   public String getValeurEntreeMin2() 
   {
      return valeurEntreeMin2;
   }
   
   /**
    * Sets the value of the valeurEntreeMin2 property.
    * 
    * @param aValeurEntreeMin2 the new value of the valeurEntreeMin2 property
    */
   public void setValeurEntreeMin2(String aValeurEntreeMin2) 
   {
      valeurEntreeMin2 = aValeurEntreeMin2;
   }
   
   /**
    * Access method for the valeurEntreeMax2 property.
    * 
    * @return   the current value of the valeurEntreeMax2 property
    */
   public String getValeurEntreeMax2() 
   {
      return valeurEntreeMax2;
   }
   
   /**
    * Sets the value of the valeurEntreeMax2 property.
    * 
    * @param aValeurEntreeMax2 the new value of the valeurEntreeMax2 property
    */
   public void setValeurEntreeMax2(String aValeurEntreeMax2) 
   {
      valeurEntreeMax2 = aValeurEntreeMax2;
   }
   
   /**
    * Access method for the valeurEntreeMin3 property.
    * 
    * @return   the current value of the valeurEntreeMin3 property
    */
   public String getValeurEntreeMin3() 
   {
      return valeurEntreeMin3;
   }
   
   /**
    * Sets the value of the valeurEntreeMin3 property.
    * 
    * @param aValeurEntreeMin3 the new value of the valeurEntreeMin3 property
    */
   public void setValeurEntreeMin3(String aValeurEntreeMin3) 
   {
      valeurEntreeMin3 = aValeurEntreeMin3;
   }
   
   /**
    * Access method for the valeurEntreeMax3 property.
    * 
    * @return   the current value of the valeurEntreeMax3 property
    */
   public String getValeurEntreeMax3() 
   {
      return valeurEntreeMax3;
   }
   
   /**
    * Sets the value of the valeurEntreeMax3 property.
    * 
    * @param aValeurEntreeMax3 the new value of the valeurEntreeMax3 property
    */
   public void setValeurEntreeMax3(String aValeurEntreeMax3) 
   {
      valeurEntreeMax3 = aValeurEntreeMax3;
   }
   
   /**
    * Access method for the valeurEntreeMin4 property.
    * 
    * @return   the current value of the valeurEntreeMin4 property
    */
   public String getValeurEntreeMin4() 
   {
      return valeurEntreeMin4;
   }
   
   /**
    * Sets the value of the valeurEntreeMin4 property.
    * 
    * @param aValeurEntreeMin4 the new value of the valeurEntreeMin4 property
    */
   public void setValeurEntreeMin4(String aValeurEntreeMin4) 
   {
      valeurEntreeMin4 = aValeurEntreeMin4;
   }
   
   /**
    * Access method for the valeurEntreeMax4 property.
    * 
    * @return   the current value of the valeurEntreeMax4 property
    */
   public String getValeurEntreeMax4() 
   {
      return valeurEntreeMax4;
   }
   
   /**
    * Sets the value of the valeurEntreeMax4 property.
    * 
    * @param aValeurEntreeMax4 the new value of the valeurEntreeMax4 property
    */
   public void setValeurEntreeMax4(String aValeurEntreeMax4) 
   {
      valeurEntreeMax4 = aValeurEntreeMax4;
   }
   
   /**
    * Access method for the valeurEntreeMin5 property.
    * 
    * @return   the current value of the valeurEntreeMin5 property
    */
   public String getValeurEntreeMin5() 
   {
      return valeurEntreeMin5;
   }
   
   /**
    * Sets the value of the valeurEntreeMin5 property.
    * 
    * @param aValeurEntreeMin5 the new value of the valeurEntreeMin5 property
    */
   public void setValeurEntreeMin5(String aValeurEntreeMin5) 
   {
      valeurEntreeMin5 = aValeurEntreeMin5;
   }
   
   /**
    * Access method for the valeurEntreeMax5 property.
    * 
    * @return   the current value of the valeurEntreeMax5 property
    */
   public String getValeurEntreeMax5() 
   {
      return valeurEntreeMax5;
   }
   
   /**
    * Sets the value of the valeurEntreeMax5 property.
    * 
    * @param aValeurEntreeMax5 the new value of the valeurEntreeMax5 property
    */
   public void setValeurEntreeMax5(String aValeurEntreeMax5) 
   {
      valeurEntreeMax5 = aValeurEntreeMax5;
   }
   
   /**
    * Access method for the valeurEntreeMin6 property.
    * 
    * @return   the current value of the valeurEntreeMin6 property
    */
   public String getValeurEntreeMin6() 
   {
      return valeurEntreeMin6;
   }
   
   /**
    * Sets the value of the valeurEntreeMin6 property.
    * 
    * @param aValeurEntreeMin6 the new value of the valeurEntreeMin6 property
    */
   public void setValeurEntreeMin6(String aValeurEntreeMin6) 
   {
      valeurEntreeMin6 = aValeurEntreeMin6;
   }
   
   /**
    * Access method for the valeurEntreeMax6 property.
    * 
    * @return   the current value of the valeurEntreeMax6 property
    */
   public String getValeurEntreeMax6() 
   {
      return valeurEntreeMax6;
   }
   
   /**
    * Sets the value of the valeurEntreeMax6 property.
    * 
    * @param aValeurEntreeMax6 the new value of the valeurEntreeMax6 property
    */
   public void setValeurEntreeMax6(String aValeurEntreeMax6) 
   {
      valeurEntreeMax6 = aValeurEntreeMax6;
   }
   
   /**
    * Access method for the valeurEntreeMin7 property.
    * 
    * @return   the current value of the valeurEntreeMin7 property
    */
   public String getValeurEntreeMin7() 
   {
      return valeurEntreeMin7;
   }
   
   /**
    * Sets the value of the valeurEntreeMin7 property.
    * 
    * @param aValeurEntreeMin7 the new value of the valeurEntreeMin7 property
    */
   public void setValeurEntreeMin7(String aValeurEntreeMin7) 
   {
      valeurEntreeMin7 = aValeurEntreeMin7;
   }
   
   /**
    * Access method for the valeurEntreeMax7 property.
    * 
    * @return   the current value of the valeurEntreeMax7 property
    */
   public String getValeurEntreeMax7() 
   {
      return valeurEntreeMax7;
   }
   
   /**
    * Sets the value of the valeurEntreeMax7 property.
    * 
    * @param aValeurEntreeMax7 the new value of the valeurEntreeMax7 property
    */
   public void setValeurEntreeMax7(String aValeurEntreeMax7) 
   {
      valeurEntreeMax7 = aValeurEntreeMax7;
   }
   
	/**
	 * @return Returns the refBareme.
	 */
	public Bareme getRefBareme() {
		return refBareme;
	}
	
	/**
	 * @param refBareme The refBareme to set.
	 */
	public void setRefBareme(Bareme refBareme) {
		this.refBareme = refBareme;
	}
	
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}	
	
	public boolean equals(Object o) {
		if(!(o instanceof Option)){ 
			return false;
		}
    	Option option = (Option)o;	
		if((option.getLibelle() != null)
			&& (option.getLibelle().equals(this.libelle)) 
			) {
				return true;
			}		
		return false;								
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
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
	
	public String getLibelleAr() {
		return libelleAr;
	}

	public void setLibelleAr(String libelleAr) {
		this.libelleAr = libelleAr;
	}
	
	
}
