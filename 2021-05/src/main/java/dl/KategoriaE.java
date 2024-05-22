package dl;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the Kategoria database table.
 * 
 */
@Entity
@Table(name="Kategoria")
@NamedQuery(name="KategoriaE.findAll", query="SELECT k FROM KategoriaE k")
public class KategoriaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Izena")
	private String izena;

	@Column(name="Deskribapena")
	private String deskribapena;

	public KategoriaE() {
	}

	public KategoriaE(String izena, String deskribapena) {
		super();
		this.izena = izena;
		this.deskribapena = deskribapena;
	}

	public String getIzena() {
		return this.izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getDeskribapena() {
		return this.deskribapena;
	}

	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}

}