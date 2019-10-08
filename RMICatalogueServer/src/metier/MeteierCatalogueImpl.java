package metier;

import java.util.List;
import java.util.ArrayList;

public class MeteierCatalogueImpl {
	private List<Produit> produits=new ArrayList<>();
	
	public MeteierCatalogueImpl() {
		produits.add(new Produit(1L, "HP80", 6000, "image1.jpg"));
		produits.add(new Produit(2L, "HP90", 7000, "image2.jpg"));
		produits.add(new Produit(3L, "HP100", 8000, "image3.jpg"));
	}
	
	public List<Produit> listProduit() {
		return produits;
	}
	
	public List<Produit> getProduitsParMC(String mc){
		List<Produit> prods = new ArrayList<Produit>();
		for(Produit p:produits) {
			if(p.getNomProduit().indexOf(mc) >= 0) {
				prods.add(p);
			}
		}
		return prods;
	}
	
	public Produit getProduit(Long idP) {
		for(Produit p:produits) {
			if(p.getIdProduit().equals(idP)) {
				return p;
			}
		}
		return null;
	}
	
}
