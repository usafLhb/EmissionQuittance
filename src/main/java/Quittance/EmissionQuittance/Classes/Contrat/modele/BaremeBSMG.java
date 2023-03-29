package Quittance.EmissionQuittance.Classes.Contrat.modele;



import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;



public class BaremeBSMG implements IEntite {
	private long id;
	private Integer franchise;
	private String categorie;
	private String typeBareme;	
	private Double borneInf;
	private Double borneSup;
	private Double prime;
	
	private Contrat refContrat;
	

	public long getId() {
		return id;
	}

	
	public void setId(long aId) {
		id = aId;
	}


	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public String getTypeBareme() {
		return typeBareme;
	}


	public void setTypeBareme(String typeBareme) {
		this.typeBareme = typeBareme;
	}




	public Double getPrime() {
		return prime;
	}


	public void setPrime(Double prime) {
		this.prime = prime;
	}


	public Contrat getRefContrat() {
		return refContrat;
	}


	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
	}


	public Integer getFranchise() {
		return franchise;
	}


	public void setFranchise(Integer franchise) {
		this.franchise = franchise;
	}


	public Double getBorneInf() {
		return borneInf;
	}


	public void setBorneInf(Double borneInf) {
		this.borneInf = borneInf;
	}


	public Double getBorneSup() {
		return borneSup;
	}


	public void setBorneSup(Double borneSup) {
		this.borneSup = borneSup;
	}

	
	







	
	
	

}
