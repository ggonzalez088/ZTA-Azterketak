package pl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import bl.OrokorraEJB;
import bl.TaulaJB;

@Named
@ViewScoped
public class ViewMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB private OrokorraEJB oEJB;
	private List<TaulaJB> irudiak;
	public ViewMB() {
		// TODO Auto-generated constructor stub
	}

	public void resetView() {
		irudiak=null;
	}
	public List<TaulaJB> irudiaLortuDB(){
		if(irudiak==null)
			irudiak=oEJB.taulaLortuDB();
		return irudiak;
	}

	
	
}
