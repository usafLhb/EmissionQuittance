package Quittance.EmissionQuittance.Classes.sequence;


public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Test1 c0= new Test1();
		c0.setNom("test");
		System.out.println(c0.getNom()+"\n");
		met(c0.clone());
		System.out.println(c0.getNom()+"\n");
	}
	public static void met(Object c){
		
		Test1 c1=(Test1) c;
		    			//System.out.println(c.getNom()+"\n"+c1.getNom());
			 c1.setNom("test11111");
			 //System.out.println(c0.getNom()+"\n"+c1.getNom());
	}
	
	
}
class Test1 implements          Cloneable {
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}