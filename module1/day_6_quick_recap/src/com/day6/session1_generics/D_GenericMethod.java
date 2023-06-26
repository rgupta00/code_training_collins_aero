package com.day6.session1_generics;

import com.day6.session1_quick_recap.Employee;

//generic method
public class D_GenericMethod {
	
	public static void main(String[] args) {
		
//		Integer a=3;
//		Integer b=2;
//		Integer c=41;
//		
//		Integer max=maxData(a, b , c);
//		System.out.println(max);
		
		Double a=3.0;
		Double b=2.6;
		Double c=41.4;
		
		Double max=maxData(a, b , c);
		System.out.println(max);
		
		Employee e1=new Employee(123,	"zen", "delhi", 45000.00);
		Employee e2= new Employee(13,	"sumit", "noida", 42000.00);
		Employee e3= new Employee(93,	"sumit", "banglore", 49000.00);
		
		Employee employeeMax=maxData(e1, e2, e3);
		System.out.println(employeeMax);
	}
	//T must be something that implement/extends Comparable
	private static  <T extends Comparable<T>> T  maxData(T a, T b, T c) {
		T max=a;
		if(b.compareTo(max)>0)
			max=b;
		if(c.compareTo(max)>0)
			max=c;
		return max;
	}

}
