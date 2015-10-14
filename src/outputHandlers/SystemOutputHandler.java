package outputHandlers;

public class SystemOutputHandler implements OutputHandler {

    @Override
    public void out(Object content) {
        System.out.println(content.toString());
    }
    
}
