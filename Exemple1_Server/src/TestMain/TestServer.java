package TestMain;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import model.ServClient;
import model.ServImp;

public class TestServer {
	public static void main(String[] args) {
		try {
			ServClient sc = new ServImp();
			System.out.println("step one");
			LocateRegistry.createRegistry(1099);
			System.out.println("step two");
			Context nomContext = new InitialContext();
			nomContext.rebind("rmi:ClientImpObject", sc);
			System.out.println("step tree");
			System.out.println("wating a client ...");
			//nomContext.close();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}