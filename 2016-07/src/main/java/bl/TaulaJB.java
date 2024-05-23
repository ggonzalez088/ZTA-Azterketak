package bl;

import dl.IrudiaE;

public class TaulaJB {

	
	private IrudiaE irudia;
	private int zirkulukop;
	private int testukop;
	
	
	
	public TaulaJB() {
	}
	public TaulaJB(IrudiaE irudia, int zirkulukop, int testukop) {
		super();
		this.irudia = irudia;
		this.zirkulukop = zirkulukop;
		this.testukop = testukop;
	}
	public int getZirkulukop() {
		return zirkulukop;
	}
	public void setZirkulukop(int zirkulukop) {
		this.zirkulukop = zirkulukop;
	}
	public IrudiaE getIrudia() {
		return irudia;
	}
	public void setIrudia(IrudiaE irudia) {
		this.irudia = irudia;
	}
	public int getTestukop() {
		return testukop;
	}
	public void setTestukop(int testukop) {
		this.testukop = testukop;
	}
}
