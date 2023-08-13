package mvp;

import animals.animalGroups.AnimalGroup;
import Data.Registry;
import Data.RegistryObject;
import animals.Animal;
import animals.animalTypes.AnimalType;

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
        AnimalGroup nextGroup = animalRegistry.getGroup(group);
        if (nextGroup != null) {
            AnimalType nextType = nextGroup.getType(type);
            if (nextType != null) {
                animalRegistry.addAnimal(new Animal(nextType, nextGroup, name));
            }
        }
    }
}
