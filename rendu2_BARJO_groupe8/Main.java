package rendu2_BARJO_groupe8;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Data data = new Data(0);
		Barman b1 = data.getBarman();
								
							/* CARTE DES PRODUITS */	
		/* Apéritifs */
		Aperitif cacahuete = new Aperitif("cacahuètes", 1);
		Aperitif chips = new Aperitif("chips", 2);
		Aperitif olives = new Aperitif("olives", 1);
		
		/* Boissons */
		/* Boissons non alcoolisées */
		//String nomProduit, float prix, int contenance, int stock, float degSucre
		BoissonNonAlcoolisee jusOrange = new BoissonNonAlcoolisee("jus d'orange", 6, 0.25f, 40, 60);
		BoissonNonAlcoolisee coca = new BoissonNonAlcoolisee("coca", 4, 0.25f, 20, 90);
		BoissonNonAlcoolisee fanta = new BoissonNonAlcoolisee("fanta", 4, 0.25f, 40, 86);
		BoissonNonAlcoolisee perrier = new BoissonNonAlcoolisee("perrier", 4, 0.25f, 40, 3);
		BoissonNonAlcoolisee limonade = new BoissonNonAlcoolisee("limonade", 4, 0.25f, 40, 70);
		BoissonNonAlcoolisee cafe = new BoissonNonAlcoolisee("café", 4, 0.06f, 40, 70);
		
		
		/* Cocktail */
		
		/* Création du cocktail whisky/coca */	
			/* Liste d'alcool dans le whisky-coca */
		List<BoissonAlcoolisee> ingredientAlcool = new ArrayList<BoissonAlcoolisee>();
		//ingredientAlcool.add(whisky);
		
			/* Liste de soft dans le whisky-coca */
		List<BoissonNonAlcoolisee> ingredientSoft = new ArrayList<BoissonNonAlcoolisee>();
		ingredientSoft.add(coca);
		
		//Cocktail whiskyCoca = new Cocktail("whisky-coca", 2, ingredientAlcool, ingredientSoft);
		
		/* Commande du client */
		List<Produit> maCommande = new ArrayList<Produit>();
		
		data.setClient(new Client(1, 10000, 0, maCommande));
		Client c1 = data.getClient();
				
		/* Arrivée du client */
		System.out.println("		B A R J O");
		System.out.println();
		
		c1.saluer();
		b1.saluer();
		
		/* Ajout des produits à la commande cu client c1 */
		maCommande.add(jusOrange);
		maCommande.add(cacahuete);
		//maCommande.add(whiskyCoca);
		
		c1.commander(maCommande);
		
		
		/* Vérification du stock */
		b1.verifStock(jusOrange);
		b1.verifStock(coca);
		//b1.verifStock(whisky);
		
		/* On remplace le jus d'orange par la bière */
		maCommande.remove(jusOrange);
		//.add(biere);
		
		c1.commander(maCommande);
		b1.indiquerPrix(maCommande);
		c1.parler("Je veux un verre de chaque.");
		
		/* Contenance de la biere : 0.25L */
		coca.setContenance((float) 0.2);
		
		/*Mise à jour des stocks*/
		coca.calculStock((float)-0.2);
		
		/* Affichage de prix */
		//b1.parler("Le prix du verre de 25cl de bière est : " + biere.calculerPrix() + " €. Le degré de la bière est " + biere.getDegAlcool() + "%.");
		//b1.parler("Le prix du verre de 25cl du cocktail whisky coca est : " + whiskyCoca.calculerPrix() + " €. Le degré d'alcool du cocktail est " + whiskyCoca.calculerAlcool() + " et le degré de sucre est " + whiskyCoca.calculerSucre() + ".");
		
		// rajouter les prix dans setAddition du client
	//	float addition = biere.calculerPrix() + whiskyCoca.calculerPrix() + cacahuete.getPrix();
		System.out.println();
		System.out.println("Bugdet Client 1 : " + c1.getBudget() + "€");
		System.out.println("Bugdet Barman : " +b1.getBudget() + "€");
		//c1.setAddition(addition);
		c1.depenser();
		//b1.facturer(addition);
		//System.out.println("Prix de la commande : " + addition + "€");
		System.out.println("Bugdet Client 1 après la facturation : " +c1.getBudget() + "€");
		System.out.println("Bugdet Barman après la facturation: " + b1.getBudget() + "€");
		System.out.println();
		
		b1.parler("Tenez votre commande. Bon appétit ! ");
		c1.parler("Merci beaucoup !");
		
		/*Affichage stock*/
		//biere.afficheStock();
		coca.afficheStock();
		//whisky.afficheStock();
	}
}
