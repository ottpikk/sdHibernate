package main;

import model.Employee;
import persistence.RepositoryEmployee;

public class MainTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setFirstName("Billy");
        employee1.setLastName("Green");
        employee1.setPhoneNumber("666-9999");
        employee1.setSalary(4567);
        employee1.setDateOfBirth("2000-02-01");
        employee1.setEmail("billygreen@gmail.com");

        RepositoryEmployee repositoryEmployee = new RepositoryEmployee();
        repositoryEmployee.saveEmployee(employee1);
    }
}
