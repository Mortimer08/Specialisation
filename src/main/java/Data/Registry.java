package Data;

import animals.Animal;
import animals.animalGroups.AnimalGroup;

import java.util.ArrayList;

public interface Registry {
    void addAnimal(Animal animal);
    String getAnimalsList();

    ArrayList<AnimalGroup> getGroups();
    public AnimalGroup getGroup(AnimalGroup group);
    public AnimalGroup getGroup(String group);
}
