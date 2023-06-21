package com.day3.string_demo;

public class Demo1 {
    public static void main(String[] args) {
    	
    	
    	//String data="a"+"b"+"c"+"d"; performance problem why?
    	
    	String data=
    			new StringBuilder().append("a").append("b").append("c")
    			.append("d").toString();
    	
    	
    	
    	
    	
    	//String 	vs StringBuilder vs StringBuffer: imp
    	//Immutable	---mutable
    	//StringBuilder : is not thread safe , very good in performance , no locking is used 
    	//java 1.5
    	
    	//vs 
    	//StringBuffer: is thread safe , but poor in performance
    	
    	
//    	
//    	StringBuilder sb=
//    			new StringBuilder().append("a").append("b").append("c");
    	
    	
    	
    	
    	//String data="i love java";
    	//how to reverse the string?
    	
    	
    	
    	
    	
    
//    	String name1="raj";
//    	
//    	String name2="raj";
//    	
//    	System.out.println(name1==name2);// compare the address
//    	
//    	
    	
    	
    	
    	
    	//String are immutable , once u create the object of string 
    	//i can not change the state
    	
    	
        //how string stored in merory, basics questions
        //string vs string builder vs stringbuffer



    }
}
