package data;

import skills.Skill;
import animals.Animal;
import animals.animalGroups.AnimalGroup;

import java.util.ArrayList;
import java.util.HashMap;

public interface Registry {
    void addAnimal(Animal animal);

    void addAnimal(String group, String type, String name);

    void addAnimal(String type, String name);

    ArrayList<Skill> getSkillsList(Animal animal);

    void addSkill(Animal animal, String skillName, String skillDescription);

    public AnimalGroup getGroup(String group);

    HashMap<Integer, Animal> getAnimalMap();
}
