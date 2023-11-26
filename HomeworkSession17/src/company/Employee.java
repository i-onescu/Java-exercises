package company;

public class Employee {
    private String name;
    private Department department;
    private long salary;

    public Employee(String name, Department department, long salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public Department getDepartment() {
        return department;
    }

    public long getSalary() {
        return salary;
    }

}

