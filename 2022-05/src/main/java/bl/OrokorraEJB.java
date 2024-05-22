package bl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.ejb3.annotation.SecurityDomain;

import dl.HerriaE;
import dl.KontaktuaE;
import dl.PertsonaE;
@SecurityDomain("ExamDbApplicationDomain")
@LocalBean
@Stateless

public class OrokorraEJB {

	@PersistenceContext private EntityManager em;
	
	public OrokorraEJB() {
		// TODO Auto-generated constructor stub
	}

	@RolesAllowed("osasungintza")
	@SuppressWarnings("unchecked")
	public List<PertsonaE> ataritikGoraLortuDB(float tenperatura){
		return (List<PertsonaE>) em.createNamedQuery("PertsonaE.findTenperatura").setParameter("tenperaturaAtaria", tenperatura).getResultList();
	}
	@RolesAllowed("osasungintza")
	public void ohartarazi(List<Integer> idak) {
		for(int id:idak) {
			PertsonaE perE=em.find(PertsonaE.class, id);
			perE.setOhartarazia(true);
			em.persist(perE);
		}
		@SuppressWarnings("unchecked")
		List<KontaktuaE> kontaktuak=(List<KontaktuaE>)em.createNamedQuery("KontaktuaE.findArriskutsua").setParameter("true1", true).setParameter("true2", true).getResultList();
		for(KontaktuaE konE:kontaktuak) {
			PertsonaE per1=em.find(PertsonaE.class,konE.getPertsona1().getId());
			per1.setOhartarazia(true);
			PertsonaE per2=em.find(PertsonaE.class,konE.getPertsona2().getId());
			per2.setOhartarazia(true);
			
			
		}
	}
	public List<MonitorizazioaJB> monitorizazioaLortuDB(){
		List<MonitorizazioaJB> lista=new ArrayList<MonitorizazioaJB>();
		@SuppressWarnings("unchecked")
		List<HerriaE> herriak=(List<HerriaE>)em.createNamedQuery("HerriaE.findAll").getResultList();
		for(HerriaE herE:herriak) {
			@SuppressWarnings("unchecked")
			List<PertsonaE> pertsonak=(List<PertsonaE>)em.createNamedQuery("PertsonaE.findHerria").setParameter("herriaid", herE.getId()).getResultList();
			MonitorizazioaJB monJB=new MonitorizazioaJB(herE, 0, pertsonak,0);
			lista.add(monJB);
		}
		return lista;
	}
	
}
