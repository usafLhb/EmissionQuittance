package Quittance.EmissionQuittance.Classes.Produit.modele;

import org.apache.log4j.Logger;

public enum AmcFormule {

	// AMC FORMULE
	AMC_FORMULE_Essentielle("0","Essentielle"),
	AMC_FORMULE_Optimale("1","Optimale"),
	AMC_FORMULE_Confort("2","Confort"),
	AMC_FORMULE_Confort_Plus("3","Confort Plus"),
	
	// Protection famille formule
	PF_FORMULE_1("15","FORMULE 1"),
	PF_FORMULE_2("16","FORMULE 2"),
	PF_FORMULE_3("17","FORMULE 3");

	private String value;
	private String libelle;
	private static final Logger LOG = Logger.getLogger(AmcFormule.class);

	private AmcFormule(String value,String libelle) {
		this.value = value;
		this.libelle=libelle;
	}

	public String getValue(){
		return value;
	}


	public String getLibelle() {
		return libelle;
	}

	/**
	 * Recupere une enumeration depuis son code
	 * @param code
	 * @return
	 */
	public static AmcFormule instance(String code){
		for(AmcFormule e : AmcFormule.values()){
		    if(e.value.equals(code)) return e;
		  }

		  LOG.error("le code specifie ne correspond a aucune formule");
		  return null;
	}

}