package bl;

import java.util.List;

import dl.HerriaE;
import dl.PertsonaE;

public class MonitorizazioaJB {

	private HerriaE herria;
	private float portzentaia;
	private List<PertsonaE> pertsonak;
	private int oharKop;
	
	
	public MonitorizazioaJB(HerriaE herria, float portzentaia, List<PertsonaE> pertsonak,int oharKop) {
		super();
		this.herria = herria;
		this.portzentaia = portzentaia;
		this.pertsonak = pertsonak;
		this.oharKop=oharKop;
		portzentaiaKalkulatzea();
	}
	public HerriaE getHerria() {
		return herria;
	}
	public void setHerria(HerriaE herria) {
		this.herria = herria;
	}
	public float getPortzentaia() {
		return portzentaia;
	}
	public void setPortzentaia(float portzentaia) {
		this.portzentaia = portzentaia;
	}
	public List<PertsonaE> getPertsonak() {
		return pertsonak;
	}
	public void setPertsonak(List<PertsonaE> pertsonak) {
		this.pertsonak = pertsonak;
	}
	private void portzentaiaKalkulatzea() {
		
		for(PertsonaE perE:pertsonak) {
			if(perE.getOhartarazia()==true){
				oharKop=oharKop+1;
			}
		}
		portzentaia=(((float)oharKop/(float)herria.getBiztanleak()))*100;
	}
	public int getOharKop() {
		return oharKop;
	}
	public void setOharKop(int oharKop) {
		this.oharKop = oharKop;
	}
	
	
}
