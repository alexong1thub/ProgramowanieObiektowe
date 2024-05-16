package zadanie3;

import java.time.LocalDate;
import java.util.Scanner;

public class TeamMember {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private static final Scanner sc = new Scanner(System.in);
    public TeamMember(String name, String surname, LocalDate birthDate){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public TeamMember(String name, String surname){
        this.name = name;
        this.surname =surname;
        setBirthDate();
    }

    public void thankFans(){
        System.out.println("Hey, it's me " + getName() +". Thank you all for your support");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(){
        System.out.println("Podaj rok urodzenia: ");
        int year = Integer.parseInt(sc.nextLine());
        int birthYearLimitMax = LocalDate.now().getYear()-10;
        System.out.println("Podaj miesiac urodzenia: ");
        int month = Integer.parseInt(sc.nextLine());
        if(year > 1920 && year < birthYearLimitMax && month > 0 && month < 13)
        {
            int day = Integer.parseInt(sc.nextLine());
            if(month != 2 && month % 2 == 0 && day > 31){
                System.out.println("Miesiace parzysty, oprocz lutego maja 31 dni");
            }
            else if(month %2 != 0 && day > 30){
                System.out.println("Miesiace nieparzyste maja 30 dni");
            }

            if(year % 4 == 0 && month == 2 && day > 29){
                System.out.println("Luty w roku przestepnym ma 29 dni!");
            }
            else if(year % 4 == 0 && month == 2 && day > 28){
                System.out.println("Luty w roku przestepnym ma 28 dni!");
            }
            this.birthDate = LocalDate.of(year, month, day);
        }
        else{
            System.out.println("Rok urodzenia musi byc w przedziale 1920 do " + birthYearLimitMax);
            System.out.println("Miesiac musi byc w przedziale 1 do 12");
        }

    }
}
