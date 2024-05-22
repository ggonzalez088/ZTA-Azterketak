package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LekuFormMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private String izena;
	private float latitudea;
	private float longitudea;
	private String deskribapena;
	private int indexkat;
	public LekuFormMB() {
		// TODO Auto-generated constructor stub
	}

	public LekuFormMB(String izena, float latitudea, float longitudea, String deskribapena) {
		super();
		this.izena = izena;
		this.latitudea = latitudea;
		this.longitudea = longitudea;
		this.deskribapena = deskribapena;
	}

	public String getIzena() {
		return izena;
	}

	public float getLatitudea() {
		return latitudea;
	}

	public float getLongitudea() {
		return longitudea;
	}

	public String getDeskribapena() {
		return deskribapena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public void setLatitudea(float latitudea) {
		this.latitudea = latitudea;
	}

	public void setLongitudea(float longitudea) {
		this.longitudea = longitudea;
	}

	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}
	public void resetForm() {
		izena=null;
		latitudea=0.0F;
		longitudea=0.0F;
		deskribapena=null;
	}

	public int getIndexkat() {
		return indexkat;
	}

	public void setIndexkat(int indexkat) {
		this.indexkat = indexkat;
	}



	
}
