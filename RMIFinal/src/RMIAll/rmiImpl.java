package RMIAll;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class rmiImpl extends UnicastRemoteObject implements RMIInterface{

	protected rmiImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String echo(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return "Server says HI " + name + "\n";
	}

}
