package pl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import bl.OrokorraEJB;
import bl.TaulaJB;
import dl.BerriaE;
import dl.KategoriaE;

@Named
@ViewScoped
public class KudViewMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<KategoriaE> kategoriak;
	private List<TaulaJB> taulak;
	@EJB private OrokorraEJB oEJB;
	public KudViewMB() {
		// TODO Auto-generated constructor stub
	}

	public Date dataLortu() {
		Date d=new Date();
		return d;
	}
	public List<KategoriaE> kategoriakLortuDB(){
		if(kategoriak==null) {
			kategoriak=oEJB.kategoriakLortuDB();
		}
		return kategoriak;
	}
	public void resetView() {
		kategoriak=null;
		taulak=null;
	}
	
	public List<TaulaJB> taulakLortuDB(){
		if(taulak==null) {
			taulak=oEJB.taulaJBLortuDB();
		}
		return taulak;
	}
	public List<BerriaE> berriakLortuDB(){
		return oEJB.berriakLortuDB();
	}
	
}
