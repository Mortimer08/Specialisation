package Data;

import animals.Animal;
import animals.animalGroups.AnimalGroup;
import animals.animalGroups.BeastOfBurden;
import animals.animalGroups.Pet;

import java.util.ArrayList;

public class RegistryObject implements Registry{
    BeastOfBurden beastOfBurden = new BeastOfBurden();
    Pet pet = new Pet();
    private final ArrayList<Animal> registry = new ArrayList<Animal>();

    public RegistryObject() {
    }


    public String getAnimalsList() {
        int skillsNumber = 1;
        StringBuilder animalsList = new StringBuilder();
        for (Animal animal : registry) {
             animalsList.append(String.format("%s, %s, %s%n",animal.getName(),animal.getGroupName(),animal.getType()));
        }
        return animalsList.toString();
    }

    @Override
    public void addAnimal(Animal animal) {
        registry.add(animal);

    }
}
