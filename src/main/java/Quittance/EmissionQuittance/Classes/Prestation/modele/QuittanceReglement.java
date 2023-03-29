//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\tpr\\metier\\modele\\QuittanceReglement.java

package Quittance.EmissionQuittance.Classes.Prestation.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;
import ma.co.omnidata.framework.utile.DateUtile;

import com.rmawatanya.convergence.application.tpr.metier.valueobjects.TprQuittanceItem;
import com.rmawatanya.convergence.utile.common.Constantes;
import com.rmawatanya.convergence.utile.referentiel.MotifRejetReglement;
import com.rmawatanya.convergence.utile.referentiel.PrestataireService;
import com.rmawatanya.convergence.utile.referentiel.TypeQuittance;

public class QuittanceReglement implements IEntite
{
   private long id;
   private String numero;
   private Calendar dateEtablissement;
   private Double montant;
   
   /**
    * en attente de r�glement
    * r�gl�e
    * annul�e
    */
   private String etat;
   private Calendar dateEtat;

   private Calendar dateReglement;
   
   /**
    * virement ou ch�que
    */
   private String modeReglement;
   private String referenceCheque;
   private String motifAnnulation;
   
   /**
    * Date d�but de la rente
    */
   private Calendar dateDebutPeriode;
   
   /**
    * Date fin de la p�riode de rente
    */
   private Calendar dateFinPeriode;
   private String typeReglement;
   
   /**
    * souscripteur, adh�rent, assur�, b�n�ficiaire
    */
   private String typeDestinataire;
   private String codeDestinataire;
   private String nomEtPrenomsDestinataire;
   private String numeroCompteDestinataire;
   private Prestation refPrestation;
   private TypeQuittance refTypeQuittance;
   
   private Boolean edite;
   private Boolean migre;
   private Calendar dateMigration;
   private String numeroLien;
   
   private String adresseDestinataire;
   private Double montantBrut;
   private Double montantIgr;
   private Double montantAvance;
   private Double montantPenalite;
   private Double montantTvaSurPenalite;
   private Double montantInteretAvance;
   private Double montantTVASurInteretAvance;
   private Calendar dateComptabilisation;
   private Calendar datesyncCentrale;
   
   private MotifRejetReglement refMotifRejetReglement;
   private EnteteReglement refEnteteReglement;
   
   private PrestataireService refPrestataireService;
   private Double montantTaxeSolidarite;

   private String refReglement ;
   
   /**
    * Bloc Ajout� pour la migration conso
    * TODO : Mettre � jour les methodes ci-dessous
    */
   private Calendar dateEdition;
   private Calendar dateReception;
   
	private String numeroContrat;
	 private String numeroSinistre;
	 private String typeSinistre;
	 private Calendar dateDemande;
	 private Calendar dateSurvenance;

	 private Double montantQtc;
	 

	 private String typeQuittance;
   
	public PrestataireService getRefPrestataireService() {
	return refPrestataireService;
	}
	
	public void setRefPrestataireService(PrestataireService refPrestataireService) {
		this.refPrestataireService = refPrestataireService;
	}
	
		public String getNumeroLien() {
		return numeroLien;
	}
	
	public void setNumeroLien(String numeroLien) {
		this.numeroLien = numeroLien;
	}

	public String getCodeDestinataire() {
		return codeDestinataire;
	}

	public void setCodeDestinataire(String codeDestinataire) {
		this.codeDestinataire = codeDestinataire;
	}

	public Calendar getDateDebutPeriode() {
		return dateDebutPeriode;
	}

	public void setDateDebutPeriode(Calendar dateDebutPeriode) {
		this.dateDebutPeriode = dateDebutPeriode;
	}

	public String getLibelleDateEtablissement() {
		if (this.dateEtablissement == null) {
			return null;
		} else {
			try {
				return DateUtile.calendarToString(dateEtablissement);
			} catch (Exception e) {
				return null;
			}
		}
	}
	
	public Calendar getDateEtablissement() {
		return dateEtablissement;
	}

	public void setDateEtablissement(Calendar dateEtablissement) {
		this.dateEtablissement = dateEtablissement;
	}

	public Calendar getDateEtat() {
		return dateEtat;
	}

	public void setDateEtat(Calendar dateEtat) {
		this.dateEtat = dateEtat;
	}

	public Calendar getDateFinPeriode() {
		return dateFinPeriode;
	}

	public void setDateFinPeriode(Calendar dateFinPeriode) {
		this.dateFinPeriode = dateFinPeriode;
	}

	public Calendar getDateMigration() {
		return dateMigration;
	}

	public void setDateMigration(Calendar dateMigration) {
		this.dateMigration = dateMigration;
	}

	public Calendar getDateReglement() {
		return dateReglement;
	}

	public void setDateReglement(Calendar dateReglement) {
		this.dateReglement = dateReglement;
	}

	public Boolean getEdite() {
		return edite;
	}

	public void setEdite(Boolean edite) {
		this.edite = edite;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Boolean getMigre() {
		return migre;
	}

	public void setMigre(Boolean migre) {
		this.migre = migre;
	}

	public String getModeReglement() {
		return modeReglement;
	}

	public void setModeReglement(String modeReglement) {
		this.modeReglement = modeReglement;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public String getMotifAnnulation() {
		return motifAnnulation;
	}

	public void setMotifAnnulation(String motifAnnulation) {
		this.motifAnnulation = motifAnnulation;
	}

	public String getNomEtPrenomsDestinataire() {
		return nomEtPrenomsDestinataire;
	}

	public void setNomEtPrenomsDestinataire(String nomEtPrenomsDestinataire) {
		this.nomEtPrenomsDestinataire = nomEtPrenomsDestinataire;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumeroCompteDestinataire() {
		return numeroCompteDestinataire;
	}

	public void setNumeroCompteDestinataire(String numeroCompteDestinataire) {
		this.numeroCompteDestinataire = numeroCompteDestinataire;
	}

	public String getReferenceCheque() {
		return referenceCheque;
	}

	public void setReferenceCheque(String referenceCheque) {
		this.referenceCheque = referenceCheque;
	}

	public Prestation getRefPrestation() {
		return refPrestation;
	}

	public void setRefPrestation(Prestation refPrestation) {
		this.refPrestation = refPrestation;
	}

	public TypeQuittance getRefTypeQuittance() {
		return refTypeQuittance;
	}

	public void setRefTypeQuittance(TypeQuittance refTypeQuittance) {
		this.refTypeQuittance = refTypeQuittance;
	}

	public String getTypeDestinataire() {
		return typeDestinataire;
	}

	public void setTypeDestinataire(String typeDestinataire) {
		this.typeDestinataire = typeDestinataire;
	}

	public String getTypeReglement() {
		return typeReglement;
	}

	public void setTypeReglement(String typeReglement) {
		this.typeReglement = typeReglement;
	}   
	
	   
	   public String getLibelleEtat() {
		   if (Constantes.TPR_ETAT_QUITTANCE_CREE.equals(etat)) {
				return "Quittance " + Constantes.TPR_LIBELLE_QUITTANCE_CREE;
			} 
			if (Constantes.TPR_ETAT_QUITTANCE_ENATTENTE.equals(etat)) {
				return "Quittance " + Constantes.TPR_LIBELLE_QUITTANCE_ENATTENTE;
			} 
			
			if (Constantes.TPR_ETAT_QUITTANCE_REGLEE.equals(etat)) {
				return "Quittance " + Constantes.TPR_LIBELLE_QUITTANCE_REGLEE;
			}
			
			if (Constantes.TPR_ETAT_QUITTANCE_ANNULEE.equals(etat)) {
				return "Quittance " + Constantes.TPR_LIBELLE_QUITTANCE_ANNULEE;
			} 
			if (Constantes.TPR_ETAT_QUITTANCE_EDITEE.equals(etat)) {
				return "Quittance " + Constantes.TPR_LIBELLE_QUITTANCE_EDITEE;
			} 			
			if (Constantes.TPR_ETAT_QUITTANCE_RECUE.equals(etat)) {
				return "Quittance " + Constantes.TPR_LIBELLE_QUITTANCE_RECUE;
			} 
			return "";
		}
	   
	   public String getLibelleModeReglement() {
			if (Constantes.TPR_MODE_REGLEMENT_QUITTANCE_VIREMENT.equals(modeReglement)) {
				return Constantes.TPR_LIBELLE_MODE_REGLEMENT_QUITTANCE_VIREMENT;
			} 
			
			if (Constantes.TPR_MODE_REGLEMENT_QUITTANCE_CHEQUE.equals(modeReglement)) {
				return Constantes.TPR_LIBELLE_MODE_REGLEMENT_QUITTANCE_CHEQUE;
			} 
			
			if (Constantes.TPR_MODE_REGLEMENT_QUITTANCE_SANSSUPPORT.equals(modeReglement)) {
				return Constantes.TPR_LIBELLE_MODE_REGLEMENT_QUITTANCE_SANSSUPPORT;
			} 
			
			return "";
		}
	   
	   public String getLibelleTypeReglement() {
			if (Constantes.TPR_TYPE_REGLEMENT_QUITTANCE_SEPARE.equals(typeReglement)) {
				return Constantes.TPR_LIBELLE_TYPE_REGLEMENT_QUITTANCE_SEPARE;
			}
			
			if (Constantes.TPR_TYPE_REGLEMENT_QUITTANCE_REGROUPE.equals(typeReglement)) {
				return Constantes.TPR_LIBELLE_TYPE_REGLEMENT_QUITTANCE_REGROUPE;
			} 
			
			return "";
		}
	   
	   public String getLibelleTypeDestinataire() {
			if (Constantes.TPR_TYPE_DESTINATAIRE_QUITTANCE_BENEFICIAIRE.equals(typeDestinataire)) {
				return Constantes.TPR_LIBELLE_TYPE_DESTINATAIRE_QUITTANCE_BENEFICIAIRE;
			} 
			
			if (Constantes.TPR_TYPE_DESTINATAIRE_QUITTANCE_SOUSCRIPTEUR.equals(typeDestinataire)) {
				return Constantes.TPR_LIBELLE_TYPE_DESTINATAIRE_QUITTANCE_SOUSCRIPTEUR;
			} 
			
			if (Constantes.TPR_TYPE_DESTINATAIRE_QUITTANCE_ADHERENT.equals(typeDestinataire)) {
				return Constantes.TPR_LIBELLE_TYPE_DESTINATAIRE_QUITTANCE_ADHERENT;
			} 
			
			if (Constantes.TPR_TYPE_DESTINATAIRE_QUITTANCE_ASSURE.equals(typeDestinataire)) {
				return Constantes.TPR_LIBELLE_TYPE_DESTINATAIRE_QUITTANCE_ASSURE;
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
	
		
		public TprQuittanceItem convertToQuittanceItem(){
			TprQuittanceItem tprQuittanceItem = new TprQuittanceItem();
			tprQuittanceItem.setId(String.valueOf(this.getId()));
			
			if (this.getNumero() != null) {
				tprQuittanceItem.setNumeroQuittance(this.getNumero());
					
			}
			if (this.getRefTypeQuittance() != null) {
				tprQuittanceItem.setTypeQuittance(String.valueOf(this.getRefTypeQuittance().getLibelle()));
			}
			tprQuittanceItem.setEtat(this.getLibelleEtat());
			
			if (this.getRefPrestation() != null) {
				if (this.getRefPrestation().getNumeroSinistre() != null && this.getRefPrestation().getNumeroSinistre().length() == 17) {
					tprQuittanceItem.setNumeroSinistre(this.getRefPrestation().getNumeroSinistre().substring(4));
				}					
				if (this.getRefPrestation().getRefContrat() != null && this.getRefPrestation().getRefContrat().getNumero() != null) {
					tprQuittanceItem.setNumeroContrat(this.getRefPrestation().getRefContrat().getNumero());
				}		
				//Fadili
				if (this.getRefPrestation().getRefContrat() != null && this.getRefPrestation().getRefContrat().getNumeroAdhesion() != null) {
					tprQuittanceItem.setNumeroAdhesion(this.getRefPrestation().getRefContrat().getNumeroAdhesion());
				}
				//fin
			}
			
			return tprQuittanceItem;
		}

		public String getAdresseDestinataire() {
			return adresseDestinataire;
		}

		public void setAdresseDestinataire(String adresseDestinataire) {
			this.adresseDestinataire = adresseDestinataire;
		}

		public Double getMontantBrut() {
			return montantBrut;
		}

		public void setMontantBrut(Double montantBrut) {
			this.montantBrut = montantBrut;
		}

		public Double getMontantIgr() {
			return montantIgr;
		}

		public void setMontantIgr(Double montantIgr) {
			this.montantIgr = montantIgr;
		}

		public Double getMontantAvance() {
			return montantAvance;
		}

		public void setMontantAvance(Double montantAvance) {
			this.montantAvance = montantAvance;
		}

		public Double getMontantPenalite() {
			return montantPenalite;
		}

		public void setMontantPenalite(Double montantPenalite) {
			this.montantPenalite = montantPenalite;
		}

		public Double getMontantTvaSurPenalite() {
			return montantTvaSurPenalite;
		}

		public void setMontantTvaSurPenalite(Double montantTvaSurPenalite) {
			this.montantTvaSurPenalite = montantTvaSurPenalite;
		}

		public Double getMontantInteretAvance() {
			return montantInteretAvance;
		}

		public void setMontantInteretAvance(Double montantInteretAvance) {
			this.montantInteretAvance = montantInteretAvance;
		}

		public Double getMontantTVASurInteretAvance() {
			return montantTVASurInteretAvance;
		}

		public void setMontantTVASurInteretAvance(Double montantTVASurInteretAvance) {
			this.montantTVASurInteretAvance = montantTVASurInteretAvance;
		}

		public Calendar getDateComptabilisation() {
			return dateComptabilisation;
		}

		public void setDateComptabilisation(Calendar dateComptabilisation) {
			this.dateComptabilisation = dateComptabilisation;
		}

		public Calendar getDatesyncCentrale() {
			return datesyncCentrale;
		}

		public void setDatesyncCentrale(Calendar datesyncCentrale) {
			this.datesyncCentrale = datesyncCentrale;
		}

		public MotifRejetReglement getRefMotifRejetReglement() {
			return refMotifRejetReglement;
		}

		public void setRefMotifRejetReglement(MotifRejetReglement refMotifRejetReglement) {
			this.refMotifRejetReglement = refMotifRejetReglement;
		}

		public EnteteReglement getRefEnteteReglement() {
			return refEnteteReglement;
		}

		public void setRefEnteteReglement(EnteteReglement refEnteteReglement) {
			this.refEnteteReglement = refEnteteReglement;
		}
		

		public Double getMontantTaxeSolidarite() {
			return montantTaxeSolidarite;
		}

		public void setMontantTaxeSolidarite(Double montantTaxeSolidarite) {
			this.montantTaxeSolidarite = montantTaxeSolidarite;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime
					* result
					+ ((adresseDestinataire == null) ? 0 : adresseDestinataire
							.hashCode());
			result = prime
					* result
					+ ((codeDestinataire == null) ? 0 : codeDestinataire
							.hashCode());
			result = prime
					* result
					+ ((dateComptabilisation == null) ? 0
							: dateComptabilisation.hashCode());
			result = prime
					* result
					+ ((dateDebutPeriode == null) ? 0 : dateDebutPeriode
							.hashCode());
			result = prime
					* result
					+ ((dateEtablissement == null) ? 0 : dateEtablissement
							.hashCode());
			result = prime * result
					+ ((dateEtat == null) ? 0 : dateEtat.hashCode());
			result = prime
					* result
					+ ((dateFinPeriode == null) ? 0 : dateFinPeriode.hashCode());
			result = prime * result
					+ ((dateMigration == null) ? 0 : dateMigration.hashCode());
			result = prime * result
					+ ((dateReglement == null) ? 0 : dateReglement.hashCode());
			result = prime
					* result
					+ ((datesyncCentrale == null) ? 0 : datesyncCentrale
							.hashCode());
			result = prime * result + ((edite == null) ? 0 : edite.hashCode());
			result = prime * result + ((etat == null) ? 0 : etat.hashCode());
			result = prime * result + (int) (id ^ (id >>> 32));
			result = prime * result + ((migre == null) ? 0 : migre.hashCode());
			result = prime * result
					+ ((modeReglement == null) ? 0 : modeReglement.hashCode());
			result = prime * result
					+ ((montant == null) ? 0 : montant.hashCode());
			result = prime * result
					+ ((montantAvance == null) ? 0 : montantAvance.hashCode());
			result = prime * result
					+ ((montantBrut == null) ? 0 : montantBrut.hashCode());
			result = prime * result
					+ ((montantIgr == null) ? 0 : montantIgr.hashCode());
			result = prime
					* result
					+ ((montantInteretAvance == null) ? 0
							: montantInteretAvance.hashCode());
			result = prime
					* result
					+ ((montantPenalite == null) ? 0 : montantPenalite
							.hashCode());
			result = prime
					* result
					+ ((montantTVASurInteretAvance == null) ? 0
							: montantTVASurInteretAvance.hashCode());
			result = prime
					* result
					+ ((montantTvaSurPenalite == null) ? 0
							: montantTvaSurPenalite.hashCode());
			result = prime
					* result
					+ ((motifAnnulation == null) ? 0 : motifAnnulation
							.hashCode());
			result = prime
					* result
					+ ((nomEtPrenomsDestinataire == null) ? 0
							: nomEtPrenomsDestinataire.hashCode());
			result = prime * result
					+ ((numero == null) ? 0 : numero.hashCode());
			result = prime
					* result
					+ ((numeroCompteDestinataire == null) ? 0
							: numeroCompteDestinataire.hashCode());
			result = prime * result
					+ ((numeroLien == null) ? 0 : numeroLien.hashCode());
			result = prime
					* result
					+ ((refEnteteReglement == null) ? 0 : refEnteteReglement
							.hashCode());
			result = prime
					* result
					+ ((refMotifRejetReglement == null) ? 0
							: refMotifRejetReglement.hashCode());
			result = prime
					* result
					+ ((refPrestataireService == null) ? 0
							: refPrestataireService.hashCode());
			result = prime * result
					+ ((refPrestation == null) ? 0 : refPrestation.hashCode());
			result = prime
					* result
					+ ((refTypeQuittance == null) ? 0 : refTypeQuittance
							.hashCode());
			result = prime
					* result
					+ ((referenceCheque == null) ? 0 : referenceCheque
							.hashCode());
			result = prime
					* result
					+ ((typeDestinataire == null) ? 0 : typeDestinataire
							.hashCode());
			result = prime * result
					+ ((typeReglement == null) ? 0 : typeReglement.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final QuittanceReglement other = (QuittanceReglement) obj;
			if (adresseDestinataire == null) {
				if (other.adresseDestinataire != null)
					return false;
			} else if (!adresseDestinataire.equals(other.adresseDestinataire))
				return false;
			if (codeDestinataire == null) {
				if (other.codeDestinataire != null)
					return false;
			} else if (!codeDestinataire.equals(other.codeDestinataire))
				return false;
			if (dateComptabilisation == null) {
				if (other.dateComptabilisation != null)
					return false;
			} else if (!dateComptabilisation.equals(other.dateComptabilisation))
				return false;
			if (dateDebutPeriode == null) {
				if (other.dateDebutPeriode != null)
					return false;
			} else if (!dateDebutPeriode.equals(other.dateDebutPeriode))
				return false;
			if (dateEtablissement == null) {
				if (other.dateEtablissement != null)
					return false;
			} else if (!dateEtablissement.equals(other.dateEtablissement))
				return false;
			if (dateEtat == null) {
				if (other.dateEtat != null)
					return false;
			} else if (!dateEtat.equals(other.dateEtat))
				return false;
			if (dateFinPeriode == null) {
				if (other.dateFinPeriode != null)
					return false;
			} else if (!dateFinPeriode.equals(other.dateFinPeriode))
				return false;
			if (dateMigration == null) {
				if (other.dateMigration != null)
					return false;
			} else if (!dateMigration.equals(other.dateMigration))
				return false;
			if (dateReglement == null) {
				if (other.dateReglement != null)
					return false;
			} else if (!dateReglement.equals(other.dateReglement))
				return false;
			if (datesyncCentrale == null) {
				if (other.datesyncCentrale != null)
					return false;
			} else if (!datesyncCentrale.equals(other.datesyncCentrale))
				return false;
			if (edite == null) {
				if (other.edite != null)
					return false;
			} else if (!edite.equals(other.edite))
				return false;
			if (etat == null) {
				if (other.etat != null)
					return false;
			} else if (!etat.equals(other.etat))
				return false;
			if (id != other.id)
				return false;
			if (migre == null) {
				if (other.migre != null)
					return false;
			} else if (!migre.equals(other.migre))
				return false;
			if (modeReglement == null) {
				if (other.modeReglement != null)
					return false;
			} else if (!modeReglement.equals(other.modeReglement))
				return false;
			if (montant == null) {
				if (other.montant != null)
					return false;
			} else if (!montant.equals(other.montant))
				return false;
			if (montantAvance == null) {
				if (other.montantAvance != null)
					return false;
			} else if (!montantAvance.equals(other.montantAvance))
				return false;
			if (montantBrut == null) {
				if (other.montantBrut != null)
					return false;
			} else if (!montantBrut.equals(other.montantBrut))
				return false;
			if (montantIgr == null) {
				if (other.montantIgr != null)
					return false;
			} else if (!montantIgr.equals(other.montantIgr))
				return false;
			if (montantInteretAvance == null) {
				if (other.montantInteretAvance != null)
					return false;
			} else if (!montantInteretAvance.equals(other.montantInteretAvance))
				return false;
			if (montantPenalite == null) {
				if (other.montantPenalite != null)
					return false;
			} else if (!montantPenalite.equals(other.montantPenalite))
				return false;
			if (montantTVASurInteretAvance == null) {
				if (other.montantTVASurInteretAvance != null)
					return false;
			} else if (!montantTVASurInteretAvance
					.equals(other.montantTVASurInteretAvance))
				return false;
			if (montantTvaSurPenalite == null) {
				if (other.montantTvaSurPenalite != null)
					return false;
			} else if (!montantTvaSurPenalite
					.equals(other.montantTvaSurPenalite))
				return false;
			if (motifAnnulation == null) {
				if (other.motifAnnulation != null)
					return false;
			} else if (!motifAnnulation.equals(other.motifAnnulation))
				return false;
			if (nomEtPrenomsDestinataire == null) {
				if (other.nomEtPrenomsDestinataire != null)
					return false;
			} else if (!nomEtPrenomsDestinataire
					.equals(other.nomEtPrenomsDestinataire))
				return false;
			if (numero == null) {
				if (other.numero != null)
					return false;
			} else if (!numero.equals(other.numero))
				return false;
			if (numeroCompteDestinataire == null) {
				if (other.numeroCompteDestinataire != null)
					return false;
			} else if (!numeroCompteDestinataire
					.equals(other.numeroCompteDestinataire))
				return false;
			if (numeroLien == null) {
				if (other.numeroLien != null)
					return false;
			} else if (!numeroLien.equals(other.numeroLien))
				return false;
			if (refEnteteReglement == null) {
				if (other.refEnteteReglement != null)
					return false;
			} else if (!refEnteteReglement.equals(other.refEnteteReglement))
				return false;
			if (refMotifRejetReglement == null) {
				if (other.refMotifRejetReglement != null)
					return false;
			} else if (!refMotifRejetReglement
					.equals(other.refMotifRejetReglement))
				return false;
			if (refPrestataireService == null) {
				if (other.refPrestataireService != null)
					return false;
			} else if (!refPrestataireService
					.equals(other.refPrestataireService))
				return false;
			if (refPrestation == null) {
				if (other.refPrestation != null)
					return false;
			} else if (!refPrestation.equals(other.refPrestation))
				return false;
			if (refTypeQuittance == null) {
				if (other.refTypeQuittance != null)
					return false;
			} else if (!refTypeQuittance.equals(other.refTypeQuittance))
				return false;
			if (referenceCheque == null) {
				if (other.referenceCheque != null)
					return false;
			} else if (!referenceCheque.equals(other.referenceCheque))
				return false;
			if (typeDestinataire == null) {
				if (other.typeDestinataire != null)
					return false;
			} else if (!typeDestinataire.equals(other.typeDestinataire))
				return false;
			if (typeReglement == null) {
				if (other.typeReglement != null)
					return false;
			} else if (!typeReglement.equals(other.typeReglement))
				return false;
			return true;
		}

		public void setRefReglement(String refReglement) {
			this.refReglement = refReglement;
		}

		public String getRefReglement() {
			return refReglement;
		}
		
		public Calendar getDateEdition() {
			return dateEdition;
		}

		public void setDateEdition(Calendar dateEdition) {
			this.dateEdition = dateEdition;
		}

		public Calendar getDateReception() {
			return dateReception;
		}

		public void setDateReception(Calendar dateReception) {
			this.dateReception = dateReception;
		}

		public String getNumeroContrat() {
			return numeroContrat;
		}

		public void setNumeroContrat(String numeroContrat) {
			this.numeroContrat = numeroContrat;
		}

		public String getNumeroSinistre() {
			return numeroSinistre;
		}

		public void setNumeroSinistre(String numeroSinistre) {
			this.numeroSinistre = numeroSinistre;
		}

		public String getTypeSinistre() {
			return typeSinistre;
		}

		public void setTypeSinistre(String typeSinistre) {
			this.typeSinistre = typeSinistre;
		}

		public Calendar getDateDemande() {
			return dateDemande;
		}

		public void setDateDemande(Calendar dateDemande) {
			this.dateDemande = dateDemande;
		}

		public Calendar getDateSurvenance() {
			return dateSurvenance;
		}

		public void setDateSurvenance(Calendar dateSurvenance) {
			this.dateSurvenance = dateSurvenance;
		}

		public Double getMontantQtc() {
			return montantQtc;
		}

		public void setMontantQtc(Double montantQtc) {
			this.montantQtc = montantQtc;
		}

		public String getTypeQuittance() {
			return typeQuittance;
		}

		public void setTypeQuittance(String typeQuittance) {
			this.typeQuittance = typeQuittance;
		}
		
		
		
}
