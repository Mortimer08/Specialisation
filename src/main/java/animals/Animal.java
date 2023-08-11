package animals;

import Skills.Skill;
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
public String getTypeName(){
        return this.type.name;
}
    public AnimalGroup getGroup() {
        return this.group;
    }

    public String getGroupName() {
        return group.name;
    }

    public String getSkills() {
//        System.out.printf("%s can:\n", this.getName());
        int skillsNumber = 1;
        StringBuilder skillsList = new StringBuilder();
        for (Skill skill : skills) {
            skillsList.append(String.format("\t%d. %s\n", skillsNumber++, skill.getSkillName()));
        }
        return skillsList.toString();
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }
}
