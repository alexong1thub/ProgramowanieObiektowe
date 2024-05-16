package lab3.Cars;

public class CarTest {
    public static void main(String[] args) {
        Car sally = new Car(180, "996 Carrera", "Porsche", 1470);
        sally.setSpeed(100000);
        sally.setSpeed(280);
        System.out.println(sally.getSpeed());
    }
}
