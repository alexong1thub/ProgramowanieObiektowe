package zadanie2;

public class SystemObslugiKlientow {
    public static void main(String[] args){
        Klient mark = new Klient("Marek", "Malanowski");
        System.out.println(mark.pobierzDaneKlienta());
        mark.dodajPunktyLojalnosciowe(10);
        System.out.println(mark.pobierzDaneKlienta());
        Klient peter = new Klient("Piotr", "Marker", 2);
        peter.dodajPunktyLojalnosciowe(22);
        System.out.println(peter.pobierzDaneKlienta());
        KlientVip chuck =  new KlientVip("Chuck", "Norris", 3, 10);
        System.out.println(chuck.pobierzDaneKlienta());
        chuck.ustawUpustProcentowy(100);
        System.out.println(chuck.pobierzDaneKlienta());
    }
}
