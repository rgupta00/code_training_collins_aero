package com.day2.ex5;
interface Jumpable{
	public void jump();
}
class Monkey implements Jumpable{
	public void stayOnTree(){
		System.out.println("stayOnTree...");
	}
	
	public void jump(){
		System.out.println("monkey jump like anything...");
	}
}
//Kid is not monkey but he can jump like monkey
class Kid implements Jumpable{
	
	public void goSchool(){
		System.out.println("doing to school");
	}
	
	public void study(){
		System.out.println("study");
	}
	
	public void jump(){
		System.out.println("kid jump better then anything...");
	}
}

public class C_WhenToGoForInterfaceVsAbstractClass {
	
	public static void main(String[] args) {
		Kid k=new Kid();
		
	}

}
