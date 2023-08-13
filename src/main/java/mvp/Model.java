package mvp;

import Data.Registry;
import Data.RegistryObject;
import animals.Animal;

import java.util.ArrayList;
import java.util.HashMap;

public class Model {
    private final Registry animalRegistry = new RegistryObject();

    public Model() {
    }

    public void addAnimal(Animal animal) {
        animalRegistry.addAnimal(animal);
        System.out.printf("Animal %s added", animal.getName());
    }

    public void addAnimal(String group, String type, String name) {
        animalRegistry.addAnimal(group, type, name);
    }

    public void addAnimal(String type, String name) {
        animalRegistry.addAnimal(type, name);
    }

    public String getAnimalSkills(Animal animal) {
        return animal.getSkills();
    }

    public ArrayList<Animal> getAnimalsList() {
        return animalRegistry.getAnimalsList();
    }

    public HashMap<Integer, Animal> getAnimalMap() {
        return animalRegistry.getAnimalMap();
    }
}
