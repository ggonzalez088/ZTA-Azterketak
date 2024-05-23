package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IrudiaFormMB implements Serializable {

	private static final long serialVersionUID = 1L;
	private String izena;
	private int altuera;
	private int zabalera;
	public IrudiaFormMB() {
		// TODO Auto-generated constructor stub
	}
	
	public IrudiaFormMB(String izena, int altuera, int zabalera) {
		super();
		this.izena = izena;
		this.altuera = altuera;
		this.zabalera = zabalera;
	}

	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public int getAltuera() {
		return altuera;
	}
	public void setAltuera(int altuera) {
		this.altuera = altuera;
	}
	public int getZabalera() {
		return zabalera;
	}
	public void setZabalera(int zabalera) {
		this.zabalera = zabalera;
	}
	public void resetForm() {
		izena=null;
		altuera=0;
		zabalera=0;
	}

}
