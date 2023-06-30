package com.basic.ser2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {
}

class B implements Serializable {
}

class C implements Serializable {
}

public class B_OrderDoesMatter {
	public static void main(String[] args) throws Exception {
		// ser of A, then then Object B, then Object of C
		// de-ser follow the same order A-> B -> C CCEx
		
		A a=new A();
		B b=new B();
		C c=new C();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				new File("demo.txt")));
		
		oos.writeObject(a);
		oos.writeObject(b);
		oos.writeObject(c);
		

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				new File("demo.txt")));
		
		b=(B) ois.readObject();
		
		
	}
}













