package zadanie3;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class SupportStaff extends TeamMember{
    private String role;

    public SupportStaff(String name, String surname, LocalDate birthDate, String role) {
        super(name, surname, birthDate);
        this.setRole(role);
    }

    public void getWater(TeamMember teamMember){
        System.out.println(teamMember.getName() + " here is you water! Get them!");
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void pepTalk(Player player){
        System.out.println("You can do this! Who are you? YOU ARE WINNER. KEEP YOUR HEAD ON THE PRIZE! GET THEM: " + player.getName());
    }

}
