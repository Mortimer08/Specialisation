package animals;

import skills.Skill;
import animals.animalGroups.AnimalGroup;
import animals.animalTypes.AnimalType;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Animal {

    protected AnimalGroup group;
    protected AnimalType type;
    private String name;
    private Data birthDay;
    private ArrayList<Skill> skills;

    public Animal(String name) {
        this.name = name;
        this.skills = new ArrayList<Skill>();
    }

    public Animal(AnimalType animalType, AnimalGroup animalGroup, String animalName) {
        this.group = animalGroup;
        this.type = animalType;
        this.name = animalName;
        this.skills = new ArrayList<Skill>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(Data birthDay) {
        this.birthDay = birthDay;
    }

    public AnimalType getType() {
        return this.type;
    }

    public String getTypeName() {
        return this.type.name;
    }

    public AnimalGroup getGroup() {
        return this.group;
    }

    public String getGroupName() {
        return group.getName();
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }
    @Override
    public String toString(){
        StringBuilder animalString = new StringBuilder();
        animalString.append(this.name);
        animalString.append(", ");
        animalString.append(this.type);
        animalString.append(", ");
        animalString.append(this.group);
        return animalString.toString();
    }
}
