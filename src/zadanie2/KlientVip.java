package zadanie2;

public class KlientVip extends Klient{
    double upustProcentowy;
    public KlientVip(String imie, String nazwisko, int nrKlienta, double upustProcentowy){
        super(imie, nazwisko, nrKlienta);
        this.upustProcentowy = upustProcentowy;
    }

    public void ustawUpustProcentowy(double percent){
        if(percent < 0){
            System.out.println("Procenty upustu powinny miescic sie w przedziale większym od 0 \n" +
                    "Upust pozostał bez zmian.");
        }else{
            this.upustProcentowy = percent;
            System.out.println("Zmieniono upust cenowy klienta na: " + this.upustProcentowy);
        }

    }

    @Override
    public String pobierzDaneKlienta() {
        return super.pobierzDaneKlienta() + " i ma: " + this.upustProcentowy + "% upustu";
    }
}
