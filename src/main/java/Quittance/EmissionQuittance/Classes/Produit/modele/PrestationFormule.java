package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;
import java.util.List;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.habilitations.Utilisateur;
import com.rmawatanya.convergence.utile.referentiel.TypePrestationDommage;

public class PrestationFormule extends ParametrageBO implements IEntite {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private GarantieFormule refGarantieFormule;
	private TypePrestationDommage refPrestation;			
	// TODO  a definir la partie capital et franchise
	private String commentaireCapital;
	private String commentaireFranchise;
	
	private String typeCouverture;
	private String typeBareme;
	
	private Integer ordre;
	private String typeCapital;
//	private String typeValeurControle;
//	private Double pourcentage;
	private Double capitalMin;
	private Double capitalMax;
	private Double primeMinimale;
	private Double tauxFranchise;
	private Double franchiseMin;
	private Boolean capitalModifiable;
	private Boolean editerCP;
	private Integer optionGarantieRC;
	
	private Double minValeurContenu;
	private Double maxValeurContenu;	
	private Double minValeurBatiment;
	private Double maxValeurBatiment;	
	
//	private Double minMontantFranchise;	
	private Double capitalForfaitaire;
//	private Double primeSansCapital;
	
	private Boolean tauxModifiable;
	private Boolean controleCapitalMin;
	private Boolean controleCapitalMax;
	
//	private String idPrestationFormule;
//	private String idTypeCapital;
//	private String tauxExpression;
	
	private List refPourcentagesExpression;
	private Calendar dateAjout;
	private Calendar dateDerniereModification;
	private Utilisateur refUtilisateurAjout;
	private Utilisateur refUtilisateurModification;
	
	private String libelleCapital;
	private String libelleFranchise;
	private String libelleCapital_Ar;
	private String libelleFranchise_Ar;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public GarantieFormule getRefGarantieFormule() {
		return refGarantieFormule;
	}
	public void setRefGarantieFormule(GarantieFormule refGarantieFormule) {
		this.refGarantieFormule = refGarantieFormule;
	}
	public TypePrestationDommage getRefPrestation() {
		return refPrestation;
	}
	public void setRefPrestation(TypePrestationDommage refPrestation) {
		this.refPrestation = refPrestation;
	}
	
	/**
	 * @return the commentaireCapital
	 */
	public String getCommentaireCapital() {
		return commentaireCapital;
	}
	/**
	 * @param commentaireCapital the commentaireCapital to set
	 */
	public void setCommentaireCapital(String commentaireCapital) {
		this.commentaireCapital = commentaireCapital;
	}
	/**
	 * @return the commentaireFranchise
	 */
	public String getCommentaireFranchise() {
		return commentaireFranchise;
	}
	/**
	 * @param commentaireFranchise the commentaireFranchise to set
	 */
	public void setCommentaireFranchise(String commentaireFranchise) {
		this.commentaireFranchise = commentaireFranchise;
	}
	@Override
	public String getDescription() {
		return refPrestation.getLibelle();
	}
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	public Integer getOrdre() {
		return ordre;
	}
	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}
	public String getTypeCapital() {
		return typeCapital;
	}
	public void setTypeCapital(String typeCapital) {
		this.typeCapital = typeCapital;
	}
	
	public Double getCapitalMin() {
		return capitalMin;
	}
	public void setCapitalMin(Double capitalMin) {
		this.capitalMin = capitalMin;
	}
	public Double getCapitalMax() {
		return capitalMax;
	}
	public void setCapitalMax(Double capitalMax) {
		this.capitalMax = capitalMax;
	}
	
	public Double getPrimeMinimale() {
		return primeMinimale;
	}
	public void setPrimeMinimale(Double primeMinimale) {
		this.primeMinimale = primeMinimale;
	}
	public Double getTauxFranchise() {
		return tauxFranchise;
	}
	public void setTauxFranchise(Double tauxFranchise) {
		this.tauxFranchise = tauxFranchise;
	}
	public Double getFranchiseMin() {
		return franchiseMin;
	}
	public void setFranchiseMin(Double franchiseMin) {
		this.franchiseMin = franchiseMin;
	}
	public Boolean getCapitalModifiable() {
		return capitalModifiable;
	}
	public void setCapitalModifiable(Boolean capitalModifiable) {
		this.capitalModifiable = capitalModifiable;
	}
	public Boolean getEditerCP() {
		return editerCP;
	}
	public void setEditerCP(Boolean editerCP) {
		this.editerCP = editerCP;
	}
	
	public Integer getOptionGarantieRC() {
		return optionGarantieRC;
	}
	public void setOptionGarantieRC(Integer optionGarantieRC) {
		this.optionGarantieRC = optionGarantieRC;
	}
	public String getTypeCouverture() {
		return typeCouverture;
	}
	public void setTypeCouverture(String typeCouverture) {
		this.typeCouverture = typeCouverture;
	}
	public String getTypeBareme() {
		return typeBareme;
	}
	public void setTypeBareme(String typeBareme) {
		this.typeBareme = typeBareme;
	}
	public Double getMinValeurContenu() {
		return minValeurContenu;
	}
	public void setMinValeurContenu(Double minValeurContenu) {
		this.minValeurContenu = minValeurContenu;
	}
	public Double getMaxValeurContenu() {
		return maxValeurContenu;
	}
	public void setMaxValeurContenu(Double maxValeurContenu) {
		this.maxValeurContenu = maxValeurContenu;
	}
	public Double getMinValeurBatiment() {
		return minValeurBatiment;
	}
	public void setMinValeurBatiment(Double minValeurBatiment) {
		this.minValeurBatiment = minValeurBatiment;
	}
	public Double getMaxValeurBatiment() {
		return maxValeurBatiment;
	}
	public void setMaxValeurBatiment(Double maxValeurBatiment) {
		this.maxValeurBatiment = maxValeurBatiment;
	}
	public Boolean getTauxModifiable() {
		return tauxModifiable;
	}
	public void setTauxModifiable(Boolean tauxModifiable) {
		this.tauxModifiable = tauxModifiable;
	}
	public List getRefPourcentagesExpression() {
		return refPourcentagesExpression;
	}
	public void setRefPourcentagesExpression(List refPourcentagesExpression) {
		this.refPourcentagesExpression = refPourcentagesExpression;
	}
//	public String getIdPrestationFormule() {
//		return idPrestationFormule;
//	}
//	public void setIdPrestationFormule(String idPrestationFormule) {
//		this.idPrestationFormule = idPrestationFormule;
//	}
//	public String getIdTypeCapital() {
//		return idTypeCapital;
//	}
//	public void setIdTypeCapital(String idTypeCapital) {
//		this.idTypeCapital = idTypeCapital;
//	}
//	public String getTauxExpression() {
//		return tauxExpression;
//	}
//	public void setTauxExpression(String tauxExpression) {
//		this.tauxExpression = tauxExpression;
//	}
//	public Double getMinMontantFranchise() {
//		return minMontantFranchise;
//	}
//	public void setMinMontantFranchise(Double minMontantFranchise) {
//		this.minMontantFranchise = minMontantFranchise;
//	}
	public Double getCapitalForfaitaire() {
		return capitalForfaitaire;
	}
	public void setCapitalForfaitaire(Double capitalForfaitaire) {
		this.capitalForfaitaire = capitalForfaitaire;
	}
//	public Double getPrimeSansCapital() {
//		return primeSansCapital;
//	}
//	public void setPrimeSansCapital(Double primeSansCapital) {
//		this.primeSansCapital = primeSansCapital;
//	}
	public Boolean getControleCapitalMin() {
		return controleCapitalMin;
	}
	public void setControleCapitalMin(Boolean controleCapitalMin) {
		this.controleCapitalMin = controleCapitalMin;
	}
	public Boolean getControleCapitalMax() {
		return controleCapitalMax;
	}
	public void setControleCapitalMax(Boolean controleCapitalMax) {
		this.controleCapitalMax = controleCapitalMax;
	}
	public Calendar getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(Calendar dateAjout) {
		this.dateAjout = dateAjout;
	}
	public Calendar getDateDerniereModification() {
		return dateDerniereModification;
	}
	public void setDateDerniereModification(Calendar dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}
	public Utilisateur getRefUtilisateurAjout() {
		return refUtilisateurAjout;
	}
	public void setRefUtilisateurAjout(Utilisateur refUtilisateurAjout) {
		this.refUtilisateurAjout = refUtilisateurAjout;
	}
	public Utilisateur getRefUtilisateurModification() {
		return refUtilisateurModification;
	}
	public void setRefUtilisateurModification(Utilisateur refUtilisateurModification) {
		this.refUtilisateurModification = refUtilisateurModification;
	}
	public String getLibelleCapital() {
		return libelleCapital;
	}
	public void setLibelleCapital(String libelleCapital) {
		this.libelleCapital = libelleCapital;
	}
	public String getLibelleFranchise() {
		return libelleFranchise;
	}
	public void setLibelleFranchise(String libelleFranchise) {
		this.libelleFranchise = libelleFranchise;
	}
	public String getLibelleCapital_Ar() {
		return libelleCapital_Ar;
	}
	public void setLibelleCapital_Ar(String libelleCapital_Ar) {
		this.libelleCapital_Ar = libelleCapital_Ar;
	}
	public String getLibelleFranchise_Ar() {
		return libelleFranchise_Ar;
	}
	public void setLibelleFranchise_Ar(String libelleFranchise_Ar) {
		this.libelleFranchise_Ar = libelleFranchise_Ar;
	}
	
}
