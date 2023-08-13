package UserInterface;

import mvp.Presenter;

public class ConsoleView implements UserInteraction {
    private Presenter presenter;
    public boolean keepRunning;

    public ConsoleView() {
        keepRunning = true;
    }

    public void start() {
        while (keepRunning) {
//            System.out.println("Console View Started");
            presenter.addAnimal("Pet", "Dog", "Polkan");
            System.out.println(presenter.getAnimalsList());
            keepRunning = false;
        }
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
//        System.out.println("Console View Presenter Added");
    }

}
