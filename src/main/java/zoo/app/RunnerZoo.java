package zoo.app;

import zoo.model.Animal;
import zoo.model.Cat;
import zoo.model.Dog;
import zoo.model.Owner;

public class RunnerZoo {
    public static void main(String[] args) {

        Owner seba = new Owner("sebastian", "wardak");
        Owner michal = new Owner("michal", "traba");

        Animal dog = new Dog("puszek", michal);
        Animal cat = new Cat("koltun", seba);

        seba.setAnimal(cat);
        michal.setAnimal(dog);


    }
}
