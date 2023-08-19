package data;

import java.io.IOException;

public interface Storage {
void SaveRegistry(Registry registry) throws IOException;
Registry LoadRegistry() throws IOException;
}
