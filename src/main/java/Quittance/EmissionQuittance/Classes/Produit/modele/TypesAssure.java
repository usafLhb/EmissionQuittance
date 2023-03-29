package Quittance.EmissionQuittance.Classes.Produit.modele;

public enum TypesAssure {

	// TYPES ASSURE
	ASSURE("1"),CONJOINTE("2"),ENFANTS("3");

	private String value;

	private TypesAssure(String value) {
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
	public static TypesAssure instance(String code){
		for(TypesAssure e : TypesAssure.values()){
		    if(e.value.equals(code)) return e;
		  }
		  return null;
	}

}
