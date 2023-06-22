package com.day4.ann_innerclass;

//1. top level inner class
/*
 * 	class LL{
 * 		class Node{
 * 		}
 * 	}
 */

//u cant create the object of inner class without the valid object of outer class
class Outer{
	private int i=55;
	
   class Inner{
	   private int i=555;
	   public void doInner(){
		   //Outer.this.i	=> use to access data of the outer class
		   //this.i			=> use to access data of the same class
		   System.out.println("doInner method of inner class "+Outer.this.i);
	   }
   }
}


public class A_TopLevelInnerClass {
    public static void main(String[] args) {
    
//    	//Syn to create object of innner class
//      Outer.Inner inner=new Outer().new Inner();
//      inner.doInner();
    	
    	//Syn to create object of innner class
    	Outer outer=new Outer();
    	
        Outer.Inner inner=outer.new Inner();
        inner.doInner();
      
    }
}





