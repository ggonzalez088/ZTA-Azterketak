package bl;

import java.io.Serializable;
import java.util.List;

import dl.BerriaE;


public class WBerE implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<BerriaE> berriak;

	public WBerE() {
		
	}
	
	public WBerE(List<BerriaE> berriak) {
		super();
		this.berriak = berriak;
	}

	public List<BerriaE> getBerriak() {
		return berriak;
	}

	public void setBerriak(List<BerriaE> berriak) {
		this.berriak = berriak;
	}
	
	
	
}
