package com.day6.session1_quick_recap;

import java.util.Scanner;
//loose coupling and high cohesion
//m1		m2: abstraction : 2 ways to achive abs in java: abs class vs interface

//abstract class Shape{
//	public abstract void showArea();
//}

interface Shape{
	public abstract void showArea();
}
class Circle implements Shape{

	@Override
	public void showArea() {
		System.out.println("area of circle : PI r r");
	}
}
class Triangle implements Shape{

	@Override
	public void showArea() {
		System.out.println("area of Triangle : 0.5 X B X h");
	}
}

class Square implements Shape{

	@Override
	public void showArea() {
		System.out.println("area of Sq :l X b");
	}
}

public class A_InterfaceAndAbClass {
	
	public static void main(String[] args) {
		
		Shape shape=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE ur choice 1. Circle 2. Tr 3. SQ");
		int choice=scanner.nextInt();
		
		if(choice==1)
			shape=new Circle();
		else if(choice==2)
			shape=new Triangle();
		else 
			shape=new Square();
		
		shape.showArea();
		
	}

}





