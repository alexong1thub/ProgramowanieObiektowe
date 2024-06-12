package zadanie5;

import java.util.ArrayList;

public class EmployeeManagement {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(boolean isFulltime, String name, double salary, double hoursWorked) {
        if (isFulltime) {
            employees.add(new FullTimeEmployee(name, salary, hoursWorked));
        } else {
            employees.add(new ContractEmployee(name, salary, hoursWorked));
        }
    }

    public void removeEmployeev1(int id){
        employees.get(id-1).info();
        Employee empToRemove = employees.get(id-1);
        employees.remove(empToRemove);
        for(Employee emp: employees){
            if(emp.getId() > (id-1)){
                emp.backId();
            }

        }
    }

    public void editEmployee(int id, double wage, double timeWorked) {

        Employee employeeToEdit = employees.get(id-1);
        if (employeeToEdit != null) {
            if (employeeToEdit.getClass().equals(FullTimeEmployee.class)) {
                FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employeeToEdit;
                fullTimeEmployee.setMonthlySalary(wage);
                fullTimeEmployee.setMonthlySalary(timeWorked);
                employees.set(id-1, fullTimeEmployee);
            } else {
                ContractEmployee contractEmployee = (ContractEmployee) employeeToEdit;
                contractEmployee.setHourlyRate(wage);
                contractEmployee.setHoursWorked(timeWorked);
                employees.set(id-1, contractEmployee);
            }
        }
    }


    public void showEmployees() {
        for (Employee employee : employees) {
            if (employee.getClass().equals(FullTimeEmployee.class)) {
                FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
                fullTimeEmployee.info();
            } else {
                ContractEmployee contractEmployee = (ContractEmployee) employee;
                contractEmployee.info();

            }
        }
    }

}
