package mvp;

public class Presenter {
    private final Model model;
    private final View view;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setPresenter(this);
    }

    public void addAnimal(String group, String type, String name) {
        model.addAnimal(group, type, name);
    }

    public void addAnimal(String type, String name) {
        model.addAnimal(type, name);
    }

    public String getSkillsList() {
        return model.getAnimalSkills();
    }

    public void addSkill(String skillName, String skillDescription) {
        model.addSkill(skillName, skillDescription);
    }

    public String getAnimals() {
        return model.getAnimals();
    }

    public void setCurrentAnimal(Integer animalNumber) {
        model.setCurrentAnimal(animalNumber);
    }

    public String getAnimal(Integer animalNumber) {
        return model.getAnimal(animalNumber);
    }

    public String performSkill(Integer skillNumber) {
        return model.performSkill(skillNumber);
    }
}
