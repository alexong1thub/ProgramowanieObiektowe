package zadanie5;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeManagement {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(boolean isFulltime, String name, double salary, double hoursWorked){
        if(isFulltime){
            employees.add(new FullTimeEmployee(name, salary, hoursWorked));
        }
        else{
            employees.add(new ContractEmployee(name, salary, hoursWorked));
        }
    }

    public void removeEmployee(int id){
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                for (Employee emp : employees) {
                    if (emp.getId() > id) {
                        emp.backId();
                    }
                }
                break;
            }
        }

    }

    public void editEmployee(int id, double salary, double money){
        Employee employeeToEdit = employees.get(id);
        if(employeeToEdit != null){
            if(employeeToEdit.getClass().equals(FullTimeEmployee.class)){
                FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employeeToEdit;
                fullTimeEmployee.setMonthlySalary(salary);
                fullTimeEmployee.setMonthlySalary(money);
                employees.set(id, fullTimeEmployee);
            }
            else{
                ContractEmployee contractEmployee = (ContractEmployee) employeeToEdit;
                contractEmployee.setHourlyRate(salary);
                contractEmployee.setHoursWorked(money);
                employees.set(id, contractEmployee);
            }
        }
    }
    public void showEmployees(){
        for(Employee employee: employees){
            if(employee.getClass().equals(FullTimeEmployee.class)){
                FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
                fullTimeEmployee.info();
            }
            else{
                ContractEmployee contractEmployee = (ContractEmployee) employee;
                contractEmployee.info();

            }
        }
    }

}
