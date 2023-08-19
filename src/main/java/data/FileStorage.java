package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

import animals.Animal;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class FileStorage implements Storage {
    private FileWriter fileWriter;
    private FileReader fileReader;
    private ObjectWriter objectWriter;
    private ObjectMapper objectMapper;

    public FileStorage() {
        objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        objectMapper = new ObjectMapper();
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
    public RegistryObject LoadRegistry() {
        StringBuilder registryJson = new StringBuilder();
        RegistryObject registry = new RegistryObject();
        System.out.println(registry);
        try {
            fileReader = new FileReader("src/main/resources/RegistryFile");
            Scanner fileScanner = new Scanner(fileReader);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
//                System.out.println(line);
                registryJson.append(line);
            }
            fileReader.close();
//            System.out.println(registryJson.toString());
            registry = objectMapper.readValue(registryJson.toString(), RegistryObject.class);

        } catch (IOException exception) {
            System.out.println("File Reading Error");
            System.out.println(exception.getMessage());
        }

        return registry;
    }
}
