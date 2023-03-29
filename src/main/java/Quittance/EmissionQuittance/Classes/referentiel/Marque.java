//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\referentiel\\MotifRejetPrelevement.java

package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;


public class Marque extends ParametrageBO implements IEntite {
   private long id;
   private Integer visible;
   private String libelle;
   
   public Marque() 
   {
    
   }
   
 
   public long getId() 
   {
      return id;
   }
   
  
   public void setId(long aId) 
   {
      id = aId;
   }
   
 
   public String getLibelle() 
   {
      return libelle;
   }
	
   public void setLibelle(String aLibelle) 
   {
      libelle = aLibelle;
   }
   

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}


	public Integer getVisible() {
		return visible;
	}


	public void setVisible(Integer visible) {
		this.visible = visible;
	}


	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}   
}
