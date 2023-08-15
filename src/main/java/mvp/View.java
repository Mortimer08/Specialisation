package mvp;

import userInterface.ConsoleView;
import userInterface.UserInteraction;

public class View {
    private UserInteraction userInteraction = new ConsoleView();

    public void start() {
        userInteraction.start();
    }

    public void setPresenter(Presenter presenter) {
        userInteraction.setPresenter(presenter);
    }
}
