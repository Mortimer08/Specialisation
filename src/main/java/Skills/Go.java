package Skills;

public class Go extends Skill{

    public Go() {
        super("Go");
    }

    @Override
    public void perform() {
        System.out.println("I'm going");
    }
}
