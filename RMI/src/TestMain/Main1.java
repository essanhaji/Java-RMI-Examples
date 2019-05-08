package TestMain;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import exemple1.Hello;
import exemple1.HelloImpl;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LocateRegistry.createRegistry(1099);
			System.out.println("server : construction de l'implementaion ");
			Hello rev = new HelloImpl();
			System.out.println("object reverse lie dans le RMIregestry");
			Context nomContext = new InitialContext();
			nomContext.rebind("rmi:hello", rev);
			System.out.println("Attente des invocations des client ...");
		} catch (RemoteException | NamingException e) {
			// TODO Auto-generated catch block
			System.out.println("Erreur de liaison de l'object reverse");
			System.out.println(e.toString());
		}
	}
}