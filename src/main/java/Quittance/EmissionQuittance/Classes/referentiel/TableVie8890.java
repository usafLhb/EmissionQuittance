
package Quittance.EmissionQuittance.Classes.referentiel;

import ma.co.deltasoft.parametrage.dal.ParametrageBO;
import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class TableVie8890 extends ParametrageBO implements IEntite {

	private static final long serialVersionUID = 1L;
	
	private long id;

	private long age;

	private Double lx;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean equals(Object obj) {
		if(this.getId()==((TableVie8890)obj).getId()){
			return true;
		}
			return false;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public Double getLx() {
		return lx;
	}

	public void setLx(Double lx) {
		this.lx = lx;
	}
	

	
	

	

}
