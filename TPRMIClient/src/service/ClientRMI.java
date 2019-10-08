package service;

import java.rmi.Naming;


public class ClientRMI {

	public static void main(String[] args) {
		try {
			IBanqueRemote stub = (IBanqueRemote)Naming.lookup("rmi://localhost:8888/BK");
			System.out.println(stub.conversion(700));
			System.out.println(stub.getServerDate());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

//ServerRMI
//cd C:\Users\Meriem\Desktop\javas\TPRMIServer\bin
//java service.ServerRMI


//ClientRMI
//cd C:\Users\Meriem\Desktop\javas\TPRMIClient\bin
//java service.ClientRMI


/*
RMI is used to build distributed applications it provides
remote communication between java programs It is provided 
in the package java.rmi

RMI Architecture 
server program server skeleton RRL(Virtual connection) Transport Layer(Network connection) 
client program Client Stub RRL(Virtual connection) Transport Layer(Network connection)

Transport Layer :: This Layer connects the client and the server.
IT manages the existing connection and also sets up a new connections.

Stub A stub is a representation proxy of the remote object at client.
It resides in the client system it acts as a gateway for 
the client program.

Skeleton THis is the object which resides on the server side.
stub communicates with this skeleton to pass request to the remote object.

RRL Remote reference Layer it is the layer which manages
the references made by the client to the remote object  

Working of an RMI application 

#when the client makes a call to the remote object,
it is received by the stub which evantually passes this request
to the RRL
  
#When a client side RRL receives the request it invokes a method
called invoke() of the object remoteRef. It passes the request to the 
RRL on the server side

#The RRL on the server side passes the request to the skeleton(proxy 
on the server) which finally invokes the required object on the server.

#The result is passed all the way back to the client
*/










