package com.salaryprocesingsystem;

public class FullTimeEmployee extends Employee{

	private String ppf;
	
	public  FullTimeEmployee(int id, String name, double salary, String ppf) {
		super(id, name, salary);
		this.ppf=ppf;
	}
	
	@Override
	public double getPay() {
		return getSalary()*0.7;
	}

	public void printDetails(){
		super.printDetails();
		System.out.println("ppf : "+ ppf);
	}
	
}
