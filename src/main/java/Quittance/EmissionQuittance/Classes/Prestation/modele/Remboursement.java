//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\tpr\\metier\\modele\\Remboursement.java

package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.utile.DateUtile;
import ma.co.omnidata.framework.utile.DoubleUtile;

import com.rmawatanya.convergence.application.prl.metier.modele.EcheancierPrelevement;
import com.rmawatanya.convergence.application.tpr.metier.valueobjects.TprRemboursementItem;
import com.rmawatanya.convergence.application.tpr.metier.valueobjects.TprRemboursementVO;
import com.rmawatanya.convergence.utile.common.Constantes;

public class Remboursement implements IEntite
{
   private long id;
   
   /**
    * s�quentiel par avance
    */
   private String numero;
   private Calendar dateRemboursement;
   private Double montant;
   private EcheancierPrelevement refEcheancierPrelevement;
   private Calendar datePrelevement;
   private String etatPrelevement;
   private Prestation refPrestation;
   private Boolean migre;
   private Calendar dateMigration;
   private String numLien;
   private Boolean sync2Centrale;
   private Boolean remboursementFinal;
   private String numeroRemise;

   //*** for migration
   private Calendar dateEtatMigration;
   
   public Calendar getDateMigration() {
	return dateMigration;
	}
	
	public void setDateMigration(Calendar dateMigration) {
		this.dateMigration = dateMigration;
	}
	
	public Boolean getMigre() {
		return migre;
	}
	
	public void setMigre(Boolean migre) {
		this.migre = migre;
	}

	public Remboursement() 
	 {
	    
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
    * Access method for the montant property.
    * 
    * @return   the current value of the montant property
    */
   public Double getMontant() 
   {
      return montant;
   }
   
   /**
    * Sets the value of the montant property.
    * 
    * @param aMontant the new value of the montant property
    */
   public void setMontant(Double aMontant) 
   {
      montant = aMontant;
   }
   
   /**
    * Access method for the refPrestation property.
    * 
    * @return   the current value of the refPrestation property
    */
   public Prestation getRefPrestation() 
   {
      return refPrestation;
   }
   
   /**
    * Sets the value of the refPrestation property.
    * 
    * @param aRefPrestation the new value of the refPrestation property
    */
   public void setRefPrestation(Prestation aRefPrestation) 
   {
      refPrestation = aRefPrestation;
   }
   
   public Calendar getDatePrelevement() {
	   return datePrelevement;
   }

   public void setDatePrelevement(Calendar datePrelevement) {
	   this.datePrelevement = datePrelevement;
   }

   public Calendar getDateRemboursement() {
	   return dateRemboursement;
   }

   public void setDateRemboursement(Calendar dateRemboursement) {
	   this.dateRemboursement = dateRemboursement;
   }

   public String getEtatPrelevement() {
	   return etatPrelevement;
   }

   public void setEtatPrelevement(String etatPrelevement) {
	   this.etatPrelevement = etatPrelevement;
   }
   
   public String getLibelleEtatPrelevement() {
		if (Constantes.TPR_ETAT_REMBOURSEMENT_ENATTENTE.equals(etatPrelevement)) {
			return "Remboursement " +Constantes.TPR_LIBELLE_REMBOURSEMENT_ENATTENTE;
		} 
		
		if (Constantes.TPR_ETAT_REMBOURSEMENT_REGLE.equals(etatPrelevement)) {
			return "Remboursement " +Constantes.TPR_LIBELLE_REMBOURSEMENT_REGLE;
		} 
		
		if (Constantes.TPR_ETAT_REMBOURSEMENT_BLOQUE.equals(etatPrelevement)) {
			return "Remboursement " +Constantes.TPR_LIBELLE_REMBOURSEMENT_BLOQUE;
		} 
		
		return "";
	}

	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public EcheancierPrelevement getRefEcheancierPrelevement() {
		return refEcheancierPrelevement;
	}

	public void setRefEcheancierPrelevement(
			EcheancierPrelevement refEcheancierPrelevement) {
		this.refEcheancierPrelevement = refEcheancierPrelevement;
	}

	public String getNumLien() {
		return numLien;
	}

	public void setNumLien(String numLien) {
		this.numLien = numLien;
	}   
	
	
	public TprRemboursementItem convertToRemboursementItem() {
		TprRemboursementItem tprRemboursementItem = new TprRemboursementItem();
		tprRemboursementItem.setId(String.valueOf(this.getId()));
		tprRemboursementItem.setNumeroRemboursement(this.getNumero());
		tprRemboursementItem.setNumeroRemise(this.getNumeroRemise());
		if (this.getRefPrestation() != null) {
			if(this.getRefPrestation().getNumeroSinistre() != null && this.getRefPrestation().getNumeroSinistre().length() == 17) {
				tprRemboursementItem.setNumeroAvance(this.getRefPrestation().getNumeroSinistre().substring(4));
			}
			if (this.getRefPrestation().getRefContrat() != null) {
				tprRemboursementItem.setNumeroContrat(this.getRefPrestation().getRefContrat().getNumero());
				tprRemboursementItem.setNumeroAdhesion(this.getRefPrestation().getRefContrat().getNumeroAdhesion());
			}
		}
		
		if (this.getDateRemboursement() != null) {
			tprRemboursementItem.setDateRemboursement(DateUtile.calendarToString(this.getDateRemboursement()));
		}else{
			tprRemboursementItem.setDateRemboursement("");
		}
		
		if (this.getMontant() != null) {
			tprRemboursementItem.setMontantRemboursement(DoubleUtile.convertDoubleToString(this.getMontant().doubleValue()));
		}else{
			tprRemboursementItem.setMontantRemboursement("");
		}

		if (this.getDatePrelevement() != null) {
			tprRemboursementItem.setDatePrelevement(DateUtile.calendarToString(this.getDatePrelevement()));
		}else{
			tprRemboursementItem.setDatePrelevement("");
		}
		
		tprRemboursementItem.setEtat(this.getLibelleEtatPrelevement());

		return tprRemboursementItem;
	}

	public Boolean getSync2Centrale() {
		return sync2Centrale;
	}

	public void setSync2Centrale(Boolean sync2Centrale) {
		this.sync2Centrale = sync2Centrale;
	}

	public Calendar getDateEtatMigration() {
		return dateEtatMigration;
	}

	public void setDateEtatMigration(Calendar dateEtatMigration) {
		this.dateEtatMigration = dateEtatMigration;
	}
	
	public TprRemboursementVO convertToVO() {
		TprRemboursementVO tprRemboursementVO = new TprRemboursementVO();
		
		tprRemboursementVO.setId(String.valueOf(this.getId()));
		tprRemboursementVO.setNumero(this.getNumero());
		tprRemboursementVO.setStatus(this.getLibelleEtatPrelevement());
		tprRemboursementVO.setNumeroRemise(this.getNumeroRemise());
		if (this.getRefPrestation() != null) {
			tprRemboursementVO.setIdAvance(String.valueOf(this.getRefPrestation().getId()));
			if (this.getRefPrestation().getNumeroSinistre() != null && this.getRefPrestation().getNumeroSinistre().length() == 17) {
				tprRemboursementVO.setNumeroSinistre1(this.getRefPrestation().getNumeroSinistre().substring(4,7));
				tprRemboursementVO.setNumeroSinistre2(this.getRefPrestation().getNumeroSinistre().substring(7,11));
				tprRemboursementVO.setNumeroSinistre3(this.getRefPrestation().getNumeroSinistre().substring(11,17));
			}					
			if (this.getRefPrestation().getRefContrat() != null && this.getRefPrestation().getRefContrat().getNumero() != null) {
				tprRemboursementVO.setContrat1(this.getRefPrestation().getRefContrat().getNumero().substring(0,5));
				tprRemboursementVO.setContrat2(this.getRefPrestation().getRefContrat().getNumero().substring(5,6));
				tprRemboursementVO.setContrat3(this.getRefPrestation().getRefContrat().getNumero().substring(6,12));
				tprRemboursementVO.setNumeroAdhesion(this.getRefPrestation().getRefContrat().getNumeroAdhesion());
			}
			
			if(this.getRefPrestation().getRefContrat() != null && this.getRefPrestation().getRefContrat().getNumeroCompteBancaire() != null
					&& this.getRefPrestation().getRefContrat().getNumeroCompteBancaire().length() == 24) {
				tprRemboursementVO.setCompte0(this.getRefPrestation().getRefContrat().getNumeroCompteBancaire().substring(0,3));
				tprRemboursementVO.setCompte1(this.getRefPrestation().getRefContrat().getNumeroCompteBancaire().substring(3,6));
				tprRemboursementVO.setCompte11(this.getRefPrestation().getRefContrat().getNumeroCompteBancaire().substring(6,10));
				tprRemboursementVO.setCompte2(this.getRefPrestation().getRefContrat().getNumeroCompteBancaire().substring(10,22));
				tprRemboursementVO.setCompte6(this.getRefPrestation().getRefContrat().getNumeroCompteBancaire().substring(22,24));
			}
			if(this.getRefPrestation().getRefContrat() != null && this.getRefPrestation().getRefContrat().getNumeroCompteAdherent() != null
					&& this.getRefPrestation().getRefContrat().getNumeroCompteAdherent().length() == 24) {
				tprRemboursementVO.setCompte1ADH(this.getRefPrestation().getRefContrat().getNumeroCompteAdherent().substring(0,3));
				tprRemboursementVO.setCompte2ADH(this.getRefPrestation().getRefContrat().getNumeroCompteAdherent().substring(3,6));
				tprRemboursementVO.setCompte3ADH(this.getRefPrestation().getRefContrat().getNumeroCompteAdherent().substring(6,10));
				tprRemboursementVO.setCompte4ADH(this.getRefPrestation().getRefContrat().getNumeroCompteAdherent().substring(10,22));
				tprRemboursementVO.setCompte8ADH(this.getRefPrestation().getRefContrat().getNumeroCompteAdherent().substring(22,24));
			}
			if(this.getRefPrestation().getRefContrat()!= null && this.getRefPrestation().getRefContrat().getTypeContrat()!= null && Constantes.TYPE_CONTRAT_ADHESION.equals(this.getRefPrestation().getRefContrat().getTypeContrat())){
				if(this.getRefPrestation().getRefContrat() != null && this.getRefPrestation().getRefContrat().getRefAdherent() != null) {
					
					String nomPrenom = "";
					if(this.getRefPrestation().getRefContrat().getRefAdherent().getNom() != null && !this.getRefPrestation().getRefContrat().getRefAdherent().getNom().trim().equals("")) {
					nomPrenom = nomPrenom + this.getRefPrestation().getRefContrat().getRefAdherent().getNom();
					}
					if(this.getRefPrestation().getRefContrat().getRefAdherent().getPrenom() != null && !this.getRefPrestation().getRefContrat().getRefAdherent().getPrenom().trim().equals("")) {
						nomPrenom = nomPrenom + " " + this.getRefPrestation().getRefContrat().getRefAdherent().getPrenom();
					}
					if(this.getRefPrestation().getRefContrat().getRefAdherent().getRaisonSociale() != null && !this.getRefPrestation().getRefContrat().getRefAdherent().getRaisonSociale().trim().equals("")){
						nomPrenom = this.getRefPrestation().getRefContrat().getRefAdherent().getRaisonSociale();
					}
				
					tprRemboursementVO.setNomPrenomAdherent(nomPrenom);
					String nomPrenomsouscripteur = "";
					if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getNom() != null && !this.getRefPrestation().getRefContrat().getRefSouscripteur().getNom().trim().equals("")) {
						nomPrenomsouscripteur = nomPrenomsouscripteur + this.getRefPrestation().getRefContrat().getRefSouscripteur().getNom();
					}
					if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getPrenom() != null && !this.getRefPrestation().getRefContrat().getRefSouscripteur().getPrenom().trim().equals("")) {
						nomPrenomsouscripteur = nomPrenomsouscripteur + " " + this.getRefPrestation().getRefContrat().getRefSouscripteur().getPrenom();
					}
					if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getRaisonSociale() != null && !this.getRefPrestation().getRefContrat().getRefSouscripteur().getRaisonSociale().trim().equals("")){
						nomPrenomsouscripteur = this.getRefPrestation().getRefContrat().getRefSouscripteur().getRaisonSociale();
					}
					tprRemboursementVO.setNomPrenomSouscripteur(nomPrenomsouscripteur);
					
					String cin = "";
					if(this.getRefPrestation().getRefContrat().getRefAdherent().getTypePieceIdentite() != null && !this.getRefPrestation().getRefContrat().getRefAdherent().getTypePieceIdentite().equals("")) {
						if(this.getRefPrestation().getRefContrat().getRefAdherent().getTypePieceIdentite().equals(Constantes.TYPE_PIECE_IDENTITE_CIN)) {
							cin = cin + Constantes.LIBELLE_PIECE_IDENTITE_CIN;
						}	
						if(this.getRefPrestation().getRefContrat().getRefAdherent().getTypePieceIdentite().equals(Constantes.TYPE_PIECE_IDENTITE_CS)) {
							cin = cin + Constantes.LIBELLE_PIECE_IDENTITE_CS;
						}
						if(this.getRefPrestation().getRefContrat().getRefAdherent().getTypePieceIdentite().equals(Constantes.TYPE_PIECE_IDENTITE_RC)) {
							cin = cin + Constantes.LIBELLE_PIECE_IDENTITE_RC;
						}
						if(this.getRefPrestation().getRefContrat().getRefAdherent().getTypePieceIdentite().equals(Constantes.TYPE_PIECE_IDENTITE_PASSEPORT)) {
							cin = cin + Constantes.LIBELLE_PIECE_IDENTITE_PASSEPORT;
						}
					}
				
					if(this.getRefPrestation().getRefContrat().getRefAdherent().getNumeroPieceIdentite() != null && !this.getRefPrestation().getRefContrat().getRefAdherent().getNumeroPieceIdentite().equals("")) {
						cin = cin + " " + this.getRefPrestation().getRefContrat().getRefAdherent().getNumeroPieceIdentite();
					}
				
					tprRemboursementVO.setPieceIdentiteSouscripteur(cin);
				
				
					if(this.getRefPrestation().getRefContrat().getRefAdherent().getDateNaissance() != null) {
						tprRemboursementVO.setDateNaissance(DateUtile.calendarToString(this.getRefPrestation().getRefContrat().getRefAdherent().getDateNaissance()));
					}
				
					if(this.getRefPrestation().getRefContrat().getRefAdherent().getNumero() != null) {
						tprRemboursementVO.setNumeroClient(this.getRefPrestation().getRefContrat().getRefAdherent().getNumero());
					}
				}
			}else{
				if(this.getRefPrestation().getRefContrat() != null && this.getRefPrestation().getRefContrat().getRefSouscripteur() != null) {
					
					String nomPrenom = "";
					if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getNom() != null && !this.getRefPrestation().getRefContrat().getRefSouscripteur().getNom().trim().equals("")) {
						nomPrenom = nomPrenom + this.getRefPrestation().getRefContrat().getRefSouscripteur().getNom();
					}
					if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getPrenom() != null && !this.getRefPrestation().getRefContrat().getRefSouscripteur().getPrenom().trim().equals("")) {
						nomPrenom = nomPrenom + " " + this.getRefPrestation().getRefContrat().getRefSouscripteur().getPrenom();
					}
					if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getRaisonSociale() != null && !this.getRefPrestation().getRefContrat().getRefSouscripteur().getRaisonSociale().trim().equals("")){
						nomPrenom = this.getRefPrestation().getRefContrat().getRefSouscripteur().getRaisonSociale();
					}
				
					tprRemboursementVO.setNomPrenomSouscripteur(nomPrenom);
			
					String cin = "";
					if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getTypePieceIdentite() != null && !this.getRefPrestation().getRefContrat().getRefSouscripteur().getTypePieceIdentite().equals("")) {
						if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getTypePieceIdentite().equals(Constantes.TYPE_PIECE_IDENTITE_CIN)) {
							cin = cin + Constantes.LIBELLE_PIECE_IDENTITE_CIN;
						}
						if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getTypePieceIdentite().equals(Constantes.TYPE_PIECE_IDENTITE_CS)) {
							cin = cin + Constantes.LIBELLE_PIECE_IDENTITE_CS;
						}
						if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getTypePieceIdentite().equals(Constantes.TYPE_PIECE_IDENTITE_RC)) {
							cin = cin + Constantes.LIBELLE_PIECE_IDENTITE_RC;
						}
						if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getTypePieceIdentite().equals(Constantes.TYPE_PIECE_IDENTITE_PASSEPORT)) {
							cin = cin + Constantes.LIBELLE_PIECE_IDENTITE_PASSEPORT;
						}
					}
				
					if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getNumeroPieceIdentite() != null && !this.getRefPrestation().getRefContrat().getRefSouscripteur().getNumeroPieceIdentite().equals("")) {
						cin = cin + " " + this.getRefPrestation().getRefContrat().getRefSouscripteur().getNumeroPieceIdentite();
					}
				
					tprRemboursementVO.setPieceIdentiteSouscripteur(cin);
				
				
					if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getDateNaissance() != null) {
						tprRemboursementVO.setDateNaissance(DateUtile.calendarToString(this.getRefPrestation().getRefContrat().getRefSouscripteur().getDateNaissance()));
					}
				
					if(this.getRefPrestation().getRefContrat().getRefSouscripteur().getNumero() != null) {
						tprRemboursementVO.setNumeroClient(this.getRefPrestation().getRefContrat().getRefSouscripteur().getNumero());
					}
				}
			}
		}
		if (this.getDateRemboursement() != null) {
			tprRemboursementVO.setDateRemboursement(DateUtile.calendarToString(this.getDateRemboursement()));
		} 
		if (this.getMontant() != null) {
			tprRemboursementVO.setMontantRemboursement(DoubleUtile.convertDoubleToString(this.getMontant().doubleValue()));
		}				
		return tprRemboursementVO;
	}

	public Boolean getRemboursementFinal() {
		return remboursementFinal;
	}

	public void setRemboursementFinal(Boolean remboursementFinal) {
		this.remboursementFinal = remboursementFinal;
	}
	
	public String getNumeroRemise() {
		return numeroRemise;
	}

	public void setNumeroRemise(String numeroRemise) {
		this.numeroRemise = numeroRemise;
	}

}
