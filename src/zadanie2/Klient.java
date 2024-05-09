package zadanie2;

public class Klient {
    String imie;
    String nazwisko;
    int nrKlienta;
    int punktyLojalnosciowe = 0;
    static int liczbaKlientow = 0;
    public Klient(String i, String n, int nrK){
        liczbaKlientow++;
        this.imie = i;
        this.nazwisko = n;
        this.nrKlienta = nrK;
        System.out.println("Klient " + this.imie + " został dodany do systemu");
    }
    public Klient(String i, String n){
        liczbaKlientow++;
        this.imie = i;
        this.nazwisko = n;
        this.nrKlienta = liczbaKlientow;
        System.out.println("Klient " + this.imie + " został dodany do systemu");
    }

    public void dodajPunktyLojalnosciowe(int nowePunktyLojal){
        this.punktyLojalnosciowe += nowePunktyLojal;
    }

    public String pobierzDaneKlienta(){
        return "Klient nazywa sie: " + this.imie + " " + this.nazwisko + " jego nr klienta to: " + this.nrKlienta + " ma on: " + this.punktyLojalnosciowe + " punktow lojalnosciowych";
    }
}
