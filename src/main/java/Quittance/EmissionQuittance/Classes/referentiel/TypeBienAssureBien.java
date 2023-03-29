/**
 * 
 */
package Quittance.EmissionQuittance.Classes.referentiel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author b.slayki
 *
 */
public class TypeBienAssureBien {
	
	private String nom;
	
	private Collection refAttributs = new ArrayList();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection getRefAttributs() {
		return refAttributs;
	}

	public void setRefAttributs(Collection refAttributs) {
		this.refAttributs = refAttributs;
	}
	
	public void addAttribute(TypeBienAssureAttribut a){
		refAttributs.add(a);
	}

}
