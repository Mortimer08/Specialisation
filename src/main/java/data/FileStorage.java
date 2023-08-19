package data;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class FileStorage implements Storage {
    private final ObjectWriter objectWriter;
    private final ObjectMapper objectMapper;

    public FileStorage() {
        objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        objectMapper = new ObjectMapper();
    }

    @Override
    public void SaveRegistry(Registry registry) {
        String registryJson;
        try {
            registryJson = objectWriter.writeValueAsString(registry);
            FileWriter fileWriter = new FileWriter("src/main/resources/RegistryFile");
            fileWriter.write(registryJson);
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("File Writing Error");
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public RegistryObject LoadRegistry() {
        StringBuilder registryJson = new StringBuilder();
        RegistryObject registry = new RegistryObject();
        try {
            FileReader fileReader = new FileReader("src/main/resources/RegistryFile");
            Scanner fileScanner = new Scanner(fileReader);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                registryJson.append(line);
            }
            fileReader.close();
            registry = objectMapper.readValue(registryJson.toString(), RegistryObject.class);

        } catch (IOException exception) {
            System.out.println("File Reading Error");
            System.out.println(exception.getMessage());
        }

        return registry;
    }
}
