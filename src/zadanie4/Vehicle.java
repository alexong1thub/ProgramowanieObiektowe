package zadanie4;

import java.util.Scanner;

public class Vehicle {

    private static int vehicleID = 0;
    FUEL fuelType;
    private int wheels;
    private int weight;
//    Color is string should be enum for lazy but im lazyy
    private String color;
    public Vehicle(){
        vehicleID += 1;
        fuelType = FUEL.valueOf(setFuelType());
    }

    public Vehicle(int wheels, int weight){
        vehicleID +=1;
        setWheels(wheels);
        setWeight(weight);

    }

    public String setFuelType(){
        Scanner sc = new Scanner(System.in);

        System.out.println("What kind of fuel do you use? ");
        for(FUEL f: FUEL.values()){
            System.out.println(f.name());
        }
        String fuel = sc.nextLine().toUpperCase();
        for(FUEL f: FUEL.values()){
            if(fuel.equals(f.name())){
                return f.name();
            }
        }
        return "GAS";
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
}
