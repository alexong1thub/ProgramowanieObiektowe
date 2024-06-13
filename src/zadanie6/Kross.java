package zadanie6;

public class Kross implements Vehicle, Bike{

    private boolean isBroken = false;
    private int maxSpeedKmH = 50;
    private boolean isHelmet = false;

    private String color;
    private int yearOfProduction;

    public Kross(String color, int yearOfProduction){
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void wearHelmet() {
        isHelmet = !isHelmet;
    }

    @Override
    public void drive() {
        System.out.println("Start pedalling");
    }

    @Override
    public void stop() throws InterruptedException {
        System.out.println("STOPPPPPP");
    }

    @Override
    public void tank() {
        System.out.println("No tanking bike lol, tank yourself homie!");
    }
}
