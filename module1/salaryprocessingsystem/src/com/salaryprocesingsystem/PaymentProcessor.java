package com.salaryprocesingsystem;

public class PaymentProcessor {
	
	public static void paymentProcessing(Payable payable){
		double payment= payable.getPay();
		//some jdbc ( data connectivity) to put data to database
		System.out.println("---------------------------");
		System.out.println("payment is being process "+ payment);
		System.out.println("---------------------------");
		
	}

}
