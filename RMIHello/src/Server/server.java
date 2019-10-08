package Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class server {


	public static void main(String args[]) throws RemoteException, MalformedURLException {
		
		String url = new String("rmi://localhost:9999/HelloRMI");
		Registry registry = LocateRegistry.createRegistry(9999);
		impl obj = new impl();
		System.out.println(obj.toString());
		Naming.rebind(url, obj);
		System.err.println("Server Ready");
	}
}
