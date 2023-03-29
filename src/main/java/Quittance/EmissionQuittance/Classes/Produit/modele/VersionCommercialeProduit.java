
package Quittance.EmissionQuittance.Classes.Produit.modele;

import java.util.Calendar;
import java.util.Collection;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.organisation.Societe;

public class VersionCommercialeProduit extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nomCommercial;
	private String nomCommercialAr;
	private Calendar dateDebut;
	private Calendar dateFin;
	private String compteBancaireService;
	private String compteBancairePrestation;
	private String refhomologation;
	
	private Produit refProduit;
	private Societe refSociete;

	private Collection refCommissions;	
	private Collection refAccessoires;
	private Collection refTaxeAssurances;	
	
	private String codeintermediaire;
	private Integer delaiModifEnInstance ;
	private Integer nombreMaxAdhesion;
	// plafond indeminite journaliere pour certains types de produit comme Hospitalisation
	private Double plafondIndemnite;
	private Calendar dateMajProduit;
	public VersionCommercialeProduit(){
		
	}
	
	public boolean equals(Object obj) {
	if(this.getId()==((VersionCommercialeProduit)obj).getId()){
		return true;
	}
	return false;
	}
	
	public EntiteFactory getFactory() {
		return null;
	}
	
	public String getDescription() {
		return nomCommercial;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomCommercial() {
		return nomCommercial;
	}

	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
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

	public Produit getRefProduit() {
		return refProduit;
	}

	public void setRefProduit(Produit refProduit) {
		this.refProduit = refProduit;
	}

	public Societe getRefSociete() {
		return refSociete;
	}
	
	public void setRefSociete(Societe refSociete) {
		this.refSociete = refSociete;
	}
	
	public Collection getRefCommissions() {
		return refCommissions;
	}

	public void setRefCommissions(Collection refCommissions) {
		this.refCommissions = refCommissions;
	}

	public Collection getRefAccessoires() {
		return refAccessoires;
	}

	public void setRefAccessoires(Collection refAccessoires) {
		this.refAccessoires = refAccessoires;
	}

	public String getCompteBancairePrestation() {
		return compteBancairePrestation;
	}

	public void setCompteBancairePrestation(String compteBancairePrestation) {
		this.compteBancairePrestation = compteBancairePrestation;
	}

	public String getCompteBancaireService() {
		return compteBancaireService;
	}

	public void setCompteBancaireService(String compteBancaireService) {
		this.compteBancaireService = compteBancaireService;
	}
	public String getRefhomologation() {
		return refhomologation;
	}
	public void setRefhomologation(String refhomologation) {
		this.refhomologation = refhomologation;
	}

	public Collection getRefTaxeAssurances() {
		return refTaxeAssurances;
	}

	public void setRefTaxeAssurances(Collection refTaxeAssurances) {
		this.refTaxeAssurances = refTaxeAssurances;
	}

	public String getCodeintermediaire() {
		return codeintermediaire;
	}

	public void setCodeintermediaire(String codeintermediaire) {
		this.codeintermediaire = codeintermediaire;
	}

	public Integer getDelaiModifEnInstance() {
		return delaiModifEnInstance;
	}

	public void setDelaiModifEnInstance(Integer delaiModifEnInstance) {
		this.delaiModifEnInstance = delaiModifEnInstance;
	}

	public Integer getNombreMaxAdhesion() {
		return nombreMaxAdhesion;
	}

	public void setNombreMaxAdhesion(Integer nombreMaxAdhesion) {
		this.nombreMaxAdhesion = nombreMaxAdhesion;
	}

	public String getNomCommercialAr() {
		return nomCommercialAr;
	}

	public void setNomCommercialAr(String nomCommercialAr) {
		this.nomCommercialAr = nomCommercialAr;
	}

	public Double getPlafondIndemnite() {
		return plafondIndemnite;
	}

	public void setPlafondIndemnite(Double plafondIndemnite) {
		this.plafondIndemnite = plafondIndemnite;
	}

	public Calendar getDateMajProduit() {
		return dateMajProduit;
	}

	public void setDateMajProduit(Calendar dateMajProduit) {
		this.dateMajProduit = dateMajProduit;
	}

}
