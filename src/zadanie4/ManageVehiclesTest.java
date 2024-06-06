package zadanie4;

import zadanie4.Vehicles.Bike;
import zadanie4.Vehicles.Car;
import zadanie4.Vehicles.ElectricCar;
import zadanie4.Vehicles.Motorcycle;

import java.util.Scanner;

public class ManageVehiclesTest {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ManageVehicles mV = new ManageVehicles();
        mV.addVehicle(new Car(1570, 2010, "Blue", "Audi", 5));
        mV.addVehicle(new Car(1570, 2010, "Blue", "Audi", 5));
        mV.addVehicle(new ElectricCar(1570, 2010, "Blue", "Audi", 5));
        mV.addVehicle(new Bike(10, 2022, "Blue", "Kross"));
        mV.addVehicle(new Motorcycle(550, 2022, "Blue", "Yamaha"));
        mV.compareVehicles(1, 2);
        mV.showVehicles();
        mV.removeVehicle(1);
        mV.compareVehicles(1, 2);
        mV.compareVehicles(1,3);
//        mV.showVehicles();

    }

//    For adding with prompt
    private static void chooseOption() {
        System.out.print("What do you want to:\n1.Add a vehicle.\n2.Delete a vehicle\n3.Show vehicles.\n4.Compare vehicles.");
    }
}
