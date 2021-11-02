package rendu2_BARJO_groupe8;

public class BoissonNonAlcoolisee extends Boisson {
	/* Attributs */
	private float degSucre;
	
	/* Constructeurs */
	public BoissonNonAlcoolisee(String nomProduit, float prix, float contenance, int stock, float degSucre) {
		super(nomProduit, prix, contenance, stock);
		this.degSucre = degSucre;
	}
	
	public BoissonNonAlcoolisee(String nomProduit, float prix, int stock, float degSucre) {
		super(nomProduit, prix, stock);
		this.degSucre = degSucre;
	}
	
	public BoissonNonAlcoolisee(String nomProduit, float prix, int stock) {
		super(nomProduit, prix, stock);
	}

	/* Getter/Setter */
	public float getDegSucre() {
		return degSucre;
	}

	public void setDegSucre(float degSucre) {
		this.degSucre = degSucre;
	}	
	
	/* Méthodes */
	public float calculerPrix() {
		return(this.getPrix()*this.getContenance());
	}
}
