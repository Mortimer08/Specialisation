package animals.animalGroups;

import animals.Animal;

public class Pet extends Animal {

    public Pet(String name) {
        super(name);
        super.groupName = "Pet";
    }
    public void setAnimalType(String animalType){
        super.typeName = animalType;
    }

}
