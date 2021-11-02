package rendu2_BARJO_groupe8;

public class Produit {
	/* Attributs */
	private String nomProduit;
	private float prix;
	
	/* Constructeurs */
	public Produit(String nomProduit, float prix) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
	}

	public Produit() {
		super();
	}

	/* Getter/Setter */
	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
}
