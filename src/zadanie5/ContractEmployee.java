package zadanie5;

public class ContractEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;
    private int contractEmployeeId = 0;

    public ContractEmployee(String n, double hR, double hW) {
        id++;
        contractEmployeeId = id;
        this.name = n;
        this.hourlyRate = hR;
        this.hoursWorked = hW;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void info() {
        System.out.println(name + " is working: " + hoursWorked +
                " hours for " + hourlyRate + "$ per hour " + "In month he will earn " + calculateSalary() + "$(BTW EmployeeId=" + id + " CONTRACTORID="+contractEmployeeId+")");
    }
}
