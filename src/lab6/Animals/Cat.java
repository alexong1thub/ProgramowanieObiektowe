package lab6.Animals;

public class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("Miau, miau");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating whiskas even knowing she shouldn't.");
    }
}
