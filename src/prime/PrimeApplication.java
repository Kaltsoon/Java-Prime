package prime;

import commands.CommandCollection;
import utils.CommandType;
import utils.CommandParser;
import inputHandlers.InputHandler;
import outputHandlers.OutputHandler;

public class PrimeApplication {
    
    private InputHandler input;
    private OutputHandler output;
    private CommandCollection commandCollection;
    
    public PrimeApplication(InputHandler input, OutputHandler output){
        this.input = input;
        this.output = output;
        this.commandCollection = new CommandCollection(this);
    }
    
    public void setOutputHandler(OutputHandler output){
        this.output = output;
    }
    
    public OutputHandler getOutputHandler(){
        return this.output;
    }
    
    public void setInputHandler(InputHandler input){
        this.input = input;
    }
    
    public InputHandler getInputHandler(){
        return this.input;
    }
    
    public void run(){
        System.out.println("* Input use-output-file FILENAME to target output to a file");
        System.out.println("* Input end to end");
        
        while(nextCommand());
        
        System.out.println("Bye!");
    }
    
    public boolean nextCommand(){
        System.out.println("Input number");
        
        String givenInput = this.input.in();
        
        CommandType commandType = CommandParser.getType(givenInput);
        
        if(commandType == CommandType.UNDEFINED){
            System.out.println("Invalid command!");
        }else if(commandType == CommandType.END){
            return false;
        }else{
            this.commandCollection.getCommand(commandType).execute(givenInput);
        }
        
        return true;
    }
}
