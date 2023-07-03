package com.bankapp;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
	
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		AtmCardImpl obj=new AtmCardImpl();
		
		Registry registry=LocateRegistry.createRegistry(5400);
		
		registry.bind("obj", obj);
		
		System.out.println("server is running");
		
	}

}
