//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\utile\\habilitations\\MotdePasse.java

package Quittance.EmissionQuittance.Classes.habilitations;

import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Collection;
import java.util.Vector;

import ma.co.omnidata.framework.services.mail.MailException;
import ma.co.omnidata.framework.services.mail.MessageObjet;
import ma.co.omnidata.framework.services.mail.impl.smtp.SmtpMailService;
import sun.misc.BASE64Encoder;

public class MotdePasse 
{
   private long id;
   private String motdePasse;
   private Calendar dateCreation;
   
   /**
    * 1 : mot de passe courant, 0 : mot de passe non courant.
    */
   private Boolean courant;
   private Utilisateur refUtilisateur;
   
   private String realMotdePasse;
   
   public MotdePasse() 
   {
   	courant = Boolean.TRUE;
   }
   
   /**
    * Access method for the id property.
    * 
    * @return   the current value of the id property
    */
   public long getId() 
   {
      return id;
   }
   
   /**
    * Sets the value of the id property.
    * 
    * @param aId the new value of the id property
    */
   public void setId(long aId) 
   {
      id = aId;
   }
   
   /**
    * Access method for the motdePasse property.
    * 
    * @return   the current value of the motdePasse property
    */
   public String getMotdePasse() 
   {
      //return encryptPassword(motdePasse);
   	return motdePasse;
   }
   
   /**
    * Sets the value of the motdePasse property.
    * 
    * @param aMotdePasse the new value of the motdePasse property
    */
   public void setMotdePasse(String aMotdePasse) 
   {
      //motdePasse = encryptPassword(aMotdePasse);
   	motdePasse = aMotdePasse;
   	
   }
   
   /**
    * Access method for the dateCreation property.
    * 
    * @return   the current value of the dateCreation property
    */
   public Calendar getDateCreation() 
   {
      return dateCreation;
   }
   
   /**
    * Sets the value of the dateCreation property.
    * 
    * @param aDateCreation the new value of the dateCreation property
    */
   public void setDateCreation(Calendar aDateCreation) 
   {
      dateCreation = aDateCreation;
   }
   
   /**
    * Access method for the courant property.
    * 
    * @return   the current value of the courant property
    */
   public Boolean getCourant() 
   {
      return courant;
   }
   
   /**
    * Sets the value of the courant property.
    * 
    * @param aCourant the new value of the courant property
    */
   public void setCourant(Boolean aCourant) 
   {
      courant = aCourant;
   }
   
   /**
    * Access method for the refUtilisateur property.
    * 
    * @return   the current value of the refUtilisateur property
    */
   public Utilisateur getRefUtilisateur() 
   {
      return refUtilisateur;
   }
   
   /**
    * Sets the value of the refUtilisateur property.
    * 
    * @param aRefUtilisateur the new value of the refUtilisateur property
    */
   public void setRefUtilisateur(Utilisateur aRefUtilisateur) 
   {
      refUtilisateur = aRefUtilisateur;
   }   

	public String getRealMotdePasse() {
		return realMotdePasse;
	}

	public void setRealMotdePasse(String realMotdePasse) {
		this.realMotdePasse = realMotdePasse;
	}
	
    public void sendPassword() {
   	MessageObjet msg = new MessageObjet();
	Collection dest = new Vector();
	
	if (refUtilisateur != null) {
		dest.add(refUtilisateur.getEmail());
		msg.setDestinataires((Vector)dest);
		msg.setObjet("Creation de compte : " + refUtilisateur.getLogin());
		msg.setBody("\n Votre mot de passe : " + this.getMotdePasse());
		
		SmtpMailService smtpMail = new SmtpMailService();
		
		try {
			smtpMail.envoyer(msg);
		} catch (MailException e) {
			e.printStackTrace();
		}
	}
	
   }
   
   public void sendNewPassword() {
   	MessageObjet msg = new MessageObjet();
	Collection dest = new Vector();
	
	if (refUtilisateur != null) {
		dest.add(refUtilisateur.getEmail());
		msg.setDestinataires((Vector)dest);
		msg.setObjet("Changement de mot de passe du compte : " + refUtilisateur.getLogin());
		msg.setBody("\n Votre mot de passe : " + this.getMotdePasse());
		
		SmtpMailService smtpMail = new SmtpMailService();
		
		try {
			smtpMail.envoyer(msg);
		} catch (MailException e) {
			e.printStackTrace();
		}
	}
	
   }
   
   public void sendConfirmationNewPassword() {
   	MessageObjet msg = new MessageObjet();
	Collection dest = new Vector();
	
	if (refUtilisateur != null) {
		dest.add(refUtilisateur.getEmail());
		msg.setDestinataires((Vector)dest);
		msg.setObjet("Changement de mot de passe du compte : " + refUtilisateur.getLogin());
		msg.setBody("\n Vous venez de changer votre mot de passe");
		
		SmtpMailService smtpMail = new SmtpMailService();
		
		try {
			smtpMail.envoyer(msg);
		} catch (MailException e) {
			e.printStackTrace();
		}
	}
	
   }
   
   public String encryptPassword(String password) {

	MessageDigest md = null;
	try
		{
		md = MessageDigest.getInstance("SHA");
		md.update(password.getBytes("UTF-8"));
		byte raw[] = md.digest();
		String hash = (new BASE64Encoder()).encode(raw);
		return hash;
		}
		catch(Exception e)
		{
		return null;
		}
}
   
}
