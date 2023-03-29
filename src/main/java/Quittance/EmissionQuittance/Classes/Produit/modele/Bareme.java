
package Quittance.EmissionQuittance.Classes.Produit.modele;
import java.util.Calendar;
import java.util.Collection;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.AssocProduitTypeBienAssureFamilleGarantie;
import com.rmawatanya.convergence.utile.referentiel.AssocProduitTypePersonneAssureeFamilleGarantie;

public class Bareme extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	private long id;
	private Integer code;
	private String libelle;
	private Calendar dateDebut;
	private Calendar dateFin;
	private Integer nombreEntrees;

	/**
	 * c'est la classe de type de l'entree, elle toujours li�e au contrat, exemple Contrat.Activite , attribut : classe
	 */
	private String classeTypeEntree1;
	private String attributEntree1;
	private String classeTypeEntree2;
	private String attributEntree2;
	private String classeTypeEntree3;
	private String attributEntree3;
	private String classeTypeEntree4;
	private String attributEntree4;
	private String classeTypeEntree5;
	private String attributEntree5;
	private String classeTypeEntree6;
	private String attributEntree6;
	private String classeTypeEntree7;
	private String attributEntree7;
	
	private ParametresPrevoyance refParametresPrevoyance;
	private ParametresDommages refParametresDommages;
	private VersionCommercialeProduit refVersionCommercialeProduit;
	private AssocProduitTypeBienAssureFamilleGarantie refAssocProduitTypeBienAssureFamilleGarantie;
	private AssocProduitTypePersonneAssureeFamilleGarantie refAssocProduitTypePersonneAssureeFamilleGarantie;
	
	private Collection refOptions;
	
	public boolean equals(Object obj) {
		if(this.getId()==((Bareme)obj).getId()){
			return true;
		}
		return false;
	}
	
	public Bareme() {

	}
	
	public String getDescription() {
		return code + " - " + libelle;
	}

	/**
	 * Access method for the id property.
	 * 
	 * @return the current value of the id property
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param aId
	 *            the new value of the id property
	 */
	public void setId(long aId) {
		id = aId;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * Access method for the libelle property.
	 * 
	 * @return the current value of the libelle property
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Sets the value of the libelle property.
	 * 
	 * @param aLibelle
	 *            the new value of the libelle property
	 */
	public void setLibelle(String aLibelle) {
		libelle = aLibelle;
	}

	/**
	 * Access method for the dateDebut property.
	 * 
	 * @return the current value of the dateDebut property
	 */
	public Calendar getDateDebut() {
		return dateDebut;
	}

	/**
	 * Sets the value of the dateDebut property.
	 * 
	 * @param aDateDebut
	 *            the new value of the dateDebut property
	 */
	public void setDateDebut(Calendar aDateDebut) {
		dateDebut = aDateDebut;
	}

	/**
	 * Access method for the dateFin property.
	 * 
	 * @return the current value of the dateFin property
	 */
	public Calendar getDateFin() {
		return dateFin;
	}

	/**
	 * Sets the value of the dateFin property.
	 * 
	 * @param aDateFin
	 *            the new value of the dateFin property
	 */
	public void setDateFin(Calendar aDateFin) {
		dateFin = aDateFin;
	}

	/**
	 * Access method for the nombreEntrees property.
	 * 
	 * @return the current value of the nombreEntrees property
	 */
	public Integer getNombreEntrees() {
		return nombreEntrees;
	}

	/**
	 * Sets the value of the nombreEntrees property.
	 * 
	 * @param aNombreEntrees
	 *            the new value of the nombreEntrees property
	 */
	public void setNombreEntrees(Integer aNombreEntrees) {
		nombreEntrees = aNombreEntrees;
	}

	/**
	 * Access method for the classeTypeEntree1 property.
	 * 
	 * @return the current value of the classeTypeEntree1 property
	 */
	public String getClasseTypeEntree1() {
		return classeTypeEntree1;
	}

	/**
	 * Sets the value of the classeTypeEntree1 property.
	 * 
	 * @param aClasseTypeEntree1
	 *            the new value of the classeTypeEntree1 property
	 */
	public void setClasseTypeEntree1(String aClasseTypeEntree1) {
		classeTypeEntree1 = aClasseTypeEntree1;
	}

	/**
	 * Access method for the attributEntree1 property.
	 * 
	 * @return the current value of the attributEntree1 property
	 */
	public String getAttributEntree1() {
		return attributEntree1;
	}

	/**
	 * Sets the value of the attributEntree1 property.
	 * 
	 * @param aAttributEntree1
	 *            the new value of the attributEntree1 property
	 */
	public void setAttributEntree1(String aAttributEntree1) {
		attributEntree1 = aAttributEntree1;
	}

	/**
	 * Access method for the classeTypeEntree2 property.
	 * 
	 * @return the current value of the classeTypeEntree2 property
	 */
	public String getClasseTypeEntree2() {
		return classeTypeEntree2;
	}

	/**
	 * Sets the value of the classeTypeEntree2 property.
	 * 
	 * @param aClasseTypeEntree2
	 *            the new value of the classeTypeEntree2 property
	 */
	public void setClasseTypeEntree2(String aClasseTypeEntree2) {
		classeTypeEntree2 = aClasseTypeEntree2;
	}

	/**
	 * Access method for the attributEntree2 property.
	 * 
	 * @return the current value of the attributEntree2 property
	 */
	public String getAttributEntree2() {
		return attributEntree2;
	}

	/**
	 * Sets the value of the attributEntree2 property.
	 * 
	 * @param aAttributEntree2
	 *            the new value of the attributEntree2 property
	 */
	public void setAttributEntree2(String aAttributEntree2) {
		attributEntree2 = aAttributEntree2;
	}

	/**
	 * Access method for the classeTypeEntree3 property.
	 * 
	 * @return the current value of the classeTypeEntree3 property
	 */
	public String getClasseTypeEntree3() {
		return classeTypeEntree3;
	}

	/**
	 * Sets the value of the classeTypeEntree3 property.
	 * 
	 * @param aClasseTypeEntree3
	 *            the new value of the classeTypeEntree3 property
	 */
	public void setClasseTypeEntree3(String aClasseTypeEntree3) {
		classeTypeEntree3 = aClasseTypeEntree3;
	}

	/**
	 * Access method for the attributEntree3 property.
	 * 
	 * @return the current value of the attributEntree3 property
	 */
	public String getAttributEntree3() {
		return attributEntree3;
	}

	/**
	 * Sets the value of the attributEntree3 property.
	 * 
	 * @param aAttributEntree3
	 *            the new value of the attributEntree3 property
	 */
	public void setAttributEntree3(String aAttributEntree3) {
		attributEntree3 = aAttributEntree3;
	}

	/**
	 * Access method for the classeTypeEntree4 property.
	 * 
	 * @return the current value of the classeTypeEntree4 property
	 */
	public String getClasseTypeEntree4() {
		return classeTypeEntree4;
	}

	/**
	 * Sets the value of the classeTypeEntree4 property.
	 * 
	 * @param aClasseTypeEntree4
	 *            the new value of the classeTypeEntree4 property
	 */
	public void setClasseTypeEntree4(String aClasseTypeEntree4) {
		classeTypeEntree4 = aClasseTypeEntree4;
	}

	/**
	 * Access method for the attributEntree4 property.
	 * 
	 * @return the current value of the attributEntree4 property
	 */
	public String getAttributEntree4() {
		return attributEntree4;
	}

	/**
	 * Sets the value of the attributEntree4 property.
	 * 
	 * @param aAttributEntree4
	 *            the new value of the attributEntree4 property
	 */
	public void setAttributEntree4(String aAttributEntree4) {
		attributEntree4 = aAttributEntree4;
	}

	/**
	 * Access method for the classeTypeEntree5 property.
	 * 
	 * @return the current value of the classeTypeEntree5 property
	 */
	public String getClasseTypeEntree5() {
		return classeTypeEntree5;
	}

	/**
	 * Sets the value of the classeTypeEntree5 property.
	 * 
	 * @param aClasseTypeEntree5
	 *            the new value of the classeTypeEntree5 property
	 */
	public void setClasseTypeEntree5(String aClasseTypeEntree5) {
		classeTypeEntree5 = aClasseTypeEntree5;
	}

	/**
	 * Access method for the attributEntree5 property.
	 * 
	 * @return the current value of the attributEntree5 property
	 */
	public String getAttributEntree5() {
		return attributEntree5;
	}

	/**
	 * Sets the value of the attributEntree5 property.
	 * 
	 * @param aAttributEntree5
	 *            the new value of the attributEntree5 property
	 */
	public void setAttributEntree5(String aAttributEntree5) {
		attributEntree5 = aAttributEntree5;
	}

	/**
	 * Access method for the classeTypeEntree6 property.
	 * 
	 * @return the current value of the classeTypeEntree6 property
	 */
	public String getClasseTypeEntree6() {
		return classeTypeEntree6;
	}

	/**
	 * Sets the value of the classeTypeEntree6 property.
	 * 
	 * @param aClasseTypeEntree6
	 *            the new value of the classeTypeEntree6 property
	 */
	public void setClasseTypeEntree6(String aClasseTypeEntree6) {
		classeTypeEntree6 = aClasseTypeEntree6;
	}

	/**
	 * Access method for the attributEntree6 property.
	 * 
	 * @return the current value of the attributEntree6 property
	 */
	public String getAttributEntree6() {
		return attributEntree6;
	}

	/**
	 * Sets the value of the attributEntree6 property.
	 * 
	 * @param aAttributEntree6
	 *            the new value of the attributEntree6 property
	 */
	public void setAttributEntree6(String aAttributEntree6) {
		attributEntree6 = aAttributEntree6;
	}

	/**
	 * Access method for the classeTypeEntree7 property.
	 * 
	 * @return the current value of the classeTypeEntree7 property
	 */
	public String getClasseTypeEntree7() {
		return classeTypeEntree7;
	}

	/**
	 * Sets the value of the classeTypeEntree7 property.
	 * 
	 * @param aClasseTypeEntree7
	 *            the new value of the classeTypeEntree7 property
	 */
	public void setClasseTypeEntree7(String aClasseTypeEntree7) {
		classeTypeEntree7 = aClasseTypeEntree7;
	}

	/**
	 * Access method for the attributEntree7 property.
	 * 
	 * @return the current value of the attributEntree7 property
	 */
	public String getAttributEntree7() {
		return attributEntree7;
	}

	/**
	 * Sets the value of the attributEntree7 property.
	 * 
	 * @param aAttributEntree7
	 *            the new value of the attributEntree7 property
	 */
	public void setAttributEntree7(String aAttributEntree7) {
		attributEntree7 = aAttributEntree7;
	}

	/**
	 * Access method for the refParametresPrevoyance property.
	 * 
	 * @return the current value of the refParametresPrevoyance property
	 */
	public ParametresPrevoyance getRefParametresPrevoyance() {
		return refParametresPrevoyance;
	}

	/**
	 * Sets the value of the refParametresPrevoyance property.
	 * 
	 * @param aRefParametresPrevoyance
	 *            the new value of the refParametresPrevoyance property
	 */
	public void setRefParametresPrevoyance(ParametresPrevoyance aRefParametresPrevoyance) {
		refParametresPrevoyance = aRefParametresPrevoyance;
	}

	/**
	 * Access method for the refParametresDommages property.
	 * 
	 * @return the current value of the refParametresDommages property
	 */
	public ParametresDommages getRefParametresDommages() {
		return refParametresDommages;
	}

	/**
	 * Sets the value of the refParametresDommages property.
	 * 
	 * @param aRefParametresDommages
	 *            the new value of the refParametresDommages property
	 */
	public void setRefParametresDommages(ParametresDommages aRefParametresDommages) {
		refParametresDommages = aRefParametresDommages;
	}



	public Collection getRefOptions() {
		return refOptions;
	}

	public void setRefOptions(Collection refOptions) {
		this.refOptions = refOptions;
	}



	public VersionCommercialeProduit getRefVersionCommercialeProduit() {
		return refVersionCommercialeProduit;
	}

	public void setRefVersionCommercialeProduit(VersionCommercialeProduit refVersionCommercialeProduit) {
		this.refVersionCommercialeProduit = refVersionCommercialeProduit;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public AssocProduitTypeBienAssureFamilleGarantie getRefAssocProduitTypeBienAssureFamilleGarantie() {
		return refAssocProduitTypeBienAssureFamilleGarantie;
	}

	public void setRefAssocProduitTypeBienAssureFamilleGarantie(
			AssocProduitTypeBienAssureFamilleGarantie refAssocProduitTypeBienAssureFamilleGarantie) {
		this.refAssocProduitTypeBienAssureFamilleGarantie = refAssocProduitTypeBienAssureFamilleGarantie;
	}

	public AssocProduitTypePersonneAssureeFamilleGarantie getRefAssocProduitTypePersonneAssureeFamilleGarantie() {
		return refAssocProduitTypePersonneAssureeFamilleGarantie;
	}

	public void setRefAssocProduitTypePersonneAssureeFamilleGarantie(
			AssocProduitTypePersonneAssureeFamilleGarantie refAssocProduitTypePersonneAssureeFamilleGarantie) {
		this.refAssocProduitTypePersonneAssureeFamilleGarantie = refAssocProduitTypePersonneAssureeFamilleGarantie;
	}
}
