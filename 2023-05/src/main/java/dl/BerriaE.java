package dl;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the Berria database table.
 * 
 */
@Entity
@Table(name="Berria")
@NamedQuery(name="BerriaE.findAll", query="SELECT b FROM BerriaE b")
public class BerriaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idBerria;

	@Temporal(TemporalType.DATE)
	@Column(name="`argitalpen-data`")
	private Date argitalpen_data;

	private String izenburua;

	private String testua;
	

	public BerriaE() {
	}

	
	public BerriaE(int idBerria, Date argitalpen_data, String izenburua, String testua) {
		super();
		this.idBerria = idBerria;
		this.argitalpen_data = argitalpen_data;
		this.izenburua = izenburua;
		this.testua = testua;
		
	}


	public int getIdBerria() {
		return this.idBerria;
	}

	public void setIdBerria(int idBerria) {
		this.idBerria = idBerria;
	}

	public Date getArgitalpen_data() {
		return this.argitalpen_data;
	}

	public void setArgitalpen_data(Date argitalpen_data) {
		this.argitalpen_data = argitalpen_data;
	}

	public String getIzenburua() {
		return this.izenburua;
	}

	public void setIzenburua(String izenburua) {
		this.izenburua = izenburua;
	}

	public String getTestua() {
		return this.testua;
	}

	public void setTestua(String testua) {
		this.testua = testua;
	}




}