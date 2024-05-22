package pl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import bl.OrokorraEJB;
import dl.PertsonaE;

@Named
@SessionScoped
public class KontrolAtazakMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB private OrokorraEJB oEJB;
	public KontrolAtazakMB() {
		// TODO Auto-generated constructor stub
	}

	public void ohartarazi(List<PertsonaE> pertsonak,KontrolViewMB kvMB) {
		List<Integer> idak=new ArrayList<Integer>();
		for(PertsonaE perE:pertsonak) {
			idak.add(perE.getId());
		}
		oEJB.ohartarazi(idak);
		kvMB.resetView();
	}
	
	
}
