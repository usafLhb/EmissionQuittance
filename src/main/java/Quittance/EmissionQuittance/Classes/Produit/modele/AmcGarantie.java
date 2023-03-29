package Quittance.EmissionQuittance.Classes.Produit.modele;

public enum AmcGarantie {

	// AMC garantie
			PLAFOND_PROTHESE("1"),PLAFOND_GENERAL("2"),MONTURE("3"),MATERNITE("4"),EXTENSION_GRT("5");
			
			private String value;

			private AmcGarantie(String value) {
				this.value = value;
			}
			
			public String getValue(){
				return value;
			}
			
			/**
			 * Recupere une enumeration depuis son code
			 * @param code
			 * @return
			 */
			public static AmcGarantie instance(String code){
				for(AmcGarantie e : AmcGarantie.values()){
				    if(e.value.equals(code)) return e;
				  }
				  return null;
			}
}
