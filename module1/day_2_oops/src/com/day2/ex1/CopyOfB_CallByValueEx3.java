package com.day2.ex1;


public class CopyOfB_CallByValueEx3 {
	
	public static void main(String[] args) {
		Value value=new Value(5);
		//java says u cant swap 2 objects in java (trick: of array)
		//but u can change the state of object in a method call?
		System.out.println("value is : "+ value.getV());
		changeIt(value);
		System.out.println("value is : "+ value.getV());//NPE?
	}

	private static void changeIt(final Value x) {
//		x=new Value(100);// u are not allowed the change the ref
		x.setV(x.getV()*2);//but u are allowed to change the state of obj
		//that is pointed by the pointer (ref)
	}
}
