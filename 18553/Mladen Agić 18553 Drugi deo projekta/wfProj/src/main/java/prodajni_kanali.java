import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table (name = "prodajni_kanali")
public class prodajni_kanali
{
	@TableGenerator(name = "prodajni_kanaliGen", table = "id_gen", pkColumnName = "genName", valueColumnName = "genVal", allocationSize = 1, pkColumnValue = "prodajni_kanaliGen")
	
	@Id
	@Column(name="IDPRODAJNOGKANALA")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "prodajni_kanaliGen")
	private int idprodajnog_kanala;
	
	@Column(name = "NAZIV")
	private String naziv;
	
	@Column(name = "TIP")
	private String tip;
	
	@Column(name = "POPUST")
	private int popust;
	
	@Column(name = "TELEFON")
	private String telefon;
	
	@Column(name = "ADRESA")
	private String adresa;
	
	public prodajni_kanali()
	{
		
	}
	
	public prodajni_kanali(int idprodajnog_kanala, String naziv, String tip, int popust, String telefon, String adresa)
	{
		this.SetId(idprodajnog_kanala);
		this.SetNaziv(naziv);
		this.SetTip(tip);
		this.SetPopust(popust);
		this.SetTelefon(telefon);
		this.SetAdresa(adresa);
	}
	
	public void SetId(int id)
	{
		this.idprodajnog_kanala = id;
	}
	
	public int GetId()
	{
		return idprodajnog_kanala;
	}
	
	public void SetNaziv(String naziv)
	{
		this.naziv = naziv;
	}
	
	public String GetNaziv()
	{
		return naziv;
	}
	
	public void SetTip(String tip)
	{
		this.tip = tip;
	}
	
	public String GetTip()
	{
		return tip;
	}
	
	public void SetPopust(int popust)
	{
		this.popust = popust;
	}
	
	public int GetPopust()
	{
		return popust;
	}
	
	public void SetTelefon(String telefon)
	{
		this.telefon = telefon;
	}
	
	public String GetTelefon()
	{
		return telefon;
	}
	
	public void SetAdresa(String adresa)
	{
		this.adresa = adresa;
	}
	
	public String GetAdresa()
	{
		return adresa;
	}
}