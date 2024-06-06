package zadanie5;

import java.util.ArrayList;

public class EmployeManagementTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee firstOne = new FullTimeEmployee("Krzysiu", 3600, 20);
        firstOne.info();
        Employee secondOne = new ContractEmployee("Benek", 27.70, 120);
        firstOne.calculateSalary();
        secondOne.calculateSalary();
        secondOne.info();

    }
}
