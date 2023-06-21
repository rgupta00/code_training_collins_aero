package com.day3.string_demo;

import java.util.StringTokenizer;

public class Demo2 {
    public static void main(String[] args) {
    	
    	String data="java".toLowerCase();
    	String data2="Java".toLowerCase();
    	if(data.equals(data2)){
    		System.out.println("are eq");
    	}else{
    		System.out.println("not eq");
    	}
    	
    	
    	
    	
//    	String data="i love java";
//    	data =data.toUpperCase();
//    	data=data.toLowerCase();
//    	
//    	//how to make tokens of the string 
//    	
//    	String tokens[]=data.split(" ");
//    	for(String token: tokens){
//    		System.out.println(token);
//    	}
//    	
    	
//    	StringTokenizer st=new StringTokenizer(data);
//    	System.out.println(st.countTokens());
//    	while(st.hasMoreTokens()){
//    		String token= st.nextToken(" ");
//    		System.out.println(token);
//    	}
    	
        System.out.println("some common string method");
    }
}
