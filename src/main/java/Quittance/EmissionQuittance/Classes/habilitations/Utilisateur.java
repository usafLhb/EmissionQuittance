package Quittance.EmissionQuittance.Classes.habilitations;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import ma.co.omnidata.framework.services.securite.impl.OMNIUtilisateur;

import com.rmawatanya.convergence.utile.organisation.Entite;

public class Utilisateur extends OMNIUtilisateur implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Boolean changementMotdePassealaConnexion;
	private String telephone;
	private String email;
	private boolean blocked;
	private Calendar dateDebutAcces;
	private Calendar dateFinAcces;
	private Boolean autoriseToutProduit;
	private Boolean autoriseTouteAgence;
	private Boolean superUtilisateur;
	private Entite refEntiteAppartenance;
	private Collection refConnexions;
	private Collection refMotsdePasse;
	private Profil refProfil;

	private Connexion currentConnexion;
	private boolean alreadyConnected;

	private transient String motdepasse;

	private String typeUtilisateur;
	private Utilisateur responsable;

	private Boolean modePack;
	private Boolean multiSociete;
	private String matricule;
	
	private List refEntites;
	
	public String getDescription(){
		return getPrenom() + " - " + getNom();
	}
	
	public Boolean getModePack() {
		return modePack;
	}

	public void setModePack(Boolean modePack) {
		this.modePack = modePack;
	}

	public Utilisateur() {

	}

	/**
	 * Access method for the changementMotdePassealaConnexion property.
	 * 
	 * @return the current value of the changementMotdePassealaConnexion property
	 */
	public Boolean getChangementMotdePassealaConnexion() {
		return changementMotdePassealaConnexion;
	}

	/**
	 * Sets the value of the changementMotdePassealaConnexion property.
	 * 
	 * @param aChangementMotdePassealaConnexion
	 *            the new value of the changementMotdePassealaConnexion property
	 */
	public void setChangementMotdePassealaConnexion(Boolean aChangementMotdePassealaConnexion) {
		changementMotdePassealaConnexion = aChangementMotdePassealaConnexion;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	/**
	 * Access method for the telephone property.
	 * 
	 * @return the current value of the telephone property
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Sets the value of the telephone property.
	 * 
	 * @param aTelephone
	 *            the new value of the telephone property
	 */
	public void setTelephone(String aTelephone) {
		telephone = aTelephone;
	}

	/**
	 * Access method for the email property.
	 * 
	 * @return the current value of the email property
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the value of the email property.
	 * 
	 * @param aEmail
	 *            the new value of the eMail property
	 */
	public void setEmail(String aEmail) {
		email = aEmail;
	}

	/**
	 * Access method for the dateDebutAcces property.
	 * 
	 * @return the current value of the dateDebutAcces property
	 */
	public Calendar getDateDebutAcces() {
		return dateDebutAcces;
	}

	/**
	 * Sets the value of the dateDebutAcces property.
	 * 
	 * @param aDateDebutAcces
	 *            the new value of the dateDebutAcces property
	 */
	public void setDateDebutAcces(Calendar aDateDebutAcces) {
		dateDebutAcces = aDateDebutAcces;
	}

	/**
	 * Access method for the dateFinAcces property.
	 * 
	 * @return the current value of the dateFinAcces property
	 */
	public Calendar getDateFinAcces() {
		return dateFinAcces;
	}

	/**
	 * Sets the value of the dateFinAcces property.
	 * 
	 * @param aDateFinAcces
	 *            the new value of the dateFinAcces property
	 */
	public void setDateFinAcces(Calendar aDateFinAcces) {
		dateFinAcces = aDateFinAcces;
	}

	/**
	 * Access method for the autoriseToutProduit property.
	 * 
	 * @return the current value of the autoriseToutProduit property
	 */
	public Boolean getAutoriseToutProduit() {
		return autoriseToutProduit;
	}

	/**
	 * Sets the value of the autoriseToutProduit property.
	 * 
	 * @param aAutoriseToutProduit
	 *            the new value of the autoriseToutProduit property
	 */
	public void setAutoriseToutProduit(Boolean aAutoriseToutProduit) {
		autoriseToutProduit = aAutoriseToutProduit;
	}

	/**
	 * Access method for the autoriseTouteAgence property.
	 * 
	 * @return the current value of the autoriseTouteAgence property
	 */
	public Boolean getAutoriseTouteAgence() {
		return autoriseTouteAgence;
	}

	/**
	 * Sets the value of the autoriseTouteAgence property.
	 * 
	 * @param aAutoriseTouteAgence
	 *            the new value of the autoriseTouteAgence property
	 */
	public void setAutoriseTouteAgence(Boolean aAutoriseTouteAgence) {
		autoriseTouteAgence = aAutoriseTouteAgence;
	}

	/**
	 * Access method for the superUtilisateur property.
	 * 
	 * @return the current value of the superUtilisateur property
	 */
	public Boolean getSuperUtilisateur() {
		return superUtilisateur;
	}

	/**
	 * Sets the value of the superUtilisateur property.
	 * 
	 * @param aSuperUtilisateur
	 *            the new value of the superUtilisateur property
	 */
	public void setSuperUtilisateur(Boolean aSuperUtilisateur) {
		superUtilisateur = aSuperUtilisateur;
	}

	/**
	 * Access method for the refEntiteAppartenance property.
	 * 
	 * @return the current value of the refEntiteAppartenance property
	 */
	public Entite getRefEntiteAppartenance() {
		return refEntiteAppartenance;
	}

	/**
	 * Sets the value of the refEntiteAppartenance property.
	 * 
	 * @param aRefEntiteAppartenance
	 *            the new value of the refEntiteAppartenance property
	 */
	public void setRefEntiteAppartenance(Entite aRefEntiteAppartenance) {
		refEntiteAppartenance = aRefEntiteAppartenance;
	}

	/**
	 * @return Returns the refConnexions.
	 */
	public Collection getRefConnexions() {
		return refConnexions;
	}

	/**
	 * @param refConnexions
	 *            The refConnexions to set.
	 */
	public void setRefConnexions(Collection refConnexions) {
		this.refConnexions = refConnexions;
	}

	/**
	 * @return Returns the refMotsdePasse.
	 */
	public Collection getRefMotsdePasse() {
		return refMotsdePasse;
	}

	/**
	 * @param refMotsdePasse
	 *            The refMotsdePasse to set.
	 */
	public void setRefMotsdePasse(Collection refMotsdePasse) {
		this.refMotsdePasse = refMotsdePasse;
	}

	/**
	 * Access method for the refProfil property.
	 * 
	 * @return the current value of the refProfil property
	 */
	public Profil getRefProfil() {
		return refProfil;
	}

	/**
	 * Sets the value of the refProfil property.
	 * 
	 * @param aRefProfil
	 *            the new value of the refProfil property
	 */
	public void setRefProfil(Profil aRefProfil) {
		refProfil = aRefProfil;
	}

	public Connexion getCurrentConnexion() {
		return currentConnexion;
	}

	public void setCurrentConnexion(Connexion currentConnexion) {
		this.currentConnexion = currentConnexion;
	}

	/**
	 * retourne le mot de passe actif.
	 */
	public String getMotdepasse() {
		if (refMotsdePasse != null) {
			for (Iterator iter = refMotsdePasse.iterator(); iter.hasNext();) {
				MotdePasse element = (MotdePasse) iter.next();
				if ((Boolean.TRUE).equals(element.getCourant())) {
					return element.getMotdePasse();
				}
			}
		}

		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	public boolean isAlreadyConnected() {
		return alreadyConnected;
	}

	public void setAlreadyConnected(boolean alreadyConnected) {
		this.alreadyConnected = alreadyConnected;
	}

	public Utilisateur getResponsable() {
		return responsable;
	}

	public void setResponsable(Utilisateur responsable) {
		this.responsable = responsable;
	}

	public String getTypeUtilisateur() {
		return typeUtilisateur;
	}

	public void setTypeUtilisateur(String typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}

	/**
	 * Access method for the matricule property.
	 * 
	 * @return the current value of the matricule property
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * Sets the value of the matricule property.
	 * 
	 * @param aId
	 *            the new value of the matricule property
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * Access method for the multiSociete property.
	 * 
	 * @return the current value of the multiSociete property
	 */
	public Boolean getMultiSociete() {
		return multiSociete;
	}

	/**
	 * Sets the value of the multiSociete property.
	 * 
	 * @param aId
	 *            the new value of the multiSociete property
	 */
	public void setMultiSociete(Boolean multiSociete) {
		this.multiSociete = multiSociete;
	}

	/**
	 * Access method for the refEntites property.
	 * 
	 * @return the current value of the refEntites property
	 */
	public List getRefEntites() {
		return refEntites;
	}

	/**
	 * Sets the value of the refEntites property.
	 * 
	 * @param aId
	 *            the new value of the refEntites property
	 */
	public void setRefEntites(List refEntites) {
		this.refEntites = refEntites;
	}

}
