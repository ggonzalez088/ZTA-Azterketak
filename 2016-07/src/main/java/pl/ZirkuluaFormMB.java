package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;



@Named
@RequestScoped
public class ZirkuluaFormMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private int cx;

	private int cy;

	private String fill;

	private int r;
	
	public ZirkuluaFormMB() {
		// TODO Auto-generated constructor stub
	}
	
	public ZirkuluaFormMB( int cx, int cy, String fill, int r) {
		super();

		this.cx = cx;
		this.cy = cy;
		this.fill = fill;
		this.r = r;
	}

	
	public int getCx() {
		return cx;
	}
	public void setCx(int cx) {
		this.cx = cx;
	}
	public int getCy() {
		return cy;
	}
	public void setCy(int cy) {
		this.cy = cy;
	}
	public String getFill() {
		return fill;
	}
	public void setFill(String fill) {
		this.fill = fill;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public void resetForm() {
		cx=0;
		cy=0;
		fill=null;
		r=0;
	}

}
