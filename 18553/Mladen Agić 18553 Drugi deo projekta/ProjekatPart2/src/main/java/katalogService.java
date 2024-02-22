import java.util.List;

public interface katalogService
{
	public void createKatalog(int id, String model, int cena, String dostup, String brend);
	public void deleteKatalog(int id);
	public void updateModel(int id, String model);
	public void setDostupan(int id);
	public void setNedostupan(int id);
	public katalog getKat(int id);
	public List<katalog> listKat();
}