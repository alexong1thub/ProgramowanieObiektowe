package lab6.Animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Dog clifford = new Dog();
        clifford.sound();
        clifford.eat();
        Cat garfield = new Cat();
        garfield.eat();
        garfield.sound();
        garfield.eat();
        garfield.eat();

        Animal scoobert = new Dog();
        Animal puss = new Cat();

        List<Animal> animals = new ArrayList<>();

        animals.add(scoobert);
        animals.add(puss);
        if(scoobert instanceof Dog){
            System.out.println("Scoobert is a dog!");
            ((Dog)scoobert).run();
        }
    }
}
