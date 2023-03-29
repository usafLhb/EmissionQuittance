package Quittance.EmissionQuittance.Classes.sequence;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class SequenceDistributor implements IEntite {

    private String code;
    private int startWith;
    private int incrementBy;

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public int getStartWith(){
        return startWith;
    }

    public void setStartWith(int startWith){
        this.startWith = startWith;
    }

    public int getIncrementBy(){
        return incrementBy;
    }

    public void setIncrementBy(int incrementBy){
        this.incrementBy = incrementBy;
    }

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setId(long id) {
		// TODO Auto-generated method stub
		
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
}
