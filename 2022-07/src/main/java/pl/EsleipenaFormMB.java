package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class EsleipenaFormMB implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private int  indexgela;
	
	public EsleipenaFormMB() {
		// TODO Auto-generated constructor stub
	}




	


	public EsleipenaFormMB(int indexgela) {
		super();
		this.indexgela = indexgela;
	}







	public int getIndexgela() {
		return indexgela;
	}

	public void setIndexgela(int indexgela) {
		this.indexgela = indexgela;
	}
	
}
