package client;

import java.rmi.Remote;
import java.rmi.RemoteException;



public interface Chat extends Remote{
	public void enregistrer(Client c) throws RemoteException;
	public void diffuser(String message) throws RemoteException;
}
