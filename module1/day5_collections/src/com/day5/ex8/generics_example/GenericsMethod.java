package com.day5.ex8.generics_example;
//generics method ..
//to compare "any" three object
public class GenericsMethod {

	public static void main(String[] args) {
		Employee employee1=new Employee(121, "raj", "noida", 566667.00);
		Employee employee2=new Employee(129991, "suman", "noida", 5666907.00);
		
		Employee employee3=new Employee(1, "tarun", "banlore", 500667.00);
		
//		Integer a, b, c;
//		a=11;
//		b=4000;
//		c=-111;
//		Integer larest= largestValue(a, b , c);
//		System.out.println(larest);
		
		Employee maxEmp=largestValue(employee1, employee2, employee3);
		System.out.println(maxEmp);
	}

	//generic method E T
	 static <T extends Comparable<T>>  T largestValue(T a, T b, T c) {
		T max=a;
		if(b.compareTo(max)>0) {
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		return max;
	}
}




