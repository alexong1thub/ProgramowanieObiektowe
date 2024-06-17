package zadanie6v2;

import static java.lang.Thread.sleep;

public class Kross implements Bike, Vehicle {

    private boolean isBroken = false;
    private int maxSpeedKmH = 50;
    private boolean isHelmet = false;
    private int energy = 100;
    private int mileage = 0;
    private String color;
    private int yearOfProduction;

    public Kross(String color, int yearOfProduction){
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void wearHelmet() {
        isHelmet = !isHelmet;
        if(isHelmet){
            System.out.println("Nice, you are wearing a helmet. Good to be safe.");
        }
        else{
            System.out.println("Why did you take of your helmet? I hope you jumped of you bike.");
        }
    }

    @Override
    public void drive() throws InterruptedException {
        if(isHelmet){
            System.out.println("Start pedalling");
        }
        else{
            System.out.println("Maybe wear a helmet first?");
        }
        while(!isBroken && isHelmet && energy > 0){
            System.out.println("You are cycling on: " + getClass().getName() + " you cycled: " + mileage + " km");
            if(energy <= 10){
                System.out.println("Wooah, sloww down, or you will run out of energy");
            }
            mileage += 10;
            energy -= 1;
            sleep(1000);
        }
        if(energy <= 0){
            System.out.println("You run out of energy. You drove: " + mileage + " kilometres");
        }
        stop();

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
