package mvp;

import animals.Animal;

import java.util.ArrayList;

public class Presenter {
    private Model model;
    private View view;

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

    public ArrayList<Animal> getAnimalsList() {
        return model.getAnimalsList();
    }
}
