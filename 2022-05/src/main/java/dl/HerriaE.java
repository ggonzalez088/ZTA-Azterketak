package dl;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the Herria database table.
 * 
 */
@Entity
@Table(name="Herria")
@NamedQuery(name="HerriaE.findAll", query="SELECT h FROM HerriaE h")
public class HerriaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int biztanleak;

	private String izena;

	public HerriaE() {
	}

	
	public HerriaE(int id, int biztanleak, String izena) {
		super();
		this.id = id;
		this.biztanleak = biztanleak;
		this.izena = izena;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBiztanleak() {
		return this.biztanleak;
	}

	public void setBiztanleak(int biztanleak) {
		this.biztanleak = biztanleak;
	}

	public String getIzena() {
		return this.izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

}