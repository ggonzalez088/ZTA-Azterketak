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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;


/**
 * The persistent class for the Zirkulua database table.
 * 
 */
@Entity
@Table(name="Zirkulua")
@NamedQueries({
	@NamedQuery(name="ZirkuluaE.findAll", query="SELECT z FROM ZirkuluaE z"),
	@NamedQuery(name="ZirkuluaE.findIrudia", query="SELECT z FROM ZirkuluaE z WHERE z.irudia.izena= :izena"),
	
	
})

public class ZirkuluaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idZirkulua;

	private int cx;

	private int cy;

	private String fill;

	private int r;

	//uni-directional many-to-one association to IrudiaE
	@ManyToOne
	@JoinColumn(name="Irudia_izena")
	private IrudiaE irudia;

	public ZirkuluaE() {
	}
 
	
	public ZirkuluaE(int idZirkulua, int cx, int cy, String fill, int r, IrudiaE irudia) {
		super();
		this.idZirkulua = idZirkulua;
		this.cx = cx;
		this.cy = cy;
		this.fill = fill;
		this.r = r;
		this.irudia = irudia;
	}

	@XmlTransient
	public int getIdZirkulua() {
		return this.idZirkulua;
	}

	public void setIdZirkulua(int idZirkulua) {
		this.idZirkulua = idZirkulua;
	}
	@XmlAttribute
	public int getCx() {
		return this.cx;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}
	@XmlAttribute
	public int getCy() {
		return this.cy;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}
	@XmlAttribute
	public String getFill() {
		return this.fill;
	}

	public void setFill(String fill) {
		this.fill = fill;
	}
	@XmlAttribute
	public int getR() {
		return this.r;
	}

	public void setR(int r) {
		this.r = r;
	}
	@XmlTransient
	public IrudiaE getIrudia() {
		return this.irudia;
	}

	public void setIrudia(IrudiaE irudia) {
		this.irudia = irudia;
	}

}