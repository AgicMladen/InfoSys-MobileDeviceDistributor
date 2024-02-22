import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table (name = "zaposleni")
public class zaposleni
{
	@TableGenerator(name = "zaposleniGen", table = "id_gen", pkColumnName = "genName", valueColumnName = "genVal", allocationSize = 1, pkColumnValue = "zaposleniGen")
	
	@Id
	@Column(name="IDZAPOSLENOG")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "zaposleniGen")
	private int idzaposlenog;
	
	@Column(name="IME")
	private String ime;
	
	@Column(name="PREZIME")
	private String prezime;
	
	@Column(name="JMBG")
	private String jmbg;
	
	@Column(name="PLATA")
	private int plata;
	
	@Column(name="BONUS")
	private int bonus;
	
	public zaposleni()
	{
		
	}
	
	public zaposleni(int idzaposlenog, String ime, String prezime, String jmbg, int plata, int bonus)
	{
		this.SetId(idzaposlenog);
		this.SetIme(ime);
		this.SetPrezime(prezime);
		this.SetJmbg(jmbg);
		this.SetPlata(plata);
		this.SetBonus(bonus);
	}
	
	public void SetId(int id)
	{
		this.idzaposlenog = id;
	}
	
	public int GetId()
	{
		return idzaposlenog;
	}
	
	public void SetIme(String ime)
	{
		this.ime = ime;
	}
	
	public String GetIme()
	{
		return ime;
	}
	
	public void SetPrezime(String prezime)
	{
		this.prezime = prezime;
	}
	
	public String GetPrezime()
	{
		return prezime;
	}
	
	public void SetJmbg(String jmbg)
	{
		this.jmbg = jmbg;
	}
	
	public String GetJmbg()
	{
		return jmbg;
	}
	
	public void SetPlata(int plata)
	{
		this.plata = plata;
	}
	
	public int GetPlata()
	{
		return plata;
	}
	
	public void SetBonus(int bonus)
	{
		this.bonus = bonus;
	}
	
	public int GetBonus()
	{
		return bonus;
	}
	
	
	
}
	