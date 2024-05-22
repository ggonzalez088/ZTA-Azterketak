package bl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.annotation.security.DenyAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.ejb3.annotation.SecurityDomain;

import dl.AppUserE;
import dl.BaimenaE;
import dl.ErabilpenaE;

@SecurityDomain("ExamDbApplicationDomain")
@DenyAll
@Stateless
@LocalBean
public class OrokorraEJB {

	@Resource javax.ejb.EJBContext ejbContext;
	@PersistenceContext private EntityManager em;
	public OrokorraEJB() {
		// TODO Auto-generated constructor stub
	}
	@RolesAllowed("administraria")
	public void baimenaSartu(String logina,String gela) {
		AppUserE appE=em.find(AppUserE.class, logina);
		BaimenaE baiE=new BaimenaE(0,gela,appE);
		em.persist(baiE);
	}
	@RolesAllowed("langilea")
	public boolean langileaEgiaztatuDB() {
		@SuppressWarnings("unchecked")
		List<ErabilpenaE> erabilpenak=(List<ErabilpenaE>)em.createNamedQuery("ErabilpenaE.findLogina").setParameter("logina", ejbContext.getCallerPrincipal().getName()).getResultList();
		ErabilpenaE eraE=erabilpenak.get(erabilpenak.size()-1);
		if(eraE.getIrteera()==null) {
			return true;
		}
		return false;
	}
	@SuppressWarnings("unchecked")
	@RolesAllowed("langilea")
	public List<BaimenaE> baimenakLortuDB(){
		return(List<BaimenaE>)em.createNamedQuery("BaimenaE.findLogina").setParameter("logina", ejbContext.getCallerPrincipal().getName()).getResultList();
	}
	@RolesAllowed("langilea")
	public void erabilpenaSartuDB(String gela) {
		Date d=new Date();
		AppUserE appE=em.find(AppUserE.class,ejbContext.getCallerPrincipal().getName());
		
		ErabilpenaE eraE=new ErabilpenaE(0, gela, null, d, appE);
		em.persist(eraE);
	}
	@SuppressWarnings({ "unused", "unchecked" })
	@RolesAllowed("langilea")
	public void erabilpenaAmaituDB() {
		Date d=new Date();
		List<ErabilpenaE> erabilpenak=(List<ErabilpenaE>)em.createNamedQuery("ErabilpenaE.findLoginaAmaitzeke").setParameter("logina", ejbContext.getCallerPrincipal().getName()).getResultList();
		for(ErabilpenaE eraE:erabilpenak) {
			eraE=em.find(ErabilpenaE.class, eraE.getIdErabilpena());
			eraE.setIrteera(d);
		}
	}
	
	
	
}
