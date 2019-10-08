package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import client.Client;

public interface Chat extends Remote{
	public void enregistrer(Client c) throws RemoteException;
	public void diffuser(String message) throws RemoteException;
}
