import java.util.List;

public interface zaposleniService
{
	public void createZaposlenog(int id, String ime, String prezime, String jmbg, int plata, int bonus);
	public void deleteZaposlenog(int id);
	public void updateImeZap(int id, String ime);
	public void updatePrezimeZap(int id, String prezime);
	public void updatePlataZap(int id, int plata);
	public void updateBonusZap(int id, int bonus);
	public void resetBonusZap(int id);
	public zaposleni getZap(int id);
	public List<zaposleni> listZap();
	public void resetMonth();
}