package prime;

import inputHandlers.InputHandler;
import inputHandlers.SystemInputHandler;
import outputHandlers.OutputHandler;
import java.io.IOException;
import java.util.Scanner;
import outputHandlers.SystemOutputHandler;

public class Prime {

    public static void main(String[] args) throws IOException { 
        InputHandler input = new SystemInputHandler(new Scanner(System.in));
        OutputHandler output = new SystemOutputHandler();
        
        PrimeApplication app = new PrimeApplication(input, output);
        
        app.run();
    }
    
}
