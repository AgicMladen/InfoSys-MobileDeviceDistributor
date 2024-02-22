import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class katalogController
{
	private int id;
	private String model;
	private int cena;
	private String dostup;
	private String brend;
	
	
	@EJB
	private katalogService service;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public String getDostup() {
		return dostup;
	}
	public void setDostup(String dostup) {
		this.dostup = dostup;
	}
	public String getBrend() {
		return brend;
	}
	public void setBrend(String brend) {
		this.brend = brend;
	}
	
	public void saveKatalog()
	{
		service.createKatalog(id, model, cena, dostup, brend);
	}
	
	public void deleteKatalog()
	{
		service.deleteKatalog(id);
	}
	
	public void updateModel()
	{
		service.updateModel(id, model);
	}
	
	public void setDostupan()
	{
		service.setDostupan(id);
	}
	
	public void setNedostupan()
	{
		service.setNedostupan(id);
	}
	
	public katalog getKat()
	{
		katalog kat = new katalog();
		kat = service.getKat(id);
		return kat;
	}
	
	public List<katalog> listKatalog()
	{
		List<katalog>Katalog = service.listKat();
		return Katalog;
	}
}