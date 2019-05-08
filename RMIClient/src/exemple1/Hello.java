package exemple1;

import java.rmi.RemoteException;
import java.rmi.Remote;

public interface Hello extends Remote{

	public String helloRMI(String nom) throws RemoteException;
}
