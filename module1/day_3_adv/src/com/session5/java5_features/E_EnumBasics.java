package com.session5.java5_features;
/*
 * enum is a specical class that extends a class Enum
 * used to define resturctive range of an object?
 * 
 */
enum ShirtSize{
	
	S,M,L,XL,XXL;
	private ShirtSize(){
		System.out.println("hello");
	}
	
}
class Shirt{
	private String name;
	private String color;
	private ShirtSize size;
	public Shirt(String name, String color, ShirtSize size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "Shirt [name=" + name + ", color=" + color + ", size=" + size
				+ "]";
	}

}
public class E_EnumBasics {
	public static void main(String[] args) {
		//Shirtsize: 38,40,42,44,46
		Shirt shirt=new Shirt("pe", "blue", ShirtSize.XL);
		System.out.println(shirt);
	}

}
