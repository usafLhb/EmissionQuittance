package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.historique.HistoryItem;

public class VehiculeHistoryItem extends HistoryItem {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	private String typeCarburant;
	private String puissanceFiscale;
	private String marqueVeh;
	private String modeleVeh;
	private Calendar dateMiseEnCirculation;
	private String nImmat;
	private String vNeuf;
	private String vVenale;
	private String assurActuel;
	private Calendar dateEchenaceContrat;
	private ClientVehiculeHistoryItem refClientVehiculeHistoryItem;

	public VehiculeHistoryItem() {

	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTypeCarburant() {
		return typeCarburant;
	}

	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}

	public String getPuissanceFiscale() {
		return puissanceFiscale;
	}

	public void setPuissanceFiscale(String puissanceFiscale) {
		this.puissanceFiscale = puissanceFiscale;
	}

	public String getMarqueVeh() {
		return marqueVeh;
	}

	public void setMarqueVeh(String marqueVeh) {
		this.marqueVeh = marqueVeh;
	}

	public String getModeleVeh() {
		return modeleVeh;
	}

	public void setModeleVeh(String modeleVeh) {
		this.modeleVeh = modeleVeh;
	}

	public Calendar getDateMiseEnCirculation() {
		return dateMiseEnCirculation;
	}

	public void setDateMiseEnCirculation(Calendar dateMiseEnCirculation) {
		this.dateMiseEnCirculation = dateMiseEnCirculation;
	}

	public String getvNeuf() {
		return vNeuf;
	}

	public void setvNeuf(String vNeuf) {
		this.vNeuf = vNeuf;
	}

	public String getAssurActuel() {
		return assurActuel;
	}

	public void setAssurActuel(String assurActuel) {
		this.assurActuel = assurActuel;
	}

	public Calendar getDateEchenaceContrat() {
		return dateEchenaceContrat;
	}

	public void setDateEchenaceContrat(Calendar dateEchenaceContrat) {
		this.dateEchenaceContrat = dateEchenaceContrat;
	}

	public String getnImmat() {
		return nImmat;
	}

	public void setnImmat(String nImmat) {
		this.nImmat = nImmat;
	}

	public String getvVenale() {
		return vVenale;
	}

	public void setvVenale(String vVenale) {
		this.vVenale = vVenale;
	}

	public void setRefClientVehiculeHistoryItem(
			ClientVehiculeHistoryItem refClientVehiculeHistoryItem) {
		this.refClientVehiculeHistoryItem = refClientVehiculeHistoryItem;
	}

	public ClientVehiculeHistoryItem getRefClientVehiculeHistoryItem() {
		return refClientVehiculeHistoryItem;
	}

}
