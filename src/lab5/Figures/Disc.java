package lab5.Figures;

public class Disc extends Figure{
    double r;
    final double PI = 3.14;

    public Disc(double r){
        this.r = r;
    }
    @Override
    public double calculatePole() {
        pole = PI * r * r;
        return pole;
    }

    @Override
    public double calculateObwod() {
        obwod = 2 * PI * r;
        return obwod;
    }
}
