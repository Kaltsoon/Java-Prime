package commands;

import prime.PrimeApplication;
import utils.PrimeInspector;

public class NumberCommand implements Command {

    private PrimeApplication app;
    
    public NumberCommand(PrimeApplication app){
        this.app = app;
    }
    
    @Override
    public void execute(String input) {
        int number = 0;
        
        try{
            number = Integer.parseInt(input);
            this.app.getOutputHandler().out(PrimeInspector.primeStatus(number));
        } catch(Exception e){
            System.out.println("The maximum value for number is " + Integer.MAX_VALUE + "!");
            return;
        }
        
    }
    
}
