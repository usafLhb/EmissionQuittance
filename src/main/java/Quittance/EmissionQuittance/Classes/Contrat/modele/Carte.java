package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.List;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.services.historique.HistoryItem;
import ma.co.omnidata.framework.services.historique.IHistorisable;
import ma.co.omnidata.framework.utile.DoubleUtile;

import com.rmawatanya.convergence.application.oct.metier.valueobjects.OctCarteVO;
import com.rmawatanya.convergence.application.prd.metier.modele.Option;

public class Carte implements IHistorisable ,IEntite 
{
   private long id;
   private String numero;
   private Option refOption;
   private Double prime;
   private Double surPrime;
   private Double montantTaxeParafiscale;
   private PartieDommages refPartieDommages;
   
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Option getRefOption() {
		return refOption;
	}
	public void setRefOption(Option refOption) {
		this.refOption = refOption;
	}

	public Double getPrime() {
		return prime;
	}

	public void setPrime(Double prime) {
		this.prime = prime;
	}

	public Double getSurPrime() {
		return surPrime;
	}

	public void setSurPrime(Double surPrime) {
		this.surPrime = surPrime;
	}

	public PartieDommages getRefPartieDommages() {
		return refPartieDommages;
	}

	public void setRefPartieDommages(PartieDommages refPartieDommages) {
		this.refPartieDommages = refPartieDommages;
	}
	   
	public Double getMontantTaxeParafiscale() {
		return montantTaxeParafiscale;
	}

	public void setMontantTaxeParafiscale(Double montantTaxeParafiscale) {
		this.montantTaxeParafiscale = montantTaxeParafiscale;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public OctCarteVO convertToVo() {
		OctCarteVO octCarteVO = new OctCarteVO();
		octCarteVO.setIdCarte(String.valueOf(this.id));
		octCarteVO.setNumeroCarte(this.numero);
		if(this.refOption != null) {
			octCarteVO.setOptionCarte(String.valueOf(this.refOption.getId()));
			octCarteVO.setLibelleOptionCarte(this.refOption.getLibelle());
		}
		if(this.prime != null) {
			octCarteVO.setPrimeCarte(DoubleUtile.convertDoubleToString(this.prime.doubleValue()));
		}
		if(this.surPrime != null) {
			octCarteVO.setSurPrimeCarte(DoubleUtile.convertDoubleToString(this.surPrime.doubleValue()));
		}
		return octCarteVO;
	}

	public boolean isToBeRemoved() {
		if(this.id != 0 && this.numero == null 
				&& this.refOption == null && this.prime == null 
				&& this.surPrime == null) {
			return true;
		}
		return false;
	}

	
	
	
	public List getHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoryItem getLastHistoryItem() {
		// TODO Auto-generated method stub
		return null;
	}

	public List getParents() {
		// TODO Auto-generated method stub
		return null;
	}

	public void historiser() {
		// TODO Auto-generated method stub
		
	}
public boolean isValideCardLength() {
	int n;                             
  
	if(this.numero == null){
		return false ;
	}                                         
	                                                       
	n = this.numero.length();                                    
	                                                       
	if (n < 13 || n > 19) {                                  
	    return false;  
	}else {
		return true;   
	}
}
public  boolean isValideCardNumber(){
		
		
		
		int n, i,  sum;                              
        boolean alternate;
		if(this.numero == null){
			return false ;
		}                                         
		                                                       
		n = this.numero.length();                                    
		                                                       
		if (n < 13 || n > 19)                                  
		    return false;                                          
		                                                       
		for (alternate = false, sum = 0, i = n - 1; i > -1; --i) { 
			
			try{
				int testint =(int)this.numero.charAt(i);
			}catch(Exception e){
				return false;
			}
		                                       
		                                                       
		    n = this.numero.charAt(i) - '0';                               
		                                                       
		    if (alternate) {                                   
		        n *= 2;                                        
		        if (n >   9)                                   
		            n =   (n)  % 10+ 1;                        
		    }                                                  
		    alternate = !alternate;                            
		                                                       
		    sum += n;                                          
		}                                                      
		                                                       
		return (sum % 10 == 0);                                

}
public static void main(String args[]) throws Exception {
	System.out.println("debut de teste........00");
	Carte carte =new Carte();
	carte.setNumero("");
	System.out.println(carte.isValideCardNumber());
}
}