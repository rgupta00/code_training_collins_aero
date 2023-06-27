package com.day6.session1.java8streams;
import java.util.*;
public class D_SortingUserDefineObject {

	public static void main(String[] args) {
	
		List<Employee>employees=new ArrayList<Employee>();
		employees.add(new Employee(123,	"zen", "delhi", 45000.00));
		employees.add(new Employee(13,	"sumit", "noida", 42000.00));
		employees.add(new Employee(93,	"sumit", "banglore", 49000.00));
		employees.add(new Employee(939,	"amit", "chennai", 59000.00));
		
		System.out.println("---printing all emps as it is-------------");
		for(Employee e: employees){
			System.out.println(e);
		}
		
		System.out.println("sort the employee as per id");
		Collections.sort(employees);
		for(Employee e: employees){
			System.out.println(e);
		}
	
		
	}
}




