package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class BanqueServiceImpl extends UnicastRemoteObject implements IBanqueRemote{

	protected BanqueServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public double conversion(double mt) throws RemoteException {
		// TODO Auto-generated method stub
		return 11*mt;
	}

	@Override
	public Date getServerDate() throws RemoteException {
		// TODO Auto-generated method stub
		return new Date();
	}
	
	

}
