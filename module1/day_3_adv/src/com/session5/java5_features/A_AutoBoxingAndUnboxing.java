package com.session5.java5_features;

public class A_AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        /*
            some imp java 5 features
            * boxing unboxing
            * enhance for loop
            * varargs
            *static import
            * enum
            * generics
            * annotations

         */
    	System.out.println("=====auto boxing unboxing==========");
    	
    	//Wrapper classes?
    	int i=12;// it is object or primitive?
    	
    	Integer it=new Integer(i);
    
    	//object are more powerful...java collection ds in java dont support primitive
    	
    	//before java 1.5 we have to manually wrap and un wrap the data :(
    	
    	//int temp=it.intValue();
//    	temp++;
//    	it=new Integer(temp);
    	
//    	int temp= it;
//    	temp++;
//    	it=temp;
    	
    	it++;
    	
    	
    }
}















