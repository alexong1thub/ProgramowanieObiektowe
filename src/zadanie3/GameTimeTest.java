package zadanie3;

import java.time.LocalDate;

public class GameTimeTest {
    public static void main(String[] args) {
        Player iga = new Player("Iga", "Swiatek", LocalDate.of(2001, 5, 31), "tennis");
        iga.thankFans();
        Coach tomasz = new Coach("Tomasz", "Wiktorowski", LocalDate.of(1981, 1, 10), 19);
    }
}
