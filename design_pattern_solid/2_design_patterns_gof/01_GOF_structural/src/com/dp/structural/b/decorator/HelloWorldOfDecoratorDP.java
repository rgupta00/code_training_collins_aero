package com.dp.structural.b.decorator;

import com.dp.structural.c.proxy.Main;

//good morning 		very good moring		deepawali very good morining
interface Greet{
	public String greet();
}

class NormalGreet implements Greet{

	@Override
	public String greet() {
		return "good morning";
	}
}

class SpecialGreet implements Greet{
	
	private Greet greet;
	
	public SpecialGreet(Greet greet) {
		this.greet = greet;
	}
	
	@Override
	public String greet() {
		return "special "+ greet.greet();
	}
}
class VerySpecialGreet implements Greet{
	
	private Greet greet;
	
	public VerySpecialGreet(Greet greet) {
		this.greet = greet;
	}
	
	@Override
	public String greet() {
		return "very "+ greet.greet();
	}
}

public class HelloWorldOfDecoratorDP {

	public static void main(String[] args) {
		Greet greet=new VerySpecialGreet(new SpecialGreet(new NormalGreet()));
		System.out.println(greet.greet());
	}
}




