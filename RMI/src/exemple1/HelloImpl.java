package exemple1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello{

	public HelloImpl() throws RemoteException{}

	@Override
	public String helloRMI(String nom) throws RemoteException {
		return "Hello "+ nom;
	}

}
