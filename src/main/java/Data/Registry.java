package Data;

import Skills.Skill;
import Skills.SkillsList;
import animals.Animal;
import animals.animalGroups.AnimalGroup;
import animals.animalTypes.AnimalType;

import java.util.ArrayList;

public interface Registry {
    void addAnimal(Animal animal);

    void addAnimal(String group, String type, String name);

    AnimalGroup findGroup(Animal animal);

    AnimalGroup findGroup();

    SkillsList getSkillsList(Animal animal);

    void teachCommand(Animal animal, Skill skill);

    String getAnimalsList();

    ArrayList<AnimalGroup> getGroups();

    public AnimalGroup getGroup(AnimalGroup group);

    public AnimalGroup getGroup(String group);
}
