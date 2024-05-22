package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class KatFormMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private String izena;
	private String deskribapena;
	
	public KatFormMB() {
		// TODO Auto-generated constructor stub
	}

	public KatFormMB(String izena, String deskribapena) {
		super();
		this.izena = izena;
		this.deskribapena = deskribapena;
	}

	public String getIzena() {
		return izena;
	}

	public String getDeskribapena() {
		return deskribapena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}
	public void resetForm() {
		izena=null;
		deskribapena=null;
	}
	
}
