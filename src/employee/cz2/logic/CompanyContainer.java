package employee.cz2.logic;

import employee.cz2.model.Employee;

public class CompanyContainer {

    private Employee[] employees = new Employee[5];

    public void add(EmployeeCreator empCreate) {

        if (employees[0] == null) {
            employees[0] = empCreate.create();
        } else if (employees[1] == null) {
            employees[1] = empCreate.create();
        } else if (employees[2] == null) {
            employees[2] = empCreate.create();
        } else if (employees[3] == null) {
            employees[3] = empCreate.create();
        } else if (employees[4] == null) {
            employees[4] = empCreate.create();
        }
    }

    public void get(int index) {
        System.out.println(employees[index].toString());
    }
}
