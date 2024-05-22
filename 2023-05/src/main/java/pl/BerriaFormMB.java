package pl;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class BerriaFormMB implements Serializable {

	
	
	private static final long serialVersionUID = 1L;

	private String izenburua;
	private String testua;
	private Date data;
	private int indexkat;
	public BerriaFormMB() {
		// TODO Auto-generated constructor stub
	}

	public BerriaFormMB(String izenburua, String testua, Date data,int indexkat) {
		super();
		this.izenburua = izenburua;
		this.testua = testua;
		this.data=data;
		this.indexkat=indexkat;
	}

	public String getIzenburua() {
		return izenburua;
	}

	public String getTestua() {
		return testua;
	}



	public void setIzenburua(String izenburua) {
		this.izenburua = izenburua;
	}

	public void setTestua(String testua) {
		this.testua = testua;
	}

	

	public void resetForm() {
		izenburua=null;
		testua=null;
		data=null;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getIndexkat() {
		return indexkat;
	}

	public void setIndexkat(int indexkat) {
		this.indexkat = indexkat;
	}
	
	
}
