package bl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dl.EsleipenaE;
import dl.KategoriaE;
import dl.LekuaE;

@LocalBean
@Stateless
public class OrokorraEJB {

	public OrokorraEJB() {
		// TODO Auto-generated constructor stub
	}
	@PersistenceContext private EntityManager em;
	
	
	public void KategoriaSartuDB(KategoriaE kat) {
		em.persist(kat);
	}
	
	@SuppressWarnings("unchecked")
	public List<KategoriaE> KategoriaKLortuDB(){
		return (List<KategoriaE>)em.createNamedQuery("KategoriaE.findAll").getResultList();
	}
	public void lekuaSartuDB(LekuaE lekE,List<KategoriaE> katZerrenda) {
		em.persist(lekE);
		for(KategoriaE katE:katZerrenda) {
			EsleipenaE elsE=new EsleipenaE(0, katE, lekE);
			em.persist(elsE);
		}
	}
	@SuppressWarnings("unchecked")
	public List<LekuKatJB> lekuKatJBLortuDB(){
		List<LekuKatJB> lekukatJB= new ArrayList<LekuKatJB>();
		List<LekuaE> lekuakE=(List<LekuaE>)em.createNamedQuery("LekuaE.findAll").getResultList();
		List<KategoriaE> kategoriakE=new ArrayList<KategoriaE>();
		for(LekuaE lekE: lekuakE) {
			List<EsleipenaE> esleipenakE=(List<EsleipenaE>)em.createNamedQuery("EsleipenaE.findLekua").setParameter("idlekua", lekE.getIdLekua()).getResultList();
			for(EsleipenaE eslE: esleipenakE) {
				kategoriakE.add(eslE.getKategoria());
			}
			LekuKatJB lkJB=new LekuKatJB(lekE,kategoriakE);
			lekukatJB.add(lkJB);
			kategoriakE.clear();
		}
		return lekukatJB;
	}
	
	public void lekuaEzabatuDB(int  idLekua) {
		LekuaE lekE=em.find(LekuaE.class, idLekua);
		em.remove(lekE);
	}
}
