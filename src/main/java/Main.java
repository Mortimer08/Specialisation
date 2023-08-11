import Skills.Go;
import Skills.Voice;
import animals.*;
import animals.animalGroups.AnimalGroup;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Polkan");
        Animal pet1 = new Pet("Timofey");
        Animal beast2 = new BeastOfBurden("Beast");
        Registry reg = new Registry();
        dog1.addSkill(new Voice());
        dog1.addSkill(new Go());
        dog1.showSkills();
        reg.addAnimal(pet1);
        reg.addAnimal(beast2);
        reg.addAnimal(dog1);
        reg.showAnimals();

    }
}
