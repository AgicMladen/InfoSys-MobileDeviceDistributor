import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

@Remote(zaposleniService.class)
@Stateless

public class katalogServiceImpl implements katalogService
{
	
	private static EntityManager em;
	
	public katalogServiceImpl()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prodajaPU");
		em = emf.createEntityManager();
	}

	@Override
	public void createKatalog(int id, String model, int cena, String dostup, String brend) {

		em.getTransaction().begin();
		katalog kat = new katalog (id, model, cena, dostup, brend);
		em.persist(kat);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteKatalog(int id) {

		katalog kat = em.find(katalog.class, id);
		em.getTransaction().begin();
		em.remove(kat);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateModel(int id, String model) {
		
		katalog kat = em.find(katalog.class, id);
		em.getTransaction().begin();
		kat.SetModel(model);
		em.getTransaction().commit();
		
	}

	@Override
	public void setDostupan(int id) {

		katalog kat = em.find(katalog.class, id);
		em.getTransaction().begin();
		kat.SetDostupnost("Dostupan");
		em.getTransaction().commit();
		
	}

	@Override
	public void setNedostupan(int id) {
		
		katalog kat = em.find(katalog.class, id);
		em.getTransaction().begin();
		kat.SetDostupnost("Nedostupan");
		em.getTransaction().commit();
		
	}

	@Override
	public katalog getKat(int id) {

		katalog kat = em.find(katalog.class, id);
		return kat;
		
	}

	@Override
	public List<katalog> listKat() {
		
		TypedQuery<katalog>query = em.createQuery("SELECT k FROM katalog k", katalog.class);
		List<katalog> kats = query.getResultList();
		return kats;
	}
	
}