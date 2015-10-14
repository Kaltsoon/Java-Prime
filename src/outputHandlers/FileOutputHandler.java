package outputHandlers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileOutputHandler implements OutputHandler {
    
    private final String fileName;
    
    public FileOutputHandler(String fileName){
        this.fileName = fileName;
    }
    
    @Override
    public void out(Object content) { 
        PrintWriter outputWriter = null;
        
        try {
            outputWriter = new PrintWriter(new BufferedWriter(new FileWriter(this.fileName, true)));
            outputWriter.println(content.toString());
            outputWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(FileOutputHandler.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            outputWriter.close();
        }
    }
    
}
