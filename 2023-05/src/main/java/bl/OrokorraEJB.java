package bl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import dl.BerriaE;
import dl.EsleipenaE;
import dl.KategoriaE;

@LocalBean
@Stateless
public class OrokorraEJB {

	@PersistenceContext private EntityManager em;
	
	public OrokorraEJB() {
		// TODO Auto-generated constructor stub
	}
	
	public void berriaSartuDB(BerriaE berE,List<KategoriaE> katZerrenda) {
		em.persist(berE);
		for(KategoriaE katE: katZerrenda) {
			EsleipenaE eslE=new EsleipenaE(0,berE,katE);
			em.persist(eslE);
		}
	}
	@SuppressWarnings("unchecked")
	public List<KategoriaE> kategoriakLortuDB() {
		return (List<KategoriaE>)em.createNamedQuery("KategoriaE.findAll").getResultList();
	}
	public List<TaulaJB> taulaJBLortuDB(){
		List<KategoriaE> kategoriak=kategoriakLortuDB();
		List<TaulaJB> taula=new ArrayList<TaulaJB>();
		for(KategoriaE katE: kategoriak) {
			@SuppressWarnings("unchecked")
			List<EsleipenaE> esleipenak=em.createNamedQuery("EsleipenaE.findKategoria").setParameter("idKategoria", katE.getIdKategoria()).getResultList();
			TaulaJB tJB=new TaulaJB(katE,esleipenak.size());
			taula.add(tJB);
		}
		return taula;
	}
	
	public List<BerriaE> berriakLortuDB(){
		WBerE wrapper=ClientBuilder.newClient().target("http://localhost:8080/2023-05/rest/zerbitzuak/berriakLortuDBURL").request(MediaType.APPLICATION_JSON).get(WBerE.class);
		return (wrapper.getBerriak());
	}
	
}
