package zadanie4.Vehicles;

public class ElectricCar extends Car {

    private double batteryLife = 100.0;

    public ElectricCar(int weight, int productionYear, String color, String brand, int doors) {
        super(weight, productionYear, color, brand, doors);
        fuelType = FUEL.EV;
    }

    public void sayHi() {
        System.out.println("Hi, I'm you autonomous car *wink, wink* ");
    }

    public void batteryGetDamage() {
        double damage = Math.random() * 10;
        double batteryLife = getBatteryLife();
        setBatteryLife(batteryLife - damage);
        System.out.println("While using yours " + getBrand() + " battery got damaged by: " + damage + "%. Your" +
                "current battery life is: " + (batteryLife - damage) + " %");
    }

    @Override
    public String toString() {
        return this.getClass() + " {brand=" + getBrand() + " doors=" + getDoors() + " fuel=" + getFuelType()
                + " battery damage= " + getBatteryLife() + " productionYear=" + getProductionYear() + "}";
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }
}
