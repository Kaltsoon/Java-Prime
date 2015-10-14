package inputHandlers;

import java.util.Scanner;

public class SystemInputHandler implements InputHandler{
    
    private final Scanner reader;
    
    public SystemInputHandler(Scanner reader){
        this.reader = reader;
    }
    
    @Override
    public String in() {
        return this.reader.nextLine();
    }
    
}
