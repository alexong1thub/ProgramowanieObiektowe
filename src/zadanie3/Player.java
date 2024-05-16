package zadanie3;

import java.time.LocalDate;

public class Player extends TeamMember{
    private String discipline;

    public Player(String name, String surname, LocalDate birthDate, String discipline) {
        super(name, surname, birthDate);
        this.setDiscipline(discipline);
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }


}
