package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class FileStorage implements Storage {
    private FileWriter fileWriter;
    private FileReader fileReader;
    private ObjectWriter objectWriter;

    public FileStorage() {
        objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();

    }

    @Override
    public void SaveRegistry(Registry registry) {
        String registryJson;
        try {
            registryJson = objectWriter.writeValueAsString(registry);
            fileWriter = new FileWriter("src/main/resources/RegistryFile");
            fileWriter.write(registryJson);
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("File Writing Error");
            System.out.println(exception.getMessage());
            ;
        }
    }

    @Override
    public Registry LoadRegistry() {
        try {
            fileReader = new FileReader("src/main/resources/RegistryFile");
            fileReader.close();

        } catch (IOException exception) {
            System.out.println("File Reading Error");
            System.out.println(exception.getMessage());
        }
        return null;
    }
}
