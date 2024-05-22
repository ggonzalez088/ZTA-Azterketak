package dl;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idKategoria;

	private String izena;

	public KategoriaE() {
	}

	public int getIdKategoria() {
		return this.idKategoria;
	}

	
	public KategoriaE(int idKategoria, String izena) {
		super();
		this.idKategoria = idKategoria;
		this.izena = izena;
	}

	public void setIdKategoria(int idKategoria) {
		this.idKategoria = idKategoria;
	}

	public String getIzena() {
		return this.izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

}