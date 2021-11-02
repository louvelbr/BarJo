package rendu2_BARJO_groupe8;

public class Aperitif extends Produit {
	/* Attributs */
	private int stock;
	
	/* Constructeurs */
	public Aperitif(String nomProduit, float prix, int stock) {
		super(nomProduit, prix);
		this.stock = stock;
	}
	
	public Aperitif(String nomProduit, float prix) {
		super(nomProduit, prix);
	}
	
	/* Getter/Setter */
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}	
}
