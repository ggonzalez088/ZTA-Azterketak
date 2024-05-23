package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TestuaFormMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	

	private String fill;

	private String testua;

	private int x;

	private int y;
	public TestuaFormMB() {
		// TODO Auto-generated constructor stub
	}
	
	public TestuaFormMB(String fill, String testua, int x, int y) {
		super();
		this.fill = fill;
		this.testua = testua;
		this.x = x;
		this.y = y;
	}

	public String getFill() {
		return fill;
	}
	public void setFill(String fill) {
		this.fill = fill;
	}
	public String getTestua() {
		return testua;
	}
	public void setTestua(String testua) {
		this.testua = testua;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void resetForm() {
		fill=null;
		x=0;
		y=0;
		testua=null;
	}

}
