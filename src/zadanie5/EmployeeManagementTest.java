package zadanie5;

public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagement empMan = new EmployeeManagement();

        empMan.addEmployee(true, "Frank Sinatra", 20000, 100);
        empMan.addEmployee(false, "John Travolta", 15, 120);
        empMan.addEmployee(false, "Hipster Johnes", 27, 54);

        empMan.showEmployees();
        empMan.editEmployee(2, 4321, 20);
        System.out.println("After editing id=2");

        empMan.showEmployees();
        empMan.removeEmployeev1(2);
        empMan.showEmployees();

        empMan.addEmployee(false, "Hipster Johnes 2", 27, 54);
        empMan.showEmployees();
    }
}
