package lab5.Figures;

public class FigureTest {
    public static void main(String[] args) {
        Disc disc = new Disc(2.5);
        Square square = new Square(6.);
        disc.calculateObwod();
        disc.calculatePole();
        disc.info();
        square.info();
        square.calculatePole();
        square.calculateObwod();
        square.info();
    }
}
