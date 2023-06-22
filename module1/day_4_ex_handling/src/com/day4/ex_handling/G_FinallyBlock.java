package com.day4.ex_handling;

public class G_FinallyBlock {
	public static void main(String[] args) {
		// Why we need

		// good programming practice about finallly block
		/*
		 * 1. never return values form finally block 2. never throw ex from
		 * finally block
		 */

//		int value = foo();
//		System.out.println(value);
		
		
		
		//Me
		try{
			bar();
		}catch(Exception e){
			System.out.println(e);
		}
		

	}

	//Ashok
	private static void bar() {
		try{
			throw new ArithmeticException();
		}finally{
			throw new NullPointerException();// it is a bad code to throw ex from finally block
		}
	}

//	private static int foo() {
//		try {
//			return 10;
//		} finally {
//			
//			//returing some value from finally block is a bad programming practice
//			return 11;
//		}
//	}

}
