package RMIAll;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class server {
	
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		rmiImpl rmiI = new rmiImpl();
		Registry registry = LocateRegistry.createRegistry(8888);	
		String url = new String("rmi://localhost:8888/RMIEcho");
		//registry.rebind(url, rmiI);
		Naming.rebind(url, rmiI);
		System.err.println("RMIIMPL object bound to the name RMIEcho and is ready for use");
	}
}
