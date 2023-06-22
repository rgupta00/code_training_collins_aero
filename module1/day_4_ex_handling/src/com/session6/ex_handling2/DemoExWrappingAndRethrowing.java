package com.session6.ex_handling2;

//What is the use of it
//Exception wrapping and re-throwing
//------------------------------------
//in business requirments i need to send some exception to other method by first wrapping into my own 
//excception : ex wrapping
//and i can throw that ex from catch block : it is called re-throwing 
//CalException: my req is to create a user define ex ie called 
//CalException and what is expected that u should wrap ArithmeticException inside that? 

class CalException extends Exception {

	public CalException(String message, Throwable cause) {
		super(message, cause);
	}

}

class Cal {
	public int divide(int a, int b)throws CalException {
		try {
			if (b == 0)
				throw new ArithmeticException("deno must not be zero");
			return a / b;
		} catch (ArithmeticException e) {
			throw new CalException("cal ex", e);
		}
	}
}

public class DemoExWrappingAndRethrowing {
	public static void main(String[] args) {

		try {
			Cal cal = new Cal();
			int result = cal.divide(2, 0);
			System.out.println(result);
		} catch (CalException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause().getMessage());
		}

	}
}
