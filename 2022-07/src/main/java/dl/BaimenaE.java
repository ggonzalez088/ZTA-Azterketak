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
 * The persistent class for the Baimena database table.
 * 
 */
@Entity
@Table(name="Baimena")
@NamedQueries({
	@NamedQuery(name="BaimenaE.findAll", query="SELECT b FROM BaimenaE b"),
	@NamedQuery(name="BaimenaE.findLogina", query="SELECT b FROM BaimenaE b WHERE b.appUser.username= :logina")
	
})

public class BaimenaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idBaimena;

	private String gela;

	//uni-directional many-to-one association to AppUserE
	@ManyToOne
	@JoinColumn(name="AppUser_username")
	private AppUserE appUser;

	public BaimenaE() {
	}

	public BaimenaE(int idBaimena, String gela, AppUserE appUser) {
		super();
		this.idBaimena = idBaimena;
		this.gela = gela;
		this.appUser = appUser;
	}

	public int getIdBaimena() {
		return this.idBaimena;
	}

	public void setIdBaimena(int idBaimena) {
		this.idBaimena = idBaimena;
	}

	public String getGela() {
		return this.gela;
	}

	public void setGela(String gela) {
		this.gela = gela;
	}

	public AppUserE getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUserE appUser) {
		this.appUser = appUser;
	}

}