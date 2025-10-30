package assessmentOct.streamQuestion;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int joiningYear;

    public Employee(int id, String name, String department, double salary, int joiningYear) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joiningYear = joiningYear;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public int getJoiningYear() { return joiningYear; }

    @Override
    public String toString() {
        return String.format("Employee{id=%d, name='%s', department='%s', salary=%.2f, joiningYear=%d}",
                id, name, department, salary, joiningYear);
    }
}