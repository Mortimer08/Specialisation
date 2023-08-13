package Data;

import animals.Animal;
import animals.animalGroups.AnimalGroup;
import animals.animalTypes.AnimalType;
import java.util.ArrayList;

public class RegistryObject implements Registry {

    final ArrayList<Animal> registry = new ArrayList<Animal>();
    final ArrayList<AnimalGroup> groups = new ArrayList<>();

    public RegistryObject() {
        AnimalGroup beastOfBurden = new AnimalGroup("Beast Of Burden");
        AnimalGroup pet = new AnimalGroup("Pet");
        groups.add(beastOfBurden);
        groups.add(pet);
        beastOfBurden.addType(new AnimalType("Horse"));
        beastOfBurden.addType(new AnimalType("Camel"));
        beastOfBurden.addType(new AnimalType("Donkey"));
        pet.addType(new AnimalType("Dog"));
        pet.addType(new AnimalType("Cat"));
        pet.addType(new AnimalType("Hamster"));
    }

    public ArrayList<Animal> getAnimalList() {
        return registry;
    }

    public String getAnimalsList() {
        int skillsNumber = 1;
        StringBuilder animalsList = new StringBuilder();
        for (Animal animal : registry) {
            animalsList.append(String.format("%s, %s, %s%n", animal.getName(), animal.getGroupName(), animal.getType()));
        }
        return animalsList.toString();
    }

    @Override
    public void addAnimal(Animal animal) {
        registry.add(animal);
    }

    public ArrayList<AnimalGroup> getGroups() {
        return groups;
    }

    public AnimalGroup getGroup(AnimalGroup group) {
        for (AnimalGroup nextGroup : groups) {
            if (nextGroup.equals(group)) {
                return nextGroup;
            }
        }
        return null;
    }

    public AnimalGroup getGroup(String group) {
        for (AnimalGroup nextGroup : groups) {
            if (nextGroup.getName().equals(group)) {
                return nextGroup;
            }
        }
        return null;
    }

}
