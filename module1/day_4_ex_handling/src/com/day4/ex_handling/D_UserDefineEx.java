package com.day4.ex_handling;
//java defined ex: BL
//Account -> withdraw and deposit
//OverFundException , NotSufficentFundException, AccountCreationExcpetion

//how to create my own exception?
//1. need to decide wheter u want to have checked or unchecked ex?
//class NegativeRadiusEception extends Exception{
//	
//}

class NegativeRadiusEception extends Exception{
	public NegativeRadiusEception(String message) {
		super(message);
	}
}

class Circle{
    private int radius;

    //throw and throws 
    //throw : comes inside the method call
    //throws comes on method signature
    //Note: using throws is not mandatory with Unchecked ex
    
    public Circle(int radius) throws NegativeRadiusEception {
    	if(radius<=0)
    		throw new NegativeRadiusEception(" radius can not be zero or neg...");
        this.radius = radius;
    }
    
    public double getPerimeter(){
        return  2 * radius*Math.PI;
    }
    
    public double getArea(){
        return  radius* radius*Math.PI;
    }
}
//main act as controller, should not use throws

public class D_UserDefineEx {
    public static void main(String[] args) {
    		try{
    			Circle circle=new Circle(3);
    			System.out.println(circle.getArea());
        		System.out.println(circle.getPerimeter());
    		}catch(NegativeRadiusEception ex){
    			System.out.println(ex);
    			System.out.println(ex.getMessage());
    		}
    		
    }
}
