package com.day6.session1_quick_recap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class B_ExHandling {
	
	public static void main(String[] args) {
		//try catch throw throws and finally
		//checked vs unchecked ex
		try {
			BufferedReader br=new BufferedReader(new FileReader(new File("demo.txt")));
			System.out.println("file is found");
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		
	}

}
