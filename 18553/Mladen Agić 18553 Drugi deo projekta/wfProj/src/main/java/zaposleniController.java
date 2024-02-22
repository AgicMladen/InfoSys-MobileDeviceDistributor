import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class zaposleniController
{
	private int id;
	private String ime;
	private String prezime;
	private String jmbg;
	private int plata;
	private int bonus;
	
	@EJB
	private zaposleniService service;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public void saveZaposlenog()
	{
		service.createZaposlenog(id, ime, prezime, jmbg, plata, bonus);
	}
	
	public void deleteZaposlenog()
	{
		service.deleteZaposlenog(id);
	}
	
	public void updateIme()
	{
		service.updateImeZap(id, ime);
	}
	
	public void updatePrezime()
	{
		service.updatePrezimeZap(id, prezime);
	}
	
	public void updatePlata()
	{
		service.updatePlataZap(id, plata);
	}
	
	public void updateBonus()
	{
		service.updateBonusZap(id, bonus);
	}
	
	public void resetBonus()
	{
		service.resetBonusZap(id);
	}
	
	public List<zaposleni> listZaposleni()
	{
		List<zaposleni>sviZaposleni = service.listZap();
		return sviZaposleni;
	}

	public void resetMonth()
	{
		service.resetMonth();
	}
}