package com.bankapp;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AtmCard extends Remote{
	public boolean isValid(String card)throws RemoteException;

}
