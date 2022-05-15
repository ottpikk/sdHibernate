package main;

import model.Department;
import model.Employee;
import model.Project;
import persistence.RepositoryDepartment;
import persistence.RepositoryEmployee;
import persistence.RepositoryProject;

public class MainTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setFirstName("Johnny");
        employee1.setLastName("Green");
        employee1.setPhoneNumber("456-9999");
        employee1.setSalary(9874);
        employee1.setDateOfBirth("1998-01-01");
        employee1.setEmail("johnny@gmail.com");
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

        //Project
        repositoryProject.saveProject(project1);
        repositoryProject.updateProject(project1);
        repositoryProject.deleteProject(project1);


        //Department
        repositoryDepartment.saveDepartment(department);

        */
        for (Department dept:
             repositoryDepartment.listAllDepartment()) {
            System.out.println(dept);
        }










    }
}
