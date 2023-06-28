package com.demo.ex1.sol;
//Seprate what varies

//O:OCP: 
interface Operation{
	public int apply(int a, int b);
}

 class Calculator{
	int applyOperation ( int a , int b, Operation operation) {
		return operation.apply(a, b);
	}
}


public class DemoOCP {

	public static void main(String[] args) {
		Calculator c = new Calculator();
	
		int diff=c.applyOperation(2, 1,( a,  b)-> a-b);
		
		
		System.out.println(diff);

	}
}
