package outputHandlers;

import java.io.IOException;

public interface OutputHandler {
    public void out(Object content) throws IOException;
}
