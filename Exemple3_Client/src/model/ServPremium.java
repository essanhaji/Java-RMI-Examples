package model;

import java.rmi.RemoteException;

public interface ServPremium extends ServClient{

	Double echangeDolEr(Double m) throws RemoteException;
}