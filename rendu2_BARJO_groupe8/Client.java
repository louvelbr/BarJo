package rendu2_BARJO_groupe8;
import java.util.List; 
import java.util.ArrayList; 

public class Client extends Personne {
	/* Attributs */
	private float addition;
	private List<Produit> mesProduits;
	
	/* Constructeur */
	public Client(int idPersonne, float budget, float addition, List<Produit> mesProduits) {
		super(idPersonne, budget);
		this.addition = addition;
		mesProduits = new ArrayList<Produit> ();
		this.mesProduits = mesProduits;
	}

	/* Getter/Setter */
	public float getAddition() {
		return addition;
	}

	public void setAddition(float addition) {
		this.addition = addition;
	}


	public List<Produit> getProduits() {
		return mesProduits;
	}

	public void setProduits(List<Produit> mesProduits) {
		this.mesProduits = mesProduits;
	}

	/* Méthodes */
	public void parler(String texte) {
		System.out.println("( Client "+ this.getIdPersonne() + " ) - << " + texte + " >>");
		System.out.println();
	}
	
	public void saluer() {
		parler("Bonjour !");
	}
	
	public void commander(List<Produit> maCommande) {
		System.out.println("( Client "+ this.getIdPersonne() + " ) - << S'il vous plaît, pourrais-je avoir : ");
		for (int i=0; i < maCommande.size(); i++) {
			if (i == maCommande.size()-1) {
				System.out.println("		- " + maCommande.get(i).getNomProduit() + " >>");
			} else {
				System.out.println("		- " + maCommande.get(i).getNomProduit());
			}
		}
		System.out.println();
	}
		
	public void depenser() {
		setBudget(getBudget() - getAddition());
	}
}
