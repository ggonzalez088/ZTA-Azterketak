package pl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import bl.LekuKatJB;
import bl.OrokorraEJB;
import dl.KategoriaE;
import dl.LekuaE;

@Named
@SessionScoped
public class AtazakMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB private OrokorraEJB oEJB;
	private List<KategoriaE> partZerrenda=new ArrayList<KategoriaE>();
	private int pantaila=0;
	public AtazakMB() {
		// TODO Auto-generated constructor stub
	}
	public void kategoriaSartuDB(KatFormMB katF,ViewMB vMB) {
		KategoriaE kat= new KategoriaE(katF.getIzena(),katF.getDeskribapena());
		oEJB.KategoriaSartuDB(kat);
		katF.resetForm();
		vMB.resetView();
	}
	
	public void kategoriaZerrendaratu(int indexkat,ViewMB vMB) {
		KategoriaE katE= vMB.kategoriakLortuDB().get(indexkat);
		partZerrenda.add(katE);
		vMB.resetView();
	}
	public List<KategoriaE> getPartZerrenda() {
		return partZerrenda;
	}
	public int getPantaila() {
		return pantaila;
	}
	public void pantailaInformazioa(ViewMB vMB) {
		pantaila=0;
		vMB.resetView();
	}
	public void pantailaTaula(ViewMB vMB) {
		pantaila=1;
		vMB.resetView();
	}
	public void lekuaSartuDB(LekuFormMB lkMB,ViewMB vMB) {
		LekuaE lekE=new LekuaE(0, lkMB.getDeskribapena(), lkMB.getIzena(),lkMB.getLatitudea(), lkMB.getLongitudea());
		oEJB.lekuaSartuDB(lekE, partZerrenda);
		pantaila=1;
		partZerrenda.clear();
		vMB.resetView();
		lkMB.resetForm();
	}
	public void lekuaEzabatuDB(LekuKatJB lkJB,ViewMB vMB) {
		oEJB.lekuaEzabatuDB(lkJB.getLekE().getIdLekua());
		vMB.resetView();
	}

}
