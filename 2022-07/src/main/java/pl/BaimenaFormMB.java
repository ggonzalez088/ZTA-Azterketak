package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class BaimenaFormMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private String logina;
	private String gela;
	public BaimenaFormMB() {
		// TODO Auto-generated constructor stub
	}
	
	public BaimenaFormMB(String logina, String gela) {
		super();
		this.logina = logina;
		this.gela = gela;
	}

	public String getLogina() {
		return logina;
	}
	public void setLogina(String logina) {
		this.logina = logina;
	}
	public String getGela() {
		return gela;
	}
	public void setGela(String gela) {
		this.gela = gela;
	}

}
