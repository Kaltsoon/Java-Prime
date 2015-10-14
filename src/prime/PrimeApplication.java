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
            }else{
                break;
            }
        }
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
        
        if(number < 0){
            System.out.println("The minimum value for number is 0!");
        }
        
        this.output.out(PrimeInspector.primeStatus(number));
    }
}
