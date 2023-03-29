/**
 * 
 */
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

/**
 * @author Ayouch
 * 
 */
public class ReponseVisiteMedical  implements IEntite {
	private long id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private Calendar datereponse;
	private String commentaire;
	private Contrat refContrat;
	private String exclusionGar;

	
	
	public Contrat getRefContrat() {
		return refContrat;
	}
	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
	}
	public void setDatereponse(Calendar datereponse) {
		this.datereponse = datereponse;
	}
	public Calendar getDatereponse() {
		return datereponse;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setExclusionGar(String exclusionGar) {
		this.exclusionGar = exclusionGar;
	}
	public String getExclusionGar() {
		return exclusionGar;
	}

	
}
