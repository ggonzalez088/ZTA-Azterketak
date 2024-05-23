package pl;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import bl.OrokorraEJB;
import dl.IrudiaE;
import dl.TestuaE;
import dl.ZirkuluaE;

@Named
@SessionScoped
public class AtazakMB implements Serializable {

	private static final long serialVersionUID = 1L;
	@EJB private OrokorraEJB oEJB;
	private String izena;
	public AtazakMB() {
		// TODO Auto-generated constructor stub
	}
	
	public void irudiaEzabatuDB(String izena,ViewMB vMB) {
		oEJB.irudiaEzabatuDB(izena);
		vMB.resetView();
	}
	public void irudiaSartuDB(IrudiaFormMB ifMB,ViewMB vMB) {
		IrudiaE irudia= new IrudiaE(ifMB.getIzena(),ifMB.getAltuera(),ifMB.getZabalera());
		oEJB.irudiaSartuDB(irudia);
		vMB.resetView();
		ifMB.resetForm();
	}
	public void izenaEzarri(String Izena) {
		izena=Izena;
	}
	
	public void zirkuluaSartuDB(ZirkuluaFormMB zfMB,ViewMB vMB) {
		ZirkuluaE zirkulua=new ZirkuluaE(0, zfMB.getCx(), zfMB.getCy(), zfMB.getFill(), zfMB.getR(), null);
		oEJB.zirkuluaSartu(zirkulua, izena);
		vMB.resetView();
		zfMB.resetForm();
	}
	public void testuaSartuDB(TestuaFormMB tfMB,ViewMB vMB) {
		TestuaE testua=new TestuaE(0, tfMB.getFill(), tfMB.getTestua(), tfMB.getX(), tfMB.getY(), null);
		oEJB.testuaSartu(testua, izena);
		vMB.resetView();
		tfMB.resetForm();
	}
	public void fitxategiaLortu(String izena) {
		oEJB.fitxategiaLortu(izena);
	}

}
