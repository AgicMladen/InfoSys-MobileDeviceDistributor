import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCase1
{
	
	private static zaposleniServiceImpl service;
	
	@BeforeClass
	public static void initTest()
	{
		service = new zaposleniServiceImpl();
	}
	
	@Before
	public void testPrecondition()
    {
	    zaposleni z1 = service.getZap(19);
        assertNull(z1);
    }
	
	@Test
	public void testAssertions() 
    {
	    service.createZaposlenog(19, "Pera", "Peric", "0113759403843", 85000 , 0);  
    }
	
	@After
	public void testPostcondition()
	{
		zaposleni z1 = service.getZap(19);
	    assertNotNull(z1);
	}
	
	@Ignore
	public void testPostcondition2()
	{
		zaposleni z1 = service.getZap(19);
		assertEquals(z1.GetId(), 19);
		assertEquals(z1.GetIme(), "Pera");
		assertEquals(z1.GetPrezime(), "Peric");
		assertEquals(z1.GetJmbg(), "0113759403843");
		assertEquals(z1.GetPlata(), 85000);       
		assertEquals(z1.GetBonus(), 0);   
	}
	   
	@AfterClass
	public static void clearTest()
	{
		service.deleteZaposlenog(19);
	}

	
	
}