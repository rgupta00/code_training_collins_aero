package com.day11.dp.structrual.adpator;
import java.util.*;
class RoundPeg{
	public void insertToHole(String data) {
		System.out.println("insert to hole :"+ data);
	}
}
class SquarePeg{
	public void insertToSquare(String data) {
		System.out.println("insert to square :"+ data);
	}
}
//this class act as a adaptor that make a RoundPeg comptable to SquarePeg
class ShapeAdaptor extends SquarePeg{
	
	private RoundPeg peg;

	public ShapeAdaptor(RoundPeg peg) {
		this.peg = peg;
	}

	@Override
	public void insertToSquare(String data) {
		peg.insertToHole(data);
	}
		
}
public class DemoAdaptor {
	
	public static void main(String[] args) {
		//String names[]= {"raj","ravi","gunika"};
		
		//List<String> list=Arrays.asList(names);
		//adaptors to convert char stream <===> byte stream
		
		RoundPeg roundPeg= new RoundPeg();
		
		
		//SquarePeg sequarePeg=roundPeg;
		SquarePeg sequarePeg=new ShapeAdaptor(roundPeg);
		
		myMetthod(sequarePeg);
		
	}

	private static void myMetthod(SquarePeg sequarePeg) {
		sequarePeg.insertToSquare("hello shape");
	}

}
