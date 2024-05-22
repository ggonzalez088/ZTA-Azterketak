package pl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import bl.OrokorraEJB;
import dl.BerriaE;
import dl.KategoriaE;

@Named
@SessionScoped
public class KudAtazakMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB private OrokorraEJB oEJB;
	private int pantaila=0;
	private List<KategoriaE> katZerrenda=new ArrayList<KategoriaE>();
	
	public KudAtazakMB() {
		// TODO Auto-generated constructor stub
	}
	
	public void berriaSartuDB(BerriaFormMB berFMB,KudViewMB kvMB) {
		Date sdf=new Date();
		BerriaE berE= new BerriaE(0,sdf,berFMB.getIzenburua(),berFMB.getTestua());
		oEJB.berriaSartuDB(berE,katZerrenda);
		pantaila=1;
		katZerrenda.clear();
		kvMB.resetView();
	}
	public void pantailaBerria(KudViewMB kvMB) {
		pantaila=0;
		kvMB.resetView();
	}
	public void katZerrendaratu(int indexkat,KudViewMB kvMB) {
		KategoriaE kat=kvMB.kategoriakLortuDB().get(indexkat);
		katZerrenda.add(kat);
		kvMB.resetView();
	}

	public List<KategoriaE> getKatZerrenda() {
		return katZerrenda;
	}

	public void setKatZerrenda(List<KategoriaE> katZerrenda) {
		this.katZerrenda = katZerrenda;
	}

	public int getPantaila() {
		return pantaila;
	}
	
	
	

	
	
	
	
	
}
