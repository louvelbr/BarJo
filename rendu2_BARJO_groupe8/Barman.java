package rendu2_BARJO_groupe8;

import java.util.List;

public class Barman extends Personne {
	/* Attribut */
	private List<Cocktail> mesCocktail;

	/* Constructeur */
	public Barman(int idPersonne, float budget, List<Cocktail> mesCocktail) {
		super(idPersonne, budget);
		this.mesCocktail = mesCocktail;
	}
	
	public Barman(int idPersonne, float budget) {
		super(idPersonne, budget);
	}

	/* Getter/Setter*/
	public List<Cocktail> getMesCocktail() {
		return mesCocktail;
	}

	public void setMesCocktail(List<Cocktail> mesCocktail) {
		this.mesCocktail = mesCocktail;
	}
	
	/* Méthodes */
	public void parler(String texte) {
		System.out.println("( Barman ) - << " + texte + " >>");
		System.out.println();
	}

	public void saluer() {
		parler("Bienvenue au Barjo, que voulez-vous ?");
	}
	
	public void facturer(float addition) {
		setBudget(getBudget() + addition);
	}
	
	public void verifStock(Boisson b) {
		if (b.getStock() == 0) {
			parler("On n'a plus de " + b.getNomProduit() + ".");
		}
	}
	
	public void indiquerPrix(List<Produit> maCommande) {
		System.out.println("( Barman ) - << Voici les prix (au litre pour les boissons) : ");
		for (int i=0; i < maCommande.size(); i++) {
			System.out.println("		- " + maCommande.get(i).getNomProduit() + " : "+ maCommande.get(i).getPrix() + " €");
		}
		System.out.println("		Un verre correspond à 25cl >>");
		System.out.println();
	}
} 

