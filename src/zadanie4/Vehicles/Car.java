package zadanie4.Vehicles;

public class Car extends Vehicle {

    private int doors;

    public Car(int weight, int productionYear, String color, String brand, int doors) {
        super(4, weight, productionYear, color, brand);
        this.doors = doors;
        if (this.getClass().getName().equals("Car")) {
            setFuelType();
        }

    }

    public void honk() {
        System.out.println("HONK HONK");
    }

    @Override
    public String toString() {
        return this.getClass() + " {brand=" + getBrand() + " doors=" + getDoors() + " fuel=" + getFuelType()
                + " productionYear=" + getProductionYear() + "}";
    }


    public int getDoors() {
        return doors;
    }
}
