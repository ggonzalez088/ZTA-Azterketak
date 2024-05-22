package bl;

import dl.KategoriaE;

public class TaulaJB {
	
	private KategoriaE katE;
	private int kop;
	public TaulaJB(KategoriaE katE, int kop) {
		super();
		this.katE = katE;
		this.kop = kop;
	}
	
	public TaulaJB() {
	}

	public KategoriaE getKatE() {
		return katE;
	}
	public int getKop() {
		return kop;
	}
	public void setKatE(KategoriaE katE) {
		this.katE = katE;
	}
	public void setKop(int kop) {
		this.kop = kop;
	}
	
	
	
}
