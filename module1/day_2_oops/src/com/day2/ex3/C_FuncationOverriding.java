package com.day2.ex3;

//why overriding?

class NormalMilk{}

class PasteurizedMilk extends NormalMilk{}

class KrishnaDairy{
	//till java 1.4 it is need to have exactly same sign of method so that they can be overriden
	//java 1.5 : u can return a covarient return type
	
	public NormalMilk sellMilk(){
		System.out.println("selling normal milk");
		return new NormalMilk();
	}
}
class KrishnaDairyImproved extends KrishnaDairy{
	
	@Override
	public PasteurizedMilk sellMilk(){
		System.out.println("selling pasteurized  milk");
		return new PasteurizedMilk();
	}
}


public class C_FuncationOverriding {
	
	public static void main(String[] args) {
		//overrding support run time polymorphism
		KrishnaDairy dairy=new KrishnaDairyImproved();
		dairy.sellMilk();//Compiler is clue less which method is going to be called
		//ie why it called run time poly... it is decided at run time which method is 
		//going to be called
	}

}
