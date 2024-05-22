package dl;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the Kontaktua database table.
 * 
 */
@Entity
@Table(name="Kontaktua")
@NamedQueries({
	@NamedQuery(name="KontaktuaE.findAll", query="SELECT k FROM KontaktuaE k"),
	@NamedQuery(name="KontaktuaE.findArriskutsua", query="SELECT k FROM KontaktuaE k WHERE k.pertsona1.ohartarazia=:true1 OR k.pertsona2.ohartarazia=:true2 AND k.metroak<=2 AND k.minutuak>=5"),
})

public class KontaktuaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data;

	private float metroak;

	private int minutuak;

	//uni-directional many-to-one association to PertsonaE
	@ManyToOne
	@JoinColumn(name="Pertsona1_id")
	private PertsonaE pertsona1;

	//uni-directional many-to-one association to PertsonaE
	@ManyToOne
	@JoinColumn(name="Pertsona2_id")
	private PertsonaE pertsona2;

	public KontaktuaE() {
	}

	
	public KontaktuaE(int id, Date data, float metroak, int minutuak, PertsonaE pertsona1, PertsonaE pertsona2) {
		super();
		this.id = id;
		this.data = data;
		this.metroak = metroak;
		this.minutuak = minutuak;
		this.pertsona1 = pertsona1;
		this.pertsona2 = pertsona2;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public float getMetroak() {
		return this.metroak;
	}

	public void setMetroak(float metroak) {
		this.metroak = metroak;
	}

	public int getMinutuak() {
		return this.minutuak;
	}

	public void setMinutuak(int minutuak) {
		this.minutuak = minutuak;
	}

	public PertsonaE getPertsona1() {
		return this.pertsona1;
	}

	public void setPertsona1(PertsonaE pertsona1) {
		this.pertsona1 = pertsona1;
	}

	public PertsonaE getPertsona2() {
		return this.pertsona2;
	}

	public void setPertsona2(PertsonaE pertsona2) {
		this.pertsona2 = pertsona2;
	}

}