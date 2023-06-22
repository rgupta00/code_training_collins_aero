package com.day4.ex_handling;

import java.io.FileNotFoundException;
import java.io.IOException;

class X{
	X()throws IOException{
		System.out.println("Ctr of X");
	}
}
class Y extends X{
	//drived class ctr can not throw smaller ex then the base method 
	Y()throws Exception{
		System.out.println("Ctr of Y");
	}
}
public class F_ExHandingAndCtr {
    public static void main(String[] args) {
        
    }
}
