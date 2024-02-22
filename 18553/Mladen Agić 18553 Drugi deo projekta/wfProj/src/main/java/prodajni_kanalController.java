import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class prodajni_kanalController
{
	private int id;
	private String naziv;
	private String tip;
	private int popust;
	private String telefon;
	private String adresa;
	
	//private prodajni_kanali kanal = new prodajni_kanali();
	
	@EJB
	private prodajni_kanaliService service;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public prodajni_kanali GetKanal()
	{
		prodajni_kanali kanal = service.getKanal(id);
		this.id = kanal.GetId();
		this.naziv = kanal.GetNaziv();
		this.tip = kanal.GetTip();
		this.popust = kanal.GetPopust();
		this.telefon = kanal.GetTelefon();
		this.adresa = kanal.GetAdresa();
		return kanal;
	}
	
	public void SaveKanal()
	{
		service.createKanal(id,naziv, tip, popust,telefon, adresa);
	}
	
	public void DeleteKanal()
	{
		service.deleteKanal(id);
	}
	
	public void UpdateNazivKan()
	{
		service.updateNazivKan(id, naziv);
	}
	
	public void UpdateTipKan()
	{
		service.updateTipKan(id, tip);
	}
	
	public void UpdatePopustKan()
	{
		service.updatePopustKan(id, popust);
	}
	
	public void UpdateTelefonKan()
	{
		service.updateTelefonKan(id, telefon);
	}
	
	public void UpdateAdresaKan()
	{
		service.updateAdresaKan(id, adresa);
	}
	
	public List<prodajni_kanali> listKanali()
	{
		List<prodajni_kanali>sviKanali = service.listKan();
		return sviKanali;
	}
}