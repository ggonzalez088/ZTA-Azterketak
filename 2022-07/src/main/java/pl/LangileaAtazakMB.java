package pl;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import bl.OrokorraEJB;
import dl.BaimenaE;

@Named
@SessionScoped
public class LangileaAtazakMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB private OrokorraEJB oEJB;
	public LangileaAtazakMB() {
		// TODO Auto-generated constructor stub
	}

	
	public boolean langileaEgiaztatuDB(LangileaViewMB lvMB) {
		lvMB.resetView();
		return oEJB.langileaEgiaztatuDB();
		
		
	}
	public void erabilpenaSartuDB(EsleipenaFormMB efMB,LangileaViewMB lvMB) {
		BaimenaE baiE=lvMB.getBaimenak().get(efMB.getIndexgela());
		oEJB.erabilpenaSartuDB(baiE.getGela());
	}
	public void erabilpenaAmaitu(LangileaViewMB lvMB) {
		oEJB.erabilpenaAmaituDB();
		lvMB.resetView();
	}
}
