package model;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServClient extends Remote{

	Double echangeDhEr(Double m) throws RemoteException;
}
