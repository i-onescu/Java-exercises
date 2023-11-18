package HomeworkSession7.Exercise7;

public class Employee extends Person{
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName,lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public Employee(String firstName, String lastName, int employeeId) {
        super(firstName, lastName);
        this.employeeId = employeeId;
    }

    public Employee(String firstName, String lastName, String jobTitle) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
    }

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String getLastName() {
        return lastName + jobTitle;
    }
}
