package zadanie5;

public abstract class Employee {
    static int employeeIdCounter = 0;
    int employeeId;
    String name;
    public abstract double calculateSalary();
    public abstract void info();
    public abstract void generateEmployeeId();
    public abstract void backId();
    public abstract int getId();
}
