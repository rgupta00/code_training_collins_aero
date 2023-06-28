package com.demo.ex2.sol;

public class ProcessShape {

	
	//OCP : open for extension but close for modification
	
	public static void processShape(Shape shape){
		shape.drawShape();
	}
}
