package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface Hello extends Remote{
		public Date printMsg() throws RemoteException;
}
