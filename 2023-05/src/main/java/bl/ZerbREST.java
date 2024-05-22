package bl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import dl.BerriaE;

@Path("/zerbitzuak")
public class ZerbREST {

	
	@PersistenceContext private EntityManager em;
	
	@Path("/berriakLortuDBURL")
	@GET
	@Produces("application/json")
	public WBerE berriakLortuDB(){
		@SuppressWarnings("unchecked")
		List<BerriaE> berriak=(List<BerriaE>)em.createNamedQuery("BerriaE.findAll").getResultList();
		WBerE wrapper=new WBerE(berriak);
		return wrapper;
	}
	
}
