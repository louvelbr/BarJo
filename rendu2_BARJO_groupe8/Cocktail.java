package rendu2_BARJO_groupe8;
import java.util.List;

public class Cocktail extends Produit {
    /* Attribut */
//    private List <BoissonAlcoolisee> ingredientAlcool;
//    private List <BoissonNonAlcoolisee> ingredientSoft;
    private BoissonAlcoolisee[] ingredientAlcool;
    private BoissonNonAlcoolisee[] ingredientSoft;

 

    public Cocktail(String nomProduit, float prix, BoissonAlcoolisee[] ingredientAlcool,
            BoissonNonAlcoolisee[] ingredientSoft) {
        super(nomProduit, prix);
        this.ingredientAlcool = ingredientAlcool;
        this.ingredientSoft = ingredientSoft;
    }

 

    /* Getter/Setter */
    public BoissonAlcoolisee[] getIngredientAlcool() {
        return ingredientAlcool;
    }

 

    public void setIngredientAlcool(BoissonAlcoolisee[] ingredientAlcool) {
        this.ingredientAlcool = ingredientAlcool;
    }

 

    public BoissonNonAlcoolisee[] getIngredientSoft() {
        return ingredientSoft;
    }

 

    public void setIngredientSoft(BoissonNonAlcoolisee[] ingredientSoft) {
        this.ingredientSoft = ingredientSoft;
    }
//    public List<BoissonAlcoolisee> getIngredientAlcool() {
//        return ingredientAlcool;
//    }
//
//    public void setIngredientAlcool(List<BoissonAlcoolisee> ingredientAlcool) {
//        this.ingredientAlcool = ingredientAlcool;
//    }
//
//    public List<BoissonNonAlcoolisee> getIngredientSoft() {
//        return ingredientSoft;
//    }
//
//    public void setIngredientSoft(List<BoissonNonAlcoolisee> ingredientSoft) {
//        this.ingredientSoft = ingredientSoft;
//    }
    
    /* Méthodes */
    
    /* Calcul du prix du cocktail */
    float calculerPrix() {
        float prix = 0;
        for (int i = 0; i < ingredientAlcool.length; i++) {
            prix = prix + ingredientAlcool[i].calculerPrix();
        }
        for (int i = 0; i < ingredientSoft.length; i++) {
            prix = prix + ingredientSoft[i].calculerPrix();
        }
        return (prix*110/100);
    }
    
    float calculerDose() {
        float sommeContenanceSoft = 0;
        float sommeContenanceAlcool = 0;
        
        for (int i = 0; i < ingredientAlcool.length; i++) {
            sommeContenanceAlcool = sommeContenanceAlcool + ingredientAlcool[i].getContenance();
        }
        
        for (int i = 0; i < ingredientSoft.length; i++) {
            sommeContenanceSoft = sommeContenanceSoft + ingredientSoft[i].getContenance();
        }
        
        return(sommeContenanceSoft + sommeContenanceAlcool);
    }

 

    /* Calcul du degré d'alcool dans le cocktail */
    float calculerAlcool() {
        float somme = 0;
        
        for (int i = 0; i < ingredientAlcool.length; i++) {
            somme = somme + ingredientAlcool[i].getDegAlcool()*ingredientSoft[i].getContenance();
        }
        return (somme/calculerDose());
    }
    
    /* Calcul du degré de sucre dans le cocktail */
    float calculerSucre() {
        float somme = 0;
        
        for (int i = 0; i < ingredientSoft.length; i++) {
            somme = somme + ingredientSoft[i].getDegSucre()*ingredientSoft[i].getContenance();
        }
        return (somme/calculerDose());
    }
}