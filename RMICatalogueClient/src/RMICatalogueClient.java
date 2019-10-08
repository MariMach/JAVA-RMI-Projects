import java.rmi.Naming;
import java.util.List;

import metier.Produit;
import service.ICatalogueRemote;

// cd C:\Users\Meriem\Desktop\javas\RMICatalogueServer\bin
// java serveur.ServeurRMI

//cd C:\Users\Meriem\Desktop\javas\RMICatalogueClient\bin
//java -cp .;../ClientCata.jar RMICatalogueClient
//on a utilise un ficher jar .; means quand va chercher les classes
//dans notre class actuelle sinon on cherche le jar

//generer un stub en jdk 1.6 la commande rmi c

public class RMICatalogueClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ICatalogueRemote stub = (ICatalogueRemote)Naming.lookup("rmi://localhost:1099/CATAL");
			System.out.println("Prix Moyen :"+ stub.getPrixMoyen());
			List<Produit> prods = stub.consulterProduitParMC("H");
			for(Produit p:prods) {
				System.out.println(p.getNomProduit()+"__"+p.getPrix());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
			
	}

}
