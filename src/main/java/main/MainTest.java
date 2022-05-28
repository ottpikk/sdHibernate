package main;

import model.Department;
import model.Employee;
import model.EmployeeDepartment;
import model.Project;
import persistence.RepositoryDepartment;
import persistence.RepositoryEmployee;
import persistence.RepositoryProject;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setFirstName("Jimmy");
        employee1.setLastName("Blue");
        employee1.setPhoneNumber("6548-9999");
        employee1.setSalary(2584);
        employee1.setDateOfBirth("1997-01-01");
        employee1.setEmail("jimmy@gmail.com");
        employee1.setManager(employee1);  // set employee to be his own manager

        //employee1.setEmployeeId(1);

        Project project1 = new Project();
        project1.setDescription("Create new online store");
        project1.setProjectId(2);

        Department department = new Department();
        department.setName("Management");

        RepositoryProject repositoryProject = new RepositoryProject();
        RepositoryEmployee repositoryEmployee = new RepositoryEmployee();
        RepositoryDepartment repositoryDepartment = new RepositoryDepartment();

        /*
        //Employee
        repositoryEmployee.saveEmployee(employee1);
        repositoryEmployee.updateEmployeeSalary(1,5555);
        repositoryEmployee.deleteEmployee(employee1);
        for (Employee emp : repositoryEmployee.listAllEmployees()) {
            System.out.println(emp.toString());
        }
        repositoryEmployee.deleteEmployeeUsingQuery(3);
        System.out.println(repositoryEmployee.findEmployeeById(4));
        System.out.println(repositoryEmployee.findEmployeeByIdUsingQuery(5));
        employee1.setDepartment(department);  // set department for employee

        List<Employee> list = repositoryEmployee.findEmployeeByDepartmentName("IT");
        for (Employee emp: list) {
            System.out.println(emp);
        }

        //Project
        repositoryProject.saveProject(project1);
        repositoryProject.updateProject(project1);
        repositoryProject.deleteProject(project1);

        //Department
        repositoryDepartment.saveDepartment(department);
        for (Department dept:
             repositoryDepartment.listAllDepartment()) {
             System.out.println(dept);
        }
        */

        List<EmployeeDepartment> list = repositoryEmployee.listEmployeeWithDepartmentName();
        for (EmployeeDepartment emp : list){
            System.out.println(emp);
        }

    }
}
