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

public class TestCase2 {

    private static katalogServiceImpl service;
	
   @BeforeClass
   public static void initTest()
   {
	   service = new katalogServiceImpl();
   }
 
   @Before
   public void testPrecondition()
   {
	   service.createKatalog(45, "Smart 123", 27500, "dostupan", "LG");
   }
  
   @Test
   public void testAssertions() 
   {
	   
	   service.deleteKatalog(45);
   }
   
   @After
   public void testPostcondition()
   {
	   katalog k = service.getKat(45);
       assertNull(k);
   }

   
}