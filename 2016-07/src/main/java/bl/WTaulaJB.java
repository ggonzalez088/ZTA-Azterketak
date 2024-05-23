package bl;

import java.util.List;

public class WTaulaJB {

	List<TaulaJB> taula;

	public WTaulaJB(List<TaulaJB> taula) {
		super();
		this.taula = taula;
	}

	public WTaulaJB() {

	}

	public List<TaulaJB> getTaula() {
		return taula;
	}

	public void setTaula(List<TaulaJB> taula) {
		this.taula = taula;
	}
	
}
