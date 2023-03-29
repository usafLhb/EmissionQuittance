package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.utile.DateUtile;

import com.rmawatanya.convergence.application.tpr.metier.valueobjects.TprPieceJustificativeVO;
import com.rmawatanya.convergence.utile.referentiel.AttestationSinistre;

public class PrestationAttestationSinistre implements IEntite
{
   private long id;
   private Prestation refPrestation;
   private DeclarationSinistre refDeclarationSinistre; 
   private AttestationSinistre refAttestationSinistre;
   private Integer nombrePages;
   private String reference;
   private Calendar dateEtablissement;
   private Calendar dateEnvoi;
   private Calendar dateReception;
   
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public AttestationSinistre getRefAttestationSinistre() {
		return refAttestationSinistre;
	}

	public void setRefAttestationSinistre(
			AttestationSinistre refAttestationSinistre) {
		this.refAttestationSinistre = refAttestationSinistre;
	}

	public Prestation getRefPrestation() {
		return refPrestation;
	}

	public void setRefPrestation(Prestation refPrestation) {
		this.refPrestation = refPrestation;
	}
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Calendar getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(Calendar dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

	public Calendar getDateEtablissement() {
		return dateEtablissement;
	}

	public void setDateEtablissement(Calendar dateEtablissement) {
		this.dateEtablissement = dateEtablissement;
	}

	public Calendar getDateReception() {
		return dateReception;
	}

	public void setDateReception(Calendar dateReception) {
		this.dateReception = dateReception;
	}

	public Integer getNombrePages() {
		return nombrePages;
	}

	public void setNombrePages(Integer nombrePages) {
		this.nombrePages = nombrePages;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	

	public DeclarationSinistre getRefDeclarationSinistre() {
		return refDeclarationSinistre;
	}

	public void setRefDeclarationSinistre(DeclarationSinistre refDeclarationSinistre) {
		this.refDeclarationSinistre = refDeclarationSinistre;
	}

	public TprPieceJustificativeVO convertToVo(){
		TprPieceJustificativeVO vo = new TprPieceJustificativeVO();
		vo.setIdPieceJustificative(String.valueOf(this.id));
		if(this.refAttestationSinistre != null) {
			vo.setNaturePiece(String.valueOf(this.refAttestationSinistre.getId()));
			vo.setLibelleNaturePiece(this.refAttestationSinistre.getLibelle());
		}
		if(this.nombrePages != null) {
			vo.setNombrePages(String.valueOf(this.nombrePages));
		}
		vo.setReference(this.reference);
		vo.setDateEnvoi(DateUtile.calendarToString(this.dateEnvoi));
		vo.setDateEtablissement(DateUtile.calendarToString(this.dateEtablissement));
		vo.setDateReception(DateUtile.calendarToString(this.dateReception));
		return vo;
	}
	
	public boolean isToBeRemoved() {
		if(this.id == 0 && this.refAttestationSinistre == null 
				&& this.nombrePages == null && this.reference == null 
				&& this.dateEnvoi == null && this.dateEtablissement == null) {
			return true;
		}
		return false;
	}
	
}
