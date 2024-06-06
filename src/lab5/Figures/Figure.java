package lab5.Figures;

public abstract class Figure {

    double pole;
    double obwod;

    public abstract double calculatePole();

    public abstract double calculateObwod();

    public void info(){
        System.out.println("Pole wynosi: " + pole);
        System.out.println("Obwod wynosi: " + obwod);
    }
}
