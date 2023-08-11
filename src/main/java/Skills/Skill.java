package Skills;

public class Skill {
    private String skillName;

    public Skill(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillName() {
        return this.skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public void perform() {
        System.out.println("I can do something");
    }
}
