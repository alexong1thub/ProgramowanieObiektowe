package lab2.Animals;

public class Cat extends Animal{
    static int counter = 0;
    private final String race = "Europejska";


    public Cat(String name, int age){
        super(name, age);
        counter += 1;
    }

    @Override
    public void sound(){
        super.sound();
        System.out.println("Kot " + this.name + " miauczy");
    }
}
