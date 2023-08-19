package userInterface.workWithAnimal;

import userInterface.ConsoleView;
import userInterface.Menu;
import userInterface.commands.workWithAnimal.*;

public class WorkWithAnimal extends Menu {
    public WorkWithAnimal(ConsoleView view) {
        super(view);
        super.setMenuWelcome("Enter command");
        super.addCommand(new ChooseAnimal(this));
        super.addCommand(new ShowSkills(this));
        super.addCommand(new AddSkill(this));
        super.addCommand(new Perform(this));
        super.addCommand(new Exit(this));
    }
}
