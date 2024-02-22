import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

@Remote(zaposleniService.class)
@Stateless

public class zaposleniServiceImpl implements zaposleniService
{
	private static EntityManager em;
	
	public zaposleniServiceImpl()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prodajaPU");
		em = emf.createEntityManager();
	}

	@Override
	public void createZaposlenog(int id, String ime, String prezime, String jmbg, int plata, int bonus) {

		em.getTransaction().begin();
		zaposleni zap = new zaposleni (id, ime, prezime, jmbg, plata, bonus);
		em.persist(zap);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteZaposlenog(int id) {

		zaposleni zap = em.find(zaposleni.class, id);
		em.getTransaction().begin();
		em.remove(zap);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateImeZap(int id, String ime) {

		zaposleni zap = em.find(zaposleni.class, id);
		em.getTransaction().begin();
		zap.SetIme(ime);
		em.getTransaction().commit();
		
	}

	@Override
	public void updatePrezimeZap(int id, String prezime) {

		zaposleni zap = em.find(zaposleni.class, id);
		em.getTransaction().begin();
		zap.SetPrezime(prezime);
		em.getTransaction().commit();
		
	}

	@Override
	public void updatePlataZap(int id, int plata) {
		
		zaposleni zap = em.find(zaposleni.class, id);
		em.getTransaction().begin();
		zap.SetPlata(plata);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateBonusZap(int id, int bonus) {

		zaposleni zap = em.find(zaposleni.class, id);
		em.getTransaction().begin();
		zap.SetBonus(bonus);
		em.getTransaction().commit();
		
	}

	@Override
	public void resetBonusZap(int id) {
	
		zaposleni zap = em.find(zaposleni.class, id);
		em.getTransaction().begin();
		zap.SetBonus(0);
		em.getTransaction().commit();
		
	}

	@Override
	public zaposleni getZap(int id) {
		
		zaposleni zap = em.find(zaposleni.class, id);
		return zap;
	}

	@Override
	public List<zaposleni> listZap() {
		
		TypedQuery<zaposleni>query = em.createQuery("SELECT g FROM Glasac g", zaposleni.class);
		List<zaposleni> zaps = query.getResultList();
		return zaps;
	}

	@Override
	public void resetMonth() {

		TypedQuery<zaposleni>query = em.createQuery("SELECT z FROM zaposleni z", zaposleni.class);
		List<zaposleni> zaps = query.getResultList();
		for(zaposleni z : zaps)
		{
			z.SetBonus(0);
		}
		
	}

	
}