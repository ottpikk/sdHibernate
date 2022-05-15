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

        employee1.setFirstName("Jimmy");
        employee1.setLastName("Black");
        employee1.setPhoneNumber("55-9999");
        employee1.setSalary(3254);
        employee1.setDateOfBirth("1995-12-31");
        employee1.setEmail("johnnyblack@gmail.com");
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
        repositoryEmployee.saveEmployee(employee1);
        repositoryEmployee.updateEmployeeSalary(1,5555);
        repositoryEmployee.deleteEmployee(employee1);

        for (Employee emp : repositoryEmployee.listAllEmployees()) {
            System.out.println(emp.toString());
        }

        repositoryEmployee.deleteEmployeeUsingQuery(3);
        repositoryProject.saveProject(project1);
        repositoryProject.updateProject(project1);
        repositoryProject.deleteProject(project1);
        */

        repositoryDepartment.saveDepartment(department);









    }
}
