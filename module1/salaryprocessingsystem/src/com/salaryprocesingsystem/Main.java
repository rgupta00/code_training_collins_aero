package com.salaryprocesingsystem;

public class Main {
	
	public static void main(String[] args) {
		
		Employee e=new PartTimeEmployee(1, "rajat", 1200, 12,5,2500);
		e.printDetails();
		
		PaymentProcessor.paymentProcessing(e);
		
		Invoice invoice=new Invoice("A1Aq", "raj", 30000, 15, "AZAQ");
		PaymentProcessor.paymentProcessing(invoice);

		
//		Employee e=new FullTimeEmployee(1, "rajat", 120000, "ASJLKJLJ");
//		e.printEmployee();
//		System.out.println(e.getPay());
	}

}
