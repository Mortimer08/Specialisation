package animals.animalGroups;

import animals.Animal;

public class BeastOfBurden extends Animal {
    public BeastOfBurden(String name) {
        super(name);
        super.groupName = "Beast Of Burden";
    }
    public void setAnimalType(String animalType){
        super.typeName = animalType;
    }
}
