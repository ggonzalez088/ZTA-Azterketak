package pl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import bl.LekuKatJB;
import bl.OrokorraEJB;
import dl.KategoriaE;

@Named
@ViewScoped
public class ViewMB implements Serializable {

	private static final long serialVersionUID = 1L;
	@EJB private OrokorraEJB oEJB;
	private List<KategoriaE> kategoriak;
	private List<LekuKatJB> lekuKatJB;
	public ViewMB() {
		// TODO Auto-generated constructor stub
	}
	public List<KategoriaE> kategoriakLortuDB(){
		if(kategoriak==null) {
			kategoriak=oEJB.KategoriaKLortuDB();
		}
		return kategoriak;
	}
	
	
	public List<LekuKatJB> lekuKatJBLortuDB(){
		if(lekuKatJB==null) {
			lekuKatJB=oEJB.lekuKatJBLortuDB();
		}
		return lekuKatJB;
	}
	public void resetView() {
		kategoriak=null;
		lekuKatJB=null;
	}

}
