package zadanie6v2;

import zadanie6v2.Fuel;

import static java.lang.Thread.sleep;

public class Audi implements Car, Vehicle{
    private boolean isBroken = false;
    private boolean isCarOn = false;
    private boolean isAcTurn = false;
    private boolean isMoving = false;

    private final int doors;
    private double MAX_FUEL_LITRES;
    private final Fuel FUEL;
    private double fuelAmountLitres = MAX_FUEL_LITRES; // Podstawowo
    private int weightKg; // Ile waza samochody? z 2tony
    private double milageKm = 0; // Piekne czasy, moze licznik cofniety?

    // Konstruktor do tworzenia auta nowego
    public Audi(int doors, double MAX_FUEL_LITRES, Fuel FUEL, double fuelAmountLitres, int weightKg) {
        this.doors = doors;
        this.MAX_FUEL_LITRES = MAX_FUEL_LITRES;
        this.FUEL = FUEL;
        this.fuelAmountLitres = fuelAmountLitres;
        this.weightKg = weightKg;
    }

    // Konstruktor do tworzenia auta rozjebanego
    public Audi(int doors, double MAX_FUEL_LITRES, Fuel FUEL, double fuelAmountLitres, int weightKg, double milageKm) {
        this.isBroken = true;
        this.doors = doors;
        this.MAX_FUEL_LITRES = MAX_FUEL_LITRES;
        this.FUEL = FUEL;
        this.fuelAmountLitres = fuelAmountLitres;
        this.weightKg = weightKg;
        this.milageKm = milageKm;
    }

    public void turnOnOffCar() {
        if (isBroken) {
            System.out.println("Sorry your car is broken, you cannot turn it on or off!");
        } else if (!isBroken && !isCarOn && fuelAmountLitres > 0) {
            System.out.println("Brrrr, you turned your car on");
            this.isCarOn = true;
            this.isMoving = true;
        } else if (!isBroken && isCarOn) {
            System.out.println("Pffff, you turned your car off");
        } else {
            System.out.println("Something weird is happpeningggg... (err0r");
        }

    }

    public void drive() throws InterruptedException {
        if(isCarOn){
            System.out.println("I hope you settle your belt");
        }


        while (!isBroken && isCarOn && isMoving && fuelAmountLitres > 0) {

            fuelAmountLitres -= 10;
            milageKm += 10;
            sleep(1000);
            System.out.println("You are then kilometeres closer to your goal");
        }

        if (fuelAmountLitres == 0) {
            System.out.println("You run out of gas. Car is stopping");
            stop();
        }


    }

    public void stop(){
        System.out.println("Stop, stop. Look around you.");
    }

    @Override
    public void tank() {
        System.out.println("tank");
    }

    @Override
    public void turnOnAc() {
        isAcTurn = !isAcTurn;
    }
}