package lab2.Animals;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("lion", 2);
        var tiger = new Animal("tiger", 12);
        Animal cheetah = new Animal("cheetah", 5);
        Animal simba = new Animal("lion");
        lion.eat();
        tiger.eat();
        cheetah.eat();
        tiger.run(10);
        lion.run(10);
        cheetah.run(40);
        simba.run();
        cheetah.run();

        Cat garfield = new Cat("Garfield", 10);
        garfield.eat();
        garfield.sound();

        System.out.println("Number of created cats: " + Cat.counter);

        int someKindNumber = 23;
        for(int i =0; i<5; i++){
            int notSoKindNumber = 12;
            System.out.println(notSoKindNumber);
        }
        System.out.println(someKindNumber);
    }

}