package pl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import bl.OrokorraEJB;
import dl.BaimenaE;

@Named
@ViewScoped
public class LangileaViewMB implements Serializable {

	private static final long serialVersionUID = 1L;
	@EJB private OrokorraEJB oEJB;
	private List<BaimenaE> baimenak;
	public LangileaViewMB() {
		// TODO Auto-generated constructor stub
	}

	public List<BaimenaE> baimenakLortuDB(){
		if(baimenak==null) {
			baimenak=oEJB.baimenakLortuDB();
		}
		return baimenak;
	}
	public void resetView() {
		baimenak=null;
	}

	public List<BaimenaE> getBaimenak() {
		return baimenak;
	}


	
}
