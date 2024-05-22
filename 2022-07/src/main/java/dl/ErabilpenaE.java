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
 * The persistent class for the Erabilpena database table.
 * 
 */
@Entity
@Table(name="Erabilpena")
@NamedQueries({
	@NamedQuery(name="ErabilpenaE.findAll", query="SELECT e FROM ErabilpenaE e"),
	@NamedQuery(name="ErabilpenaE.findLogina", query="SELECT e FROM ErabilpenaE e WHERE e.appUser.username= :logina"),
	@NamedQuery(name="ErabilpenaE.findLoginaAmaitzeke", query="SELECT e FROM ErabilpenaE e WHERE e.appUser.username= :logina ORDER BY e.sarrera"),
	@NamedQuery(name="ErabilpenaE.findGela", query="SELECT DISTINCT(e.gela) FROM ErabilpenaE e"),
	@NamedQuery(name="ErabilpenaE.findGela2", query="SELECT e FROM ErabilpenaE e WHERE e.gela= :gela"),
})

public class ErabilpenaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idErabilpena;

	private String gela;

	@Temporal(TemporalType.TIMESTAMP)
	private Date irteera;

	@Temporal(TemporalType.TIMESTAMP)
	private Date sarrera;

	//uni-directional many-to-one association to AppUserE
	@ManyToOne
	@JoinColumn(name="AppUser_username")
	private AppUserE appUser;

	public ErabilpenaE() {
	}

	public ErabilpenaE(int idErabilpena, String gela, Date irteera, Date sarrera, AppUserE appUser) {
		super();
		this.idErabilpena = idErabilpena;
		this.gela = gela;
		this.irteera = irteera;
		this.sarrera = sarrera;
		this.appUser = appUser;
	}

	public int getIdErabilpena() {
		return this.idErabilpena;
	}

	public void setIdErabilpena(int idErabilpena) {
		this.idErabilpena = idErabilpena;
	}

	public String getGela() {
		return this.gela;
	}

	public void setGela(String gela) {
		this.gela = gela;
	}

	public Date getIrteera() {
		return this.irteera;
	}

	public void setIrteera(Date irteera) {
		this.irteera = irteera;
	}

	public Date getSarrera() {
		return this.sarrera;
	}

	public void setSarrera(Date sarrera) {
		this.sarrera = sarrera;
	}

	public AppUserE getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUserE appUser) {
		this.appUser = appUser;
	}

}