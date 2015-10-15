package outputHandlers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputHandler implements OutputHandler {
    
    private final File file;
    
    public FileOutputHandler(File file){
        this.file = file;
    }
    
    @Override
    public void out(Object content) throws IOException { 
        FileWriter fileWriter = new FileWriter(this.file, true);  
        
        fileWriter.write(content.toString() + "\n");      
        fileWriter.close();
    }
    
}
