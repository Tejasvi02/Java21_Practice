package test_Nov10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	
	String firstName;
	String lastName;
	String dept;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>  empList = new ArrayList<>();
		empList.add(new Employee("emp1", "emp1", "HR"));
		empList.add(new Employee("emp2", "emp2", "IT"));
		empList.add(new Employee("emp3", "emp3", "IT"));
		
		//group employees by department
		Map<String, List<Employee>> empByDept = 
				empList.stream()
						.collect(Collectors.groupingBy(Employee::getDept));
		
		System.out.println(empByDept.toString());
		
		//group employees' first name by department
		Map<String, List<String>> firstNamesByDept =
		        empList.stream()
		               .collect(Collectors.groupingBy(
		                       Employee::getDept,
		                       Collectors.mapping(Employee::getFirstName, Collectors.toList())
		               ));
		
		System.out.println(firstNamesByDept.toString());
	
	}

	public Employee(String firstName, String lastName, String dept) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
	}

}
