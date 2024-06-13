package lab6.Animals;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Wauf-wauf");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating. I repeat the dog is eating!");
    }

    public void run() {
        System.out.println("Dog is running.");
    }
}
