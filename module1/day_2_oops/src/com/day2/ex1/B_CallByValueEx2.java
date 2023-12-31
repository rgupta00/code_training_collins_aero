package com.day2.ex1;

class Value{
	private int v;

	public Value(int v){
		this.v=v;
	}
	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}
	
}

public class B_CallByValueEx2 {
	
	public static void main(String[] args) {
		Value v1=new Value(1);
		Value v2=new Value(2);
		
		System.out.println("value of v1: "+ v1.getV() +" value of v2: "+ v2.getV());
		swap(v1, v2);
		System.out.println("value of v1: "+ v1.getV() +" value of v2: "+ v2.getV());
	}

	private static void swap(Value i, Value j) {
		Value temp=i;
		i=j;
		j=temp;
	}
}
