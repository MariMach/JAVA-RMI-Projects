package Server;

import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;

import java.util.Date;

public class impl extends UnicastRemoteObject implements Hello{

	protected impl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Date printMsg() throws RemoteException {
		// TODO Auto-generated method stub
		return new Date();
	}

}
