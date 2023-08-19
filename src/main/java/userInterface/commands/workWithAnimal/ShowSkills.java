package userInterface.commands.workWithAnimal;

import userInterface.Menu;
import userInterface.commands.MenuCommand;

public class ShowSkills extends MenuCommand {
    public ShowSkills(Menu menu) {
        super(menu, "Show animal skills");
    }
    public void run(){
        super.getView().showSkills();
    }
}
