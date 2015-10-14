package utils;

public class Command {
    
    public static CommandType getType(String input){
        if(input.equals("end")){
            return CommandType.END;
        }if(input.matches("[0-9]+")){
            return CommandType.NUMBER;
        }else if(input.matches("use-output-file .+\\..+")){
            return CommandType.OUTPUT_FILE;
        }
        
        return CommandType.UNDEFINED;
    }
}
