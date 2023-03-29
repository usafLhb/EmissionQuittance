package Quittance.EmissionQuittance.Classes.Prestation.modele;


/**
 * @author NOURLAM
 */
public class BeanChildDemandeRachatAvance {
	
	private String id="";
	
	private String naturePiece = "";
	private String reference = "";
	private String dateEtablissement = "";
	private String nbPages = "";
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	public String getNaturePiece() {
		return naturePiece;
	}
	public void setNaturePiece(String naturePiece) {
		this.naturePiece = naturePiece;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDateEtablissement() {
		return dateEtablissement;
	}
	public void setDateEtablissement(String dateEtablissement) {
		this.dateEtablissement = dateEtablissement;
	}
	public String getNbPages() {
		return nbPages;
	}
	public void setNbPages(String nbPages) {
		this.nbPages = nbPages;
	}
	
}
