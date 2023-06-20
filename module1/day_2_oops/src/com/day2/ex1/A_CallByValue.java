package com.day2.ex1;


public class A_CallByValue {

	//java support only call by value not call by reference
	
	public static void main(String[] args) {
		int i=1;
		int j=2;
		System.out.println("value of i: "+ i +" value of j: "+ j);
		swap(i, j);
		System.out.println("value of i: "+ i +" value of j: "+ j);
	}

	private static void swap(int i, int j) {
		int temp=i;
		i=j;
		j=temp;
	}
}
