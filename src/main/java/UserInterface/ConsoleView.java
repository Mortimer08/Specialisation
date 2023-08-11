package UserInterface;

import mvp.Presenter;

public class ConsoleView implements UserInteraction {
    private Presenter presenter;
    public boolean keepRunning;

    public void start() {
        while (keepRunning) {

        }
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

}
