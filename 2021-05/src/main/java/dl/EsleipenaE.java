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
@NamedQuery(name="EsleipenaE.findLekua", query="SELECT e FROM EsleipenaE e WHERE e.lekua.idLekua=:idlekua"),
})
public class EsleipenaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEsleipena;

	//uni-directional many-to-one association to KategoriaE
	@ManyToOne
	@JoinColumn(name="Kategoria_Izena")
	private KategoriaE kategoria;

	//uni-directional many-to-one association to LekuaE
	@ManyToOne
	@JoinColumn(name="Lekua_idLekua")
	private LekuaE lekua;

	public EsleipenaE() {
	}

	public int getIdEsleipena() {
		return this.idEsleipena;
	}

	public void setIdEsleipena(int idEsleipena) {
		this.idEsleipena = idEsleipena;
	}

	public KategoriaE getKategoria() {
		return this.kategoria;
	}

	public void setKategoria(KategoriaE kategoria) {
		this.kategoria = kategoria;
	}

	public LekuaE getLekua() {
		return this.lekua;
	}

	public void setLekua(LekuaE lekua) {
		this.lekua = lekua;
	}

	public EsleipenaE(int idEsleipena, KategoriaE kategoria, LekuaE lekua) {
		super();
		this.idEsleipena = idEsleipena;
		this.kategoria = kategoria;
		this.lekua = lekua;
	}

}