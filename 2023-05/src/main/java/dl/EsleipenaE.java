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
 * The persistent class for the Esleipena database table.
 * 
 */
@Entity
@Table(name="Esleipena")
@NamedQueries({
@NamedQuery(name="EsleipenaE.findAll", query="SELECT e FROM EsleipenaE e"),
@NamedQuery(name="EsleipenaE.findKategoria", query="SELECT e FROM EsleipenaE e WHERE e.kategoria.idKategoria=:idKategoria"),
})
public class EsleipenaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEsleipena;

	//uni-directional many-to-one association to BerriaE
	@ManyToOne
	@JoinColumn(name="Berria_idBerria")
	private BerriaE berria;

	//uni-directional many-to-one association to KategoriaE
	@ManyToOne
	@JoinColumn(name="Kategoria_idKategoria")
	private KategoriaE kategoria;

	public EsleipenaE() {
	}

	public EsleipenaE(int idEsleipena, BerriaE berria, KategoriaE kategoria) {
		super();
		this.idEsleipena = idEsleipena;
		this.berria = berria;
		this.kategoria = kategoria;
	}

	public int getIdEsleipena() {
		return this.idEsleipena;
	}

	public void setIdEsleipena(int idEsleipena) {
		this.idEsleipena = idEsleipena;
	}

	public BerriaE getBerria() {
		return this.berria;
	}

	public void setBerria(BerriaE berria) {
		this.berria = berria;
	}

	public KategoriaE getKategoria() {
		return this.kategoria;
	}

	public void setKategoria(KategoriaE kategoria) {
		this.kategoria = kategoria;
	}

}