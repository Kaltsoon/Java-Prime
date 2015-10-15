package commands;

import java.util.HashMap;
import java.util.Map;
import prime.PrimeApplication;
import utils.CommandType;

public class CommandCollection {
    
    private Map<CommandType, Command> commands;
    private PrimeApplication app;
    
    public CommandCollection(PrimeApplication app){
        this.app = app;
        this.commands = new HashMap<CommandType, Command>();
        
        this.commands.put(CommandType.NUMBER, new NumberCommand(app));
        this.commands.put(CommandType.OUTPUT_FILE, new UseOutputFileCommand(app));
    }
    
    public Command getCommand(CommandType commandType){
        if(this.commands.containsKey(commandType)){
            return this.commands.get(commandType);
        }
        
        return null;
    }
}
