package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import metier.Produit;


public interface ICatalogueRemote extends Remote{
	public List<Produit> consulterProduitParMC(String mc) throws RemoteException;
	public List<Produit> consulterProduits()throws RemoteException;
	public Produit consulterProduitsidP(Long idP)throws RemoteException;
	public double getPrixMoyen()throws RemoteException;
}
