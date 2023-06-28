package com.day11.dp.structrual.decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
//Greet :good morning, special good morning , new year sp good moring
//pizza : basicsPizza, CheezToppingPizza, VegCheezToppingPizza

interface Greet {
	String sayGreet();
}

class SimpleGreet implements Greet {
	@Override
	public String sayGreet() {
		return "good morining";
	}
}

class SpecialGreet implements Greet {
	private Greet greet;

	public SpecialGreet(Greet greet) {
		this.greet = greet;
	}

	@Override
	public String sayGreet() {
		return "special " + greet.sayGreet();
	}
}

class NewYearGreet implements Greet {
	private Greet greet;

	public NewYearGreet(Greet greet) {
		this.greet = greet;
	}

	@Override
	public String sayGreet() {
		return "new year " + greet.sayGreet();
	}
}

public class DemoDecorator {

	public static void main(String[] args) {
		
		Greet greet=new NewYearGreet(new SpecialGreet(new SimpleGreet()));
		
		System.out.println(greet.sayGreet());

		// BufferedReader br=new BufferedReader(new FileReader("foo.txt"));

		// BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));

	}
}
