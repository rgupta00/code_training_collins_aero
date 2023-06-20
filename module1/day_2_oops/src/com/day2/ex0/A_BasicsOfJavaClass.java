package com.day2.ex0;
class Employee{
	private int id;
	private String name;
	private double salary;
	
	//getter and setter (mutator?)
	
	public void setSalary(int salary){
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	//default ctr
	public Employee(){
		this(1,"foo",90000);
		System.out.println("this is default ctr");
	}
	//para ... ctr
	//what is the job of ctr? used to init initial values to instance variable
	public Employee(int id, String name, double salary){
		//this();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	//copy ctr: used to create the object with the help of state of another object
	public Employee(Employee e){
		this.id=e.id;
		this.name=e.name;
		this.salary=e.salary;
	}
	
	
	public void printEmployee(){
		System.out.println("id : "+ id );
		System.out.println("name : "+ name );
		System.out.println("salary : "+ salary );
	}
}
public class A_BasicsOfJavaClass {
	
	//java oo basics: class , object , ctr: default parameteriszed, copy ctr
	//gettter setters
	//business logic methods
	//this keyword
	public static void main(String[] args) {
		
		Employee e1=new Employee(2,"raj",67000);
		e1.printEmployee();
		
		e1.setSalary(100_000);
		
		e1.printEmployee();
		
		System.out.println(e1.getSalary());
		System.out.println(e1.getName());
		System.out.println(e1.getId());
		
		
	}

}
