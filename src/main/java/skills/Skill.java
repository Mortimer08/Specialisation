package skills;

public class Skill {
    private String skillName;
    private String skillDescription;

    public Skill(String skillName, String skillDescription) {
        this.skillName = skillName;
        this.skillDescription = skillDescription;
    }

    public String getSkillName() {
        return this.skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getDescription() {
        return this.skillDescription;
    }

    public void setSkillDescription(String description) {
        this.skillDescription = description;
    }

    public void perform() {
        System.out.println("I can do something");
    }

    @Override
    public boolean equals(Object obj) {
        return (obj.getClass() == this.getClass()) && (this.skillName.equals(((Skill) obj).getSkillName()));
    }

    @Override
    public String toString() {
        StringBuilder skillString = new StringBuilder();
        skillString.append(this.skillName);
        skillString.append(" = ");
        skillString.append(this.skillDescription);
        skillString.append("\n");
        return skillString.toString();

    }
}
