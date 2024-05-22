package bl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dl.ErabilpenaE;

@LocalBean
@Stateless
public class IrekiaEJB {

	@PersistenceContext private EntityManager em;
	public IrekiaEJB() {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public List<GelaJB> gelakLortuDB(){
		List<String> gelak=(List<String>)em.createNamedQuery("ErabilpenaE.findGela").getResultList();
		List<GelaJB> gelaJB=new ArrayList<GelaJB>();
		for(String gela:gelak) {
			double denbora=0.0;
			List<ErabilpenaE> erabilpenak=(List<ErabilpenaE>)em.createNamedQuery("ErabilpenaE.findGela2").setParameter("gela",gela).getResultList();
			for(ErabilpenaE eraE:erabilpenak) {
				denbora=denbora+(eraE.getIrteera().getTime()-eraE.getSarrera().getTime());
			}
			GelaJB tmp=new GelaJB(gela,(denbora/1000));
			gelaJB.add(tmp);
			
		}
		return gelaJB;
		
	}

}
