package bl;

import java.util.List;

import dl.KategoriaE;
import dl.LekuaE;

public class LekuKatJB {

	private LekuaE lekE;
	private List<KategoriaE> kategoriakE;
	
	
	public LekuKatJB() {
		
	}
	
	public LekuKatJB(LekuaE lekE, List<KategoriaE> katE) {
		super();
		this.lekE = lekE;
		this.kategoriakE = katE;
	}

	public LekuaE getLekE() {
		return lekE;
	}
	public List<KategoriaE> getKategoriakE() {
		return kategoriakE;
	}
	public void setLekE(LekuaE lekE) {
		this.lekE = lekE;
	}
	public void setKatE(List<KategoriaE> kategoriakE) {
		this.kategoriakE = kategoriakE;
	}
	
	
}
