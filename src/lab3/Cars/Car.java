package lab3.Cars;

public class Car {
    private int speed;
    private String model;
    private String brand;
    private int weight;
    public Car(int speed, String model, String brand, int weight){
        this.setSpeed(speed);
        this.setModel(model);
        this.setBrand(model);
        this.setWeight(weight);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed >= 50 && speed < 290){
            this.speed = speed;
        }
        System.out.println("Predkosc samochodu powinna miescic sie w przedziale 50-290");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

