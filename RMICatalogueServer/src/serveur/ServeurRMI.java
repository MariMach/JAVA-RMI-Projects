package serveur;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import service.CatalogueServiceImpl;

public class ServeurRMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			LocateRegistry.createRegistry(1099);
			CatalogueServiceImpl od = new CatalogueServiceImpl();
			System.out.println(od.toString());
			Naming.rebind("rmi://localhost:1099/CATAL", od);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


