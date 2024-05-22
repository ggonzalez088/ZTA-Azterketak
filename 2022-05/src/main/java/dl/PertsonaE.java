package dl;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the Pertsona database table.
 * 
 */
@Entity
@Table(name="Pertsona")
@NamedQueries({
	@NamedQuery(name="PertsonaE.findAll", query="SELECT p FROM PertsonaE p"),
	@NamedQuery(name="PertsonaE.findTenperatura", query="SELECT p FROM PertsonaE p WHERE p.tenperatura>=:tenperaturaAtaria"),
	@NamedQuery(name="PertsonaE.findHerria", query="SELECT p FROM PertsonaE p WHERE p.herria.id=:herriaid"),
})

public class PertsonaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private boolean ohartarazia;

	private float tenperatura;

	//uni-directional many-to-one association to HerriaE
	@ManyToOne
	@JoinColumn(name="Herria_id")
	private HerriaE herria;

	public PertsonaE() {
	}

	
	public PertsonaE(int id, boolean ohartarazia, float tenperatura, HerriaE herria) {
		super();
		this.id = id;
		this.ohartarazia = ohartarazia;
		this.tenperatura = tenperatura;
		this.herria = herria;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getOhartarazia() {
		return this.ohartarazia;
	}

	public void setOhartarazia(boolean ohartarazia) {
		this.ohartarazia = ohartarazia;
	}

	public float getTenperatura() {
		return this.tenperatura;
	}

	public void setTenperatura(float tenperatura) {
		this.tenperatura = tenperatura;
	}

	public HerriaE getHerria() {
		return this.herria;
	}

	public void setHerria(HerriaE herria) {
		this.herria = herria;
	}

}