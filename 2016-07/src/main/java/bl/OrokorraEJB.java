package bl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import dl.IrudiaE;
import dl.SVGFitx;
import dl.TestuaE;
import dl.ZirkuluaE;

@LocalBean
@Stateless
public class OrokorraEJB {

	
	@PersistenceContext private EntityManager em;
	
	public OrokorraEJB() {
		// TODO Auto-generated constructor stub
	}
	
	public List<TaulaJB> taulaLortuDB(){
		WTaulaJB taula=ClientBuilder.newClient().target("http://localhost:8080/2016-07/rest/zerbitzuak/taulaLortuDBURL").request(MediaType.APPLICATION_JSON).get(WTaulaJB.class);
		return taula.getTaula();
	}
	public void irudiaEzabatuDB(String izena) {
		IrudiaE irudia=em.find(IrudiaE.class, izena);
		em.remove(irudia);
	}
	
	public void irudiaSartuDB(IrudiaE iru) {
		em.persist(iru);
	}
	public void zirkuluaSartu(ZirkuluaE zirkulua,String izena) {
		IrudiaE irudia=em.find(IrudiaE.class, izena);
		zirkulua.setIrudia(irudia);
		em.persist(zirkulua);
	}
	public void testuaSartu(TestuaE testua,String izena) {
		IrudiaE irudia=em.find(IrudiaE.class, izena);
		testua.setIrudia(irudia);
		em.persist(testua);
	}
	@SuppressWarnings("unchecked")
	public void fitxategiaLortu(String izena) {
		List<TestuaE> testuak=(List<TestuaE>)em.createNamedQuery("TestuaE.findIrudia").setParameter("izena", izena).getResultList();
		List<ZirkuluaE> zirkuluak=(List<ZirkuluaE>)em.createNamedQuery("ZirkuluaE.findIrudia").setParameter("izena", izena).getResultList();
		IrudiaE irudia=em.find(IrudiaE.class,izena);
		SVGFitx fitxa =new SVGFitx();
		fitxa.formaGuztiakIdatzi(zirkuluak, testuak,irudia.getHeight(),irudia.getWidth());
	}
}
