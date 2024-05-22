package pl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import bl.GelaJB;
import bl.IrekiaEJB;


@Named
@ViewScoped
public class IrekiaViewMB implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<GelaJB> gelak;
	@EJB private IrekiaEJB iEJB;
	public IrekiaViewMB() {
		// TODO Auto-generated constructor stub
	}

	
	public List<GelaJB> gelakLortuDB(){
		if(gelak==null) {
			gelak=iEJB.gelakLortuDB();
		}
		return gelak;
	}
	public void resetView() {
		gelak=null;
	}
	
	
}
