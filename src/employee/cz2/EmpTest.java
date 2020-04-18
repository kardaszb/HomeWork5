package employee.cz2;

import employee.cz2.logic.EmployeeCreator;
import employee.cz2.logic.CompanyContainer;

public class EmpTest {
    public static void main(String[] args) {
        EmployeeCreator employeeCreator = new EmployeeCreator();
        CompanyContainer companyContainer = new CompanyContainer();

        companyContainer.add(employeeCreator);
        companyContainer.add(employeeCreator);
        companyContainer.add(employeeCreator);

        companyContainer.get(2);
    }
}
