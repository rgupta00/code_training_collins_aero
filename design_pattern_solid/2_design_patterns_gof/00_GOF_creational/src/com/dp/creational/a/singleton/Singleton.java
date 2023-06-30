package com.dp.creational.a.singleton;

import java.io.Serializable;
import java.nio.channels.IllegalSelectorException;

/*
 	" one object per application" ex logging , db connection etc

	=> lazy vs eager
	=> threading issue, double locking
	=> What if clonned
	=> What if deserilized?
	=> What if used java reflection?
	=> what if 2 class loader load that class twice
	=> best practices, effective java
	=> using enum
 */
//Serializable *RMI and socket programming 
//useful in distrbuted application

final public class Singleton implements Cloneable, Serializable{
	//Lazy vs eager initilization
	
	private volatile  static Singleton singleton=null;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singleton;
	}

	private Singleton(){
		if(singleton!=null){
			throw new IllegalStateException();
		}
	}
	
	//visiblity problem of "singleton" variable
	
	//this code can still have race condition=> double lock checking concept?
	//t1 			t2
	public static Singleton getSingleton(){
		
		if(singleton==null){
			synchronized(Singleton.class){
				if(singleton==null){
					singleton=new Singleton();
				}
			}
		}
		
		return singleton;
	}
}
















