package mvp;

import Data.Registry;
import Data.RegistryObject;
import animals.Animal;

public class Model {
    private final Registry registry = new RegistryObject();

    public Model() {
    }

    public void addAnimal(Animal animal, String animalName) {
        registry.addAnimal(animal);
        System.out.printf("Animal %s added", animalName);
    }

    public String getAnimalSkills(Animal animal) {
        return animal.getSkills();
    }

    public String getAnimalsList() {
        return registry.getAnimalsList();
    }

}
