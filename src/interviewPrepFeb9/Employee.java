package interviewPrepFeb9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {

	String name;
	String desg;
	int salary;
	public Employee(String name, String desg, int salary) {
		super();
		this.name = name;
		this.desg = desg;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
	    return name + " : " + salary;
	}
	
	public static void main(String[] args) {
		List<Employee> emplist = List.of(
				new Employee("Arun", "SE",9000),
				new Employee("John", "SE",6000),
				new Employee("Alice", "SSE",10000),
				new Employee("Tom", "SSE",70000));
		Map<String,List<Employee>> empBydesg = emplist.stream()
				.collect(Collectors.groupingBy(Employee::getDesg));
		
		empBydesg.forEach((desg, list) -> System.out.println(desg + " -> " + list));
		
//		empBydesg.forEach((desg, list) -> {
//		   // System.out.println(desg);
//		    list.forEach(emp ->
//		        System.out.println(emp.getDesg()+"  " + emp.getName() + " : " + emp.getSalary())
//		    );
//		});
//		
		empBydesg.forEach((desg, list) ->
        list.sort(Comparator.comparingInt(Employee::getSalary))
		);
		System.out.println("");
		System.out.println("==========Sorted salaries====================================");
		empBydesg.forEach((desg, list) -> System.out.println(desg + " -> " + list));
		
		System.out.println("");
		System.out.println("=====Group by dept and Sorted salaries using same stream====================================");
		emplist.stream()
	       .sorted(Comparator.comparingInt(Employee::getSalary))
	       .collect(Collectors.groupingBy(Employee::getDesg));
		
		
		System.out.println("");
		System.out.println("=====Group,Sorted and print====================================");
		emplist.stream()
	       .collect(Collectors.groupingBy(Employee::getDesg))
	       .forEach((desg, list) -> {
	           System.out.println(desg);
	           list.stream()
	               .sorted(Comparator.comparingInt(Employee::getSalary))
	               .forEach(emp ->
	                   System.out.println("  " + emp.getName() + " : " + emp.getSalary())
	               );
	       });
	}
	//list emp with desg se ans sse different salaries and group emp by designation using stream
	// sort them on top of designation map with salaries
}
