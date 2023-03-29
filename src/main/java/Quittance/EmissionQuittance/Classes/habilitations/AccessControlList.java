package Quittance.EmissionQuittance.Classes.habilitations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import ma.co.omnidata.framework.services.ihm.commun.sessions.UtilisateurSession;

import com.rmawatanya.convergence.utile.referentiel.Fonctionnalite;

public class AccessControlList {
	
    private UtilisateurSession userSession;
    private ArrayList list = new ArrayList();
    
    
    public AccessControlList(UtilisateurSession userSession) {
        this.userSession = userSession;
        initialize();
    }
   
    public void initialize() {
    	Collection actions = userSession.getActions();
		if (actions != null) {
			for (Iterator iter = actions.iterator(); iter.hasNext();) {
				Fonctionnalite element = (Fonctionnalite) iter.next();
				list.add(String.valueOf(element.getCode()));
			}    				
		}       
    }

    public boolean hasPermission(String permissionCode) {
    	if (userSession.isSuperUtilisateur()) {
    		return true;
    	}
    	return list.contains(permissionCode);
    }

	public UtilisateurSession getUserSession() {
		return userSession;
	}
	public void setUserSession(UtilisateurSession userSession) {
		this.userSession = userSession;
	}
	
    public ArrayList getList() {
		return list;
	}
	public void setList(ArrayList list) {
		this.list = list;
	}
	
}