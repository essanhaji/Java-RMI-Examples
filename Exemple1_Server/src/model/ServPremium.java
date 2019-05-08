package model;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServPremium extends ServClient, Remote{

	Double echangeDolEr(Double m) throws RemoteException;
}