package com.day2.ex3;

import java.util.Scanner;
//req: new to java pls listen my playlist

abstract class Shape{
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	public abstract void getArea();
	
	public void printColor(){
		System.out.println("color : "+ color);
	}
}
class Triangle extends Shape{
	public Triangle(String color) {
		super(color);
	}
	@Override
	public void getArea() {
		System.out.println("area of tri: 0.5 X b X h");
	}
	
}
class Circle extends Shape{
	public Circle(String color) {
		super(color);
	}
	@Override
	public void getArea() {
		System.out.println("area of Circle: PI X r X r");
	}
}

class Square extends Shape{
	public Square(String color) {
		super(color);
	}
	@Override
	public void getArea() {
		System.out.println("area of Square: L X W");
	}
}



public class D_CodeFlexiblity {
	
	public static void main(String[] args) {
		//i can take choice for the user
		//1. circle
		//2. sq
		//3. triangle
		
		Shape shape=null;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE ur choice...1. Cir 2. Sq 3. Tri.");
		int choice= scanner.nextInt();
		if(choice==1)
			shape=new Circle("red");
		else if(choice==2)
			shape=new Square("red");
		else 
			shape=new Triangle("red");
		
		shape.getArea();//Which method is going to be called is decided at run time
		//ie why it is called run time polymorophism
		
	}

}





