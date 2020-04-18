package employee.cz1.logic;

import employee.cz1.model.Employee;

import java.util.Scanner;

public class EmployeeCreator {

    public Employee create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Imie:");
        String firstName = scanner.nextLine();

        System.out.println("Podaj Nazwisko:");
        String lastName = scanner.nextLine();

        System.out.println("Podaj wynagrodzenie:");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        Employee employee = new Employee(firstName, lastName, salary);
        return employee;
    }
}
