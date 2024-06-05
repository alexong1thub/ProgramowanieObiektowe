package zadanie4.Vehicles;

import java.util.Objects;
import java.util.Scanner;

public class Vehicle {

    private static int vehicleID = 0;
    FUEL fuelType = FUEL.GAS;
    private int wheels;
    private int weight;
    private String color;
    private int productionYear;

    private String brand;

    public Vehicle() {
        vehicleID += 1;
        setFuelType();
    }

    public Vehicle(int wheels, int weight, int productionYear, String color, String brand) {
        vehicleID += 1;
        setWheels(wheels);
        setWeight(weight);
        setProductionYear(productionYear);
        setColor(color);
        setBrand(brand);
    }

    public void setFuelType() {
        Scanner sc = new Scanner(System.in);

        System.out.println("What kind of fuel do you use? ");
        for (FUEL f : FUEL.values()) {
            System.out.println(f.name());
        }
        String fuel = sc.nextLine().toUpperCase();
        for (FUEL f : FUEL.values()) {
            if (fuel.equals(f.name())) {
                fuelType = FUEL.valueOf(f.name());
            }
        }
    }

    @Override
    public String toString() {
        return this.getClass() + " {brand=" + getBrand() + " fuel=" + getFuelType()
                + " productionYear=" + getProductionYear() + "}";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return false;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Vehicle vehicleOther = (Vehicle) other;
        return Objects.equals(this.getBrand(), vehicleOther.getBrand())
                && this.getFuelType() == vehicleOther.getFuelType()
                && this.getWheels() == vehicleOther.getWheels()
                && this.getProductionYear() == vehicleOther.getProductionYear();
    }

    public static void setVehicleID(int vehicleID) {
        Vehicle.vehicleID = vehicleID;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static int getVehicleID() {
        return vehicleID;
    }

    public FUEL getFuelType() {
        return fuelType;
    }

    public int getWheels() {
        return wheels;
    }

    public int getWeight() {
        return weight;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getBrand() {
        return brand;
    }

}
