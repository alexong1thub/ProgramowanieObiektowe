package zadanie5;

public class FullTimeEmployee extends Employee {

    private static int fullTimeEmployeesCounter = 0;
    private double monthlySalary;
    private double daysWorked;

    private int fullTimeEmployeeId = 0;

    public FullTimeEmployee(String n, double mS, double dW) {
        generateEmployeeId();
        generateId();
        name = n;
        this.monthlySalary = mS;
        this.daysWorked = dW;
    }

    public void generateId(){
        fullTimeEmployeeId = ++fullTimeEmployeesCounter;
    }

    @Override
    public void generateEmployeeId() {
        employeeId = ++employeeIdCounter;
    }
    @Override
    public int getId(){
        return fullTimeEmployeeId;
    }

    @Override
    public void backId(){
        employeeId--;
    }

    @Override
    public double calculateSalary() {
        return (monthlySalary / 30) * daysWorked;
    }

    @Override
    public void info() {
        System.out.println(name + " is earning: " + monthlySalary + "$, fullTimeEmployeeId=" +getId() + " employeeId=" + employeeId);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(double daysWorked) {
        this.daysWorked = daysWorked;
    }
}
