package RMIAll;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

// set path=C:\Program Files\Java\jdk1.8.0_181\bin
// cd C:\Users\Meriem\Desktop\javas\RMIFinal\bin java RMIAll.client

public class client {
	
	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {

		if(args.length == 1) {
			String url = new String("rmi://localhost:8888/RMIEcho");
			
			//System.setSecurityManager( new RMISecurityManager());
			RMIInterface obj = (RMIInterface) Naming.lookup(url);
			String serverReply = obj.echo(args[0]);
			System.out.println("Server Reply :" + serverReply);
			
		}else {
			System.err.println("Usage : client <name>");
		}
	
	}
}
