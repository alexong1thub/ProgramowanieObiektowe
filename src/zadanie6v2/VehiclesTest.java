package zadanie6v2;


import java.util.ArrayList;

public class VehiclesTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Audi silver = new Audi(5, 60.0, Fuel.DIESEL, 60.0, 2000);
        Audi brown = new Audi(4, 60, Fuel.DIESEL, 50, 2002, 1000);

        Kross blue = new Kross("blue", 2020);

        vehicles.add(silver);
        vehicles.add(brown);
        vehicles.add(blue);

        for (Vehicle v : vehicles) {
            if (v.getClass().getName().equals("zadanie6v2.Audi")) {
                Audi audi = (Audi) v;
                audi.turnOnOffCar();
                audi.drive();
                audi.tank();
                audi.stop();
            } else {
                Kross kross = (Kross) v;
                kross.wearHelmet();
                kross.drive();

                kross.tank();
                kross.stop();
            }
            System.out.println("===========================");
        }

    }
}
