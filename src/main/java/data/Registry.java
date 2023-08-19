package data;

import skills.Skill;
import animals.Animal;
import animals.animalGroups.AnimalGroup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public interface Registry {
    void addAnimal(Animal animal) throws IOException;

    void addAnimal(String group, String type, String name);

    void addAnimal(String type, String name);
    Animal getAnimal(Integer animalNumber);
    ArrayList<Skill> getSkillsList();

    void addSkill(String skillName, String skillDescription);

    public AnimalGroup getGroup(String group);

    HashMap<Integer, Animal> getAnimalMap();
    void setCurrentAnimal(Animal animal);
    Animal getCurrentAnimal();
}
