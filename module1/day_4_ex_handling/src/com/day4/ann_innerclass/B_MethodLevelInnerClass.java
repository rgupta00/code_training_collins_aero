package com.day4.ann_innerclass;
class A1{
      
        void foo(){
        	  //method local inner class
            class X{
            	X(){
            		System.out.println("ctr of X");
            	}
            	void fooX(){
            		System.out.println("foox is called");
            	}
            }
            
            X x=new X();
            x.fooX();
            
      }
}
public class B_MethodLevelInnerClass {
    public static void main(String[] args) {
        A1 a=new A1();
        a.foo();
        A1 a2=new A1();
        a2.foo();
    }
}
