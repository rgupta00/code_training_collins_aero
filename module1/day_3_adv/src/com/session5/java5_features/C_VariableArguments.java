package com.session5.java5_features;

//varargs
class Cal{
	public int add(int a, int b){
		return a+b;
	}
	public int add(int a, int b,int c){
		return a+b+c;
	}
	//how many methods i can define
	public int add(int ...a){
		int sum=0;
		for(int temp: a){
			sum+=temp;
		}
		return sum;
	}
}

public class C_VariableArguments {
	
	public static void main(String[] args) {
		Cal cal=new Cal();
		int sum=cal.add(3,4,4,67);
	}

}
