import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table (name = "katalog")
public class katalog
{
	@TableGenerator(name = "katalogGen", table = "id_gen", pkColumnName = "genName", valueColumnName = "genVal", allocationSize = 1, pkColumnValue = "katalogGen")
	
	@Id
	@Column(name="IDUREDJAJA")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "katalogGen")
	private int iduredjaja;
	
	@Column(name = "MODEL")
	private String model;
	
	@Column(name = "CENA")
	private int cena;
	
	@Column(name = "DOSTUPNOST")
	private String dostupnost;
	
	@Column(name = "BREND")
	private String brend;
	
	public katalog()
	{
		
	}
	
	public katalog(int iduredjaja, String model, int cena, String dostupnost, String brend)
	{
		this.SetId(iduredjaja);
		this.SetModel(model);
		this.SetCena(cena);
		this.SetDostupnost(dostupnost);
		this.SetBrend(brend);
	}
	
	public void SetId(int id)
	{
		this.iduredjaja = id;
	}
	
	public int GetId()
	{
		return iduredjaja;
	}
	
	public void SetModel(String model)
	{
		this.model = model;
	}
	
	public String GetModelv()
	{
		return model;
	}
	
	public void SetCena(int cena)
	{
		this.cena = cena;
	}
	
	public int GetCena()
	{
		return cena;
	}
	
	public void SetDostupnost(String dostupnost)
	{
		this.dostupnost = dostupnost;
	}
	
	public String GetDostupnost()
	{
		return dostupnost;
	}
	
	public void SetBrend(String brend)
	{
		this.brend = brend;
	}
	
	public String GetBrend()
	{
		return brend;
	}
	
}