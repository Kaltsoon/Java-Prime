
import inputHandlers.InputHandler;


public class InputMock implements InputHandler {

    private String input;
    
    public InputMock(String input){
        this.input = input;
    }
    
    @Override
    public String in() {
        return this.input;
    }
    
}
