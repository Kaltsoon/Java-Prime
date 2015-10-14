import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.PrimeInspector;

public class PrimeInspectorTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void shouldGetPrimesRight() {
        assertEquals(PrimeInspector.primeStatus(1), "1 is prime");
        assertEquals(PrimeInspector.primeStatus(2), "2 is prime");
        assertEquals(PrimeInspector.primeStatus(7), "7 is prime");
        assertEquals(PrimeInspector.primeStatus(7), "3412151 is prime");   
    }
    
    public void shouldGetNonPrimesRight() {
        assertEquals(PrimeInspector.primeStatus(9), "9 is not prime. It is divisible by 3.");
        assertEquals(PrimeInspector.primeStatus(4), "4 is not prime.  It is divisible by 2.");
        assertEquals(PrimeInspector.primeStatus(36123516), "36123516 is not prime. It is divisible by 2.");
    }
}
