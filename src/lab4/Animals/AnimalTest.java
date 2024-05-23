package lab4.Animals;

import java.util.Scanner;

public class AnimalTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal cat = new Animal("Miler", 1);
        Animal dog = new Animal("Reksio", 5);

        System.out.println(cat.toString());
        System.out.println(dog.toString());

        System.out.println(cat.equals(dog));
        System.out.println(cat.equals(cat));
        System.out.println("Tell me what day is it: ");
        WEEK today = WEEK.valueOf(sc.nextLine());
        switch(today){
            case MONDAY -> System.out.println("Dzisiaj jest poniedzialek");
            case TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("Dzisiaj jest kolejny dzien po poniedzialku");
            case FRIDAY, SATURDAY-> System.out.println("W końcu weekend");
            case SUNDAY -> System.out.println("Niedziela wieczur...");
            default -> System.out.println("To nawet nie jest dzien tygodnia");
        }
    }
}
