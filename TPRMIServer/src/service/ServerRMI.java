package service;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerRMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			LocateRegistry.createRegistry(8888);
			BanqueServiceImpl od = new BanqueServiceImpl();
			System.out.println(od.toString());
			Naming.rebind("rmi://localhost:8888/BK", od);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
