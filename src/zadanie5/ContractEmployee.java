package zadanie5;

public class ContractEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;
    private static int contractEmployeesCounter = 0;
    private int contractEmployeeId = 0;

    public ContractEmployee(String n, double hR, double hW) {
        generateEmployeeId();
        generatecontractEmployeeId();
        name = n;
        hourlyRate = hR;
        hoursWorked = hW;
    }

    public void generatecontractEmployeeId(){
       contractEmployeeId = ++contractEmployeesCounter;
    }

    @Override
    public void generateEmployeeId() {
        employeeId = ++employeeIdCounter;
    }

    @Override
    public int getId(){
        return contractEmployeeId;
    }

    @Override
    public void backId(){
        employeeId--;
    }
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void info() {
        System.out.println(name + " is working: " + hoursWorked +
                " hours for " + hourlyRate + "$ per hour " + "In month he will earn " + calculateSalary() + "$ contractEmployeeId=" + getId() + " employeeId=" + employeeId);
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
