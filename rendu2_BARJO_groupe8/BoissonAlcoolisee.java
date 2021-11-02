package rendu2_BARJO_groupe8;

public class BoissonAlcoolisee extends Boisson {
	/* Attributs */
	private float degAlcool;
	
	/* Constructeurs */
	public BoissonAlcoolisee(String nomProduit, float prix, float contenance, int stock, float degAlcool) {
		super(nomProduit, prix, contenance, stock);
		this.degAlcool = degAlcool;
	}
	
	public BoissonAlcoolisee(String nomProduit, float prix, int stock, float degAlcool) {
		super(nomProduit, prix, stock);
		this.degAlcool = degAlcool;
	}
	
	public BoissonAlcoolisee(String nomProduit, float prix, int stock) {
		super(nomProduit, prix, stock);
	}

	/* Getter/Setter */
	public float getDegAlcool() {
		return degAlcool;
	}

	public void setDegAlcool(float degAlcool) {
		this.degAlcool = degAlcool;
	}	

	/* Méthode */
	public float calculerPrix() {
		return(this.getPrix()*this.getContenance()); 
	}
}
