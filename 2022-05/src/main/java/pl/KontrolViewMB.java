package pl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import bl.MonitorizazioaJB;
import bl.OrokorraEJB;
import dl.PertsonaE;

@Named
@ViewScoped
public class KontrolViewMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<PertsonaE> pertsonak;
	private List<MonitorizazioaJB> monitorizazioa;
	@EJB private OrokorraEJB oEJB;
	public KontrolViewMB() {
		// TODO Auto-generated constructor stub
	}
	
	
	public List<PertsonaE> ataritikGoraLortuDB(TenpFormMB tfMB){
		resetView();
		if(pertsonak==null) {
			pertsonak=oEJB.ataritikGoraLortuDB(tfMB.getTenperatura());
		}
		tfMB.resetForm();
		
		return pertsonak;
		
	}
	public List<MonitorizazioaJB> monitorizazioaLortuDB(){
		resetView();
		if(monitorizazioa==null) {
			monitorizazioa=oEJB.monitorizazioaLortuDB();
		}
		
		return monitorizazioa;
		
	}
	public void resetView() {
		pertsonak=null;
	}


	public List<PertsonaE> getPertsonak() {
		return pertsonak;
	}


	public List<MonitorizazioaJB> getMonitorizazioa() {
		return monitorizazioa;
	}


	

	
	
}
