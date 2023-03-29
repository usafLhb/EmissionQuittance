package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.utile.DateUtile;

public class OctHistoryItem 
{
	private long id;
	private int numHistorique;
	private int realNumHistorique;
	private Calendar dateHistorique;
	private String codeUser;
	private String codeUniteOrg;
	private String action;
	private String typeItem;
	private String user;

	   
	   public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public OctHistoryItem() 
	   {
	    
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
	   
		
		public String getLibelleDateHistorique() {
			if(getDateHistorique() == null) { 
				return null;
			}
			else {
				try {
				return DateUtile.calendarToString(getDateHistorique());
				}catch(Exception e) {
					return null;
				}
			}
		}

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getCodeUniteOrg() {
			return codeUniteOrg;
		}

		public void setCodeUniteOrg(String codeUniteOrg) {
			this.codeUniteOrg = codeUniteOrg;
		}

		public String getCodeUser() {
			return codeUser;
		}

		public void setCodeUser(String codeUser) {
			this.codeUser = codeUser;
		}

		public Calendar getDateHistorique() {
			return dateHistorique;
		}

		public void setDateHistorique(Calendar dateHistorique) {
			this.dateHistorique = dateHistorique;
		}

		public int getNumHistorique() {
			return numHistorique;
		}

		public void setNumHistorique(int numHistorique) {
			this.numHistorique = numHistorique;
		}

		public int getRealNumHistorique() {
			return realNumHistorique;
		}

		public void setRealNumHistorique(int realNumHistorique) {
			this.realNumHistorique = realNumHistorique;
		}

		public String getTypeItem() {
			return typeItem;
		}

		public void setTypeItem(String typeItem) {
			this.typeItem = typeItem;
		}
}
