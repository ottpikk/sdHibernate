package model;

import javax.persistence.*;

@Entity
public class EmployeeProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeProjectId;

    // add foreign keys
    @ManyToOne
    @JoinColumn(name = "projectId")
    private Project project;
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;



    public int getEmployeeProjectId() {
        return employeeProjectId;
    }

    public void setEmployeeProjectId(int employeeProjectId) {
        this.employeeProjectId = employeeProjectId;
    }
}
