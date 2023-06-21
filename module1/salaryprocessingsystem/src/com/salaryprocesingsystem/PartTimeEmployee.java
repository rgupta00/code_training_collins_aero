package com.salaryprocesingsystem;

public class PartTimeEmployee extends Employee{

	private int noOfDays;
	private int noOfHr;
	private int ratePerHr;
	
	public  PartTimeEmployee(int id, String name, double salary, int noOfDays, int noOfHr ,
			int ratePerHr) {
		super(id, name, salary);
		this.noOfDays=noOfDays;
		this.noOfHr=noOfHr;
		this.ratePerHr=ratePerHr;
	}
	
	@Override
	public double getPay() {
		//1000+20*5*2000
		return (getSalary()+noOfDays*noOfHr*ratePerHr) *.8;
	}

	public void printDetails(){
		super.printDetails();
		System.out.println("noOfDays : "+ noOfDays);
		System.out.println("noOfHr : "+ noOfHr);
		System.out.println("ratePerHr : "+ ratePerHr);
		
	}
	
}
