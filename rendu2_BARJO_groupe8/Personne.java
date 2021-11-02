package rendu2_BARJO_groupe8;

public class Personne {
	/* Attributs */
	private int idPersonne;
	private float budget;
	
	/* Constructeurs */
	public Personne(int idPersonne, float budget) {
		super();
		this.idPersonne = idPersonne;
		this.budget = budget;
	}
	public Personne() {
		super();
	}
	
	/* Getter/Setter */
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public float getBudget() {
		return budget;
	}
	public void setBudget(float budget) {
		this.budget = budget;
	}
}
