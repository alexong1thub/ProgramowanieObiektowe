package zadanie4;

import zadanie4.Vehicles.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageVehicles {

    private ArrayList<Vehicle> vehicles;
    private static final Scanner sc = new Scanner(System.in);

    public ManageVehicles()
    {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle v){
        vehicles.add(v);
        showVehicles();
    }

    public void removeVehicle(int id){
        try {
            vehicles.remove(id-1);
        } catch (Exception e) {
            System.out.println("Hmm something went wrong: " + e);
        }
        finally {
            showVehicles();
        }
    }

    public void showVehicles() {
        int i = 1;
        for (Vehicle v : vehicles) {
            System.out.println("Id: " + i);
            System.out.println(v);
            i++;
        }
    }

    public void compareVehicles(int id, int id2){
        if (vehicles.get(id - 1).equals(vehicles.get(id2 - 1))) {
            System.out.println("Yoooho, they are the same!");
        }
        else{
            System.out.println("Sorry " + vehicles.get(id-1) + " and " + vehicles.get(id2-1) + " are not the same!" );
        }
    }

    public void addVehiclePrompt() {
        System.out.println("What kind of vehicle do you want to add?");
        System.out.println("Car | Electric Car | Motorcycle | Bike | Other");
        String vehicle = sc.nextLine();
        var vehicleData = promptData();
        switch (vehicle) {
            case "Car":
                //int weight, int yearOfManufacture, int doors, String brand,  String color
                System.out.println("How many doors your vehicles has: ");
                vehicles.add(new Car(Integer.parseInt(vehicleData.get(0)), Integer.parseInt(vehicleData.get(1)), vehicleData.get(2), vehicleData.get(3),Integer.parseInt(sc.nextLine())));
                break;
            case "Electric car":
                System.out.println("How many doors your vehicles has: ");
                vehicles.add(new ElectricCar(Integer.parseInt(vehicleData.get(0)), Integer.parseInt(vehicleData.get(1)), vehicleData.get(2), vehicleData.get(3), Integer.parseInt(sc.nextLine())));
                break;
            case "Motorcycle":
                vehicles.add(new Motorcycle(Integer.parseInt(vehicleData.get(0)), Integer.parseInt(vehicleData.get(1)), vehicleData.get(2), vehicleData.get(3)));
                break;
            case "Bike":
                vehicles.add(new Bike(Integer.parseInt(vehicleData.get(0)), Integer.parseInt(vehicleData.get(1)), vehicleData.get(2), vehicleData.get(3)));
                break;
            default:
                System.out.println("How many wheels does your vehicle have: ");
                vehicles.add(new Vehicle(Integer.parseInt(sc.nextLine()), Integer.parseInt(vehicleData.get(0)), Integer.parseInt(vehicleData.get(1)), vehicleData.get(2), vehicleData.get(3)));
                break;
        }

    }


    public void removeVehiclePrompt() {
        showVehicles();
        System.out.println("Which vehicle do you want to remove?");
        try {
            vehicles.remove(Integer.parseInt(sc.nextLine()));
        } catch (Exception e) {
            System.out.println("Hmm something went wrong: " + e);
        }
    }



    public void compareVehiclesPrompt() {
        showVehicles();
        System.out.println("Which vehicles do you want to compare: (type their IDs, one after one)");
        int firstV = Integer.parseInt(sc.nextLine());
        int secondV = Integer.parseInt(sc.nextLine());
        if (vehicles.get(firstV - 1).equals(vehicles.get(secondV - 1))) {
            System.out.println("Yoooho, they are the same!");
        }
        else{
            System.out.println("Sorry " + vehicles.get(firstV-1) + " and " + vehicles.get(secondV-1) + " are not the same!" );
        }
    }

    private ArrayList<String> promptData() {
        var vehicleData = new ArrayList<String>();
        System.out.println("Enter the weight of vehicle: ");
        vehicleData.add(sc.nextLine());
        System.out.println("Enter the production year of vehicle: ");
        vehicleData.add(sc.nextLine());
        System.out.println("Enter the color of vehicle: ");
        vehicleData.add(sc.nextLine());
        System.out.println("Enter the brand name of the vehicle: ");
        vehicleData.add(sc.nextLine());
        return vehicleData;
    }
}