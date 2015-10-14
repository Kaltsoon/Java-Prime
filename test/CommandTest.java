import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Command;
import utils.CommandType;

public class CommandTest {
    
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
    public void shouldGetTypeOfNumberCommandRight(){
        assertEquals(Command.getType("9"), CommandType.NUMBER);
        assertEquals(Command.getType("1"), CommandType.NUMBER);
        assertEquals(Command.getType("699"), CommandType.NUMBER);
    }
  
    @Test
    public void shouldGetTypeOfOutputCommandRight(){
        assertEquals(Command.getType("use-output-file out.txt"), CommandType.OUTPUT_FILE);
        assertEquals(Command.getType("use-output-file json.json"), CommandType.OUTPUT_FILE);
        assertEquals(Command.getType("use-output-file PAGE.html"), CommandType.OUTPUT_FILE);
    }
    
    @Test
    public void shouldGetTypeOfUndefinedCommandRight(){
        assertEquals(Command.getType("output out.txt"), CommandType.UNDEFINED);
        assertEquals(Command.getType("output ou"), CommandType.UNDEFINED);
        assertEquals(Command.getType("abc"), CommandType.UNDEFINED);
    }
}
