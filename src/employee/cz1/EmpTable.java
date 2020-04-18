package employee.cz1;

import employee.cz1.logic.EmployeeCreator;
import employee.cz1.model.Employee;

public class EmpTable {
    public static void main(String[] args) {
        EmployeeCreator employeeCreator = new EmployeeCreator();
        Employee[] employees = new Employee[2];

        employees[0] = employeeCreator.create();
        employees[1] = employeeCreator.create();
        System.out.println(employees[0].toString());
        System.out.println(employees[1].toString());
        System.out.println("Wynagrodzenia razem: " + (employees[0].getSalary() + employees[1].getSalary()));

    }
}
