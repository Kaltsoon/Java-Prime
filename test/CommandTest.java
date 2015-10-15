import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.CommandParser;
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
        assertEquals(CommandParser.getType("9"), CommandType.NUMBER);
        assertEquals(CommandParser.getType("1"), CommandType.NUMBER);
        assertEquals(CommandParser.getType("699"), CommandType.NUMBER);
    }
  
    @Test
    public void shouldGetTypeOfOutputCommandRight(){
        assertEquals(CommandParser.getType("use-output-file out.txt"), CommandType.OUTPUT_FILE);
        assertEquals(CommandParser.getType("use-output-file json.json"), CommandType.OUTPUT_FILE);
        assertEquals(CommandParser.getType("use-output-file PAGE.html"), CommandType.OUTPUT_FILE);
        assertEquals(CommandParser.getType("use-output-file /Users/kalleilv/out.txt"), CommandType.OUTPUT_FILE);
    }
    
    @Test
    public void shouldGetEndCommandRight(){
        assertEquals(CommandParser.getType("end"), CommandType.END);
    }
    
    @Test
    public void shouldGetTypeOfUndefinedCommandRight(){
        assertEquals(CommandParser.getType("output out.txt"), CommandType.UNDEFINED);
        assertEquals(CommandParser.getType("output ou"), CommandType.UNDEFINED);
        assertEquals(CommandParser.getType("abc use-output-file plapla"), CommandType.UNDEFINED);
        assertEquals(CommandParser.getType("end plapla"), CommandType.UNDEFINED);
    }
}
