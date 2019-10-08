package client;


import java.rmi.Naming;


//cd C:\Users\Meriem\Desktop\javas\RMIHelloc\bin
//java client.clientrmi

public class clientrmi {
		public static void main(String args[]) throws Exception {
		
			String url = new String("rmi://localhost:9999/HelloRMI");
			Hello stub = (Hello) Naming.lookup(url);
			System.out.println(stub.printMsg());
	}
}
