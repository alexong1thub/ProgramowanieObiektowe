package lab5.Figures;

public class Square extends Figure{
    double a;

    public Square(double a){
        this.a = a;
    }
    @Override
    public double calculatePole() {
        pole = a*a;
        return pole;
    }

    @Override
    public double calculateObwod() {
        obwod = 4*a;
        return obwod;
    }
}
