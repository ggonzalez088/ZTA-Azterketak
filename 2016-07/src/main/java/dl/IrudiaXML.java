package dl;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="svg")
public class IrudiaXML {
	
	private List<ZirkuluaE> zirkuluak;
	private List<TestuaE> testuak;
	private int height;
	private int width;
	
	public IrudiaXML() {
	}
	public IrudiaXML(List<ZirkuluaE> zirkuluak, List<TestuaE> testuak) {
		this.zirkuluak = zirkuluak;
		this.testuak = testuak;
	}
	@XmlElement(name="circle")
	public List<ZirkuluaE> getZirkuluak() {
		return zirkuluak;
	}
	public void setZirkuluak(List<ZirkuluaE> zirkuluak) {
		this.zirkuluak = zirkuluak;
	}
	@XmlElement(name="text")
	public List<TestuaE> getTestuak() {
		return testuak;
	}
	public void setTestuak(List<TestuaE> testuak) {
		this.testuak = testuak;
	}
	@XmlAttribute
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@XmlAttribute
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
