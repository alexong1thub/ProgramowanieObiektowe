package zadanie5;

public class FullTimeEmployee extends Employee {

    private static int fullTimeEmployeeCounter = 0;
    private int fullTimeEmployeeId = 0;
    private double monthlySalary;
    private double daysWorked;


    public FullTimeEmployee(String n, double mS, double dW) {
        generateEmployeeId();
        generateId();
        name = n;
        this.monthlySalary = mS;
        this.daysWorked = dW;
    }

    public void generateId() {
        fullTimeEmployeeId = ++fullTimeEmployeeCounter;

    }

    @Override
    public void generateEmployeeId() {
        employeeId = ++employeeCounter;
    }

    @Override
    public int getId() {
        return employeeId;
    }

    @Override
    public void backId() {
        if(fullTimeEmployeeId>1){
            fullTimeEmployeeId--;
            employeeId--;
        }

    }

    @Override
    public double calculateSalary() {
        return (monthlySalary / 30) * daysWorked;
    }

    @Override
    public void info() {
        System.out.println(name + " is earning: " + monthlySalary + "$, fullTimeEmployeeId=" + fullTimeEmployeeId + " employeeId=" + employeeId);
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
