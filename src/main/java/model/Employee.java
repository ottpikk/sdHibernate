package model;

import javax.persistence.*;

// let hibernate know to create table form class
@Entity
// change table name if you want
@Table(name = "employee")
public class Employee {
    // let hibernate know the primary key
    @Id
    // auto-increment
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    //change column name if you want, can be done wit every column
    @Column(name = "employee_id")
    private int employeeId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private int salary;
    private String phoneNumber;

    //add foreign key column departmentId
    @ManyToOne
    @JoinColumn(name = "department_Id")
    private Department department;

    //add foreign key from same class
    @ManyToOne
    @JoinColumn(name = "manager_Id")
    private Employee manager;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", department=" + department +
                ", manager=" + manager +
                '}';
    }
}
