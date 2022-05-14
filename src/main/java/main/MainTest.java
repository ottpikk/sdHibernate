package main;

import model.Employee;
import persistence.RepositoryEmployee;

public class MainTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setFirstName("Johnny");
        employee1.setLastName("Black");
        employee1.setPhoneNumber("55-9999");
        employee1.setSalary(3254);
        employee1.setDateOfBirth("1995-12-31");
        employee1.setEmail("johnnyblack@gmail.com");

        //employee1.setEmployeeId(1);

        RepositoryEmployee repositoryEmployee = new RepositoryEmployee();

        /*
        repositoryEmployee.saveEmployee(employee1);
        repositoryEmployee.updateEmployeeSalary(1,5555);
        repositoryEmployee.deleteEmployee(employee1);
        */
        for (Employee emp : repositoryEmployee.listAllEmployees()) {
            System.out.println(emp.toString());
        }



    }
}
