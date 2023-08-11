package animals.animalGroups;

import animals.animalTypes.AnimalType;

import java.util.ArrayList;

public class AnimalGroup {
    protected ArrayList<AnimalType> animalTypes;
    public String name;
    public AnimalGroup(String name){
        this.name = name;
    }
    private void addType(AnimalType animalType){
        animalTypes.add(animalType);
    }
}
