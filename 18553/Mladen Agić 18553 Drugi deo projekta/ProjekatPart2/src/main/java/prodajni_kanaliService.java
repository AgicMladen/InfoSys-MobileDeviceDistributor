import java.util.List;

public interface prodajni_kanaliService
{
	public void createKanal(int id, String naziv, String tip, int popust, String telefon, String adresa);
	public void deleteKanal(int id);
	public void updateNazivKan(int id, String naziv);
	public void updateTipKan(int id, String tip);
	public void updatePopustKan(int id, int popust);
	public void updateTelefonKan(int id, String telefon);
	public void updateAdresaKan(int id, String adresa);
	public prodajni_kanali getKanal(int id);
	public List<prodajni_kanali> listKan();
	
}