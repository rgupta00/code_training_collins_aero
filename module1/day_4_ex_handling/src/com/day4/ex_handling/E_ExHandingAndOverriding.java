package com.day4.ex_handling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.BindException;
import java.sql.SQLException;

//excpetion handing and overring
///*
// * Rule : overriden method can not throw broder excpetion then base method
// * 2. not throwing ex is ok
// * 3. overriden method can throw extra unchecked ex
// * 
// */
//class A1{
//	void foof()throws IOException{
//		System.out.println("foof method of class A");
//	}
//}
//
//class B1 extends A1{
//	@Override
//	void foof()throws RuntimeException{
//		System.out.println("foof method of class B");
//	}
//}


class AEx extends Exception{}
class BEx extends Exception{}
class B1Ex extends BEx{}

class A1{
	void foof()throws BEx{
		System.out.println("foof method of class A");
	}
}

class B1 extends A1{
	@Override
	void foof()throws B1Ex{
		System.out.println("foof method of class B");
	}
}

public class E_ExHandingAndOverriding {
    public static void main(String[] args) {

    }
}




















