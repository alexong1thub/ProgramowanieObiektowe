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
    }

}