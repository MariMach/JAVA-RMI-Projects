package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import metier.MeteierCatalogueImpl;
import metier.Produit;

public class CatalogueServiceImpl extends UnicastRemoteObject implements ICatalogueRemote{

		private MeteierCatalogueImpl metier;
	public CatalogueServiceImpl() throws RemoteException {
		super();
		metier =  new MeteierCatalogueImpl();
	}

	@Override
	public List<Produit> consulterProduitParMC(String mc) throws RemoteException {
		return metier.getProduitsParMC(mc);
	}

	@Override
	public List<Produit> consulterProduits() throws RemoteException {
		return metier.listProduit();
	}

	@Override
	public Produit consulterProduitsidP(Long idP) throws RemoteException {
		return metier.getProduit(idP);
	}

	@Override
	public double getPrixMoyen() throws RemoteException {
		List<Produit> prods = metier.listProduit();
		double somme=0;
		for(Produit p:prods){
			somme = somme + p.getPrix();
		}
		return somme/prods.size();
	}

}
