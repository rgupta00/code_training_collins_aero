package com.demo.ex2;

public class ProcessShape {

	
	//OCP : open for extension but close for modification
	
	public static void process(Object shape) {
		if(shape instanceof CircleShape) {
			((CircleShape) shape).drawCircle();
		}else if(shape instanceof SquareShape) {
			((SquareShape) shape).drawSquare();
		}else if(shape instanceof TriangleShape) {
			((TriangleShape) shape).drawTriangle();
		}else if(shape instanceof SquareShape) {
			((SquareShape) shape).drawSquare();
		}
	}
}
