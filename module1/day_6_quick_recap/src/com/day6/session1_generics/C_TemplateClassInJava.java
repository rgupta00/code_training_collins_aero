package com.day6.session1_generics;
//what is the need of generics class in java
//if my algo is same only data type is changing i can go for template / generic class


class Box<T>{
	private T data;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
public class C_TemplateClassInJava {
	
	public static void main(String[] args) {
		Box<Integer> b=new Box<>();
		b.setData(33);
		System.out.println(b.getData());
		
		Box<String> boxName=new Box<>();
		boxName.setData("rajiv");
		System.out.println(boxName.getData());
	}

}






