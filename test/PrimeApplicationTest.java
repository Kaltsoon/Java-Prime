import inputHandlers.InputHandler;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import outputHandlers.OutputHandler;
import outputHandlers.SystemOutputHandler;
import prime.PrimeApplication;

public class PrimeApplicationTest {
    
    private PrimeApplication app;
    
    public PrimeApplicationTest() {
        InputHandler input = new InputMock("1");
        OutputHandler output = new SystemOutputHandler();
        
        this.app = new PrimeApplication(input, output);
    }
    
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
   public void itShouldEndWhenEndCommandGiven(){
       this.app.setInputHandler(new InputMock("end"));
       
       assertEquals(this.app.nextCommand(), false);
   }
   
   public void isShouldNotEndWhenOtherCommandGiven(){
       this.app.setInputHandler(new InputMock("1"));
       
       assertEquals(this.app.nextCommand(), true);
   }
   
   @Test
   public void shouldHaveCorretOutput(){
       ArrayList<String> outputs = new ArrayList<String>();
       
       InputHandler isPrimeInput = new InputMock("3");
       
       this.app.setOutputHandler(new OutputMock(outputs));
       
       this.app.setInputHandler(isPrimeInput);
       this.app.nextCommand();
       
       OutputMock mock = (OutputMock)this.app.getOutputHandler();
       
       assertEquals(mock.getOutputs().size(), 1);
       assertEquals(mock.getOutputs().get(0), "3 is prime");
       
       InputHandler isNotPrime = new InputMock("4");
       
       this.app.setInputHandler(isNotPrime);
       this.app.nextCommand();
       
       assertEquals(mock.getOutputs().size(), 2);
       assertEquals(mock.getOutputs().get(1), "4 is not prime. It is divisible by 2.");
   }
}
