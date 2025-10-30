package assessmentOct.streamQuestion;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeProcessing {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "IT", 70000, 2019),
                new Employee(2, "Bob", "Finance", 65000, 2021),
                new Employee(3, "Charlie", "IT", 95000, 2022),
                new Employee(4, "Diana", "HR", 72000, 2023),
                new Employee(5, "Eve", "Finance", 88000, 2018),
                new Employee(6, "Frank", "IT", 68000, 2024)
        );

        //Finding highest paid employee in each department
        Map<String, Optional<Employee>> highestPaidByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        System.out.println("1. Highest Paid Employee per Department:");
        highestPaidByDept.forEach((dept, empOpt) -> empOpt.ifPresent(emp ->
                System.out.println(dept + " -> " + emp.getName() + " ($" + emp.getSalary() + ")")));

        // Counting employees who joined after 2020
        long countAfter2020 = employees.stream()
                .filter(e -> e.getJoiningYear() > 2020)
                .count();

        System.out.println("\n2. Employees joined after 2020: " + countAfter2020);

        //Map of department and list of employee names
        Map<String, List<String>> deptToNamesMap = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));

        System.out.println("\n3. Department to Names Map:");
        deptToNamesMap.forEach((dept, names) ->
                System.out.println(dept + " -> " + names));
    }
}
