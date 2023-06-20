package com.day2.ex3;
//What is function overloading : 4hr , 6hr 
class Cal{
	
	public double add(int a, double b){
		System.out.println("public double add(int a, double b)");
		return a+b;
	}
	
	public double add(double a, int b){
		System.out.println("public double add(double a, int b)");
		return a+b;
	}
	
	
//	public int add(int a, int b,int c){
//		return a+b+c;
//	}
}
public class B_FunctionOverloading {
	
	public static void main(String[] args) {
		
		Cal c=new Cal();
		double value=c.add(2, 2.8);//as compiler know which method ur calling. ie ....
		System.out.println(value);
		
		
		
		
		
		
		
		
		
		
		//compile time 
		//Cal c=new Cal();
		//int value=c.add(2, 2,5);//as compiler know which method ur calling. ie ....
		//System.out.println(value);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
