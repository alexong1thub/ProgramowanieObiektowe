package zadanie3;

import java.time.LocalDate;

public class Coach extends TeamMember{
    private int yearsCoachExperience;
    public Coach(String name, String surname, LocalDate birthDate, int yearsCoachExp){
        super(name, surname, birthDate);
        this.yearsCoachExperience = yearsCoachExp;
    }

    public int getYearsCoachExperience() {
        return yearsCoachExperience;
    }

    public void yellAtPlayer(Player player){
        System.out.println("DAWAJ, DAWAJ, JAZDA " + player.getName());
    }

}
