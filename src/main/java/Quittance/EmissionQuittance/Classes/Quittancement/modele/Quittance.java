package Quittance.EmissionQuittance.Classes.Quittancement.modele;
 
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;




public class Quittance implements IEntite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	private String codeSociete;

	private String natureQuittance;

	private String numeroQuittance;

	private String codePolice;

	private String numeroQuittanceOrigine;

	private String codeClient;

	private Integer codeIntermediaire;

	private Integer codeBranche;

	private String nomClient;

	private String prenomClient;

	private String adresseClient;

	private String villeClient;

	private String typeQuittance;

	private Double primeNette;

	private Double tauxTaxe;

	private Double montantTaxe;

	private Double montantAccessoire;
	
	private Double montantEncaisse;
	
	private Double tauxCommission;
	
	private Double montantCommission;
	
	private Double tauxCommissionCATNAT;
	
	private Double montantCommissionRetenue;
	
	private Double montantCommisionRistourne;
	
	private Double montantRemise;
	
	private Calendar dateDebut;

	private Calendar dateFin;

	private Calendar dateEmission;

	private String etatQuittance;

	private Calendar dateEtat;

	private Calendar dateEffet;
	
	private Calendar dateValidation;
	
	private String Periodicite;
	
	private OperationGenerationPrelevements refOperationPrelevement;

	private Utilisateur refUtilisateurValidateur;
	private Utilisateur refUtilisateurRistourne;	

	private Produit refProduit;

	private Remise refRemise;
	private Collection refEcheanciersPrelevement= new ArrayList();
	private Boolean  synchrone;
	private Double montantTaxeParafiscale;
	//lien vers la quittance origine en cas de quittance Ristourne
	private Quittance refQuittanceOrigine;

	private Calendar dateSynchronisation;
	


	public QtcQuittancePrimeItem convertToQuittancePrimeItem() {

		QtcQuittancePrimeItem qtcQuittancePrimeItem = new QtcQuittancePrimeItem();
		qtcQuittancePrimeItem.setId(String.valueOf(this.getId()));

		if (this.getNumeroQuittance() != null) {
			qtcQuittancePrimeItem.setNumeroQuittance(String.valueOf(this
					.getNumeroQuittance()));
		}

		if (this.getNumeroQuittanceOrigine() != null) {
			qtcQuittancePrimeItem.setNumeroQuittanceOrigine(String.valueOf(this
					.getNumeroQuittanceOrigine()));
		}

		if (this.getRefOperationPrelevement().getId()>0) {
			qtcQuittancePrimeItem.setIdOperationPrelevement(String.valueOf(this.getRefOperationPrelevement().getId()));
		}

		if (this.getRefRemise() !=null && this.getRefRemise().getNumeroRemise()!=null) {
			qtcQuittancePrimeItem.setNumeroRemise(this.getRefRemise().getNumeroRemise());
		}

		if (this.getNomClient() != null) {
			if(null != this.getNomClient()){
				this.getNomClient().replace("null", "");
				qtcQuittancePrimeItem.setNomClient(this.getNomClient().replace("null", ""));
			}
		}
		if (this.getPrenomClient() != null) {
			qtcQuittancePrimeItem.setPrenomClient(this.getPrenomClient());
		}
		if (this.getPrimeNette() != null) {
			qtcQuittancePrimeItem.setPrimeNette(String.valueOf(this.getPrimeNette().doubleValue()));
		}else{
			qtcQuittancePrimeItem.setPrimeNette("0.00");
		}
		
		
		if (this.getTauxTaxe() != null) {
			qtcQuittancePrimeItem.setTauxTaxe(String.valueOf(this.getTauxTaxe().doubleValue()));
		}else{
			qtcQuittancePrimeItem.setTauxTaxe("0.00");
		}
		
		
		if (this.getMontantTaxe() != null) {
			qtcQuittancePrimeItem.setMontantTaxe(String.valueOf(this.getMontantTaxe().doubleValue()));
		}else{
			qtcQuittancePrimeItem.setMontantTaxe("0.00");
		}
		
		if (this.getMontantAccessoire() != null) {
			qtcQuittancePrimeItem.setMontantAccessoire(String.valueOf(this.getMontantAccessoire().doubleValue()));
		}else{
			qtcQuittancePrimeItem.setMontantAccessoire("0.00");
		}
		if (this.getMontantEncaisse() != null) {
			qtcQuittancePrimeItem.setMontantEncaisse(String.valueOf(this.getMontantEncaisse().doubleValue()));
		}else{
			qtcQuittancePrimeItem.setMontantEncaisse("0.00");
		}
		
		if (this.getTauxCommission() != null) {
			qtcQuittancePrimeItem.setTauxCommission(String.valueOf(this.getTauxCommission().doubleValue()));
		}else{
			qtcQuittancePrimeItem.setTauxCommission("0.00");
		}
		if (this.getTauxCommissionCATNAT() != null) {
			qtcQuittancePrimeItem.setTauxCommissionCATNAT(String.valueOf(this.getTauxCommissionCATNAT().doubleValue()));
		}else{
			qtcQuittancePrimeItem.setTauxCommissionCATNAT("0.00");
		}
		if (this.getMontantCommission() != null) {
			qtcQuittancePrimeItem.setMontantCommission(String.valueOf(this.getMontantCommission().doubleValue()));
		}else{
			qtcQuittancePrimeItem.setMontantCommission("0.00");
		}
		if (this.getMontantCommissionRetenue() != null) {
			qtcQuittancePrimeItem.setMontantCommissionRetenue(String.valueOf(this.getMontantCommissionRetenue().doubleValue()));
		}else{
			qtcQuittancePrimeItem.setMontantCommissionRetenue("0.00");
		}
		if (this.getMontantCommisionRistourne() != null) {
			qtcQuittancePrimeItem.setMontantCommisionRistourne(String.valueOf(this.getMontantCommisionRistourne().doubleValue()));
		}else{
			qtcQuittancePrimeItem.setMontantCommisionRistourne("0.00");
		}
		if (this.getDateEmission() != null) {
			qtcQuittancePrimeItem.setDateEmission(DateUtile	.calendarToString(this.getDateEmission()));
		}
		if (this.getEtatQuittance() != null) {
			qtcQuittancePrimeItem.setEtatQuittance(this.getEtatQuittance());
		}
		if (this.getMontantTaxeParafiscale() != null) {
			qtcQuittancePrimeItem.setMontantTaxeParafiscale(this.getMontantTaxeParafiscale().toString());
		}


		return qtcQuittancePrimeItem;
	}

    public Calendar getDateSynchronisation() {
		return dateSynchronisation;
	}

	public void setDateSynchronisation(Calendar dateSynchronisation) {
		this.dateSynchronisation = dateSynchronisation;
	}

	public EntiteFactory getFactory() {
	    // TODO Auto-generated method stub
	    return null;
	}








	public long getId() {
	    // TODO Auto-generated method stub
	    return id;
	}








	public void setId(long id) {
	    // TODO Auto-generated method stub
		this.id=id;
	    
	}








	public static long getSerialVersionUID() {
	    return serialVersionUID;
	}








	public String getAdresseClient() {
	    return adresseClient;
	}








	public void setAdresseClient(String adresseClient) {
	    this.adresseClient = adresseClient;
	}








	public String getCodeClient() {
	    return codeClient;
	}








	public Integer getCodeIntermediaire() {
		return codeIntermediaire;
	}








	public void setCodeIntermediaire(Integer codeIntermediaire) {
		this.codeIntermediaire = codeIntermediaire;
	}








	public Integer getCodeBranche() {
		return codeBranche;
	}








	public void setCodeBranche(Integer codeBranche) {
		this.codeBranche = codeBranche;
	}








	public void setCodeClient(String codeClient) {
	    this.codeClient = codeClient;
	}








	public String getCodePolice() {
	    return codePolice;
	}








	public void setCodePolice(String codePolice) {
	    this.codePolice = codePolice;
	}








	public String getCodeSociete() {
	    return codeSociete;
	}








	public void setCodeSociete(String codeSociete) {
	    this.codeSociete = codeSociete;
	}








	public Calendar getDateDebut() {
	    return dateDebut;
	}








	public void setDateDebut(Calendar dateDebut) {
	    this.dateDebut = dateDebut;
	}








	public Calendar getDateEffet() {
	    return dateEffet;
	}








	public void setDateEffet(Calendar dateEffet) {
	    this.dateEffet = dateEffet;
	}








	public Calendar getDateEmission() {
	    return dateEmission;
	}








	public void setDateEmission(Calendar dateEmission) {
	    this.dateEmission = dateEmission;
	}








	public Calendar getDateEtat() {
	    return dateEtat;
	}








	public void setDateEtat(Calendar dateEtat) {
	    this.dateEtat = dateEtat;
	}








	public Calendar getDateFin() {
	    return dateFin;
	}








	public void setDateFin(Calendar dateFin) {
	    this.dateFin = dateFin;
	}








	public String getEtatQuittance() {
	    return etatQuittance;
	}








	public void setEtatQuittance(String etatQuittance) {
	    this.etatQuittance = etatQuittance;
	}








	public Double getMontantAccessoire() {
	    return montantAccessoire;
	}








	public void setMontantAccessoire(Double montantAccessoire) {
	    this.montantAccessoire = montantAccessoire;
	}








	public Double getMontantCommisionRistourne() {
	    return montantCommisionRistourne;
	}








	public void setMontantCommisionRistourne(Double montantCommisionRistourne) {
	    this.montantCommisionRistourne = montantCommisionRistourne;
	}








	public Double getMontantCommission() {
	    return montantCommission;
	}








	public void setMontantCommission(Double montantCommission) {
	    this.montantCommission = montantCommission;
	}








	public Double getMontantCommissionRetenue() {
	    return montantCommissionRetenue;
	}








	public void setMontantCommissionRetenue(Double montantCommissionRetenue) {
	    this.montantCommissionRetenue = montantCommissionRetenue;
	}








	public Double getMontantEncaisse() {
	    return montantEncaisse;
	}








	public void setMontantEncaisse(Double montantEncaisse) {
	    this.montantEncaisse = montantEncaisse;
	}








	public Double getMontantRemise() {
	    return montantRemise;
	}








	public void setMontantRemise(Double montantRemise) {
	    this.montantRemise = montantRemise;
	}








	public Double getMontantTaxe() {
	    return montantTaxe;
	}








	public void setMontantTaxe(Double montantTaxe) {
	    this.montantTaxe = montantTaxe;
	}








	public String getNatureQuittance() {
	    return natureQuittance;
	}








	public void setNatureQuittance(String natureQuittance) {
	    this.natureQuittance = natureQuittance;
	}








	public String getNomClient() {
	    return nomClient;
	}








	public void setNomClient(String nomClient) {
	    this.nomClient = nomClient;
	}








	public String getNumeroQuittance() {
	    return numeroQuittance;
	}








	public void setNumeroQuittance(String numeroQuittance) {
	    this.numeroQuittance = numeroQuittance;
	}








	public String getNumeroQuittanceOrigine() {
	    return numeroQuittanceOrigine;
	}








	public void setNumeroQuittanceOrigine(String numeroQuittanceOrigine) {
	    this.numeroQuittanceOrigine = numeroQuittanceOrigine;
	}








	public String getPeriodicite() {
	    return Periodicite;
	}








	public void setPeriodicite(String periodicite) {
	    Periodicite = periodicite;
	}








	public String getPrenomClient() {
	    return prenomClient;
	}








	public void setPrenomClient(String prenomClient) {
	    this.prenomClient = prenomClient;
	}








	public Double getPrimeNette() {
	    return primeNette;
	}








	public void setPrimeNette(Double primeNette) {
	    this.primeNette = primeNette;
	}








	public Collection getRefEcheanciersPrelevement() {
	    return refEcheanciersPrelevement;
	}








	public void setRefEcheanciersPrelevement(Collection refEcheanciersPrelevement) {
	    this.refEcheanciersPrelevement = refEcheanciersPrelevement;
	}








	public OperationGenerationPrelevements getRefOperationPrelevement() {
	    return refOperationPrelevement;
	}








	public void setRefOperationPrelevement(OperationGenerationPrelevements refOperationPrelevement) {
	    this.refOperationPrelevement = refOperationPrelevement;
	}








	public Produit getRefProduit() {
	    return refProduit;
	}








	public void setRefProduit(Produit refProduit) {
	    this.refProduit = refProduit;
	}








	public Remise getRefRemise() {
	    return refRemise;
	}








	public void setRefRemise(Remise refRemise) {
	    this.refRemise = refRemise;
	}








	public Utilisateur getRefUtilisateurRistourne() {
	    return refUtilisateurRistourne;
	}








	public void setRefUtilisateurRistourne(Utilisateur refUtilisateurRistourne) {
	    this.refUtilisateurRistourne = refUtilisateurRistourne;
	}








	public Utilisateur getRefUtilisateurValidateur() {
	    return refUtilisateurValidateur;
	}








	public void setRefUtilisateurValidateur(Utilisateur refUtilisateurValidateur) {
	    this.refUtilisateurValidateur = refUtilisateurValidateur;
	}








	public Boolean getSynchrone() {
	    return synchrone;
	}








	public void setSynchrone(Boolean synchrone) {
	    this.synchrone = synchrone;
	}








	public Double getTauxCommission() {
	    return tauxCommission;
	}








	public void setTauxCommission(Double tauxCommission) {
	    this.tauxCommission = tauxCommission;
	}








	public Double getTauxTaxe() {
	    return tauxTaxe;
	}








	public void setTauxTaxe(Double tauxTaxe) {
	    this.tauxTaxe = tauxTaxe;
	}








	public String getTypeQuittance() {
	    return typeQuittance;
	}








	public void setTypeQuittance(String typeQuittance) {
	    this.typeQuittance = typeQuittance;
	}








	public String getVilleClient() {
	    return villeClient;
	}








	public void setVilleClient(String villeClient) {
	    this.villeClient = villeClient;
	}








	public Calendar getDateValidation() {
		return dateValidation;
	}








	public void setDateValidation(Calendar dateValidation) {
		this.dateValidation = dateValidation;
	}


	/**
	 * @return the montantTaxeParafiscale
	 */
	public Double getMontantTaxeParafiscale() {
		return montantTaxeParafiscale;
	}



	/**
	 * @param montantTaxeParafiscale the montantTaxeParafiscale to set
	 */
	public void setMontantTaxeParafiscale(Double montantTaxeParafiscale) {
		this.montantTaxeParafiscale = montantTaxeParafiscale;
	}




	public Double getTauxCommissionCATNAT() {
		return tauxCommissionCATNAT;
	}

	public void setTauxCommissionCATNAT(Double tauxCommissionCATNAT) {
		this.tauxCommissionCATNAT = tauxCommissionCATNAT;
	}


	public Quittance getRefQuittanceOrigine() {
		return refQuittanceOrigine;
	}

	public void setRefQuittanceOrigine(Quittance refQuittanceOrigine) {
		this.refQuittanceOrigine = refQuittanceOrigine;
	}

	@Override
	public String toString() {
		return "Quittance [id=" + id + ", codeSociete=" + codeSociete + ", natureQuittance=" + natureQuittance
				+ ", numeroQuittance=" + numeroQuittance + ", codePolice=" + codePolice + ", numeroQuittanceOrigine="
				+ numeroQuittanceOrigine + ", codeClient=" + codeClient + ", codeIntermediaire=" + codeIntermediaire
				+ ", codeBranche=" + codeBranche + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient
				+ ", adresseClient=" + adresseClient + ", villeClient=" + villeClient + ", typeQuittance="
				+ typeQuittance + ", primeNette=" + primeNette + ", tauxTaxe=" + tauxTaxe + ", montantTaxe="
				+ montantTaxe + ", montantAccessoire=" + montantAccessoire + ", montantEncaisse=" + montantEncaisse
				+ ", tauxCommission=" + tauxCommission + ", montantCommission=" + montantCommission
				+ ", montantCommissionRetenue=" + montantCommissionRetenue + ", montantCommisionRistourne="
				+ montantCommisionRistourne + ", montantRemise=" + montantRemise + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + ", dateEmission=" + dateEmission + ", etatQuittance=" + etatQuittance
				+ ", dateEtat=" + dateEtat + ", dateEffet=" + dateEffet + ", dateValidation=" + dateValidation
				+ ", Periodicite=" + Periodicite + ", refOperationPrelevement=" + refOperationPrelevement
				+ ", refUtilisateurValidateur=" + refUtilisateurValidateur + ", refUtilisateurRistourne="
				+ refUtilisateurRistourne + ", refProduit=" + refProduit + ", refRemise=" + refRemise
				+ ", refEcheanciersPrelevement=" + refEcheanciersPrelevement + ", synchrone=" + synchrone + ", montanttaxeparafiscale=" + montantTaxeParafiscale +"]";
	}



	

}
