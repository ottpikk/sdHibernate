package model;

public class EmployeeProject {
    private int employeeProject;
    private int employeeId;
    private int projectId;

    public int getEmployeeProject() {
        return employeeProject;
    }

    public void setEmployeeProject(int employeeProject) {
        this.employeeProject = employeeProject;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "EmployeeProject{" +
                "employeeProject=" + employeeProject +
                ", employeeId=" + employeeId +
                ", projectId=" + projectId +
                '}';
    }
}
