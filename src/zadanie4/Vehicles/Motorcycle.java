package zadanie4.Vehicles;

import java.util.Scanner;

public class Motorcycle extends Vehicle {
    private int cc = 125;

    public Motorcycle(int weight, int productionYear, String color, String brand) {
        super(2, weight, productionYear, color, brand);
        fuelType = FUEL.GAS;
    }

    public void wheelie() {
        System.out.println("You are riding on one wheeel!");
    }

    @Override
    public String toString() {
        return this.getClass() + " {brand=" + getBrand() + " cc=" + getCC() + " fuel=" + getFuelType()
                + " productionYear=" + getProductionYear() + "}";
    }

    public void setCC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a cc for motorcycle (125,250 - 1000");
        int cc = Integer.parseInt(sc.nextLine());
        switch (cc) {
            case 125, 250, 500, 1000:
                this.cc = cc;
                break;
            default:
                System.out.println("The cc is not in range (125 - 1000).");
        }
    }

    public int getCC() {
        return cc;
    }
}
