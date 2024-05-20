package zadanie2;

public class SystemObslugiKlientow {
    public static void main(String[] args){
        Klient mark = new Klient("Marek", "Malanowski");
        System.out.println(mark.pobierzDaneKlienta());
        mark.dodajPunktyLojalnosciowe(10);
        mark.dodajPunktyLojalnosciowe(20);

        Klient peter = new Klient("Piotr", "Marker", 2);
        System.out.println(peter.pobierzDaneKlienta());
        peter.dodajPunktyLojalnosciowe(22);
        peter.dodajPunktyLojalnosciowe(-50);


        KlientVip chuck =  new KlientVip("Chuck", "Norris", 3, 10);
        System.out.println(chuck.pobierzDaneKlienta());
        chuck.ustawUpustProcentowy(100);
        chuck.ustawUpustProcentowy(-100);
        chuck.ustawUpustProcentowy(0);
    }
}
