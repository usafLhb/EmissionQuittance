package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.utile.DateUtile;

import com.rmawatanya.convergence.application.tpr.metier.valueobjects.TprDetailPrestationParSupportVO;
import com.rmawatanya.convergence.utile.referentiel.Support;

public class DetailPrestationParSupport implements IEntite {

	private long id;
	private Prestation refPrestation;
	private Support refSupport;
	private Calendar dateDemande;
	private Double pourcentage;
	private Double montant;
	private Double nombrePart;
	private Double vlDateDemande;
	private Calendar dateExecution;
	private Double vlDateExecution;
	private Double montantRachat;
	private Double plusvalus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Prestation getRefPrestation() {
		return refPrestation;
	}

	public void setRefPrestation(Prestation refPrestation) {
		this.refPrestation = refPrestation;
	}

	public Support getRefSupport() {
		return refSupport;
	}

	public void setRefSupport(Support refSupport) {
		this.refSupport = refSupport;
	}

	public Calendar getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Calendar dateDemande) {
		this.dateDemande = dateDemande;
	}

	public Double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Double getNombrePart() {
		return nombrePart;
	}

	public void setNombrePart(Double nombrePart) {
		this.nombrePart = nombrePart;
	}

	public Double getVlDateDemande() {
		return vlDateDemande;
	}

	public void setVlDateDemande(Double vlDateDemande) {
		this.vlDateDemande = vlDateDemande;
	}

	public Calendar getDateExecution() {
		return dateExecution;
	}

	public void setDateExecution(Calendar dateExecution) {
		this.dateExecution = dateExecution;
	}

	public Double getVlDateExecution() {
		return vlDateExecution;
	}

	public void setVlDateExecution(Double vlDateExecution) {
		this.vlDateExecution = vlDateExecution;
	}

	public Double getMontantRachat() {
		return montantRachat;
	}

	public void setMontantRachat(Double montantRachat) {
		this.montantRachat = montantRachat;
	}

	public Double getPlusvalus() {
		return plusvalus;
	}

	public void setPlusvalus(Double plusvalus) {
		this.plusvalus = plusvalus;
	}

	public TprDetailPrestationParSupportVO convertToVo() {
		TprDetailPrestationParSupportVO tprDetailPrestationParSupportVO = new TprDetailPrestationParSupportVO();
		tprDetailPrestationParSupportVO.setId(this.id);
		if(this.getRefPrestation()!= null){
			tprDetailPrestationParSupportVO.setIdPrestation(Long.toString(this.getRefPrestation().getId()));
		}
		if(this.getRefSupport()!= null){
			tprDetailPrestationParSupportVO.setIdSupport(Long.toString(this.getRefSupport().getId()));
			tprDetailPrestationParSupportVO.setLibelleSupport(this.getRefSupport().getLibelle());

		}
		if(this.getNombrePart()!= null){
		 tprDetailPrestationParSupportVO.setNombrePart(Double.toString(this.getNombrePart().doubleValue()));
		}
		if(this.getPourcentage()!= null){
		 tprDetailPrestationParSupportVO.setPourcentage(Double.toString(this.getPourcentage().doubleValue()));
		}
		if(this.getMontant()!= null){
		 tprDetailPrestationParSupportVO.setMontant(Double.toString(this.getMontant().doubleValue()));
		}
		if(this.getDateDemande()!= null){
			 tprDetailPrestationParSupportVO.setDateDemande(DateUtile.calendarToString(this.getDateDemande()));
		}
		if(this.getDateExecution()!= null){
			 tprDetailPrestationParSupportVO.setDateExecution(DateUtile.calendarToString(this.getDateExecution()));
		}
		if(this.getVlDateDemande()!= null){
			 tprDetailPrestationParSupportVO.setVlDateDemande(Double.toString(this.getVlDateDemande().doubleValue()));
		}
		if(this.getVlDateExecution()!= null){
			 tprDetailPrestationParSupportVO.setVlDateExecution(Double.toString(this.getVlDateExecution().doubleValue()));
		}
		if(this.getMontantRachat()!= null){
			 tprDetailPrestationParSupportVO.setMontantRachat(Double.toString(this.getMontantRachat().doubleValue()));
		}
		if(this.getPlusvalus()!= null){
			 tprDetailPrestationParSupportVO.setPlusvalus(Double.toString(this.getPlusvalus().doubleValue()));
		}
		return tprDetailPrestationParSupportVO;
	}

	public boolean isToBeRemoved() {
		if (this.pourcentage == null || this.refSupport == null
				|| this.montant == null) {
			return true;
		}
		return false;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
}
