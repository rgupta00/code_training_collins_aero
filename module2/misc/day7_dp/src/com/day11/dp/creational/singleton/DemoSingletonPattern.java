package com.day11.dp.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//static holder pattern*
/*
 * 1. serilization
 * 2. clonning
 * 3. reflection
 * 4. multiple class loader*
 */
class Singleton implements Cloneable, Serializable {

	private static final long serialVersionUID = -6834926027969920657L;

	private volatile static Singleton singleton = null;

	private Singleton() {
		if(singleton!=null) {
			throw new IllegalStateException("dont call it using reflection");
		}
	}

	// t1 t2
	public static Singleton getSingleton() {

		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singleton;
	}

	private Object readResolve() {
		return singleton;
	}

}

public class DemoSingletonPattern {

	public static void main(String[] args)
			throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton singleton = Singleton.getSingleton();
		System.out.println(singleton.hashCode());

		Class<?> clazz = Class.forName("com.day11.dp.creational.singleton.Singleton");
		Constructor<?>[] constructors = clazz.getDeclaredConstructors();
		constructors[0].setAccessible(true);// even if ctr we wnat to access at any cost
		Singleton singleton2 = (Singleton) constructors[0].newInstance();

		System.out.println(singleton2.hashCode());
		
		
//		//Ser
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("foo.txt"));
//		oos.writeObject(singleton);
//		
//		//de-ser
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("foo.txt"));
//		
//		Singleton singleton2=(Singleton) ois.readObject();
//		
//		System.out.println(singleton2.hashCode());

	}

}
