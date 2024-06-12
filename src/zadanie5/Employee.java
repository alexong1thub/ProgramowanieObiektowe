package zadanie5;

public abstract class Employee {
    static int employeeCounter = 0;
    int employeeId = 0;
    String name;
    public abstract double calculateSalary();
    public abstract void info();
    public abstract void generateEmployeeId();
    public abstract void backId();
//    public abstract void backCounter();
    public abstract int getId();

}
