package rendu2_BARJO_groupe8;

public class Boisson extends Produit {
	/* Attributs */
	private float contenance;
	private float stock;			//en Litres
	
	/* Constructeurs */
	public Boisson(String nomProduit, float prix, float contenance, float stock) {
		super(nomProduit, prix);
		this.contenance = contenance;
		this.stock = stock;
	}
	
	public Boisson(String nomProduit, float prix, float stock) {
		super(nomProduit, prix);
		this.stock = stock;
	}
	
	public Boisson(String nomProduit, float prix) {
		super(nomProduit, prix);
	}

	/* Getter/Setter */
	public float getContenance() {
		return contenance;
	}

	public void setContenance(float contenance) {
		this.contenance = contenance;
	}

	public float getStock() {
		return stock;
	}

	public void setStock(float stock) {
		this.stock = stock;
	}
	
	/* Méthodes */
	public float calculStock(float qte) {
		this.stock = this.stock + qte;
		return(this.stock);
	}
	
	public void afficheStock() { 
		System.out.println("Barman, voici le stock restant de " + this.getNomProduit() + " : " +  this.getStock() + " L");

	}
}
