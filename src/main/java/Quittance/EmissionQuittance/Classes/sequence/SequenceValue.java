package Quittance.EmissionQuittance.Classes.sequence;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class SequenceValue implements IEntite {

    protected SequenceDistributor  distributor = new SequenceDistributor();
    protected String OIDDistributor;
    protected String key;
    protected int value;
    protected boolean registered;

    public SequenceDistributor getDistributor(){
        return distributor;
    }

    public void setDistributor(SequenceDistributor distributor){
        this.distributor = distributor;
    }

    public String getKey(){
        return key;
    }

    public void setKey(String key){
        this.key = key;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setRegistered (boolean registered) {
        this.registered = registered;
    }

    public boolean getRegistered () {
        return registered;
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

	public String getOIDDistributor() {
		return OIDDistributor;
	}

	public void setOIDDistributor(String distributor) {
		OIDDistributor = distributor;
	}

}
