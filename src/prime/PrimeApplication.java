package prime;

import utils.CommandType;
import utils.Command;
import utils.PrimeInspector;
import inputHandlers.InputHandler;
import outputHandlers.FileOutputHandler;
import outputHandlers.OutputHandler;

public class PrimeApplication {
    
    private InputHandler input;
    private OutputHandler output;
    
    public PrimeApplication(InputHandler input, OutputHandler output){
        this.input = input;
        this.output = output;
    }
    
    public void run(){
        while(true){
            System.out.println("Input number");
            
            String command = this.input.in();
            CommandType commandType = Command.getType(command);

            if(commandType == CommandType.OUTPUT_FILE){
                executeOutputCommand(command);
            }else if(commandType == CommandType.NUMBER){
                executeNumberCommand(command);
            }else if(commandType == CommandType.UNDEFINED){
                executeUndefinedCommand();
            }else if(commandType == CommandType.END){
                break;
            }
        }
    }
    
    private void executeUndefinedCommand(){
        System.out.println("Invalid command!");
        System.out.println("Input a number or use-output-file FILENAME to change output target to a file");
    }
    
    private void executeOutputCommand(String input){
        String fileName = input.split(" ")[1];
        this.output = new FileOutputHandler(fileName);
    }
    
    private void executeNumberCommand(String input){
        int number = 0;
        
        try{
            number = Integer.parseInt(input);
        } catch(Exception e){
            System.out.println("The maximum value for number is " + Integer.MAX_VALUE + "!");
            return;
        }
        
        this.output.out(PrimeInspector.primeStatus(number));
    }
}
