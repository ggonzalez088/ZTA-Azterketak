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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


/**
 * The persistent class for the Testua database table.
 * 
 */
@Entity
@Table(name="Testua")
@NamedQueries({
	@NamedQuery(name="TestuaE.findAll", query="SELECT t FROM TestuaE t"),
	@NamedQuery(name="TestuaE.findIrudia", query="SELECT t FROM TestuaE t WHERE t.irudia.izena= :izena"),
	
	
})
@XmlRootElement
public class TestuaE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTestua;
	
	private String fill;

	private String testua;

	private int x;

	private int y;

	//uni-directional many-to-one association to IrudiaE
	@ManyToOne
	@JoinColumn(name="Irudia_izena")
	private IrudiaE irudia;

	public TestuaE() {
	}

	
	public TestuaE(int idTestua, String fill, String testua, int x, int y, IrudiaE irudia) {
		super();
		this.idTestua = idTestua;
		this.fill = fill;
		this.testua = testua;
		this.x = x;
		this.y = y;
		this.irudia = irudia;
	}

	@XmlTransient
	public int getIdTestua() {
		return this.idTestua;
	}

	public void setIdTestua(int idTestua) {
		this.idTestua = idTestua;
	}
	@XmlAttribute
	public String getFill() {
		return this.fill;
	}

	public void setFill(String fill) {
		this.fill = fill;
	}
	
	public String getTestua() {
		return this.testua;
	}

	public void setTestua(String testua) {
		this.testua = testua;
	}
	@XmlAttribute
	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}
	@XmlAttribute
	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	@XmlTransient
	public IrudiaE getIrudia() {
		return this.irudia;
	}

	public void setIrudia(IrudiaE irudia) {
		this.irudia = irudia;
	}

}