package mvp;

import UserInterface.ConsoleView;
import UserInterface.UserInteraction;

public class View {
    private UserInteraction userInteraction;
    public View() {
        UserInteraction userInteraction = new ConsoleView();
    }

    public void start() {
        userInteraction.start();
    }

    public void setPresenter(Presenter presenter) {
        userInteraction.setPresenter(presenter);
    }
}
