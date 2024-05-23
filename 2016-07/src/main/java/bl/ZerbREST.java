package bl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import dl.IrudiaE;
import dl.TestuaE;
import dl.ZirkuluaE;

@Path("/zerbitzuak")
public class ZerbREST {

	
	@PersistenceContext private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@GET
	@Produces("application/json")
	@Path("/taulaLortuDBURL")
	public WTaulaJB taulaLortuDB() {
		List<TaulaJB> zerrenda=new ArrayList<TaulaJB>();
		List<IrudiaE> irudiak=(List<IrudiaE>)em.createNamedQuery("IrudiaE.findAll").getResultList();
		for(IrudiaE iru:irudiak) {
			List<TestuaE> testuak=(List<TestuaE>)em.createNamedQuery("TestuaE.findIrudia").setParameter("izena", iru.getIzena()).getResultList();
			List<ZirkuluaE> zirkuluak=(List<ZirkuluaE>)em.createNamedQuery("ZirkuluaE.findIrudia").setParameter("izena", iru.getIzena()).getResultList();
			TaulaJB taula=new TaulaJB(iru, zirkuluak.size(), testuak.size());
			zerrenda.add(taula);
		}
		WTaulaJB wrapper=new WTaulaJB(zerrenda);
		return wrapper;
		
	}
}
