package zadanie5;

public class FullTimeEmployee extends Employee {

    private double monthlySalary;
    private double daysWorked;
    private int fullTimeEmployeeId = 0;
    public FullTimeEmployee(String n, double mS, double dW) {
        id++;
        fullTimeEmployeeId = id;
        name = n;
        this.monthlySalary = mS;
        this.daysWorked = dW;
    }

    @Override
    public double calculateSalary() {
        return (monthlySalary / 30) * daysWorked;
    }

    @Override
    public void info() {
        System.out.println(name + " is earning: " + monthlySalary + "$, (BTW Employeeid="+id+" FULLTIMEEMPLOYEEID=" + fullTimeEmployeeId+")");
    }
}
