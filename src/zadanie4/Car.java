package zadanie4;

public class Car extends Vehicle{
    private int yearOfManufacture;
    private String brand;

    public Car(int weight, int yearOfManufacture, String brand){
        super(4, weight);
        this.yearOfManufacture = yearOfManufacture;
        this.brand = brand;
    }

    public void honk(){
        System.out.println("HONK HONK");
    }

}
