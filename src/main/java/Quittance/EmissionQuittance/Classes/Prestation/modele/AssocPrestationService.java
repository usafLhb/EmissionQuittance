package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.utile.DateUtile;

import com.rmawatanya.convergence.utile.referentiel.Honoraire;
import com.rmawatanya.convergence.utile.referentiel.PrestataireService;
import com.rmawatanya.convergence.utile.referentiel.Service;

public class AssocPrestationService implements IEntite  {

	private long id;
	private Service refService;
	private PrestataireService refPrestataireService;
	private Honoraire refHonoraire;
	private Prestation refPrestation;
	private QuittanceReglement refQuittanceReglement;
	private Calendar dateCreation;
	
	public Calendar getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getDateCreationLibelle() {
		return DateUtile.calendarToString(dateCreation);
	}
	public Service getRefService() {
		return refService;
	}
	public void setRefService(Service refService) {
		this.refService = refService;
	}
	public PrestataireService getRefPrestataireService() {
		return refPrestataireService;
	}
	public void setRefPrestataireService(PrestataireService refPrestataireService) {
		this.refPrestataireService = refPrestataireService;
	}
	public Honoraire getRefHonoraire() {
		return refHonoraire;
	}
	public void setRefHonoraire(Honoraire refHonoraire) {
		this.refHonoraire = refHonoraire;
	}
	public Prestation getRefPrestation() {
		return refPrestation;
	}
	public void setRefPrestation(Prestation refPrestation) {
		this.refPrestation = refPrestation;
	}
	
	public QuittanceReglement getRefQuittanceReglement() {
		return refQuittanceReglement;
	}
	public void setRefQuittanceReglement(QuittanceReglement refQuittanceReglement) {
		this.refQuittanceReglement = refQuittanceReglement;
	}
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
