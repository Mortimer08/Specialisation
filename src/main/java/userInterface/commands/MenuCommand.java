package userInterface.commands;

import userInterface.ConsoleView;
import userInterface.Menu;

public class MenuCommand {
    private final String description;
    private final Menu menu;

    public MenuCommand(Menu menu, String description) {
        this.menu = menu;
        this.description = description;
    }

    public void run() {

    }
    protected ConsoleView getView(){
        return menu.getView();
    }
    public String description(){
        return this.description;
    }
}
