package lab2.Animals;

public class Animal {
    String name;
     int age;

    public Animal(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public Animal(String n){
        this.name = n;
    }

    public void eat() {
        System.out.println(name + " je posiłek, om om");
    }
    public void sound(){
        System.out.println(getClass() + " wydaje dźwięk");
    }

    public void run(int speed) {
        System.out.println(name + " biegnie z prędkością " + speed);
    }

    public void run() {
        System.out.println(name + " biegnie z niesamowitą prędkością");
    }
}
