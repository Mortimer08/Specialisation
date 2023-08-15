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

    public String getSkillsList(Integer animalNumber) {
        return model.getAnimalSkills(animalNumber);
    }

    public void addSkill(Integer animalNumber, String skillName, String skillDescription) {
        model.addSkill(animalNumber, skillName, skillDescription);
    }

/*
    public ArrayList<Animal> getAnimalsList() {
        return model.getAnimalsList();
    }
*/

    public String getAnimals() {
        return model.getAnimals();
    }
}
