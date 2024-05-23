package dl;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the Irudia database table.
 * 
 */
@Entity
@Table(name="Irudia")
@NamedQuery(name="IrudiaE.findAll", query="SELECT i FROM IrudiaE i")
public class IrudiaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String izena;

	private int height;

	private int width;

	public IrudiaE() {
	}

	
	public IrudiaE(String izena, int height, int width) {
		super();
		this.izena = izena;
		this.height = height;
		this.width = width;
	}


	public String getIzena() {
		return this.izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}