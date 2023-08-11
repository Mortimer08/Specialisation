import Data.RegistryObject;
import Skills.Go;
import Skills.Stop;
import Skills.Voice;
import animals.*;
import animals.animalTypes.Cat;
import animals.animalTypes.Dog;
import animals.animalTypes.Horse;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Polkan");
        Animal pet1 = new Cat("Timofey");
        Animal beast2 = new Horse("Beast");
        RegistryObject reg = new RegistryObject();
        dog1.addSkill(new Voice());
        dog1.addSkill(new Go());
        beast2.addSkill(new Go());
        beast2.addSkill(new Stop());
        dog1.showSkills();
        beast2.showSkills();
        pet1.showSkills();
        reg.addAnimal(pet1);
        reg.addAnimal(beast2);
        reg.addAnimal(dog1);
        reg.showAnimals();

    }
}
