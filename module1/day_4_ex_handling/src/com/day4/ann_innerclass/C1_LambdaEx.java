package com.day4.ann_innerclass;

//ann inner class

//ES6 fat arrow operator
public class C1_LambdaEx {
	public static void main(String[] args) {

		// Syn of annonymous inner class
		
		//java 8 : lambada expression , it used to do stream processing java 8
		
		
		//how to move from ann innner to lamaba
		//lambda have better performance as compared to ann inner class
		
		//java 8=>type inference ? intellegent guss
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("job of the thread");
			}
		};
		
		
	
		//Step No 1:
//		Foodish foodish = new Foodish() {
//
//			@Override
//			public void food() {
//				System.out.println("street food ...");
//			}
//		};

//		Foodish foodish = ()-> {
//				System.out.println("street food ...");
//			
//		};
		
		Foodish foodish = ()-> System.out.println("street food ...");
		
		foodish.food();
	

	}
}
