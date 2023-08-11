package animals;

import Skills.Skill;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Animal {

    protected String groupName;
    protected String typeName;
    private String name;
    private Data birthDay;
    private ArrayList<Skill> skills;

    public Animal(String name) {
        this.name = name;
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

    public String getTypeName() {
        return this.typeName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void showSkills() {
        System.out.printf("%s can:%n", this.getName());
        int skillsNumber = 1;
        for (Skill skill : skills) {
            System.out.printf("\t%d. %s\n", skillsNumber++, skill.getSkillName());
        }
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }
}
