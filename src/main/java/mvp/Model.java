package mvp;

import Data.Registry;
import Data.RegistryObject;
import animals.Animal;

public class Model {
    private final Registry animalRegistry = new RegistryObject();

    public Model() {
    }

    public void addAnimal(Animal animal) {
        animalRegistry.addAnimal(animal);
        System.out.printf("Animal %s added", animal.getName());
    }

    public String getAnimalSkills(Animal animal) {
        return animal.getSkills();
    }

    public String getAnimalsList() {
        return animalRegistry.getAnimalsList();
    }

    public void addAnimal(String group, String type, String name) {
        animalRegistry.addAnimal(group, type, name);
    }
}
