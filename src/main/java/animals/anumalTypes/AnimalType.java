package animals.anumalTypes;

import animals.animalGroups.AnimalGroup;

public class AnimalType {
    private String typeName;
    private AnimalGroup animalGroup;
    public AnimalType(String typeName){
        this.typeName = typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public String getTypeName(){
        return this.typeName;
    }
    public void setAnimalGroup(AnimalGroup animalGroup){
        this.animalGroup = animalGroup;
    }
}
