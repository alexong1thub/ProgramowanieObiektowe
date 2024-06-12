package zadanie5;

public class ContractEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;
    private static int contractEmployeeCounter = 0;
    private int contractEmployeeId = 0;

    public ContractEmployee(String n, double hR, double hW) {
        generateEmployeeId();
        generateContractEmployeeId();
        name = n;
        hourlyRate = hR;
        hoursWorked = hW;
    }

    public void generateContractEmployeeId(){
        contractEmployeeId = ++contractEmployeeCounter;
    }

    @Override
    public void generateEmployeeId() {
        employeeId = ++employeeCounter;
    }


    @Override
    public int getId(){
        return employeeId;
    }

    @Override
    public void backId(){
        if(contractEmployeeId>1){
            contractEmployeeId--;
            employeeId--;
        }

    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void info() {
        System.out.println(name + " is working: " + hoursWorked +
                " hours for " + hourlyRate + "$ per hour " + "In month he will earn " + calculateSalary() + "$ contractEmployeeId=" + contractEmployeeId + " employeeId=" + getId());
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
