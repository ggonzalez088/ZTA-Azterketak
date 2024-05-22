package dl;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the Lekua database table.
 * 
 */
@Entity
@Table(name="Lekua")
@NamedQuery(name="LekuaE.findAll", query="SELECT l FROM LekuaE l")
public class LekuaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLekua;

	@Column(name="Deskribapena")
	private String deskribapena;

	@Column(name="Izena")
	private String izena;

	@Column(name="Latitudea")
	private float latitudea;

	@Column(name="Longitudea")
	private float longitudea;

	public LekuaE() {
	}

	public LekuaE(int idLekua, String deskribapena, String izena, float latitudea, float longitudea) {
		super();
		this.idLekua = idLekua;
		this.deskribapena = deskribapena;
		this.izena = izena;
		this.latitudea = latitudea;
		this.longitudea = longitudea;
	}

	public int getIdLekua() {
		return this.idLekua;
	}

	public void setIdLekua(int idLekua) {
		this.idLekua = idLekua;
	}

	public String getDeskribapena() {
		return this.deskribapena;
	}

	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}

	public String getIzena() {
		return this.izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public float getLatitudea() {
		return this.latitudea;
	}

	public void setLatitudea(float latitudea) {
		this.latitudea = latitudea;
	}

	public float getLongitudea() {
		return this.longitudea;
	}

	public void setLongitudea(float longitudea) {
		this.longitudea = longitudea;
	}

}