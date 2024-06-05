package zadanie4.Vehicles;

import java.awt.*;

public class Bike extends Vehicle {
    boolean comfortableSaddle = false;

    public Bike(int weight, int productionYear, String color, String brand) {
        super(2, weight, productionYear, color, brand);
        fuelType = FUEL.HUMAN_POWERED;
    }

    public void ringBell() {
        System.out.println("Ringing a bell");
        Toolkit.getDefaultToolkit().beep();
    }

    @Override
    public String toString() {
        return this.getClass() + " {brand=" + getBrand() + " comfortableSadle=" + isComfortableSaddle() +  " fuel=" + getFuelType()
                + " productionYear=" + getProductionYear() + "}";
    }

    public void setComfortableSaddle() {
        this.comfortableSaddle = !comfortableSaddle;
    }

    public boolean isComfortableSaddle() {
        return comfortableSaddle;
    }
}
