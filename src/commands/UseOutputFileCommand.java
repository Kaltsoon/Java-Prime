package commands;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import outputHandlers.FileOutputHandler;
import prime.PrimeApplication;

public class UseOutputFileCommand implements Command {

    private PrimeApplication app;
    
    public UseOutputFileCommand(PrimeApplication app){
        this.app = app;
    }
    
    @Override
    public void execute(String input) {
        String fileName = input.split(" ")[1];
        File file = null;
        
        file = new File(fileName);
        
        if(file.exists()){
            this.app.setOutputHandler(new FileOutputHandler(file));
        }else{
            System.out.println("File doesn't exist!");
        }
        
        
    }
    
}
