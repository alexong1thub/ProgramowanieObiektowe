package zadanie2;

public class KlientVip extends Klient{
    double upustProcentowy;
    public KlientVip(String imie, String nazwisko, int nrKlienta, double upustProcentowy){
        super(imie, nazwisko, nrKlienta);
        this.upustProcentowy = upustProcentowy;
    }

    public void ustawUpustProcentowy(double percent){
        this.upustProcentowy = percent;
        System.out.println("Zmieniono upust cenowy klienta.");
    }

    @Override
    public String pobierzDaneKlienta() {
        return super.pobierzDaneKlienta() + " i ma: " + this.upustProcentowy + "% upustu";
    }
}
