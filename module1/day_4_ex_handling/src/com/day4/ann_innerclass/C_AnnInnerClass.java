package com.day4.ann_innerclass;

//ann inner class
//funcational interface have only one abs method:support lambda exp
interface Foodish {
	void food();
}

public class C_AnnInnerClass {
	public static void main(String[] args) {

		// Syn of annonymous inner class
		
		//java 8 : lambada expression , it used to do stream processing java 8
		
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("job of the thread");
			}
		};
		
		
		
		Foodish foodish = new Foodish() {

			@Override
			public void food() {
				System.out.println("street food ...");
			}
		};

		Foodish foodish2 = new Foodish() {

			@Override
			public void food() {
				System.out.println("hotel food ...");
			}
		};

		Foodish foodish3 = new Foodish() {

			@Override
			public void food() {
				System.out.println("hotel food ...");
			}
		};

		foodish.food();

		foodish2.food();

	}
}
