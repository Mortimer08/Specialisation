package animals;

import animals.animalGroups.AnimalGroup;
import animals.animalGroups.BeastOfBurden;
import animals.animalTypes.AnimalType;

public class AnimalConstructor {
    public Animal createAnimal(String animalType, String animalGroup, String animalName){

        return new Animal(new AnimalType(animalType), new AnimalGroup(animalGroup), animalName);
    }
}
