import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import java.util.List;

@Remote(prodajni_kanaliService.class)
@Stateless

public class prodajni_kanaliServiceImpl implements prodajni_kanaliService
{
	private static EntityManager em;
	
	public prodajni_kanaliServiceImpl()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prodajaPU");
		em = emf.createEntityManager();
	}

	@Override
	public void createKanal(int id, String naziv, String tip, int popust, String telefon, String adresa) {

		em.getTransaction().begin();
		prodajni_kanali kan = new prodajni_kanali (id, naziv, tip, popust, telefon, adresa);
		em.persist(kan);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteKanal(int id) {

		prodajni_kanali kan = em.find(prodajni_kanali.class, id);
		em.getTransaction().begin();
		em.remove(kan);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateNazivKan(int id, String naziv) {

		prodajni_kanali kan = em.find(prodajni_kanali.class, id);
		em.getTransaction().begin();
		kan.SetNaziv(naziv);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateTipKan(int id, String tip) {

		prodajni_kanali kan = em.find(prodajni_kanali.class, id);
		em.getTransaction().begin();
		kan.SetTip(tip);
		em.getTransaction().commit();
		
	}

	@Override
	public void updatePopustKan(int id, int popust) {

		prodajni_kanali kan = em.find(prodajni_kanali.class, id);
		em.getTransaction().begin();
		kan.SetPopust(popust);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateTelefonKan(int id, String telefon) {

		prodajni_kanali kan = em.find(prodajni_kanali.class, id);
		em.getTransaction().begin();
		kan.SetTelefon(telefon);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateAdresaKan(int id, String adresa) {

		prodajni_kanali kan = em.find(prodajni_kanali.class, id);
		em.getTransaction().begin();
		kan.SetAdresa(adresa);
		em.getTransaction().commit();
		
	}

	@Override
	public prodajni_kanali getKanal(int id) {
		prodajni_kanali kan = em.find(prodajni_kanali.class, id);
		return kan;
	}

	@Override
	public List<prodajni_kanali> listKan() {

		TypedQuery<prodajni_kanali>query = em.createQuery("SELECT k FROM prodajni_kanali k", prodajni_kanali.class);
		List<prodajni_kanali> kans = query.getResultList();
		return kans;
		
	}
}