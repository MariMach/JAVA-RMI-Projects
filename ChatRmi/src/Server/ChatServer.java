package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import client.Client;

public class ChatServer extends UnicastRemoteObject implements Chat{

	private ArrayList<Client> arrayc;
	protected ChatServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public synchronized void enregistrer(Client c) throws RemoteException {
		// TODO Auto-generated method stub
		this.arrayc.add(c);
		
	}

	@Override
	public synchronized void diffuser(String message) throws RemoteException {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<arrayc.size()) {
			arrayc.get(i++).recupererMessage(message);
		}
	}


}
