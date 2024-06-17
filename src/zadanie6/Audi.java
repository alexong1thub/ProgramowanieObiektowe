package zadanie6;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Audi implements Vehicle, Car {
    private boolean isAc = false;
    private int speedKmH = 0;
    private boolean isSpeeding = false;
    private final int maxSpeedKmH = 240;
    private double fuelLevelPercent = 100;
    private int mileage = 0;
    private final int SPEED_PER_SECOND = 100;
    private final static Scanner sc = new Scanner(System.in);

    @Override
    public void turnOnAc() {
        isAc = !isAc;
    }

    @Override
    public void drive() throws InterruptedException {
        if (speedKmH == 0 && !isSpeeding) {
            System.out.println(getClass() + " is standing");
            System.out.println("Do you want to drive?");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                isSpeeding = true;
            } else {
                System.out.println("Cool. Keep your head up champ!");
            }
        } else if (isSpeeding) {

            if (speedKmH >= maxSpeedKmH) {
                System.out.println("Car is driving at maximal speed of " + maxSpeedKmH + " km/h");
            } else {
                speedKmH += SPEED_PER_SECOND;
                sleep(1000);
                System.out.println(getClass() + " is driving at speed: " + getSpeedKmH());
            }
        }
    }

    @Override
    public void stop() throws InterruptedException {
        while (speedKmH != 0) {
            System.out.println("Car is slowing down");
            speedKmH -= SPEED_PER_SECOND ;
            sleep(1000);

        }
        System.out.println(getClass() + " stopped, the current speed is: " + getSpeedKmH());
    }

    @Override
    public void tank() {

    }

    public int getSpeedKmH() {
        return speedKmH;
    }
}
