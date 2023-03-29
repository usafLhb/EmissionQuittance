
package Quittance.EmissionQuittance.Classes.Contrat.modele;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.application.oct.metier.valueobjects.OctSortPartPatronaleVO;

public class SortPartPatronale implements IEntite
{
   private long id;
  
   private String sortPartPatronale;
   private String commentaire;
   private Integer ancienneteMax;
   private Integer ancienneteMin;
//   private TypeSalarie refTypeSalarie;
//   private Contrat refContrat;
   private PrimePersonnel refPrimePersonnel;



public SortPartPatronale() 
   {
    
   }
    
   
	public long getId() {
	return id;
}



public void setId(long id) {
	this.id = id;
}





//public TypeSalarie getRefTypeSalarie() {
//	return refTypeSalarie;
//}
//
//
//
//public void setRefTypeSalarie(TypeSalarie refTypeSalarie) {
//	this.refTypeSalarie = refTypeSalarie;
//}
//
//
//
//public Contrat getRefContrat() {
//	return refContrat;
//}
//
//
//
//public void setRefContrat(Contrat refContrat) {
//	this.refContrat = refContrat;
//}



	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getSortPartPatronale() {
		return sortPartPatronale;
	}



	public void setSortPartPatronale(String sortPartPatronale) {
		this.sortPartPatronale = sortPartPatronale;
	}



	public String getCommentaire() {
		return commentaire;
	}



	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}



	public Integer getAncienneteMax() {
		return ancienneteMax;
	}



	public void setAncienneteMax(Integer ancienneteMax) {
		this.ancienneteMax = ancienneteMax;
	}



	public Integer getAncienneteMin() {
		return ancienneteMin;
	}



	public void setAncienneteMin(Integer ancienneteMin) {
		this.ancienneteMin = ancienneteMin;
	}


	public OctSortPartPatronaleVO convertToVo() {
		OctSortPartPatronaleVO octSortPartPatronaleVO = new OctSortPartPatronaleVO();
		octSortPartPatronaleVO.setIdTypeSalarieChoisi(String.valueOf(this.id));
		
		
		if(this.ancienneteMax != null && !this.ancienneteMax.equals("")) {
			octSortPartPatronaleVO.setAncienneteMax(String.valueOf(ancienneteMax));
		}
		if(this.ancienneteMin != null && !this.ancienneteMin.equals("")) {
			octSortPartPatronaleVO.setAncienneteMin(String.valueOf(ancienneteMin));
		}
		if(this.sortPartPatronale != null && !this.sortPartPatronale.equals("")) {
			octSortPartPatronaleVO.setSortPartPatronale(sortPartPatronale);
		}
		if(this.commentaire != null && !this.commentaire.equals("")) {
			octSortPartPatronaleVO.setAutreSortPartPatronale(commentaire);
		}

				
		if(this.refPrimePersonnel.getRefTypeSalarie() != null) {
			octSortPartPatronaleVO.setIdTypeSalarieChoisi(String.valueOf(this.refPrimePersonnel.getRefTypeSalarie().getId()));
			octSortPartPatronaleVO.setLibelleCategorieChoisi(this.refPrimePersonnel.getRefTypeSalarie().getLibelle());
		}
//		if(this.refTypeSalarie != null) {
//			octSortPartPatronaleVO.setIdTypeSalarie(String.valueOf(this.refTypeSalarie.getId()));
//		}
		
		return octSortPartPatronaleVO;
	}

	public boolean isToBeRemoved() {
		if(this.ancienneteMax == null 
				&& this.ancienneteMin == null
				&& this.sortPartPatronale == null  
				)
		{
			return true;
		}
		return false;
	}


	public PrimePersonnel getRefPrimePersonnel() {
		return refPrimePersonnel;
	}


	public void setRefPrimePersonnel(PrimePersonnel refPrimePersonnel) {
		this.refPrimePersonnel = refPrimePersonnel;
	}
}
