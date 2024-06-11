package zadanie5;

import java.util.ArrayList;

public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagement empMan = new EmployeeManagement();

        empMan.addEmployee(true, "Frank Sinatra", 20000, 100);
        empMan.addEmployee(false, "John Travolta", 15, 120);
        empMan.addEmployee(false, "Hipster Johnes", 27, 54);

        empMan.showEmployees();

        empMan.removeEmployee(1);
        System.out.println("After removing id=1");
        empMan.showEmployees();
        empMan.removeEmployee(1);
        System.out.println("After removing id=1 again");
        empMan.showEmployees();

    }
}
