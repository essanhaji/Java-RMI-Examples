package TestMain;

import java.rmi.RemoteException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import exemple1.Hello;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Context ctx = new InitialContext();
			Hello hd = (Hello) ctx.lookup("rmi://localhost:1099/hello");
			System.out.println(hd.helloRMI("ESTE"));
		} catch (NamingException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
