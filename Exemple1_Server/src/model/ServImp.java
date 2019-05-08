package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServImp extends UnicastRemoteObject implements ServClient, ServPremium {

	public ServImp() throws RemoteException{}

	@Override
	public Double echangeDhEr(Double m) throws RemoteException {
		return m / 10;
	}

	@Override
	public Double echangeDolEr(Double m) throws RemoteException {
		return m / 1.18;
	}
}