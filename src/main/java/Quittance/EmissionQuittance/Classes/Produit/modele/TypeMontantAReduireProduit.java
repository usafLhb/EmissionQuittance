
package Quittance.EmissionQuittance.Classes.Produit.modele;

import com.rmawatanya.convergence.utile.referentiel.TypeMontantAReduire;


public class TypeMontantAReduireProduit {
	
	private long id;
	private Produit refProduit;
	private TypeMontantAReduire refTypeMontantAReduire;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Produit getRefProduit() {
		return refProduit;
	}
	public void setRefProduit(Produit refProduit) {
		this.refProduit = refProduit;
	}
	public TypeMontantAReduire getRefTypeMontantAReduire() {
		return refTypeMontantAReduire;
	}
	public void setRefTypeMontantAReduire(TypeMontantAReduire refTypeMontantAReduire) {
		this.refTypeMontantAReduire = refTypeMontantAReduire;
	}

	
}
