import java.util.ArrayList;
import java.util.List;
import outputHandlers.OutputHandler;

public class OutputMock implements OutputHandler {
    private List<String> outputs;
    
    public OutputMock(ArrayList<String> outputs){
        this.outputs = outputs;
    }
    
    @Override
    public void out(Object content) {
        this.outputs.add(content.toString());
    }
    
    public List<String> getOutputs(){
        return this.outputs;
    }
}
